/*Q2. WAP to create POJO class name as Student with field id,name and per 
and create array of object student with size 5 and input the id of student and search student record in student object array and 
if student then display student found otherwise display message student not found.*/

//==============================================================================
import java.util.Scanner;
class StudentApp{
	public static void main(String x[]){
	 Scanner sc =new Scanner (System.in);
		System.out.println("Enter  size or count  of student ");
		 int size=sc.nextInt();
		Student s[]=new Student[size];
		System.out.println("Enter the detail of students");
		for(int i=0;i<s.length;i++){
			s[i]=new Student();
			System.out.println("Enter the id of student");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name of Student");
			String name=sc.nextLine();
			System.out.println("Enter the percentage of student ");
			 float per =sc.nextFloat();
			s[i].setId(id);
			s[i].setName(name);
			s[i].setPer(per);
		}
			System.out.println("Enter the  Search id of Student ");
			 int sid=sc.nextInt();
			boolean flag=true;
			int index=0;
			for(int i=0;i<s.length;i++){
				if(s[i].getId()==sid){
					flag=true;
					index=i;
					break;
				}
				else{
					flag=false;	
				}
			}
			if(flag){
				System.out.println("Student Record Found");
				System.out.println("ID: "+ s[index].getId()+"\tName: "+s[index].getName()+"\tPercenatage: "+s[index].getPer() );
			}
			else{
				System.out.println("Student Record NOT FOUND :");
			}
	}

}
class Student{
private int id;
private String name;
private float per ;
	void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	void setPer(float per){
			this.per =per;
	}
	public float getPer(){
		return per;
	}

}