package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	/**
	 * String -> Date
	 * SimpleDateFormat.parse
	 */
	public static Date toDate(String date) {
		Date result = null;
		SimpleDateFormat dateParse = new SimpleDateFormat("yyyy-MM-dd");
		try {
			result = dateParse.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Date -> String
	 * SimpleDateFormat.format
	 */
	public static String toStr(Date date) {
		String result = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		result = dateFormat.format(date);
		return result;
	}
	
	/**
	 * Date를 주어진 포맷대로 스트링으로 변환
	 * @param date
	 * @param s
	 * @return
	 * SimpleDateFormat.format
	 */
	public static String toStr2(Date date, String format) {
		String result = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		result = dateFormat.format(date);
		return result;
	}
	
	public static Date addDay(Date today, int i) {
		String result = null;
		return null;
	}
}
