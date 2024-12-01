/*2. WAP To implement the concept of Inheritence for Engg Result.You are required to implement
inheritance between classes. You have to write four classes in java i.e. one superclass, two sub
classes and one driver class.
*/
//==========================================================================================
import java.util.Scanner;
class ResultApp{
public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	int submCSE[]=new int [6];
	int submETC[]=new int [6];
	System.out.println("Enetr the detail  for CSE DEPARTMENTS");
	System.out.println("Enter the name");
	String name=sc.nextLine();
	System.out.println("Enter the id");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the add");
	String add=sc.nextLine();
	System.out.println("Enetr the year ");
	String year=sc.nextLine();
	
	System.out.println("Enter the five subject marks for cse class ");
	for(int i=0;i<submCSE.length;i++){
		submCSE[i]=sc.nextInt();
	}
	System.out.println("Enetr the detail  for ETC DEPARTMENTS");
	System.out.println("Enter the name");
	String name1=sc.nextLine();
	System.out.println("Enter the id");
	int id1=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the add");
	String add1=sc.nextLine();
	System.out.println("Enetr the year ");
	String year1=sc.nextLine();
	System.out.println("Enter the five subject marks for cse class ");
	for(int i=0;i<submETC.length;i++){
		submETC[i]=sc.nextInt();
	}
//Per p= new Per();
	CSE c=new CSE(name,id,add,year);
		c.calper(submCSE);
		c.showCSEPer();
	ETC e =new ETC(name1 ,id1,add1,year1);
		e.calper(submETC);
		e.showETCPer();
	

}
}

class Per{
	float perc;
	void calper(int s[]){
		int sum=0;
		for(int i=0;i<s.length;i++){
			sum=sum+s[i];
		}
		perc=(sum/600)*100;
	}
	
}
class CSE extends Per{
		String name;
		int id;
		String add;
		String year;
		
	 CSE(String name,int id,String add,String year){
		 this.id=id;
		 this.name=name;
		 this.add=add;
		 this.year=year;
	 }
	public void showCSEPer(){
		System.out.println("name:" +name +"\tid: "+id+"\tadd"+"\tyear:"+ year);
		 System.out.println("percenatge of CSE class "+perc);
	 }
	
}
class ETC extends Per{
	    String name;
		int id;
		String add;
		String year;
			ETC(String name ,int id,String add,String year){
				this.id=id;
				this.name=name;
				this.add=add;
				this.year=year;
			}
			
			void showETCPer(){
				System.out.println("Name:" +name +"\tid: "+id+"\tadd :"+add+"\tyear:"+ year);
				System.out.println("percenatge of ETC class " +perc);
			}
}