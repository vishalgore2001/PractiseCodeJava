import java.util.Scanner;
class DigitSum{
public static void main (String x[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
  String c=sc.nextLine();
          int s=0;
        for(int i=0;i<c.length();i++){  
            if(c.charAt(i)>=48 && c.charAt(i)<=57){
               int z=c.charAt(i)-48;
                s= s+z;
            }
        }
        System.out.println("Sum is "+ s);
    }
}


