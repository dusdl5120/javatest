package javatest;

public class Main {

	public static void main(String[] args) {
		
		point pt1 = new point(1,2) ;
		point pt2 = new point(pt1) ;
		pt1.print();
		pt2.print();
		point pt3 = pt2.getlocation() ;
		pt3.print();
		pt3.move(10, 1);
		pt3.print();
		pt3.translate(10, 10);
		pt3.print();
		System.out.print("pt2°ª È®ÀÎ : ");
		pt2.print();
	
		
		
	}

}
