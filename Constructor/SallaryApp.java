/*4) create the class name as Salary with a following constructor and methods
The major purpose of this program is calculate the salary of employee as per his present
days using a constructor.*/
//=========================================================================
import java.util.Scanner ;
class SallaryApp{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr the name of employee");
		String name =sc.nextLine();
		System.out.println("Enter the id of employee");
		int id=sc.nextInt();
		System.out.println("Enetr the present day of employee");
		int pday=sc.nextInt();
		System.out.println("Eneter the conatct number");
		int contact=sc.nextInt();
		System.out.println("Enter  the perday sallary of employee ");
		int pdaysal=sc.nextInt();
		
		Sallary s=new Sallary(name,id,pday,contact,pdaysal);
		s.calculateSalary();
		s.show();
		
	}
}
class Sallary{
	private int id;
	private String name;
	private int presentday;
	private  int contact;
	private int pdaysal;
	private int TotalSal;
	
	
	Sallary(String  name,int id,int pday,int contact,int pdaysal){
		this.name=name;
		this.id=id;
	
		this.presentday=pday;
		this.pdaysal=pdaysal;
		this.contact=contact;
	}
	public void calculateSalary(){
		TotalSal =presentday*pdaysal;
	}
    public void show(){
		System.out.println("Details of employee");
		System.out.println("Name "+ name +" \tid : " + id + "\tpresentday : "+ presentday+"\tpdaysal :  "+ pdaysal +"\tcontact : s " + contact);
		System.out.println("Your sallary amount is based on your presen day is : "+ TotalSal);
		
	}
}