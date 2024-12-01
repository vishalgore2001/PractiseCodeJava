/*16) WAP to create the class name as Employee class and create the array object of
Employee class of size 5 and store all data in it and arrange all employee data in ascending
order salary wise*/
//============================================================================================
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
			
                                           for(int j=i+1;j<em.length;j++){
					if(em[i].getSal()>em[j].getSal()){
							         Employee temp=em[i];
								em[i]=em[j];
								em[j]=temp;
						}


			   	}
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