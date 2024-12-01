/*. *Temperature Conversion*
   - *Problem:* Create a program that converts temperatures between Celsius and Fahrenheit. 
   The temperature value should be taken as a String, 
   converted into a Double using the wrapper class, and then perform the necessary conversions.
   - *Input:* "32" (Fahrenheit)
   - *Output:* 0 (Celsius)
   
=================================================================================================
   */
import java.util.Scanner;
class TempApp{
	 public static void main( String x[]){
		  Scanner sc =new Scanner(System.in);
		  System.out.println(" Enter the temperature in celsius");
		  String tempinsel=sc.nextLine();
		 double d= Double.parseDouble(tempinsel);
		   System.out.println(d);
		   double f=d*(9/5)+32;
		   System.out.println(" after  converting celsius to farhniet  farhniet=="+ f);
	 }
	 
 }



