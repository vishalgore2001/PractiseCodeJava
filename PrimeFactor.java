import java.util.Scanner;
class PrimeFactor{
public static void main(String x[]){
	Scanner sc =new Scanner(System.in);
int a[]=new int[5];
System.out.println("Enter the array elements:");
for(int i=0;i<a.length;i++){
	a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
	int count=0;
    for(int j=1;j<a[i];j++)
	{
		if(a[i]%2==0){
			count++;
		}
		if(count<=2){
			System.out.println(j);
		}
	}


}
}
}