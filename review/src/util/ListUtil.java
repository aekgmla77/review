package util;

import java.util.ArrayList;

public class ListUtil {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		
		//추가(제일 끝에 들어감)
		list.add("apple");
		
		//삽입(중간에 들어감)
		list.add(0, "jamong");
		
		//수정
		list.set(1, "watermelon");
		
		//삭제
		list.remove(0);
		
		//단 건 조회
		list.get(0);
		
		//전체 조회
		System.out.println(list);
	}
}
