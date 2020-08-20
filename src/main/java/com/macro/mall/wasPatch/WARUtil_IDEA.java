package com.macro.mall.wasPatch;

import com.macro.mall.util.DateUtil;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//import com.form.mlife.common.util.DateUtil;

/**
 * WAS增量布署工具 1)右击工程-->Team-->创建补丁 保存到文件系统--> D：/patch.txt(可自定义）-->完成 2)确定工程名 以
 * 通过控制台找到对应的war名称 AppServerPrj20170204X73
 *
 * @author LPP
 */
public class WARUtil_IDEA {

    private String pro = "mall"; //当前生成工程名
    private String patchFile = null; // SVN增量文件名
    private String desPath;

    public WARUtil_IDEA() {
        String path = new File(WARUtil_IDEA.class.getResource("/").getPath()).getPath().replace("\\", "/");
        System.out.println("dds" + path);
//        String[] ss = path.split("/");
//        String module = ss[ss.length - 1];
//        pro = module;
        desPath = "D:/版本/出库版本/" + pro;
        if (patchFile == null) {
            patchFile = getLastPath();
        }
        this.projectPath = System.getProperty("user.dir").replace("\\", "/");
        this.webContent = "WebContent";
        this.classPath = path;
        this.version = DateUtil.getDate("yyyyMMddHHmmss") + "_" + pro;
    }

    public static String getLastPath() {
//        String path = WARUtil.class.getResource("").toString().replaceAll("file:/", "") + "wasPatch/";
        String path = WARUtil.class.getResource("").toString().replaceAll("file:/", "");
        List<String> lss = Arrays.asList(new File(path).list());
        List<String> ls = new ArrayList<>();
        for(String s: lss){
            if(s.toUpperCase().contains("XML")){
                ls.add(s);
            }
        }
        Collections.sort(ls, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        String getLastPath = path + ls.get(0);
        System.out.println("当前文件清单：" + getLastPath);
        return getLastPath;
    }

    public static void main(String[] args) throws Exception {
        WARUtil_IDEA wls = new WARUtil_IDEA();
        List<String> lists = wls.getPatchFileList();
        System.out.println("共计：" + lists.size() + "本");
        wls.copySrcFiles(lists);
        List<String> listss = new ArrayList<>();
        for(String s: lists){
            listss.add(s.replace("main/java/",""));
        }
        wls.copyFiles(listss);
        wls.toCreateZip();
    }

    public List<String> getPatchFileList() throws Exception {
        System.out.println("当前需要下载文件的列表：");
        List<String> fileList = new ArrayList<String>();
        FileInputStream f = new FileInputStream(patchFile);
        BufferedReader dr = new BufferedReader(new InputStreamReader(f, "utf-8"));
        String line;
        while ((line = dr.readLine()) != null) {
            if (line.startsWith("Index:")) {
                line = line.replaceAll(" ", "");
                line = line.substring(line.indexOf(":") + 1, line.length());
                System.out.println("    " + line);
                fileList.add(line);
            }
        }
        dr.close();
        return fileList;
    }

    public void copySrcFiles(List<String> list) {

        for (String fullFileName : list) {
            if (fullFileName.indexOf("src/") != -1) {
                String fileName = fullFileName;
                fullFileName = projectPath + "/" + fileName;
                String tempDesPath = fileName.substring(0, fileName.lastIndexOf("/"));
                String desFilePathStr = desPath + "/" + version + "/源代码/" + pro + "/" + tempDesPath;
                String desFileNameStr = desPath + "/" + version + "/源代码/" + pro + "/" + fileName;
                File desFilePath = new File(desFilePathStr);
                if (!desFilePath.exists()) {
                    desFilePath.mkdirs();
                }
                copyFile(fullFileName, desFileNameStr);
                System.out.println(fullFileName + "复制完成");
            } else {
                String desFileName = fullFileName.replaceAll(webContent, "");
                fullFileName = projectPath + "/" + fullFileName;
                String fullDesFileNameStr = desPath + "/" + version + "/源代码/" + pro + "/" + desFileName;
                String desFilePathStr = fullDesFileNameStr.substring(0, fullDesFileNameStr.lastIndexOf("/"));
                File desFilePath = new File(desFilePathStr);
                if (!desFilePath.exists()) {
                    desFilePath.mkdirs();
                }
                copyFile(fullFileName, fullDesFileNameStr);
                System.out.println(fullDesFileNameStr + "复制完成");
            }

        }

    }

    public void copyFiles(List<String> list) {
        if (!pro.contains("war")) {
            pro = pro + ".war";
        }
        for (String fullFileName : list) {
            if (fullFileName.indexOf("src/") != -1) {
                String fileName = fullFileName.replace("src", "");
                fullFileName = classPath + fileName;
                if (fileName.endsWith(".java")) {
                    fileName = fileName.replace(".java", ".class");
                    fullFileName = fullFileName.replace(".java", ".class");
                }
                String tempDesPath = fileName.substring(0, fileName.lastIndexOf("/"));
                String desFilePathStr = desPath + "/" + version + "/执行码/" + pro + "/WEB-INF/classes" + tempDesPath;

                String desFileNameStr = desPath + "/" + version + "/执行码/" + pro + "/WEB-INF/classes" + fileName;
                File desFilePath = new File(desFilePathStr);
                if (!desFilePath.exists()) {
                    desFilePath.mkdirs();
                }
                copyFile(fullFileName, desFileNameStr);
                System.out.println(fullFileName + " is ok!");
            } else {
                String desFileName = fullFileName.replaceAll(webContent, "");
                fullFileName = projectPath + "/" + fullFileName;
                String fullDesFileNameStr = desPath + "/" + version + "/执行码/" + pro + "/" + desFileName;
                String desFilePathStr = fullDesFileNameStr.substring(0, fullDesFileNameStr.lastIndexOf("/"));
                File desFilePath = new File(desFilePathStr);
                if (!desFilePath.exists()) {
                    desFilePath.mkdirs();
                }
                copyFile(fullFileName, fullDesFileNameStr);
                System.out.println(fullDesFileNameStr + " is ok!");
            }

        }

        //添加补充class$

        for (String fullFileName : list) {
            if (fullFileName.indexOf("src/") != -1) {
                String fileName = fullFileName.replace("src", "");
                fullFileName = classPath + fileName;
                if (fileName.endsWith(".java")) {
                    fileName = fileName.replace(".java", "");
                    fullFileName = fullFileName.replace(".java", "");
                }
                String tempDesPath = fileName.substring(0, fileName.lastIndexOf("/"));
                String desFilePathStr = desPath + "/" + version + "/执行码/" + pro + "/WEB-INF/classes" + tempDesPath;

                File desFilePath = new File(desFilePathStr);
                if (!desFilePath.exists()) {
                    desFilePath.mkdirs();
                }
                copyFileS(classPath + tempDesPath, fileName, desFilePathStr);//从目录中录找带$的文件抽出来
            }
        }
    }

    private void copyFileS(String path, String fileName, String desFilePathStr) {
        File srcFilePath = new File(path);
        if (srcFilePath.isDirectory()) {
            String[] fileDirectors = srcFilePath.list();
            if (fileDirectors != null && fileDirectors.length > 0) {
                for (String s : fileDirectors) {
                    String fullS = path + "/" + s;
                    if (fullS.contains(fileName + "$")) {
                        String desFileNameStr = desFilePathStr + "/" + s;
                        copyFile(fullS, desFileNameStr);
                        System.out.println(fullS + " is ok!");
                    }
                }
            }
        }
    }


    private void copyFile(String sourceFileNameStr, String desFileNameStr) {
        File srcFile = new File(sourceFileNameStr);
        File desFile = new File(desFileNameStr);
        try {
            if (srcFile.isDirectory()) {
                System.out.println(srcFile.getAbsolutePath() + srcFile.getName() + "@@@@@@@@@@");
            } else {
                copyFile(srcFile, desFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void copyFile(File sourceFile, File targetFile) throws IOException {
        BufferedInputStream inBuff = null;
        BufferedOutputStream outBuff = null;
        try {
            inBuff = new BufferedInputStream(new FileInputStream(sourceFile));
            outBuff = new BufferedOutputStream(new FileOutputStream(targetFile));
            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inBuff.read(b)) != -1) {
                outBuff.write(b, 0, len);
            }
            outBuff.flush();
        } finally {
            if (inBuff != null)
                inBuff.close();
            if (outBuff != null)
                outBuff.close();
        }
    }

    private void toCreateZip() throws IOException {
//		createZip(desPath + "/" + version + "/执行码/" + pro + "/", desPath + "/" + version + "/执行码/" + pro + ".zip");
        pro = pro.replaceAll(".war", "");
        createZip(desPath + "/" + version + "/源代码/" + pro + "/", desPath + "/" + version + "/源代码/" + pro + ".zip");
    }

    public static void createZip(String sourcePath, String zipPath) {
        System.out.println(sourcePath);
        System.out.println(zipPath);
        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        try {
            fos = new FileOutputStream(zipPath);
            zos = new ZipOutputStream(fos);
//			zos.setEncoding("gbk");// 此处修改字节码方式。
            // createXmlFile(sourcePath,"293.xml");
            writeZip(new File(sourcePath), "", zos);
        } catch (FileNotFoundException e) {
            System.out.println("创建ZIP文件失败");
        } finally {
            try {
                if (zos != null) {
                    zos.close();
                }
            } catch (IOException e) {
                System.out.println("创建ZIP文件失败");
            }

        }
    }

    private static void writeZip(File file, String parentPath, ZipOutputStream zos) {
        if (file.exists()) {
            if (file.isDirectory()) {// 处理文件夹
                parentPath += file.getName() + File.separator;
                File[] files = file.listFiles();
                if (files.length != 0) {
                    for (File f : files) {
                        writeZip(f, parentPath, zos);
                    }
                } else { // 空目录则创建当前目录
                    try {
                        zos.putNextEntry(new ZipEntry(parentPath));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream(file);
                    ZipEntry ze = new ZipEntry(parentPath + file.getName());
                    zos.putNextEntry(ze);
                    byte[] content = new byte[1024];
                    int len;
                    while ((len = fis.read(content)) != -1) {
                        zos.write(content, 0, len);
                        zos.flush();
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("创建ZIP文件失败");
                } catch (IOException e) {
                    System.out.println("创建ZIP文件失败");
                } finally {
                    try {
                        if (fis != null) {
                            fis.close();
                        }
                    } catch (IOException e) {
                        System.out.println("创建ZIP文件失败");
                    }
                }
            }
        }
    }

    private String version;
    private String projectPath;
    private String webContent;
    private String classPath;
}