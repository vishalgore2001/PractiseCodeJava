/*3. WAP to create the class Employee with a following methods
class Employee
{ void setPersonalInfo(String name,int id,int basicSal)
 { //in this function we need to store name ,id and basicSal in instance variable
 }
 void setProgressPer(int progress)
 { //if progress value is greater than 60 per then increase the basic salary of
 //employee with 30 percentage
 }
 void show()
 {//in this function we need to show the all details of employee like as
 //name id and basic salary as well as incremental salary and total salary of employee
 }
}
public class AreaApp
{
 public static void main(String x[])
 { // here create the object of Scanner class and accept the name id and basic salary as well
 //progress per value not need to calculate it by using formual directly enter e.g 70
 //means 70%
 //create the object of Employee class and call setPersonalInfo and pass name id and salary
 // in it as well as setProgressPer() and pass progress value in it
 //call the show() method of Employee class.
 }
}
*/
//============================================================================
import java.util.Scanner;
class EmployeeProgressCal{
	public static void main(String x[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the id of Employee:");
                        int id =sc.nextInt();

		System.out.println("Enter the Name of Employee:");
		String name=sc.next();

		System.out.println("Enter the sallary of Employee:");
                        int sal=sc.nextInt();

                       System.out.println("Enter the Progress of Employee:");
   		int progres=sc.nextInt();

                      Employee  e=new Employee();

 		e.setPersonalInformation(name,id,sal);
 		e.setProgressPer(progres);
		e.showEmployeeDetail();
	}
}
class Employee{
  private String name;
  private int id;
  private  int basicsal;
 private int progress;

		void setPersonalInformation(String name,int id,int basic_sal){
				this .name=name;
				this.id=id;
				this.basicsal=basic_sal;
		}
		void setProgressPer(int Progr){
                                this.progress=Progr;
		}
                       void showEmployeeDetail(){
                                         if(progress>60){
                                           System.out.println("Name : "+name+"\tID: "+id+"\tBasicSal: Rs."+basicsal+"\tProgres: "+progress+"%");
                                         }
		}
		
	
}