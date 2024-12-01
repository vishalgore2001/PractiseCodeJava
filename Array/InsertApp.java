//4) WAP to insert the element on specified position in array ?
//e.g. declare the array of size 6 and store 5 values in it and last block should be empty


//=======================================================================================================================

import java.util.Scanner;
class InsertApp{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enetr the array elemensts");
	    for(int i=0;i<a.length-1;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println("\nEnetr the index  where to add the value ");			
		int index =sc.nextInt();
		System.out.println("Enter the value");
		int val=sc .nextInt();
		
		
		 for(int i=0;i<a.length;i++){
			 if(i==index){
				  for(int j=a.length-1;j>index;j--){
					 a[j]=a[j-1];
					  
				  }
			 } 
		 }
		a[index]=val;
		 System.out.println("\ndisplay the array afetr the inserting  ");
		 for(int i=0;i<a.length;i++){
			 System.out.print(a[i]+"\t");
			 
		 }
		
		
		
		}
}