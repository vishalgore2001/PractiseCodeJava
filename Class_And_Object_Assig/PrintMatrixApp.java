/*13).WAP to create the class name as PrintMatrix with a two methods void acceptTwoDArray(int
x[][]) and showMatrix() sample code given below */
//=============================================================================================
import java.util.Scanner;
class PrintMatrixApp{
public static void main(String x[])
	{
		Scanner sc =new Scanner (System.in);
		int a[][]=new int [3][3];
		System.out.println("Enter the value :");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
			
   				a[i][j]=sc.nextInt();
			}
		}

		PrintMatrix pm=new PrintMatrix();
			pm.acceptTwoDayArray(a);
			System.out.println("Your Matrix As Below:");
			pm.showMatrix();
	}
}
class PrintMatrix{
	private int a[][];
		void acceptTwoDayArray(int x[][]){
			a=x;
		}
		public void showMatrix()
		{    
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
			
   				  System.out.print(a[i][j]+"\t");
				}
				System.out.println(" ");

			}
			
		}
}