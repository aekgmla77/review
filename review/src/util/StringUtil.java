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
	//3. String -> �솗�옣�옄(String) : LastindexOf, substr
	public static String getExt(String s) {
		String result = "";
		result = s.substring(s.lastIndexOf(".") + 1);
		return result;
	}
	/**
	 * �뙆�씪紐낆뿉�꽌 �솗�옣�옄瑜� 異붿텧
	 * @param pathname
	 * 		�뙆�씪紐� p01.jpg (�뙆�씪留� 異붿텧)
	 * 	    寃쎈줈紐� c:/img/item/p01.jpg(寃쎈줈留� 異붿텧)
	 * @return �솗�옣�옄 
	 */
	//4. String -> path, �뙆�씪紐�
	public static String getFilename(String file) {
		String result = "";
		int ff = file.lastIndexOf(".");
		result = file.substring(0, ff);
		return result;
	}
	
	public static String getPath(String path) {
		String result = "";
		int last = path.lastIndexOf("/");
		result = path.substring(0, last + 1);
		return result;
	}
}
