/*5.WAP create interface name as ArrayOperation with method name as PerformOperation(int [])
 And its implementor classes given below */
 //=====================================================================================================
import java.util.Scanner; 
class ArrayOperationApp{
	public static  void main(String x[]){
		
		Scanner sc = new Scanner (System.in);
		int a[]=new int[5];
		System.out.println("Enter the values");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		Sort s =new Sort();
		
	}
}

interface ArrayOperation{
      void performOperation(int x[]);
}

class Sort implements ArrayOperation{
	performOperation(int x[]){
		
	  for(int i=0;i<a.length;i++){
		  
		  for(int j=i+1;j<x.length;j++){
			   if(x[i]>x[j]){
				   int temp=x[i];
				   x[i]=x[j];
				   x[j]=x[temp];
			   }  
		  }
	  }
	  System.out.println("Array  after sorting ");
	   for(int i=0;i<x.length;i++){
		   System.out.print(x[i]+"\t");
	   }
	}
}
class Insertion implements ArrayOperation{
	
	 void performOperation(int x[]){
           
		   System.out.println("Enter the index where to add the values");
		   
			int index=sc.nextInt();
			System.out.println(" Enter the value");
			int value =sc.nextInt();
	
              for(int i=0;i<x.length;i++){
				  if(i==index){
					  x[i]=value;
				  }
			  }
	   }
	   
}
class Deletion implements ArrayOperation{
	
	 void performOperation(int x[]){
		 System.out.println("Enetr the index");
		 int index=sc.nextInt();
		 
		 for(int i=0;i<x.length;i++){
			 
			 
		 }
		
	 }
}