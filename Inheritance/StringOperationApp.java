/*7.WAP to create the abstract class name as StringOperation with method name as
performOperation(String) and write its different logics in different child classes as per give diagram.
*/
//===========================================================================================================================
import java.util.Scanner;
class StringOperationApp{
	public static  void main(String x[]){
		Scanner sc =new Scanner (System.in);
		System.out.println("Enetr the name ");
		String name =sc.nextLine();
	ConvertToUpper CU=new ConvertToUpper();
	CU.performOperation(name);
	CU.showUpperCase();
	MaxRepetativeChar MRC=new MaxRepetativeChar();
	MRC.performOperation(name);
	MRC.displaymaxRepetativeChar();
	WordReverse WR=new WordReverse();
	WR.performOperation();
	WR.ShowReverse();
	
	}
}
 abstract class StringOperation{

	abstract void  performOperation(String x );
}
class ConvertToUpper extends StringOperation {
      String x;
	  String upper;
	  void performOperation(String x){
		  this.x=x;
		   upper=x.toUpperCase();
	  }
	  void showUpperCase(){
		System.out.println("Your String in upper case " +upper);
	  }
}
class MaxRepetativeChar extends StringOperation{
	String x;
	 int index=0;
	void performOperation(String x){
		  this.x=x;
		  int count =0;
		  int max=0;
	  for (int i=0;i<x.length();i++){
		 
		   for(int j=i+1;j<x.length();j++){
			   if(x.charAt(i)==x.charAt(j)){
				   ++count;
			   }
		   }
		   if(count>max){
				   max=count;
				   index=i;   
			   }
			   
		}
	  }
	void displaymaxRepetativeChar(){
		System.out.println("maximum  repeated  character is "+x.charAt(index));
	}
}
class WordReverse extends StringOperation{
     String name ;
	 String rev;
	void performOperation(String x){
		this.name =x;
		for(int i=0,j=name.length()-1;i<name .length()/2;i++,j--){
		   char con=name.chartAt(i);
		    name.chartAt(i)=name.charAt(j);
			name.chartAt(j)=con;
		}
		rev=toString(name);
		
	}
	void ShowReverse(){
	System.out.println("Revers string is "+ rev);
	}

}