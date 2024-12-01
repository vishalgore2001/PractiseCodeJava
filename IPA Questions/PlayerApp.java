import java.util.Scanner;
Class PlayerApp{
  public static void main()\
  {
     Scanner sc =new Scanner(System.in);
	 int pid=sc.nextInt();
     String pname=sc.nextLine();
      int runs=sc.nextInt();
       String ptype=sc.nextLine();
      String mtype=sc.nextLine()
	 Player p[]=new Player[5];
	 
	  for(int i=0;i<p.length;i++){
		  int pid=sc.nextInt();
     String pname=sc.nextLine();
	 sc.nextLine();
      int runs=sc.nextInt();
       String ptype=sc.nextLine();
      String mtype=sc.nextLine()
		  p[i]=new Player(pid,pname,runs,ptype,mtype);
		  
	  }
	   int leastrun=findPlayerWithLowestRuns()
    
  }
  public static int  findPlayerWithLowestRuns(Player p[],String val)
  {       int min=p[0].getRuns();
		   for(int i=0;i<p.length;i++){
			   if(p[i].getRuns()<min){
				   int min=p[i].getRuns();
			   }
		   }
		   return min;
  }
   public static Player []  findPlayerByMatchType(){
  
		
  }
}
class Player{
	
  private int pid;
  private  String pname;
  private int runs;
  private String ptype;
  private String mtype;
  
  Player(int pid,String pname,int runs,String ptype,String mtype){
	  this.pid=pid;
	  this.pname-pname;
	  this.runs=runs;
	  this.ptype=ptype;
	  this.mtype=mtype;
	  
	  
  }
  public void setId(int pid){
	  this.pid=pid;
  }
  public int getId(){
	  return pid;
  }
  public void setName(String pname){
	   this.pname=pname;
  }
  public String getName(){
	  return pname;
  }
  public void setRuns(int runs){
	  this.runs=runs;
	  
  }
  public int getRuns(){
	  return runs;
  }
  public void setPtype(String ptype){
      this.ptype=ptype;	  
  }
  public String getPtype(){
	   return ptype;
  }
  public void setMtype(String mtype){
	  this.mtype=mtype;
	  
  }
  public String getMtype(){
	  return mtype;
  }
}