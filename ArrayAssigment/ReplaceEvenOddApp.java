/*6)	 Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.  
Input – 20 12 23 17 7 8 10 2 1 0
Output- 20 12 0 2 10 8 7 17 1 23
*/
//============================================================================================================================================
import java.util.Scanner;
class ReplaceEvenOddApp{
	public static void main(String x[]){
	Scanner sc =new Scanner (System.in);
	
	System.out.println("Enter the array Elements");
	
	int a[]=new int [10];
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
int j=0;
int count =0;
	for(int i=0;i<a.length;i++){
	if(a[i]%2==0){
		a[j]=a[i];
		++j;
		++count;
	}
	else{
		int l=a.length-1;
		if(a[l]%2==0){
		int temp=a[i];
	     a[i]=a[l];
		a[l]=temp;
		--l;	
		}
		else{
			int temp=a[i];
	     a[i]=a[l];
		a[l]=temp;
		--l;
			
		}
	}
	
	}
	
	System.out.println("Display the given array after sorting even and odd");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"\t");
	}
	
	}
}