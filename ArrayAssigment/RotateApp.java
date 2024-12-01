/*4)	 Write a Java program to cyclically rotate a given array clockwise by n.  
Input- 1 2 3 4 5 6
Rotate array by 1
Output-6 1 2 3 4 5
Rotate array by 3
Output-4 5 6 1 2 3 */
//============================================================================
import java.util.Scanner; 
class RotateApp{
public static void main(String x[]){
	Scanner sc =new Scanner(System.in);
 RotateAntiClokWise ac=new  RotateAntiClokWise();
    		int a[]=new int [6];
		int b[]=new int [6];
	System.out.println("Enter the first array elements");
	
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		
	}
	System.out.println("Enter the second  array elements");
	for(int i=0;i<a.length;i++){
		b[i]=sc.nextInt();
		
	}
	System.out.println("  Enetr the time to rotate");
     	int n =sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		int first=a[0];
		for(int j=0;j<a.length-1;j++)  //01 12 23 34 
		{
			a[j]=a[j+1];
		}
		  a[a.length-1]=first;
	}
	System.out.println("Display  the array after   clockwise rotation");
	for(int i=0;i<a.length;i++)
	{
	System.out.print(a[i]+"\t");
	}

	ac.displayOut(b,n);
}
		
}
class RotateAntiClokWise{

    	 void displayOut(int  b[],int n){
	
	for(int i=1;i<=n;i++)
	{
		int last=b[b.length-1];
		for(int j=0;j<b.length-1;j++)  
		{	
			b[b.length-1-j]=b[b.length-2-j];
		}
		b[0]=last;
		  
	}
	System.out.println("\nDisplay  the array after  anitclockwise rotation");
	for(int i=0;i<b.length;i++)
	{
	System.out.print(b[i]+"\t");
	}
	}


}