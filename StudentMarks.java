/*Example: WAP to Create class name as Student with field id,name,marks[] with setter and getters means 
void setId(int): accept id as parameter
int getId(): return id as parameter
void setName(String name): this method can accept name as parameter
String getName(): return name as parameter
void setMarks(int marks[]): this method can accept marks of six subject 
int [] getMarks(): this method can return marks of six subjects
and you have to create one more class name as FindPer with two methods 
void setStudent(Student student): this method accept student reference as parameter 
void showStudent(): this method can show the student data using reference of student 
float getPer(): this method can access six subject marks of student and calculate its percentage and return it.
*/
import java.util.Scanner;
class StudentMarks{
  public static void main(String x[]) 
      {
          Scanner sc =new Scanner(System.in);
          int a[]=new int [5];
    System.out.println("Enetr the marks studunt");
   for(int i=0;i<a.length;i++)
           {
               a[i]=sc.nextInt();
            }
        Student s = new Student();
           s.setId(1);
           s.setName("VISHAL");
            s.setMarks(a);
 FindPer p=new FindPer();
p.setStudent(s);
p.assignArray();
System.out.println("percentage : "  + p.getPer());
p.showStudent();

      }
}
class Student{
private int ID;
private String Name;
public   int mark[];
 void  setId(int id){
    ID=id;
}
int getId(){
  return  ID;
}
 void setName(String n){
   Name=n;
}
String getName(){
return Name;
}
void setMarks(int m[]){
this.mark=m;
}
public int [] getMarks(){
System.out.println("Check");
    for(int i=0;i<mark.length;i++){
System.out.print(mark[i]+"\t");
}
 return  mark;
}
}

class FindPer{
private Student data;
private int Mark[];
  
void setStudent(Student s){
data=s;
}
void assignArray(){
Mark = data.getMarks();
}
void showStudent(){
System.out.print(data.getId()+""+data.getName()+""+data.getMarks());
}
float getPer(){
          float per;
           int totalM=0;
      for(int i=0;i<Mark.length;i++){
              totalM=totalM+Mark[i];
          }
     per=(totalM/Mark.length)*100;
return per;
}


}


