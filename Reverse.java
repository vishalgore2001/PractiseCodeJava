import java.util.Scanner;
class Reverse{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  the String ");
		String name=sc.nextLine();     // vishal
		for(int i=0 ,  j=(name.length())-1;i<(name.length())/2;i++,j--){
				char temp=name.charAt(j);
			name .charAt(j)=name.charAt(i);
				name.charAt(i)=temp;
		}
String name2 =name.toString(name);
     
System.out.println(name2);
	}


}