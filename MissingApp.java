/*Example: WAP to FindMissingElement with two methods 
void setArray(int a[]): this method can accept array as parameter 
void showMissing(): this method can find the missing element of array.*/

import java.util.Scanner;
class MissingApp
{    public  static void main(String x[])

      {   
         Scanner sc =new Scanner (System.in);
          int a[]=new int[5];
              System.out.println("Enter the arry elments");
             for(int i=0;i<a.length;i++)
                 {
                         a[i]=sc.nextInt();
                 }                   
      Missing m= new Missing();
          m.setArray(a);
         m.showMissing();

      }
}



class Missing{

private int arr[];
void setArray(int a[])
  {
     arr=a;
 }
void showMissing()
 {  
   System.out.println("Missing elemnts in the given array as bellow:");
for(int i=0;i<arr.length-1;i++)
      {
           for(int j=arr[i]+1;j<arr[i+1];j++)
                     {
                         System.out.print(j+"\t");
                     }
       }

}

}
