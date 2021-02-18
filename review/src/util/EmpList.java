package util;

import java.util.ArrayList;
import java.util.HashMap;

public class EmpList {
	ArrayList<Emp> list = new ArrayList<Emp>();
	
	public EmpList() {
		list = new ArrayList<>();
	}
	//추가
	public void addEmp(Emp emp) {
		list.add(emp);
	}
	//해당 사원 이름 조회
	public String getName(int index) {
		String name = "";
		name = list.get(index).name;
		return name;
	}
	//삭제
	public void delEmp(int index) {
		list.remove(index);
	}
	
	//전체 이름 조회
	public void getNames() {
		for(Emp e : list) {
			System.out.println(e.name);
		} // 확장 for
	}
	//전체 이름 조회
	public String getNameStr() {
		String names = "";
//		for(int i = 0; i < list.size(); i++) {
//			names = list.get(i).name;
//		}
		for(Emp e : list) {
			names = e.name;
		}
		return names;
	}
	
	//list 조회
	public ArrayList<Emp> getList() {
		return list;
	}
}


class Emp{
	int id;
	String name;
	String dept;
	
	public Emp() { // method overloading
		
	}

	public Emp(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
}
