/*7.WAP to create the class name as InsertArrayEle with a following methods
class InsertArrEle
{ int c[];
 void setIntArray(int ch[])
 { //here accept the integer array and store in instance variable in integer array
 c=ch;
 }
 void insertValueOnIndex()
 { //here we need to write the manual logics for inserting value on specified index in arr
 }
}
public class ConvertToUpperApp
{
 public static void main(String x[])
 { //here create the array with 6 six size and store only five value in it using scanner
// create the object of InsertArrEle class
 //call the setIntArray function
 //call the insertValueOnIndex() and write the manual logics
 }
}
*/
//=========================================================================================

import java.util.Scanner;
class InsertElementArrayApp{
 	public static void main(String x[])
    {
	Scanner sc =new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter the Elements ");
	for(int i=0;i<a.length;i++){
	a[i]=sc.nextInt();	
	}
            System.out.println("Enter the index");
		int index=sc.nextInt();
	
	System.out.println("Enter the value to insert that index");
		int value=sc.nextInt();
	InsertArrayElement AE=new InsertArrayElement();
			AE.setArray(a);
			AE.insertValueOnIndex(value, index);
			AE.showAfterInsertArray();
 	
     }
}
class InsertArrayElement{
int Array[];
		void setArray(int a[]){
		Array=a;
		}
		void insertValueOnIndex(int value,int index){
			for(int i=0;i<Array.length;i++)
			{
					if(i==index)
					{
						Array[i]=value;
					}
			}

		}
		void showAfterInsertArray(){
			for(int i=0;i<Array.length;i++){
				System.out.print(Array[i]+"\t");
			}
		}


}