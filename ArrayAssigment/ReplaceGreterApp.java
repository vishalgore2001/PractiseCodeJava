/*7)	Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers.
There is no element next to the last element, therefore replace it with -1. 

Input- Original Array 
[45, 20, 100, 23, -5, 2, -6]
Output- The modified array:
[100, 100, 23, 2, 2, -6, -1]
*/
//===========================================================================

import java.util.Scanner;
class ReplaceGreterAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int index=0;
		boolean flag=true;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]>a[i]){
					a[i]=a[j];
					flag=false;
					break;
				}
				else{
					flag=true;
					index=j;
				}
			}
				
			if(i==a.length-1){
				a[i]=-1;
			}
		}
		System.out.println("Display the array element after replaceing next greter element");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}	
	}
}