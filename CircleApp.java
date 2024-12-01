//1). WAP to create the class name as Circle with a following methods 
import java.util.Scanner;
class AreaApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
	  	System.out.println("Enter the Radius:");
		int rad=sc.nextInt();
        
   		Circle c=new Circle();
                       
                       c.setRadius(rad);
                       c.showArea();
	}
}

class Circle{
Double Area;
int r;
 	void setRadius(int r){
		this .r=r;
	}
	void showArea(){
                  Area=3.14*r*r;
	System.out.println("Area of Circle is : = "+Area);
	}
         


}