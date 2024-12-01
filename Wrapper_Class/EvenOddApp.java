/*4. *Even or Odd*
   - *Problem:* Take an integer input from the user as a String,
   convert it into an Integer using a wrapper class, 
   and check if the number is even or odd.
   - *Input:* "29"
   - *Output:* Odd
   ====================================================================================
   */
 import java.util.Scanner;
 class EvenOddApp{
	 public static void main(String x[]){
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the number");
		 String num= sc.nextLine();
		 int number=Integer.parseInt(num);
		 if (number%2==0){
			 System.out.println("Even number");
		 }
		 else{
			 System.out.println("Odd number");
		 }
		 
	 }
 }
   