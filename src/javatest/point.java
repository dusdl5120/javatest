package javatest;

public class point {

	// 1. 멤버 변수 설정
	private int x ;
	private int y ;
	
	// 2. getter 와 setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}	

	// 3. 생성자들
	public point() {
	}
			// 생성자2 => 두 정수를 매개변수로 하는
	public point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
			// 생성자3 => 복사생성자 => point클래스 객체를 매개변수로 
	public point(point p) {
		this.setX(p.x);
		this.setY(p.y);
	}
	
	// 4. 필요한 기능 = 메소드

	point getlocation() {
		point p = new point (x,y);
		return p;							// return new point(x,y) 로 한줄로 가능
	}
			// x, y로 멤버 변수들을 이동시켜라
	public void move ( int x, int y) {
		this.setX(x);
		this.setY(y);
	}
			// 기존 좌표에서 x방향으로 dx만큼, y방향으로 dy만큼 이동
	public void translate ( int dx, int dy ) {
		this.move( x + dx , y + dy);
	}
	public void print() {
		System.out.println(x+" , "+y);
	}		
}








