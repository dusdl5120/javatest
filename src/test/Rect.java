package test;

import javatest.point;

public class Rect extends Shape {

	 /* 
	  * ��� : extends
	  * ����� ������ �θ� Ŭ������ �ִ� ����� ( ���� �� ��ü ) �� ��� �޼ҵ带 �̿��� �� �ִ�.
	  * ��, �θ�޼ҵ忡�� ���� �����ڰ� public �̰ų� private �� �ֵ鸸 ����� �� �ִ�.
	  * 
	  * ��ӹ��� Ŭ���� �ڽ��� �����ڿ��� �θ� Ŭ������ �����ڸ� ȣ���� �� �ִ�. : super();
	  * this() : �� �����ڸ� ȣ��
	  * 
	  * �޼ҵ� �������̵� : �θ� Ŭ������ �ִ� �޼ҵ带 ������ �ϴ� ��
	  */

	public Rect() {
		// super();
	}
	
	public Rect (int l, int u, int r, int d) {
		super(l, u, r, d);
		//super(l, u, r, d, 0);			// ���� �����ڸ� ȣ���ϸ� ������
	}

	public Rect (point lu, point rd) {
		super(lu, rd);
	}
	
	public Rect (Rect r) {
		super((Shape)r);
	}
	
	@Override
	public void print() {
		System.out.println("�簢���Դϴ�.");
	}
	
	
}
