import java.util.Scanner;
class ShowSubArry{
		public static  void main(String x[]){
                                  Scanner sc =new Scanner(System.in);
				int a[]=new int[5];
                                     System.out.println("Enetr the array elements:");
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			} 
                              for(int i=0;i<a.length;i++)	
			{
 				 
				for(int j=0;j<a.length;j++)
				{
						for(int k=i;k<j;k++)
						{
							System.out.print(a[k]+"\t");
						}
				System.out.println(" "); 
				}

			}
				
						
               		
	}

} 

