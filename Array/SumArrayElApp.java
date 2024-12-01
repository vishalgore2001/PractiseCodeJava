/*1) WAP to enter the five elements in array and show it
2) WAP to enter the five elements in array and calculate the sum of all elements 
*/
//=============================================================================================
import java .util.Scanner;
class SumArrayElApp{
public static  void main(String x[]){
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the array  elements");
	int a[]=new int[5];
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}

	  System.out.println("Given array is");
	  int sum=0;
	  for(int i=0;i<a.length;i++){
		  
		  System.out.print(a[i]+"\t");
		  sum=sum+a[i];
	  }
	  System.out.println("\nAddition of each elements in given array is "+ sum);

	}

}
