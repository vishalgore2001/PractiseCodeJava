/*15) WAP to create the class name as Employee with a following setter and getter method
and create the array of objects with a 5 elements or values and store data in it and show
it */
//===========================================================================================
import java .util.Scanner;
class EmployeeArrayApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
   		
	Employee[]  em = new Employee[3];
	System.out.println("Enter the details of Five Employee");
		for(int i=0;i<em.length;i++){
			em[i]=new Employee();
			System.out.println("Enter the id");
			int id=sc.nextInt();
		                 em[i].setId(id);
			
		System.out.println("Enter the Name");
		sc.nextLine();
			String name=sc.nextLine();
			em[i].setName(name);
	         System.out.println("Enter the Sal");
                             int sal=sc.nextInt();
			em[i].setSal(sal);	
		}
	System.out.println("Display the information of five employee");
		for(int i=0;i<em.length;i++){
			//System.out.printf("%d Employe detail  "+ i);
			System.out.print("ID : "+em[i].getId() +"\tName : "+em[i].getName()+"\t Sal: "+ em[i].getSal()+"\n");
			
		}

	}
	
}
class Employee{
private int ID;
private String Name;
private int sal;

 	void setId(int id){
		this.ID=id;
	}
	public int getId(){
		return ID;
	}
	void setName(String name){
		this.Name=name;
	}
	public String getName(){
	  	return Name;
	}
	void setSal(int sal){
		this.sal=sal;
	}
     	public int getSal(){
		return sal;
	}

}