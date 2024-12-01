/*3) Create a class named 'Programming'. While creating an object of the class, if nothing is
passed to it, then the message "I love programming languages" should be printed. If some
String is passed to it, then in place of "programming languages" the name of that String
variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed.
*/
//==================================================================
import java.util.Scanner;
class ProgrammingApp{
	public static void main(String x[]){
	Scanner sc =new Scanner (System.in);
	System.out.println("Enetr the string ");
	String st=sc.nextLine();
	Programming p1=new Programming();
	Programming p=new Programming(st);
	}

}
class Programming{

		Programming (){
			System.out.println(" I Love programming languauge");
		}
		Programming(String name){
			
			System.out.println(" I love "+ name );
		}
}

