//5.WAP create interface name as ArrayOperation with method name as PerformOperation(int [])
// And its implementor classes given below

//========================================================================================
 import java.util.Scanner ;
 class InterfaceArryOppApp{
   public static void main(String x[]){
   
   
   }
 
 }
  
  
  interface ArrayOperation{
	   void performOperation(int x[]);
	  
	 
  }
  
  class Sorting implements ArrayOperation{
	   public void performOperation(int x[]){
		   
		   for(int i=0;i<x.length;i++){
			   for(int j=i+1;j<x.length;j++){
				   if(x[i]>x[j])
				   {
					   int temp=x[i];
					   x[i]=x[j];
					   x[j]=temp;
					   
				   }
			   }
		   }
		   
		   System.out.println("Afetr the sorting given array in ascending order  ");
		   for(int i=0;i<x.length;i++){
			   System.out.print(x[i]+"\t");
			}
	   }
  }
  class Insertion implements ArrayOperation{
	  int index,num;
	   public void setIndex(int index,int number){
		   this.index=index;
		   this.num=number;
	   }
	   public void performOperation(int x[]){
		   
	   for(int i=0;i<x.length;i++){
		 if(index==i){
			 
			 a[i]=num;
		 }
	   }
		   
	   }
	  
  }
  class Deletion implements ArrayOperation{
	   public void performOperation(int x[]){}
  }
  class Revserse implements ArrayOperation{
	   public void performOperation(int x[]){}
	  
  }
  
  