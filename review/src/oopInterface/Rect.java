package oopInterface;


public class Rect
		extends Shape                    //속성
		implements Drawable, Movable {   //method(기능)     -추상

	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}

	@Override
	public void move() {
		System.out.println("사각형 이동");
	}
}
