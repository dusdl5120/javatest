package test;

import javatest.point;

public class Rect extends Shape {

	 /* 
	  * 상속 : extends
	  * 상속을 받으면 부모 클래스에 있는 멤버수 ( 변수 및 객체 ) 와 멤버 메소드를 이용할 수 있다.
	  * 단, 부모메소드에서 접근 제한자가 public 이거나 private 인 애들만 사용할 수 있다.
	  * 
	  * 상속받은 클래스 자신의 생성자에서 부모 클래스의 생성자를 호출할 수 있다. : super();
	  * this() : 내 생성자를 호출
	  * 
	  * 메소드 오버라이딩 : 부모 클래스에 있는 메소드를 재정의 하는 것
	  */

	public Rect() {
		// super();
	}
	
	public Rect (int l, int u, int r, int d) {
		super(l, u, r, d);
		//super(l, u, r, d, 0);			// 없는 생성자를 호출하면 오류남
	}

	public Rect (point lu, point rd) {
		super(lu, rd);
	}
	
	public Rect (Rect r) {
		super((Shape)r);
	}
	
	@Override
	public void print() {
		System.out.println("사각형입니다.");
	}
	
	
}
