package test;

import javatest.point;

public class Shape {
	
	// 상속함수 
	
	private point leftup ;
	private point rightdown ;
	private int height ;
	private int width ;
	
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
	
	public Shape(int left, int up, int right, int down) {
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
	
	public Shape(point leftup, point rightdown) {
		this(leftup.getX(),leftup.getY(),rightdown.getX(),rightdown.getY());
	}
	
	public Shape(Shape e) {
		this(e.leftup.getX(),e.leftup.getY(),e.rightdown.getX(),e.rightdown.getY());
	}
	public Shape() {
		this(0,0,10,10);
	}
	
	public void calwidth() {
		width = Math.abs(leftup.getY()-rightdown.getY()) ;
	}
	public void calheight() {
		height = Math.abs(leftup.getY()-rightdown.getY()) ;
	}
	
	public void print() {
		System.out.println("---------도형입니다.---------");
	}
	
	
}




















