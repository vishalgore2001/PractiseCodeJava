
class LibraryApp{
	public static void main(String x[]){
               	Book b1= new Book();
			b1.setId(1);
			b1.setName("Animal");
			b1.setPrice(220);
		Book b2= new Book();
			b2.setId(1);
			b2.setName("deolband");
			b2.setPrice(450);
		Book b3= new Book();
			b3.setId(3);
			b3.setName("Sound");
			b3.setPrice(100);
		Book b4= new Book();
			b4.setId(4);
			b4.setName("Krupasindhu");
			b4.setPrice(300);
		Book b5= new Book();
			b5.setId(5);
			b5.setName("Sham chi Aaai");
			b5.setPrice(150);
		Department d1 =new Department();
			d1.setDpid(1);
 			d1.setName("E&TC");
			d1.setBook(b4,b5);
		Department d2 =new Department();
			d2.setDpid(2);
 			d2.setName("CSE");
			d2.setBook(b1,b2);
		Department d3 =new Department();
			d3.setDpid(1);
 			d3.setName("CIVIL");
			d3.setBook(b3);
		College cl=new College();
   			cl.setDepartment(d1,d2,d3);
		cl.showDepartmentWiseBook();


		
                 
	}
}

class Book{
private int id;
private String name;
private int price;

	  void  setId(int id){
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
 class Department{
  private int dpid;
    private  String dpname;
    public Book book[];

    	  void setDpid(int id){
      	  this .dpid=id;
	}
	public int getId(){
 	return dpid;
	}
	void setName(String name){
 	  this.dpname=name;
	}
 	public String getName(){
	return dpname;
	}
            void setBook(Book...b){
	this.book=b;
	}
	 public Book [] getBook(){
	return book;
	}

}

class College{
private Department dep[];

	void setDepartment(Department...d){
 	this .dep=d;
	}
    	void showDepartmentWiseBook(){
		 for(int i=0;i<dep.length;i++){
		     System.out.println("Departmnet id:"+ dep[i].getId()+ "\tDepartment Name:"+dep[i].getName());
                             System.out.println("----------------------------------------------------------------------------------");
                             System.out.println("Book ID\tBookName\tBookPrice");
                                	for(int j=0;j<dep[i].book.length;j++){
				System.out.print(dep[i].book[j].getId()+"\t"+dep[i].book[j].getName()+"\t"+dep[i].book[j].getPrice()+"\n");
				}
     		    System.out.println("----------------------------------------------------------------------------------");
		}
	}

}
