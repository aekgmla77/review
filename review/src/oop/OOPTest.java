package oop;

import java.util.ArrayList;

/*
 * 다형성
 * 1. 부모 타입의 참조변수가 자식 객체를 참조할 수 있음
 * 2. 실행되는 method는 참조하는 객체의 method를 호출 (실행 결과가 다를 수 있음)
 */

public class OOPTest {
	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>(); // member를 담으면 자식 객체를 다 가져올 수 있음.(다형성)
		Member member;
		
		member = new Prof();
		member.setName("김유신");
		list.add(member);
		
		member = new Emp();
		member.setName("김직원");
		list.add(member);
		
		System.out.println("-----------------------");
		
		for(Member m : list) {
			m.sal();
			m.print();
			if(m instanceof Emp) {
				((Emp)m).meth();  //다운 캐스팅(형변환)  >> 부모, 자식 간에만 가능함.(객체간의 형변환)
			}
		}
		
//		for(int i = 0; i < list.size(); i++) {
//			Member m = list.get(i);
//			m.sal();
//			m.print();
//		}
	}
}
