//2) WAP to enter the five elements in array and find out the maximum and minimum elements
//===========================================================================================

import java .util.Scanner;
class MaxApp
{
  public static void main(String x[])
  {
     Scanner sc =new Scanner (System.in);
	 int a[]=new int[5];
	 System.out.println("Enter the elements");
	 for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	 }
	 int max=a[0];
	 for(int i=0;i<a.length;i++){
		 
		if (a[i]>max){
			max=a[i];
		}
	 } 
	 System.out.println("Maximum number in  given array is == "+ max);
  }

}