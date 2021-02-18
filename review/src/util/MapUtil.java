package util;

import java.util.HashMap;

public class MapUtil {
	HashMap<Integer, Emp> map;

	public MapUtil() {
		map = new HashMap<>();
	}

	// 추가
	public void addEmp(Emp emp) {
		map.put(emp.id, emp);
	}

	// 수정
	public void upEmp(Emp emp) {
		map.put(emp.id, emp);
	}// 추가랑 같음

	// 삭제
	public void delEmp(Integer id) {
		map.remove(id);
	}

	// 조회
	public String getName(Integer id) {
		String name = "";
		name = map.get(id).name;
		return name;
		// get
	}

	// 맵 리턴
	public HashMap<Integer, Emp> getMap() {
		return map;
	}

	// 전체 조회 map.keySet() --> Iterator -> for
	public void getNames() {
		map.keySet();
		
	}
}
