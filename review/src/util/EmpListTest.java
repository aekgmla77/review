package util;

public class EmpListTest {
	public static void main(String[] args) {
		EmpList emplist = new EmpList();
		emplist.addEmp(new Emp(1, "홍길동", "인사"));
		emplist.addEmp(new Emp(2, "김길동", "IT"));
		emplist.addEmp(new Emp(3, "서길동", "마케팅"));
		emplist.addEmp(new Emp(4, "이길동", "회계"));
		
		//1번 사원의 이름은?
		System.out.println(emplist.getName(1));
		
		//1번 사원 삭제
		emplist.delEmp(0);
		System.out.println(emplist.getList());
		
//		//전체사원 이름 조회
//		emplist.getNames();
		
		//전체 이름 조회
		System.out.println(emplist.getNameStr());
	}
}
