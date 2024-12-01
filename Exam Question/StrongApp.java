import java.util.Scanner;
class StrongApp{
public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter the limit ");
	   int limit = sc.nextInt();
	   System.out.println("")
	    for(int i=1;i<limit;i++){
			 
			int sum=0;
			int temp=i;
			  while(temp!=0){
				  int rem=temp%10;
				   int fact=1;
				   for(int k=1;k<=rem;k++){
					   fact=fact*k;
				   }
				   temp=temp/10;
				   sum=sum+fact;
			  }
			   if (sum==i){
				   System.out.println(i);
			   }
			
			
		}


	}



}