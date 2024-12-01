 
import java.util. Scanner;
class ManagementApp
{   
	public static void main(String x[])
	{
        Scanner sc =new Scanner(System.in);
		Associate a[]=new Associate[4];
		 for(int i=0;i<a.length;i++){
			 System.out.println("Enetr the id");
			 int id=sc.nextInt();
			 sc.nextLine();
			 System.out.println("Enetr the name");
			 String name=sc.nextLine();
			 System.out.println("Enetr the score");
			 double score =sc.nextDouble();
			 System.out.println("Enetr the experience");
			 int experience=sc.nextInt();
			  a[i]=new Associate(id,name,score,experience);
			 
		 }
		 System.out.println("Enter  searched  score ");
		 
		 double score=sc.nextDouble();
	    Associate user1=ManagementApp.searchAssociateByScores(a,score);
		if(user1==null){
			System.out.println(user1.getID()+"\t"+ user1.getName()+"\t"+user1.getExperience()+"\t"+ user1.getScore());
			System.out.println("MATCHED  RECORD NOT FOUND");
		}
		else{
			System.out.println(user1.getID()+"\t"+ user1.getName()+"\t"+user1.getExperience()+"\t"+ user1.getScore());
		
		}
       
	}

	public static Associate searchAssociateByScores(Associate a[],double score )
	{    boolean flag=false;
	     
		 for(int i=0;i<a.length;i++){
			 if(a[i].getScore()==score){
				  return a[i];
			 }
		 }
		 return null;
		 
	}
	//public static Associate findAssociateWithMaxExperience()
	//
		
	//}
 
 } 
 class Associate{
	  int id;
	  String name;
	  double score;
	  int experience;
	  Associate(int id,String name,Double Score,int Experience){
		  this.id=id;
		  this.name=name;
		  this.score=score;
		  this.experience=experience;
	  }
	 public void setId(int id)
	 {
		  this.id=id;
     }
	 public int getID()
	 {
		return id;
	 }
	 public void setName(String name){
		 this.name=name;
	 }
	 public String getName(){
		 return name;
	 }
	 public void setScore(double score){
		 this.score=score;
	 }
	 public double getScore(){
		 return score;
	 }
	 public void setExperience(int experience){
		 this.experience=experience;
	 }
	 public int getExperience(){
		 return experience;
	 }
	 
  }
  
