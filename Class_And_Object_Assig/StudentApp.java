/*4. WAP to create the class name as Student with a following methods
class Student
{ void setSubMarks(int s[])
 { //here we need to store the array in instance variable
 }
 void calculatePer()
 { //here we need to call the aggregate of six subjects marks through the array and calculate its per
and store in instance variable.
 }
 void checkGrades()
 { //here we need to check grades means per>75 && per<=100 then student in distinction if per>60
&& per<=75 then in first division if per>=50 && per<=60 then second division and if per>40 &&
per<=50 then in third division and if per <40 then student failed
 }
}
public class StudentApp
{ public static void main(String x[])
 { //create the object of scanner class
 //declare the array with 6 six of type integer and store input values in array as subject marks
 //create the object of Student class and call the setSubMarks() function and pass array in it
 //then call calculatePer() student function
 //then call checkGrades() function for checking the grading of students.
 }
}
*/
import java.util.Scanner;
class StudentApp{
	public static void main(String x[]){

	Scanner sc =new Scanner (System.in);
  	int marks[]=new int [5];
	System.out.println("Enter the marks of five subjects:");
	for(int i=0;i<marks.length;i++){
		marks[i]=sc.nextInt();
		}
	Student s =new Student();
	s.setMark(marks);
     	s.calPercentage();
	s.checkGrades();
	
	}
}
class Student{
private float per;
private int mark[];
	
	 void setMark(int m[]){
		mark=m;
	}
	
	void calPercentage(){
      	int sum=0;
		for(int i=0;i<mark.length;i++)
		{
   			sum=sum+mark[i];
		}
       		per=(sum/500.0f)*100;
	}
	void checkGrades(){
		System.out.println("You Got "+ per + "%  Percentage ");
		if(per>=75&&per<=100){
			System.out.println("You Got Distinction ,Conagratulation......");
		}
		else if(per>=65&&per<75){
			System.out.println("You Got Grad A ,Suggestion : Keep it up  ");
		}
		else if(per>=55&&per<65){
			System.out.println("You Got Grade B,Suggestion : Try To Improve More To Get Marks ");
		}
		else if(per>35&&per<55){
			System.out.println("You Got Grade C,Suggestion : Improve Next Time By Doing Practise");
		}
		else{
			System.out.println("Soory,Unfortunatly You failed in Exam ,Suggestion: Try Next Time With Full of Dedication");
		}

	}
       	



}