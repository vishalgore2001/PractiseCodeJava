/*6. create the class name as ConvertToUpper with a following methods
class ConvertToUpper
{ char c[];
 void setCharArray(char ch[])
 { //here accept the character array and store in instance variable in character array
 c=ch;
 }
 void convertToUpperCase()
 { //here we need to write the manual logics for converting lower case array
//to upper case
 }
}
public class ConvertToUpperApp
{
 public static void main(String x[])
 { //here declare the fix array with a some character e.g char ch[]=new char[]={"good"};
 //here create the object of ConvertToUpper class
 //call setCharArray() function and pass ch array in setCharArray() function
 //call convertToUpperCase() function and see the result
 }
}
*/
//==========================================================================================
import java.util.Scanner;
class ConvertToUpperApp{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr the name");
		char c[]=new char[6];
		for(int i=0;i<c.length;i++){
		c[i]=sc.next().charAt(0);
		}
		ConvertToUpper up=new ConvertToUpper();
			up.setCharArray(c);
			up.convertToUpperCase();
	}
}

class ConvertToUpper{
private char name[];
	void setCharArray(char chAr[]){
			name=chAr;
	}
	void convertToUpperCase(){
		for(int i=0;i<name.length;i++){
			name[i]=Character.toUpperCase(name[i]);
		}
		
		System.out.println(name);
		
	}

}