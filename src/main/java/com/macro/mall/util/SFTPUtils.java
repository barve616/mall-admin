package com.macro.mall.util;

import com.jcraft.jsch.*;
import com.macro.mall.common.util.Tool;
import com.macro.mall.base.controller.FileServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class SFTPUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(SFTPUtils.class);

	private String host;
	// 服务器连接ip
	private String username;
	// 用户名
	private String password;
	// 密码
	private int port = 22;
	// 端口号
	private ChannelSftp sftp = null;
	private Session sshSession = null;
	Set<String> arFiles = new HashSet<String>();

	public SFTPUtils() {
	}

	public SFTPUtils(String host, int port, String username, String password) {
		this.host = host;
		this.username = username;
		this.password = password;
		this.port = port;
	}

	public SFTPUtils(String host, String username, String password) {
		this.host = host;
		this.username = username;
		this.password = password;
	}

	/** * 通过SFTP连接服务器 */
	public void connect() {
		try {
			JSch jsch = new JSch();
			jsch.getSession(username, host, port);
			sshSession = jsch.getSession(username, host, port);
			LOGGER.info("Session created.==>" + host);
			sshSession.setPassword(password);
			Properties sshConfig = new Properties();
			sshConfig.put("StrictHostKeyChecking", "no");
			sshSession.setConfig(sshConfig);
			sshSession.connect();
			LOGGER.info("Session connected.");
			Channel channel = sshSession.openChannel("sftp");
			channel.connect();
			LOGGER.info("Opening Channel.");
			sftp = (ChannelSftp) channel;
			LOGGER.info("Connected to " + host + ".");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** * 关闭连接 */
	public void disconnect() {
		if (this.sftp != null) {
			if (this.sftp.isConnected()) {
				this.sftp.disconnect();
				LOGGER.info("sftp is closed already");
			}
		}
		if (this.sshSession != null) {
			if (this.sshSession.isConnected()) {
				this.sshSession.disconnect();
				LOGGER.info("sshSession is closed already");
			}
		}
	}
  

	private static String FtpFileName(String inFile) {
		inFile = inFile.replace('\\', '/');
		int lastSlash = inFile.lastIndexOf("/");

		return inFile.substring(lastSlash, inFile.length());
	}

	public static String FtpFilePath(String DMZPath,String inFile) {
		inFile = inFile.replace('\\', '/');
		int flSlash = inFile.indexOf(DMZPath);
		if (flSlash != -1) {
			int lastSlash = inFile.lastIndexOf("/");
			return inFile.substring(flSlash, lastSlash);
		} else {
			return inFile;
		}
	}

	public static String FtpFilePathEnd(String inFile) {
		inFile = inFile.replace('\\', '/');
		int flSlash = inFile.indexOf(FileServlet.DMZPath);
		if (flSlash != -1) {
			return inFile.substring(flSlash);
		} else {
			return inFile;
		}
	}

	/**
	 * * 下载单个文件 * @param remotPath：远程下载目录(以路径符号结束) * @param remoteFileName：下载文件名
	 * * @param localPath：本地保存目录(以路径符号结束) * @param localFileName：保存文件名 * @return
	 */
	public boolean downloadFile(String remoteFileName) {
		FileOutputStream fieloutput = null;
		try {
			//
			String targetPath = Tool.getRealPath() + remoteFileName;
			String path = FileServlet.DMZTARGETPath + FtpFilePath(remoteFileName);
			sftp.cd(path);
			File file = new File(targetPath);
			mkdirs(targetPath);
			fieloutput = new FileOutputStream(file);
			sftp.get(FileServlet.DMZTARGETPath + remoteFileName, fieloutput);
			LOGGER.info("===DownloadFile:" + remoteFileName + " success from sftp.==>" + targetPath);
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SftpException e) {
			e.printStackTrace();
		} finally {
			if (null != fieloutput) {
				try {
					fieloutput.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public static String FtpFilePath(String inFile) {
		inFile = inFile.replace('\\', '/');
		int flSlash = inFile.indexOf(FileServlet.DMZPath);
		if (flSlash != -1) {
			int lastSlash = inFile.lastIndexOf("/");
			return inFile.substring(flSlash, lastSlash);
		} else {
			return inFile;
		}
	}

	public boolean downloadFileTemp(String remoteFileName) {
		FileOutputStream fieloutput = null;
		try {
			//
			String targetPath = Tool.getRealPath() + remoteFileName + "_temp";
			String path = FileServlet.DMZTARGETPath + FtpFilePath(remoteFileName);
			sftp.cd(path);
			File file = new File(targetPath);
			mkdirs(targetPath);
			fieloutput = new FileOutputStream(file);
			sftp.get(FileServlet.DMZTARGETPath + remoteFileName, fieloutput);
			LOGGER.info("===DownloadFile:" + remoteFileName + " success from sftp.==>" + targetPath);
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SftpException e) {
			e.printStackTrace();
		} finally {
			if (null != fieloutput) {
				try {
					fieloutput.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	/**
	 * * 下载单个文件 * @param remotPath：远程下载目录(以路径符号结束) * @param remoteFileName：下载文件名
	 * * @param localPath：本地保存目录(以路径符号结束) * @param localFileName：保存文件名 * @return
	 */
	public boolean downloadFile(String remotePath, String remoteFileName, String localPath, String localFileName) {
		FileOutputStream fieloutput = null;
		try {
			//
			sftp.cd(remotePath);
			File file = new File(localPath + localFileName);
			//
			mkdirs(localPath + localFileName);
			fieloutput = new FileOutputStream(file);
			sftp.get(remotePath + remoteFileName, fieloutput);
			LOGGER.info("===DownloadFile:" + remoteFileName + " success from sftp.");
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SftpException e) {
			e.printStackTrace();
		} finally {
			if (null != fieloutput) {
				try {
					fieloutput.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public static String FtpFilePathEnd(String DMZPath,String inFile) {
		inFile = inFile.replace('\\', '/');
		int flSlash = inFile.indexOf(DMZPath);
		if (flSlash != -1) {
			return inFile.substring(flSlash);
		} else {
			return inFile;
		}
	}

//	/**
//	 * * 上传单个文件 * @param remotePath：远程保存目录 * @param remoteFileName：保存文件名 * @param
//	 * localPath：本地上传目录(以路径符号结束) * @param localFileName：上传的文件名 * @return
//	 */
//	public boolean uploadFile(String localfilename, String rep) {
//		FileInputStream in = null;
//		try {
//			String remotePath = rep + FtpFilePath(localfilename);
//			createDir(remotePath);
//			File file = new File(localfilename);
//			in = new FileInputStream(file);
//			sftp.put(in, remotePath + FtpFileName(localfilename));
//			return true;
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (SftpException e) {
//			e.printStackTrace();
//		} finally {
//			if (in != null) {
//				try {
//					in.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		return false;
//	}


	public boolean uploadInputStream(InputStream in , String remoteFilename,String dmzPath,String targerPath) {
		try {
			String remotePath = targerPath + FtpFilePath(dmzPath,remoteFilename);
			createDir(remotePath);
			sftp.put(in, remotePath + FtpFileName(remoteFilename));
			return true;
		} catch (SftpException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}


	/** * 删除本地文件 * @param filePath * @return */
	public boolean deleteFile(String filePath) {
		File file = new File(filePath);
		if (!file.exists()) {
			return false;
		}
		if (!file.isFile()) {
			return false;
		}
		boolean rs = file.delete();
		LOGGER.info("delete file success from local.");
		return rs;
	}

	/** * 创建目录 * @param createpath * @return */
	public boolean createDir(String createpath) {
		try {
			if (isDirExist(createpath)) {
				this.sftp.cd(createpath);
				return true;
			}
			String pathArry[] = createpath.split("/");
			StringBuffer filePath = new StringBuffer("/");
			for (String path : pathArry) {
				if (path.equals("")) {
					continue;
				}
				filePath.append(path + "/");
				if (isDirExist(filePath.toString())) {
					sftp.cd(filePath.toString());
				} else {
					// 建立目录
					sftp.mkdir(filePath.toString());
					// 进入并设置为当前目录
					sftp.cd(filePath.toString());
				}
			}
			this.sftp.cd(createpath);
			return true;
		} catch (SftpException e) {
			e.printStackTrace();
		}
		return false;
	}

	/** * 判断目录是否存在 * @param directory * @return */
	public boolean isDirExist(String directory) {
		boolean isDirExistFlag = false;
		try {
			SftpATTRS sftpATTRS = sftp.lstat(directory);
			isDirExistFlag = true;
			return sftpATTRS.isDir();
		} catch (Exception e) {
			if (e.getMessage().toLowerCase().equals("no such file")) {
				isDirExistFlag = false;
			}
		}
		return isDirExistFlag;
	}

	/**
	 * * 删除stfp文件 * @param directory：要删除文件所在目录 * @param deleteFile：要删除的文件 * @param
	 * sftp
	 */
	public void deleteSFTP(String directory, String deleteFile) {
		try {
			//
			sftp.cd(directory);
			sftp.rm(directory + deleteFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** * 如果目录不存在就创建目录 * @param path */
	public void mkdirs(String path) {
		File f = new File(path);
		String fs = f.getParent();
		f = new File(fs);
		if (!f.exists()) {
			f.mkdirs();
		}
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ChannelSftp getSftp() {
		return sftp;
	}

	public void setSftp(ChannelSftp sftp) {
		this.sftp = sftp;
	}

//	/** 测试 */
	public static void main(String[] args) {
		SFTPUtils sftp = null;
		try {
			sftp = new SFTPUtils("22.188.24.249", "ydweb", "chen123**");
			sftp.connect();

			//sftp.listName("/mlife/share/Pic");
			//sftp.
			 //下载
			 sftp.downloadFile("/ydweb/log/AppPrjLog/", "AppServer.log_AG7K.2019-09-12-08", "D:\\", "ceshi.txt");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sftp.disconnect();
		}
	}
}