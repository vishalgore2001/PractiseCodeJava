/*6)	 Write a Java program to separate even and odd numbers from a given array of integers. 
Put all even numbers first, and then odd numbers.  
Input – 20 12 23 17 7 8 10 2 1 0
Output- 20 12 0 2 10 8 7 17 1 23
*/
//==============================================================================================
import java.util.Scanner;
class SepareteEOddApp{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		int a[]=new int [5];
		
		System.out.println("Enetr the array elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
						 int j=0;
						  int k=0;
		int Ecount=1;
		int Ocount =1;
		int even[]=new int [Ecount];
		int odd[]=new int [Ocount];
		 for(int i=0;i<a.length;i++){
			 if(a[i]%2==0){

				 even[j]=a[i];
				 ++Ecount;
				 ++j;
			 }
			 else{
				 odd[k]=a[i];
				 ++Ocount;
				 ++k; 
			 }
		 }
		 
		 System.out.println(Ecount);
		 System.out.println("Diplaying the even elements array");
			for(int i=0;i<Ecount ;i++){
				System.out.print(even[i]+"\t");
			}
		System.out.println("\nDisplaying the odd elements array");
		
		 for(int i=0;i<Ocount;i++){
				System.out.print(odd[i]+"\t");
			}
	}

}