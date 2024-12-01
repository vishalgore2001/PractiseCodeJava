//14).WAP to create the class name as MarixMultiplication with a following methods 
//=======================================================================================
import java.util.Scanner;
class MatrixMultiplicationApp{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int [3][3];
		System.out.println("Enter the value:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
			 MatrixMultiplication MM= new MatrixMultiplication();
				MM.acceptTwoDArray(a);
 				MM.showMatrixMultiplication();


	}
}
class MatrixMultiplication{

private int a[][];
	void acceptTwoDArray(int a[][])
	{
	     this .a=a;
	}
	void showMatrixMultiplication()
	{
			for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=a[i][j]*a[i][j];
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
	}


}