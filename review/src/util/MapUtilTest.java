package util;

public class MapUtilTest {
	public static void main(String[] args) {
		
		MapUtil map = new MapUtil();
		map.addEmp(new Emp(1, "홍길동", "인사"));
		map.addEmp(new Emp(2, "김길동", "IT"));
		map.addEmp(new Emp(3, "서길동", "마케팅"));
		map.addEmp(new Emp(4, "이길동", "회계"));
		
		//2번 사원의 이름을 출력
		System.out.println(map.getName(2));
		
		
		//2번 사원 삭제
		map.delEmp(2);
		
		//전체 출력
		System.out.println(map.getMap());
	}
}
