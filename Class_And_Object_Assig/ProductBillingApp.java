/*11).WAP to create the class name as Product with a following properties
Create the another class name as CalculateBill and this class is depend on product but we want to
pass more than one product details to CalculateBill class so here we use the var-args concep */

//===============================================================================
import java.util.Scanner;
class ProductBillingApp{
		public static void main(String x[]){
		Scanner sc=new Scanner (System.in);

		Product p1=new Product();
		p1.setName("Rice Plate");
		p1.setId(1);
		p1.setQty(5);
		p1.setRate(100);

		Product p2=new Product();
		p2.setName(" Vadapav");
		p2.setId(2);
		p2.setQty(5);
		p2.setRate(10);
		
		Product p3=new Product();
		p3.setName(" Manchurian ");
		p3.setId(3);
		p3.setQty(2);
		p3.setRate(150);
		
		CalculateBill BL=new CalculateBill();
			BL.setProduct(p1,p2,p3);	
			BL.calBill();
	
	}
}
class Product{
private int id;
private String name;
private int qty;
private int rate ;
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String  getName(){
		return name;
	}
	public void setQty(int qty){
		this.qty=qty;
	}
	public int getQty(){
		return qty;
	}
	public void setRate(int rate){
		this.rate=rate;
	}
	public int  getRate(){
		return rate;
	}
}
class CalculateBill{
private Product p[];


	public void setProduct(Product ...prod){
		this.p=prod;
	}
	public void calBill(){
    			int bill=0;
		System.out.println("Your Order Details As Belows: ");
		System.out.print("Product ID \t Product Name  \t Qty\t rate \t TotalBill\n");
		System.out.println("===========================================================");
		for(int i=0;i<p.length;i++){
                           bill=bill+p[i].getQty()*p[i].getRate();
			int totalbillforthatprod=	p[i].getQty()*p[i].getRate();
			System.out.println("\t"+p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t"+p[i].getRate()+"\t" + totalbillforthatprod);		
		}
		
		System.out.println("=========================================================");
		System.out.println("GRAND TOTAL_BILL OF YOUR ORDER : "+ bill);	
	}
	
	
}