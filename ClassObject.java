import java.util.*; 
 class Rev{
    private int no;
void Setnum(int n){

no=n;
}
void DisplayRev(){
int temp=no;
int rev=0;
while(no!=0){
int rem=no%10;
rev =rev*10+rem;
 no=no/10;
}
System.out.println(rev);

}
}
 class ClassObject{
public  static  void Main( String x[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
Rev r =new Rev();
r.Setnum(number);
r.DisplayRev();
sc.close();
}

}