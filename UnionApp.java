/*WAP to create class FindUnion with two methods 
void setArray(int a[],int b[]): this method can accept two array as parameter 
int [] getUnionArray(): this method can perform union operation on array and return resultant array
*/
import java.util.Scanner;
class UnionApp
{
             public static void main(String x[])
   { 
            Scanner sc =new Scanner (System.in);
            FindUnion u =new FindUnion();
            int a[]=new int [5];
            int b[]=new int [5];
            System.out.println("Enter the first array elments:");
           for(int i=0;i<5;i++){
                    a[i]=sc.nextInt();
                          }
           System.out.println("Enter the Second  array elments:");

           for(int i=0;i<5;i++){
           b[i]=sc.nextInt();
         }
         u.setArray(a,b);
    
       u.getUnionArray();
  
  }

}
class FindUnion{
private int arr[],arr2[];
private int U[]=new int[10];

void setArray(int a[],int b[])
{  
    arr=a;
    arr2=b;
}
void DisplayMerge(){
for(int i=0;i<5;i++)
{
U[i]=arr[i];
}
for(int i=0;i<5;i++)
{
   U[i+5]=arr2[i];
}
System.out.println("Merged array is ");
for(int i=0;i<U.length;i++)
{ 
System.out.print(U[i]+"\t"); 
}
//logic to find union array
for(int i=0;i<U.length;i++)
{

     for(int j=i+1;j<U.length;j++)
            {   int count=0;
                 if(U[i]==U[j])
                              { count++;
                               
                                   for(int k=i;k<j;k++)
                                          {
                                               U[k]=U[k+1];
                                          }
                                --j;
                              }   
            }
   }

}
 void  getUnionArray()
{
System.out.println("Union array");
for(int i=0;i<U.length;i++)
{
  System.out.print(U[i]+"\t");
}
}

}