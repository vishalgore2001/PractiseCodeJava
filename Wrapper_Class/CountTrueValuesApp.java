/*5. *Count Number of True Values*
-*Problem:* Write a program that 
takes a list of String inputs representing boolean values ("true" or "false"),
converts them into Boolean wrapper objects,and 
counts how many of them are true.
 - *Input:* "true", "false", "true", "true", "false"
   - *Output:* 3
//================================================================   
*/
import java.util.Scanner;
class CountTrueValuesApp{
	public static void main(String x[]){
	  Scanner sc =new Scanner(System.in);
	  String s[]=new String[5];
	  System.out.println("Enter the string array");
	  for(int i=0;i<s.length;i++){
		  s[i]=sc.nextLine();
		  
	  }
	  System.out.println("Display the  given  string array");
	  for(int i=0;i<s.length;i++){
		  System.out.print(s[i]+"\t");
	  }
	  boolean original=true;
	   int count =0;
	  for(int i=0;i<s.length;i++){
		  boolean b= Boolean.parseBoolean(s[i]);
		  if (b==original){
			  count++;
		  }
	  }
	  System.out.println("\n Count of true in given string is "+count);
	}
	
	
}