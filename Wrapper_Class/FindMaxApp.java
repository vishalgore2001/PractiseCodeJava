/*3. *Maximum of Three Numbers*
   - *Problem:* Write a method that takes three String inputs, 
   converts them into Integer objects using wrapper classes, 
   and returns the maximum of the three.
   - *Input:* "12", "23", "15"
   - *Output:* 23
 ====================================================================
   */
   
import java.util.Scanner;
class FindMaxApp{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
			 System.out.println("Enetr the first number");
			 String num1=sc.nextLine();
			 System.out.println("Enter the second number");
			 String num2=sc.nextLine();
			 System.out.println("Enetr the third number");
			 String num3=sc.nextLine();
			 
			 int  number1=Integer.parseInt(num1);
			  int  number2=Integer.parseInt(num2);
			   int  number3=Integer.parseInt(num3);
			   if(number1>number2&&number1>number3){
				   System.out.println("Max number is "+ number1);
			   }
			   else if(number2>number1 && number2>number3){
				   System.out.println("Max number is "+ number2);
			   }
			   else{
				   System.out.println("max number is "+ number3 );
			   }
		}
}
   