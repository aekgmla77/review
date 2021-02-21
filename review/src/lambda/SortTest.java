package lambda;

import java.util.ArrayList;
import java.util.Collections;

import util.Emp;

public class SortTest {
	public static void main(String[] args) {
		ArrayList<Emp> emplist = new ArrayList<>();
		emplist.add(new Emp(1, "홍길동", "인사"));
		emplist.add(new Emp(2, "김길동", "IT"));
		emplist.add(new Emp(3, "서길동", "마케팅"));
		emplist.add(new Emp(4, "이길동", "회계"));
		
		Collections.sort(emplist, (Emp o1, Emp o2) -> 
			 	o1.getDept().compareTo(o2.getDept())
			);
		System.out.println(emplist);
	}
}

//class EmpCompare implements Comparator<Emp>{
//
//	@Override
//	public int compare(Emp o1, Emp o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
//} 