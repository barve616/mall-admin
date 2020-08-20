package com.macro.mall.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public abstract class DateUtil {

	public static final String pattern_ymd = "yyyy-MM-dd"; // pattern_ymd
	public static final String patternymd = "yyyyMMdd"; // pattern_ymd
	public static final String pattern_ymd_hms = "yyyy-MM-dd HH:mm:ss"; // pattern_ymdtime
	public static final String pattern_ymd_hms_s = "yyyy-MM-dd HH:mm:ss:SSS"; // pattern_ymdtimeMillisecond
	private static SimpleDateFormat dateMonth2 = new SimpleDateFormat("yyyyMM");

	/**
	 * 返回指定日期月最后一天
	 * 
	 * @throws ParseException
	 */
	public static String getDateStrEnd3(String str) throws ParseException {
		Calendar calendar = new GregorianCalendar();
		Date date = dateMonth2.parse(str);
		calendar.setTime(date);
		int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		return str.substring(0, 6) + String.valueOf(day);
	}

	
	public static Date addTime(Date date,int days,int hours,int minutes){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, days);
		calendar.add(Calendar.HOUR, hours);
		calendar.add(Calendar.MINUTE, minutes);
		
		return calendar.getTime();
	}
	/**
	 * 获取当前时间
	 * 
	 * @return
	 */
	public static String getDate(Date date) {
		return new SimpleDateFormat(pattern_ymd_hms).format(date);
	}

	public static String getDate(Date date, String format) {
		return new SimpleDateFormat(format).format(date);
	}

	public static String getDate() {
		return new SimpleDateFormat(pattern_ymd_hms).format(new Date());
	}

	public static String getDate(String format) {
		return new SimpleDateFormat(format).format(new Date());
	}

	/**
	 * 获取指定日期
	 * 
	 * @param date
	 * @param hour
	 * @param minute
	 * @param second
	 * @param millisecond
	 * @return
	 */
	public static Date getDate(int date, int hour, int minute, int second, int millisecond) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, date);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar.getTime();
	}

	/**
	 * 获取当前时间的时间戳
	 * 
	 * @return
	 */
	public static long getDateByTime() {
		return new Date().getTime();
	}

	/**
	 * 格式化
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String format(Date date, String pattern) {
		DateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}

	/**
	 * 格式化
	 * 
	 * @param date
	 * @param pattern
	 * @param timeZone
	 * @return
	 */
	public static String format(Date date, String pattern, TimeZone timeZone) {
		DateFormat format = new SimpleDateFormat(pattern);
		format.setTimeZone(timeZone);
		return format.format(date);
	}

	/**
	 * 格式化
	 * 
	 * @param date
	 * @param parsePattern
	 * @param returnPattern
	 * @return
	 */
	public static String format(String date, String parsePattern, String returnPattern) {
		return format(parse(date, parsePattern), returnPattern);
	}

	/**
	 * 格式化
	 * 
	 * @param date
	 * @param parsePattern
	 * @param returnPattern
	 * @param timeZone
	 * @return
	 */
	public static String format(String date, String parsePattern, String returnPattern, TimeZone timeZone) {
		return format(parse(date, parsePattern), returnPattern, timeZone);
	}

	/**
	 * 解析
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static Date parse(String date, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		try {
			return format.parse(date);
		} catch (ParseException e) {
			MLog.error("ToolDateTime.parse异常：date值" + date + "，pattern值" + pattern);
			return null;
		}
	}

	/**
	 * 解析
	 * 
	 * @param dateStr
	 * @return
	 */
	public static Date parse(String dateStr) {
		Date date = null;
		try {
			date = DateFormat.getDateTimeInstance().parse(dateStr);
		} catch (ParseException e) {
			MLog.error("ToolDateTime.parse异常：date值" + date);
			return null;
		}
		return date;
	}

	/**
	 * 两个日期的时间差，返回"X天X小时X分X秒"
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static String getBetween(Date start, Date end) {
		long between = (end.getTime() - start.getTime()) / 1000;// 除以1000是为了转换成秒
		long day = between / (24 * 3600);
		long hour = between % (24 * 3600) / 3600;
		long minute = between % 3600 / 60;
		long second = between % 60 / 60;

		StringBuilder sb = new StringBuilder();
		sb.append(day);
		sb.append("天");
		sb.append(hour);
		sb.append("小时");
		sb.append(minute);
		sb.append("分");
		sb.append(second);
		sb.append("秒");

		return sb.toString();
	}

	/**
	 * 返回两个日期之间隔了多少分钟
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static int getDateMinuteSpace(Date start, Date end) {
		int hour = (int) ((end.getTime() - start.getTime()) / (60 * 1000));
		return hour;
	}

	/**
	 * 返回两个日期之间隔了多少小时
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static int getDateHourSpace(Date start, Date end) {
		int hour = (int) ((end.getTime() - start.getTime()) / (60 * 60 * 1000));
		return hour;
	}

	/**
	 * 返回两个日期之间隔了多少天
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static int getDateDaySpace(Date start, Date end) {
		int day = (int) ((end.getTime() - start.getTime()) / (60 * 60 * 24 * 1000));
		return day;
	}

	/**
	 * 得到某一天是星期几
	 * 
	 *            日期字符串
	 * @return String 星期几
	 */
	@SuppressWarnings("static-access")
	public static String getDateInWeek(Date date) {
		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int dayIndex = calendar.get(calendar.DAY_OF_WEEK) - calendar.SUNDAY;
		if (dayIndex < 0) {
			dayIndex = 0;
		}
		return weekDays[dayIndex];
	}

	/**
	 * 日期减去多少个小时
	 * 
	 * @param date
	 * @param hourCount
	 *            多少个小时
	 * @return
	 */
	public static Date getDateReduceHour(Date date, long hourCount) {
		long time = date.getTime() - 3600 * 1000 * hourCount;
		Date dateTemp = new Date();
		dateTemp.setTime(time);
		return dateTemp;
	}

	/**
	 * 日期区间分割
	 * 
	 * @param start
	 * @param end
	 * @param splitCount
	 * @return
	 */
	public static List<Date> getDateSplit(Date start, Date end, long splitCount) {
		long startTime = start.getTime();
		long endTime = end.getTime();
		long between = endTime - startTime;

		long count = splitCount - 1l;
		long section = between / count;

		List<Date> list = new ArrayList<Date>();
		list.add(start);

		for (long i = 1l; i < count; i++) {
			long time = startTime + section * i;
			Date date = new Date();
			date.setTime(time);
			list.add(date);
		}

		list.add(end);

		return list;
	}

	/**
	 * 返回两个日期之间隔了多少天，包含开始、结束时间
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static List<String> getDaySpaceDate(Date start, Date end) {
		Calendar fromCalendar = Calendar.getInstance();
		fromCalendar.setTime(start);
		fromCalendar.set(Calendar.HOUR_OF_DAY, 0);
		fromCalendar.set(Calendar.MINUTE, 0);
		fromCalendar.set(Calendar.SECOND, 0);
		fromCalendar.set(Calendar.MILLISECOND, 0);

		Calendar toCalendar = Calendar.getInstance();
		toCalendar.setTime(end);
		toCalendar.set(Calendar.HOUR_OF_DAY, 0);
		toCalendar.set(Calendar.MINUTE, 0);
		toCalendar.set(Calendar.SECOND, 0);
		toCalendar.set(Calendar.MILLISECOND, 0);

		List<String> dateList = new LinkedList<String>();

		long dayCount = (toCalendar.getTime().getTime() - fromCalendar.getTime().getTime()) / (1000 * 60 * 60 * 24);
		if (dayCount < 0) {
			return dateList;
		}

		dateList.add(format(fromCalendar.getTime(), pattern_ymd));

		for (int i = 0; i < dayCount; i++) {
			fromCalendar.add(Calendar.DATE, 1);// 增加一天
			dateList.add(format(fromCalendar.getTime(), pattern_ymd));
		}

		return dateList;
	}

	/**
	 * 获取开始时间
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static Date startDateByDay(Date start, int end) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(start);
		calendar.add(Calendar.DATE, end);// 明天1，昨天-1
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		Date date = calendar.getTime();
		return date;
	}

	/**
	 * 获取结束时间
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static Date endDateByDay(Date start) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(start);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		Date date = calendar.getTime();
		return date;
	}

	/**
	 * 获取开始时间
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static Date startDateByHour(Date start, int end) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(start);
		calendar.set(Calendar.MINUTE, end);
		Date date = calendar.getTime();
		return date;
	}

	/**
	 * 获取结束时间
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static Date endDateByHour(Date end) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(end);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		Date date = calendar.getTime();
		return date;
	}

	/**
	 * 根据年份和周得到周的开始和结束日期
	 * 
	 * @param year
	 * @param week
	 * @return
	 */
	public static Map<String, Date> getStartEndDateByWeek(int year, int week) {
		Calendar weekCalendar = new GregorianCalendar();
		weekCalendar.set(Calendar.YEAR, year);
		weekCalendar.set(Calendar.WEEK_OF_YEAR, week);
		weekCalendar.set(Calendar.DAY_OF_WEEK, weekCalendar.getFirstDayOfWeek());

		Date startDate = weekCalendar.getTime(); // 得到周的开始日期

		weekCalendar.roll(Calendar.DAY_OF_WEEK, 6);
		Date endDate = weekCalendar.getTime(); // 得到周的结束日期

		// 开始日期往前推一天
		Calendar startCalendar = Calendar.getInstance();
		startCalendar.setTime(startDate);
		startCalendar.add(Calendar.DATE, 1);// 明天1，昨天-1
		startCalendar.set(Calendar.HOUR_OF_DAY, 0);
		startCalendar.set(Calendar.MINUTE, 0);
		startCalendar.set(Calendar.SECOND, 0);
		startCalendar.set(Calendar.MILLISECOND, 0);
		startDate = startCalendar.getTime();

		// 结束日期往前推一天
		Calendar endCalendar = Calendar.getInstance();
		endCalendar.setTime(endDate);
		endCalendar.add(Calendar.DATE, 1);// 明天1，昨天-1
		endCalendar.set(Calendar.HOUR_OF_DAY, 23);
		endCalendar.set(Calendar.MINUTE, 59);
		endCalendar.set(Calendar.SECOND, 59);
		endCalendar.set(Calendar.MILLISECOND, 999);
		endDate = endCalendar.getTime();

		Map<String, Date> map = new HashMap<String, Date>();
		map.put("start", startDate);
		map.put("end", endDate);
		return map;
	}

	/**
	 * 根据日期月份，获取月份的开始和结束日期
	 * 
	 * @param date
	 * @return
	 */
	public static Map<String, Date> getMonthDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		// 得到前一个月的第一天
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		Date start = calendar.getTime();

		// 得到前一个月的最后一天
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date end = calendar.getTime();

		Map<String, Date> map = new HashMap<String, Date>();
		map.put("start", start);
		map.put("end", end);
		return map;
	}

	/**
	 * 分割List
	 * 
	 * @param list
	 *            待分割的list
	 * @param pageSize
	 *            每段list的大小
	 * @return List<<List<T>>
	 */
	public static <T> List<List<T>> splitList(List<T> list, int pageSize) {
		int listSize = list.size(); // list的大小
		int page = (listSize + (pageSize - 1)) / pageSize; // 页数

		List<List<T>> listArray = new ArrayList<List<T>>();// 创建list数组
															// ,用来保存分割后的list

		for (int i = 0; i < page; i++) { // 按照数组大小遍历
			List<T> subList = new ArrayList<T>(); // 数组每一位放入一个分割后的list
			for (int j = 0; j < listSize; j++) { // 遍历待分割的list
				int pageIndex = ((j + 1) + (pageSize - 1)) / pageSize; // 当前记录的页码(第几页)
				if (pageIndex == (i + 1)) { // 当前记录的页码等于要放入的页码时
					subList.add(list.get(j)); // 放入list中的元素到分割后的list(subList)
				}

				if ((j + 1) == ((j + 1) * pageSize)) { // 当放满一页时退出当前循环
					break;
				}
			}
			listArray.add(subList); // 将分割后的list放入对应的数组的位中
		}
		return listArray;
	}

	/**
	 * 计算2个时间段相差的秒数
	 * 
	 * @param currTime
	 *            当前时间
	 * @param beginTime
	 *            要对比计算的时间
	 * @return 相差的秒数
	 */
	public static long calculateSecond(String currTime, String beginTime) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date currentTime = sdf.parse(currTime);
			// 将截取到的时间字符串转化为时间格式的字符串
			Date beginTime1 = sdf.parse(formatTime(beginTime));
			MLog.info("currentTime.getTime()------->" + currentTime.getTime());
			MLog.info("beginTime1.getTime()------>" + beginTime1.getTime());
			MLog.info("currentTime.getTime()-beginTime1.getTime()----->" + (currentTime.getTime() - beginTime1.getTime()));
			long interval = (currentTime.getTime() - beginTime1.getTime()) / 1000;// 秒
			MLog.info("interval-------------------->" + interval);

			return interval;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// 默认为毫秒，除以1000是为了转换成秒

		return 0;
	}

	/**
	 * 把yyyyMMddHHmmss格式的日期字符串转换为yyyy-MM-dd HH:mm:ss格式
	 * 
	 * @param time
	 *            要转的日期
	 * @return yyyy-MM-dd HH:mm:ss格式的时间字符串
	 */
	public static String formatTime(String time) {
		String str1 = "";
		for (int i = 0; i < time.length(); i++) {
			if (i == 4 || i == 6) {
				str1 += "-";
			}
			if (i == 8) {
				str1 += " ";
			}
			if (i == 10 || i == 12) {
				str1 += ":";
			}
			str1 += time.toCharArray()[i];
		}
		return str1;
	}
	
	/**
	 * 返回指定年的月份的最大天数
	 * @param day
	 * @return
	 * @throws ParseException 
	 */
	public static int dayOfMonthInYear(String today) throws ParseException{
		Calendar calendar = new GregorianCalendar();
		Date date = dateMonth2.parse(today);
		calendar.setTime(date);
		int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		return day;
	}
	/**
	 * 格式化日期
	 * @param str
	 * @return
	 */
	public static String changeDate(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date d = null;
		try {
			d = sdf.parse(str);
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			String s = sdf1.format(d);
			return s;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String changeSettleDate(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
		Date d = null;
		try {
			d = sdf.parse(str);
			SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd");
			String s = sdf1.format(d);
			return s;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * 格式化时间
	 * @param time
	 * @return
	 */
	public static String changeTime(String time) {
		SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
		Date d = null;
		try {
			d = sdf.parse(time);
			SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
			String s = sdf1.format(d);
			return s;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 获取指定日期
	 * 
	 * @param date
	 * @return
	 */
	public static Date getLastMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
	    //修改获取下个月日期的方式
		calendar.add(calendar.MONTH, 1);
		//calendar.set(Calendar.MONTH, 1);
		return calendar.getTime();
	}
}
