
/*Q1 Sum of digit
Write a program that takes an integer input from the user as a String, converts it into an Integer using a wrapper class, and calculates the sum of its digits.
   - *Input:* "12345"
   - *Output:* 15
========================================================================
*/
import java.util.Scanner;
class SumApp
{
	public static void main(String x[])
	{   
	 Scanner sc =new Scanner (System.in);
	 System.out.println("Enter the the number");
	 String number =sc.nextLine();
	  int num = Integer.parseInt(number);
	  System.out.println("Your number is "+ num);
	  int sum=0;
	  while(num!=0){
		   int temp=num%10;
		    sum=sum+temp;
		     num=num/10;
	  }
	  System.out.println("Addition of each digit is "+ sum);
	}
}


