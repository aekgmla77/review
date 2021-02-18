package util;

import java.util.Date;

public class WrapperTest {

	public static void main(String[] args) {
		//1. String -> int
//		int result = StringUtil.toInt("1234");
//		System.out.println(result);
		
		//2. int -> String
//		String s = StringUtil.toStr(5);
//		System.out.println(s);
		
		//3. String -> 확장자(파일명에서 확장자만 추출)
//		String ext = StringUtil.getExt("a.hwp");
//		System.out.println(ext);
		
		//4. String -> path, 파일명
		String extt = StringUtil.getFilename("p01.jpg");
		System.out.println(extt);
		
		//5. 경로 추출
		String path = StringUtil.getPath("c:/img/item/p01.jpg");
		System.out.println(path);
		
		Date result = DateUtil.toDate("2021-03-10");
		System.out.println(result);
		
//		String str = DateUtil.toStr(new Date()); //overloading > 중복 정의 overriding
//		System.out.println(str);
		
		String str2 = DateUtil.toStr2(new Date(), "DD");
		System.out.println(str2);
		
		Date today = new Date();
		Date meetDay = DateUtil.addDay(today, 100);
		System.out.println(DateUtil.toStr(meetDay));
	}

}
