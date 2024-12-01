import java.util.*;
class ReverseArrayApp
 {
    public static void main(String x[])
	{
	  Scanner sc =new Scanner(System.in);
	  int a[]=new int[5];
	  for(int i=0;i<a.length;i++)
	  {
		    a[i]=sc.nextInt();
	  }
	  
	  System.out.println("Display elements before the reverse");
	  
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.print(a[i]+"\t");
	  }
	  
	  for(int i=0;i<a.length/2;i++){
		  int temp=a[a.length-(i+1)];
		  a[a.length-(i+1)]=a[i];
		  a[i]=temp;
		  
	  }
	  System.out.println("\nAfter reverse");
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.print(a[i]+"\t");
	  }
	  
	}
 }