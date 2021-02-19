package oop;

//교수
public class Prof extends Member {
	
	String dept;

	@Override // 상속 받은 method 재정의
	public void sal() {
		System.out.println("교수 급여");
	}

	@Override // super >> 부모꺼(member)
	public void print() {
		super.print();  
		System.out.println("교수");
	}
	
	
}
