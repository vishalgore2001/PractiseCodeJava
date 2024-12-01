/*1) Create a class named 'Rectangle' with two data members- length and breadth and a
method to calculate the area which is 'length*breadth'. The class has three constructors
which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and
breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print
their areas.
*/
//========================================================================================
import java.util.Scanner;
class RectangleApp{
 	public static void main(String x[]){
	Scanner sc =new Scanner (System.in);
	System.out.println("Eneter the length");
	int l=sc.nextInt();
	System.out.println("Enter the breadth");
	int b=sc.nextInt();
	Rectangle R=new Rectangle(l,b);
	R.area();
	
	}

}
class Rectangle{
	private int length;
	private int breadth;

	Rectangle(int l,int b){
		length=l;
		breadth=b;
	}
	void area(){
                  float area=length*breadth;
		System.out.println("Area of reactangle is "+ area);
		
	}

}