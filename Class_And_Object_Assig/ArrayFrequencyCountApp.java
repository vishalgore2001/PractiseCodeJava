/*8.WAP to create the class name as ArrayFeqCount with a following methods
class ArrayFeqCount
{ int c[];
 void setIntArray(int ch[])
 { //here accept the integer array and store in instance variable in integer array
 c=ch;
 }
 void countFeqCount()
 { //here we need to write the manual logics for inserting value on specified index in arr
 }
}
public class ConvertToUpperApp
{
 public static void main(String x[])
 { //here create the array with 6 six size and store only value in it using scanner
// create the object of ArrayFeqCount
 //call the setIntArray function
 //call the countFeqCount() and write the manual logics
 }
}
*/
//===========================================================================
import java.util.Scanner;
class ArrayFrequencyCountApp{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the array lements:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		ArrayFreq AF=new ArrayFreq();
			AF.setArray(a);
			AF.countFrequency();
	} 

}
class ArrayFreq{
 private int a[];
  
	void setArray(int array[]){
		a=array;
	}
	void countFrequency(){
			int x=0;
			for(int i=0;i<a.length;i++){
				if(a[i]==x)
					{ 
				               continue;
					}
				int count =1;
				for(int j=i+1;j<a.length;j++){
						if(a[i]==a[j])
						{
							x=a[i];
							++count;
						}
					}
				System.out.println("Frequency "+a[i]+" "+count);
			}
	
	}
          




}