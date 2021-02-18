package util;

public class StringUtil {
	//1. String -> int
	public static int toInt(String s) {     // Integer -> int
		if (s == null)
			return -1;
		return Integer.parseInt(s);
	}
	//2. int -> String
	public static String toStr(int s) {
		return Integer.toString(s);
	}
	//3. String -> 확장자(String) : LastindexOf, substr
	public static String getExt(String s) {
		String result = "";
		result = s.substring(s.lastIndexOf(".") + 1);
		return result;
	}
	/**
	 * 파일명에서 확장자를 추출
	 * @param pathname
	 * 		파일명 p01.jpg (파일만 추출)
	 * 	    경로명 c:/img/item/p01.jpg(경로만 추출)
	 * @return 확장자 
	 */
	//4. String -> path, 파일명
	public static String getFilename(String file) {
		String result = "";
		int ff = file.lastIndexOf(".");
		result = file.substring(0, ff);
		return result;
	}
	
	public static String getPath(String path) {
		String result = "";
		int last = path.lastIndexOf("/");
		path.substring(last + 1);
		return result;
	}
}
