/*Q1. WAP to create POJO class name as Book with field id,name and price and create 5 objects of book class using array of objects
 and arrange all books in descending order by using its price.*/
//============================================================================
import java.util.Scanner;
class BookApp{
	public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		Book b[]=new Book[5];
		System.out.println("Enter the details of five books");
		for(int i=0;i<b.length;i++){
			b[i]=new Book();
			System.out.println("Enter the ID of BOOK");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the NAME of BOOK ");
			String name=sc.nextLine();
			System.out.println("Enter the PRICE of BOOK");
			int price=sc.nextInt();
			b[i].setId(id);
			b[i].setName(name);
			b[i].setPrice(price);
		}
		System.out.println("Display the book information in descending order by there price");
			for(int i=0;i<b.length;i++){
				for(int j=i+1;j<b.length;j++){
					if(b[i].getPrice()<b[j].getPrice()){
						Book temp=b[i];
						b[i]=b[j];
						b[j]=temp;
					}
				}
			}
    			
			for(int i=0;i<b.length;i++){
				System.out.println("ID :"+ b[i].getId()+ "\tName "+ b[i].getName()+"\tPrice :"+ b[i].getPrice());
			}
	}
}

class Book{
private int id;
private String name ;
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