/*10) WAP to create the pojo class name as Student class with a following methods and data
or variable/state */
//===========================================================================================
import java.util.Scanner;
class StudentDiscountApp{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		int id,actualpaidfee,totalfee;
		String name;
		float per;
		System.out.println(" Enter the name:");
		name=sc.nextLine();
		System.out.println("Enter the id:");
		id=sc.nextInt();
		System.out.println("Enter the total fee:");
		totalfee=sc.nextInt();
		System.out.println(" Enter the percentage : ");
		per=sc.nextFloat();
		
		Student s=new Student();
		s.setName(name);
		s.setId(id);
		s.setPer(per);
		s.setTotalFee(totalfee);

		DiscountFee df=new DiscountFee();
		df.setStudent(s);
		df.cheakDiscountEligibility(s.getPer());
		df.showStduentDetails();
		
	}
}
 class Student{
	private int id;
	private String name;
	private int totalfee;
	private float per;
	int actualPaidFee;

		void setId(int id){
			this .id=id;
		}
		public int getId(){
			return id;
		}
		void setName(String name){
			this.name=name;
		}
		public String getName(){
			return name;
		}
		void setTotalFee(int tf){
			this.totalfee=tf;
		}
		public int getTotalFee(){
			return totalfee;
		}
		void setPer(float per){
			this.per=per;
		}
		public float getPer(){
		return per;
		}
		void setActualPaidFee(int af){
			actualPaidFee=af;
		}		
		public int getActualPaidFee(){
			return actualPaidFee;
		}
}
class DiscountFee{
private  Student s;

		void setStudent(Student std){
			this.s=std;
		}
		
		void cheakDiscountEligibility(float per){
			
			if(per>60)
			{
				System.out.println("Student  Eligibile for Discount :");	
					int Discount=(s.getTotalFee())*30/100;   
					int feeAfterDiscount=s. getTotalFee()-Discount;
					s.setActualPaidFee(feeAfterDiscount);
			}
			else{
				System.out.println("You are Not Eligibile to get Discount :");
					s.setActualPaidFee(s.getTotalFee());
			}

		}
		void showStduentDetails(){
			System.out.print("Name:\t "+ s.getName()+"\tID : "+s.getId()+"\tPer:"+s.getPer()+" \tTotalFee:"+s.getTotalFee()+"\tActualFeePaid:"+s.getActualPaidFee());
		}

}