import java.util.Scanner ;
class TableApp
{
	public static void main(String x[])throws Exception
	{
		Scanner sc =new Scanner(System.in);
        Table T =new Table();
		   A obj=new A();
		  obj.setTable(T);
		  obj.start();
	       B objb =new B();
		   objb.setTable(T);
		   objb.start();
		
	}
}
 class Table{
	 
	 public void showTable(int no){
		 
		   for(int i=1;i<=10;i++)
		   {
			   System.out.println(no*i);
		   } 
	 }
 }
  class A extends Thread{
	  Scanner sc =new Scanner(System.in);
	  Table t;
	  void setTable(Table t){
		  this.t=t;
		  
	  }
	   public void run(){
		   System.out.println("Enetr the number");
		   int number =sc.nextInt();
		   t.showTable(number);
		   Thread.sleep(10000);
	   }
	  
	  
  }

  class B extends Thread{
	  Scanner sc =new Scanner(System.in);
	  Table t;
	  void setTable(Table t){
		  this.t=t;
		  
	  }
	   public void run(){
		  System.out.println("Enetr the number");
		   int number =sc.nextInt();
		   t.showTable(number);
           Thread.sleep(1000);
	   }
  }
