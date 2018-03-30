package javatest;

public class point {

	// 1. ��� ���� ����
	private int x ;
	private int y ;
	
	// 2. getter �� setter
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

	// 3. �����ڵ�
	public point() {
	}
			// ������2 => �� ������ �Ű������� �ϴ�
	public point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
			// ������3 => ��������� => pointŬ���� ��ü�� �Ű������� 
	public point(point p) {
		this.setX(p.x);
		this.setY(p.y);
	}
	
	// 4. �ʿ��� ��� = �޼ҵ�

	point getlocation() {
		point p = new point (x,y);
		return p;							// return new point(x,y) �� ���ٷ� ����
	}
			// x, y�� ��� �������� �̵����Ѷ�
	public void move ( int x, int y) {
		this.setX(x);
		this.setY(y);
	}
			// ���� ��ǥ���� x�������� dx��ŭ, y�������� dy��ŭ �̵�
	public void translate ( int dx, int dy ) {
		this.move( x + dx , y + dy);
	}
	public void print() {
		System.out.println(x+" , "+y);
	}		
}








