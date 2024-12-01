/*create the class Course with the below Attributes.

courseId- int
courseName- String
courseAdmin- String
quiz- int
handson -int

The above methods should be private ,write getter and
setter and parametrized constructor as required.

create class courseProgram with main method.

implement two static methods-
   findAvgOfQuizByAdmin method:this method will take array
of Course objects and a String  value as input parameters.
This method will find out Average (as int) of Quiz questions
for given Course Admin (String parametre passed)
This method will return Average if found.if there is no course
that matches then the method should return 0.

sortCourseByHandsOn method:
This method will take an Array of Course Objects and int
value as input parameters.
This methods should return an Array of Course objects in an
ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no
such course then the method should return null.

The above mentioned static methods should be called from
main methods.

for findAvgOfQuizByAdmin method: The main method
should print the average if the returned value is not 0.
if the returned value is 0 then it should print "No Course
found."


for sortCourseByHandsOn method:
                        the  main method should print the name
of the Course from the returned Course object Array if the
returned value is not null.if the returned value is null then
it should print "No Course found with mentioned attribute."

input1:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Nisha
17

output1:
35
kubernetes
Apache Spark
cassandra

input2:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Shubhamk
5

output 2:
No Course found
No Course found with mentioned attributes.
*/
import java.util.Scanner;
class CourseProgramApp
{     
	public static void main(String x[])
   {
	Scanner sc =new Scanner (System.in);
	Course c[]=new Course[4];
	for(int i=0;i<4;i++){
		int id=sc.nextInt();
		String courseName=sc.nextLine();
		sc.nextLine();
		String courseAdmin=sc.nextLine();
		
		int quiz=sc.nextInt();
		int handson=sc.nextInt();
		c[i]=new Course(id,courseName,courseAdmin,quiz,handson);
	}
	sc.nextLine();
	String val=sc.nextLine();
	int val2=sc.nextInt();
	int ans=findAvgOfQuizByAdmin(c,val);
	if(ans!=0){
		System.out.println(ans);
	}
	else{
		System.out.println("No Such Course Found");
	}
	sortCourseByHandsOn(c,val2);
  
	if( sortCourseByHandsOn(c,val2)!=null){
		for(int i=0;i<4;i++){
			System.out.println(c[i].getCourseName());
		}
		
		
	}
	else{
		System.out.println(" No Course found with mentioned attribute. ");
	}
   }

   public static int findAvgOfQuizByAdmin(Course c[],String val)
   {
	 int avg=0;
	 int count =0;
	  for(int i=0;i<4;i++){
		  if(val.compareTo(c[i].getCourseAdmin())==0){
			  avg=avg+c[i].getQuiz();
			  count++;
		  }
	  }
	  avg=avg/count;
	  return avg;
   }
   
 
   
   public static  Course[] sortCourseByHandsOn(Course c[],int val2)
   {
	      
		   for(int i=0;i<4;i++){
			   for(int j=i+1;j<4;j++){
				   if(val2>c[i].getHandson()&&c[i].getHandson()>c[j].getHandson()){
					   Course temp=c[i];
					   c[i]=c[j];
					   c[j]=temp;
					   
				   }
			   }
		   }
	  
	  return c;
   }
   
}

class Course{
	private int courseId;
	private String courseName;
	private String courseAdmin;
	int quiz;
	int handson;
	
   public Course(int courseId,String courseName,String courseAdmin,int quiz,int handson)
   {
	    this.courseId=courseId;
	    this.courseName=courseName;
	    this.courseAdmin=courseAdmin;
		this.quiz=quiz;
		this.handson=handson;
   }
   
   public void setCourseId(int courseId){
	   this.courseId=courseId;
	   
   }
   public int getCourseId(){
	   return courseId;
   }
   public void  setCourseAdmin(String courseAdmin){
	   this.courseAdmin=courseAdmin;
   }
   public  String  getCourseAdmin(){
	   return courseAdmin;
   }
   public void setQuiz(int quiz){
	   this.quiz=quiz;
   }
   public int getQuiz(){
	   return quiz;
   }
   public void setHandson(int handson){
	   this.handson=handson;
   }
   public int getHandson(){
		return handson;
   }
   public void setCourseName(String courseName){
	   this.courseName=courseName;
   }
   public String getCourseName(){
	   return courseName;
   }
}

