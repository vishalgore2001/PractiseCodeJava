class Pattern1{
public static void main(String x[]){


for(int i=1;i<=7;i++)  //outer loop for rows
{
   for(int j=1;j<=13;j++)  // innner loop for column
    {
         if(j>=8-i&&j<=6+i)
{            
System.out.print("*");
      }
else{
System.out.print(" ");
}
               
    }
System.out.println(" ");
}


for(int i=1;i<=7;i++)  //outer loop for rows
{
   for(int j=1;j<=13;j++)  // innner loop for column
    {
         if(j>=i+1&&j<=13-i)
{            
System.out.print("*");
      }
else{
System.out.print(" ");
}
               
    }
System.out.println(" ");
}





}


}