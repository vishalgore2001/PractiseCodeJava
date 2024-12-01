//8.WAP to design the Calculator Example using a Loose Coupling ?

//==================================================================================
import java.util.Scanner ;
class LooseCouplingApp{
	public static void main(String x[]){
		Scanner sc= new Scanner (System.in);
      System.out.println("Enter the first number ");
	  int a=sc.nextInt();
	  System.out.println("Enter  the second number ");
	  int b=sc.nextInt();
	   int again=0;
	  do{
	  System.out.println("Select the choice from below option");
	  System.out.println("1.Additon \n2.Multiplication \n3.Substraction\n4.Division");
	  System.out.println("Eneter the choice ");
	  int choice =sc.nextInt();
	  Value v=null;
	 
	  Calculator c= new Calculator();
	 
	
	  switch(choice){
		  case 1:    
					//Value v=null;
					v=new Add();
					v.setValue(a,b);
					c.performOperation(v);
					break;
		  case 2:
				//	Value v=null;
					v=new Mul();
					v.setValue(a,b);
					c.performOperation(v);
					break;
		  case 3:
					//Value v=null;
					v=new Sub();
					v.setValue(a,b);
					c.performOperation(v);
					break;
		  case 4:
					//Value v=null;
					v=new Div();
					v.setValue(a,b);
					c.performOperation(v);
					break;
		  default: System.out.println("Wrong choice ");
		  
	  }	
	  System.out.println("Do you want to see option again on your screen plz enter 1 for yes and 0 for the no");
	    again= sc.nextInt();
	 }while(again==1);
	}
}
 abstract class Value{
	int a,b;
	abstract   void performCalculation();
	void setValue( int a,int b){
		this.a=a;
		this.b=b;
	}

}
class Add extends Value{
 
	    void performCalculation(){
		 int  Result=a+b;
		  System.out.println("Additon  two number is "+ Result);
	 }
	
}
class Sub extends Value{
	
	void performCalculation(){
		 int  Result= a-b;
		  System.out.println(" subtraction  of two number is "+ Result);
	 }
	
}
class Mul extends Value{
	
	 void performCalculation(){
		 int  Result=a*b;
		  System.out.println("multiplication of  two number is "+ Result);
	 }
	 
	
}
class Div extends Value{
	void performCalculation(){
		 int  Result=a/b;
		  System.out.println("Division of  two number is "+ Result);
	 }
	 
}
class Calculator{
	
	void performOperation(Value k){
		k.performCalculation();

	}
}