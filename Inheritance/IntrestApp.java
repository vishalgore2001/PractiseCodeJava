/*3. WAP using inheritance with a simple Interest Rate Formula for calculate the interest on
loan we have the following class hierarchy and conditions given below/
*/
//=====================================================================================
import java.util.Scanner ;
class IntrestApp{
	public static void  main(String x[]){
		Scanner sc =new Scanner (System.in);
		CalculateInterest ci=new  CalculateInterest();
		System.out.println("Enetr the principale");
		int p=sc.nextInt();
		System.out.println("Enter the irate ");
		int irate=sc.nextInt();
		System.out.println("Enetr the  time duartion ");
		int duration =sc.nextInt();
		ci.setPRD(p,irate,duration);
		ci.calIntrest();
	}
}
class Intrest{
	int principal;
	int irate;
	int dur;
	  public void setPRD(int pamt,int irate ,int dur){
		  this.principal=pamt;
		  this.irate=irate;
		  this.dur=dur;
	  }
	
}
class CalculateInterest extends Intrest{
	void calIntrest(){
		int si=(principal*irate*dur)/100;
		System.out.println("Simple intrest is "+ si);
	}
}