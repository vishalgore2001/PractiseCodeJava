class Pattern{
public static void main(String x[]){


for(int i=1;i<=5;i++)  //outer loop for rows
{
   for(int j=1;j<=9;j++)  // innner loop for column
    {
         if(j>=6-i&&j<=4+i)
{            
System.out.print(i);
      }
else{
System.out.print(" ");
}
               
    }
System.out.println(" ");
}

}


}