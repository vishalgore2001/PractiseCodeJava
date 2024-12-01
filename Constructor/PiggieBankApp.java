/*2) Suppose you have a Piggie Bank with an initial amount of $50 and you have to add
some more amount to it. Create a class 'AddAmount' with a data member named
'amount' with an initial value of $50. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie Bank
Create object of the 'AddAmount' class and display the final amount in Piggie Bank
*/
//===========================================================================
import java.util.Scanner;
class PiggieBankApp{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amout to add in bank ");
	int amount=sc.nextInt();
	AddAmount a=new AddAmount(amount);
	a.DisplayAmount();
	}
}
class AddAmount{

	private int amount=50;
	AddAmount(int insertValu){
		amount=amount+insertValu;
	}
	void DisplayAmount(){
	System.out.println("Final Amount in ypur bank is "+ amount);
	}
}