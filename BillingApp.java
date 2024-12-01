
//11).WAP to create the class name as Product with a following properties 

class BillingApp{
public static  void main(String x[]){
Product p1=new Product();
  p1.setId(1);
  p1.setName("samosa");
  p1.setQty(5);
  p1.setPrice(10);

Product p2=new Product();
  p2.setId(2);
  p2.setName("vadapav");
  p2.setQty(10);
  p2.setPrice(5);

Product p3=new Product();
  p3.setId(3);
  p3.setName("kachori");
  p3.setQty(8);
  p3.setPrice(7);

CalBill b=new CalBill();
   b.addProduct(p1,p2,p3);
   System.out.println("Your Bill Is :");
   System.out.println(".......................................................................................");
   System.out.print("ID "+"\t"+"NAME"+"\t"+"QTY"+ "\t"+"PRICE"+"\t"+"Total"); 

   b.DisplayProduct();
System.out.println("........................................................................................");
System.out.print("YOUR TOTAL BILL AMOUNT IS ==> ");
b.showBill(); 

}

}

class Product{

private int id;
private String name;
private int qty;
private int price;

       void setId(int id)
      {
                  this.id=id;
      } 
       public int getId()
      {
           return id;
      }
       void setName(String n)
       {   
           this.name=n;
        }
      public String getName()
      { 
         return name;
      }
      void setQty(int qt)
      {
       this.qty=qt;
      } 
       public int getQty()
       {  
              return qty;
       }
       void setPrice(int p)
      {
        this.price=p;
      }
    public int  getPrice()
      {
         return price;
      }

}
 class CalBill{

 Product p[];
      public void addProduct(Product ...Prod)
     { 
           for(int i=0;i<Prod.length;i++){
               p=Prod;
            }
 
     }
int FA[]= new int [p.length];

    void DisplayProduct( ){
   int total []=new int[p.length];
    
          for(int i=0;i<p.length;i++)
          {     
                FA[i]=total[i]=p[i].getQty()*p[i].getPrice();
              System.out.print("\n"+p[i].getId()+" \t" +p[i].getName()+"\t"+p[i].getQty()+"\t"+p[i].getPrice()+"\t"+total[i]+"\n");
           }
   }
    public void showBill(){

   int sum=0;

    for(int i=0;i<FA.length;i++)
    { 
         sum=sum+FA[i];
   }
    System.out.println(sum);
}

}


















