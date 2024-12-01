import java.util.Scanner;
class SubArray{
public static void main(String x[]){
Scanner sc =new Scanner (System.in);
int a[]=new int[8];
for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
System.out.println(" Enter First index");
int index=sc.nextInt();
System.out.println(" Enter Second index");
int index2=sc.nextInt();


for(int i=index;i<=index2 ;i++){
  System.out.print(a[i]+"\t");
  }

}

}