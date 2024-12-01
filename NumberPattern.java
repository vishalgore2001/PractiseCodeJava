class NumberPattern{

public static void main(String x[]){

for(int i=1;i<=5;i++)  //outer loop for rows
{  int temp=i;
int k=1;
   for(int j=1;j<=9;j++)  // innner loop for column
    {      
         if(j>=6-i&&j<=4+i)  // 5   4 5 6   3 4 5 6 7
         {     
		      if(j==4+i)                   
		         {       //5= 1, 6=2
         	     System.out.print(k);
				    ++k;
		         }
			      else{
				         i++; //0
	                     //1
                        System.out.print(i);//1
			            --i; //0
                     }
					 i=temp;
		 }
       else{
            System.out.print(" ");
           }
       // i=temp ;      
    }

System.out.println(" ");
}
}
}
