package test;

import javatest.point;

public class ellipse {

	// Ÿ�������
	
	// 1. �������
	private point leftup ;
	private point rightdown ;
	private int height ;
	private int width ;
	
	
	// 2. getter, setter
	public point getLeftup() {
		return leftup;
	}
	public void setLeftup(point leftup) {
		this.leftup = leftup;
	}
	public point getRightdown() {
		return rightdown;
	}
	public void setRightdown(point rightdown) {
		this.rightdown = rightdown;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {

		this.width = width;
	}

	
	// 3. �����ڵ�
		
	public ellipse(int left, int up, int right, int down) {
		if (left > right) {
			int tmp = left ;
			left = right ;
			right = tmp ;
		}
		if ( up < down) {
			int tmp = up ;
			up = down ;
			down = tmp ;
		}
		leftup=new point (left, up);
		rightdown = new point ( right, down);
		this.calheight();
		this.calwidth();
	}
	
	public ellipse(point leftup, point rightdown) {
		this(leftup.getX(),leftup.getY(),rightdown.getX(),rightdown.getY());
	}
	
	public ellipse(ellipse e) {
		this(e.leftup.getX(),e.leftup.getY(),e.rightdown.getX(),e.rightdown.getY());
	}
	public ellipse() {
		this(0,0,10,10);
	}
	
	// 4. �ʿ� ��� -> �޼ҵ�
		public void print() {
			System.out.println("Ÿ���� ����");
			System.out.print("��  ��  ��  �� �� : ");
			leftup.print();
			System.out.print("������ �Ʒ��� �� : ");
			rightdown.print();
			System.out.println("���� : "+ width);
			System.out.println("���� : "+ height);
		}		
		
		public void calwidth() {
			width = Math.abs(leftup.getY()-rightdown.getY()) ;
		}
		public void calheight() {
			height = Math.abs(leftup.getY()-rightdown.getY()) ;
		}
		
		public void move (int dx, int dy) {
			leftup.translate(dx, dy);
			rightdown.translate(dx, dy);
		}
		
		public void resize(int widht, int height) {
			if (width<0) width = -width ;
			if (height<0) height = -height ;
			this.setWidth(width);
			this.setHeight(height);
			this.rightdown.move( this.leftup.getX()+width, this.leftup.getY()-height); 
		}
	
}
	
	
				
						
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
