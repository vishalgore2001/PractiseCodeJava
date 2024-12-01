/*4. WAP to create the abstract class name as Area with showArea() abstract method and declare the
two child classes name as Circle and Rectangle with a following methods
*/
//==============================================================================================

import java.util.Scanner;
class AreaApplication{
	public static void main(String x[]){
		Scanner sc =new Scanner (System.in);
		System.out.println("Enetr the length of rectangle ");
		int len=sc.nextInt();
		System.out.println("Enetr the width of rectangle ");
		int width=sc.nextInt();
		Rectangle R=new Rectangle();
		R.setLengthWidth(len,width);
		R.showArea();
		System.out.println("Enetr the radius of circle ");
		int rad=sc.nextInt();
		Circle  C =new Circle();
	      C.setRad(rad);
		  C.showArea();
	}
}
abstract class Area{
	abstract  void showArea();
}
class Circle extends Area{
    int rad;
	void setRad(int rad){
		this.rad=rad;
	}
	void showArea(){
		System.out.println("Area of circle is " + 3.14*rad*rad);
	}
}
class Rectangle extends Area{
	int len;
	int width;
	void setLengthWidth(int len,int wid){
		this.len=len;
		this.width=wid;
	}
		void showArea(){
			System.out.println("Area of rectangle is "+ len*width );
		}
			
}