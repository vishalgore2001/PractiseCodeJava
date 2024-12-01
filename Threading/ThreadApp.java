class TheadAPP{
  public static void main(String x[]){
              First f =new First();
			  Second s =new Second();
			  f.start();
			  s.start();
  
  }
}
 class First extends  Thread{
	  
	  public void run(){
		   try{
       for(int i=0;i<5;i++){
		   System.out.println(" first thred "+ i);
		     Thread.sleep(10000);
	   }
	  }
	   catch(Exception ex){
		   System.out.println("Error is" + ex);
	   }
 }
 }
 
 class   Second extends  Thread{
	 
	public   void run(){
		  
	 try{
       for(int i=0;i<15;i++){
		   System.out.println(" second thread "+ i);
		   Thread.sleep(1000);
		   
	   }
	 }
	   catch(Exception ex){
		   System.out.println("Error is" + ex);
	   }
 }
 }

