package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
	 * Date瑜� 二쇱뼱吏� �룷留룸�濡� �뒪�듃留곸쑝濡� 蹂��솚
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
	
//	public static Date addDay(Date today, int i) {
//		String result = null;
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		result = dateFormat.format(today) + i;
//		return result;
//	}
}
