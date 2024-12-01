//3)WAP to enter the five element and display in ascending order ?
import java.util.Scanner;
class AscApp{

public static void main(String x[]){
		Scanner sc =new Scanner (System.in);
		int a[]=new int[5];
		System.out.println("Enter the Elements");
		 for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		 }
		 System.out.println("Array before ascending order ");
		 for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		 }
		 
		 for(int i=0;i<a.length;i++){
			  for(int j=i+1;j<a.length;j++){
				   if(a[i]>a[j]){
					   int temp=a[i];
					   a[i]=a[j];
					   a[j]=temp;
				   }
			  }
		 }
		 System.out.println("\nArray in ascending order");
		 
		 for(int i=0;i<a.length;i++){
			 
			 System.out.print(a[i]+"\t");
		 }

	}

}