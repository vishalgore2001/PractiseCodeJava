/*Q3. WAP to Create class name as Product as POJO with field id,name and price create array of object of product of size 10 and
 find the product whose price is same.*/
//=========================================================================================
import java.util.Scanner;
class ProductApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of product ");
		int size =sc.nextInt();
		Product p []=new Product[size];
		for(int i=0;i<p.length;i++){
			p[i]=new Product();
			System.out.println("Enter the id of product ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name of  product ");
			String name = sc.nextLine();
			System.out.println("Enter the prcie of product");
			int price=sc.nextInt();
			p[i].setId(id);
			p[i].setName(name);
			p[i].setPrice(price);
		}
			boolean flag =true;
		for(int i=0;i<p.length;i++){
			for(int j=i+1;j<p.length;j++){
				if(p[i].getPrice()==p[j].getPrice()){
					flag=true;
					break;
				}
				else{
					flag=false;
				}
			}
		}
		if(flag){
			System.out.println("Have Same Price BOOk");
		}
		else{
			System.out.println("Differnat price ");
		}
		
	}
}

class Product{
private int id;
private String name;
private int price;

	void setId(int id){
		this.id=id;
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
	void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	
}