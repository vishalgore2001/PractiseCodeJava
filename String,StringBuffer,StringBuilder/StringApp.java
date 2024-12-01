import java.util.Scanner;
class StringApp{
   public static void main(String x[]){
    
	Scanner sc =new Scanner (System.in);
	
	System.out.println("Enetr the Str;ing ");
	String name =sc.nextLine();
    System.out.println("  Select the choice to perform the operation");
	
	System.out.println("\n1Reverse the string\n2.InsertingChar\n3.AppendingString\n4.Deleting Character  from String\n5.Replace a Substring\n6.Cheack capacity,ensure capacity from stringbuffer class\n7demonstreat chaining method by using stringbuffer ");
	int choice =sc.nextInt();
	  switch(choice){
		   case 1:   
		       try{
		           StringBuilder  sb= new StringBuilder(name);
				   
				    System.out.println("Before Reverse given String is "+ sb);
		            for(int i=0,j=sb.length()-1;i<sb.length()/2;i++,j--){
                       char temp=sb.charAt(i);	
                        				   
					    sb.setCharAt(i,sb.charAt(j));
						sb.setCharAt(j,temp);

					}
					if(name.compareto(sb)){
						System.out.println(" palendrome ");
					}
					else{
						System.out.println(" not  palndrome ");
					}
					 
					System.out.println("\nRevserse String is " + sb);
			   } 
			   catch(Exception ex){
				   System.out.println("Your Error is " + ex);
			   }
		   
					break;
					
		   case 2: 
		   
		   
		   
					break;
					
		   case 3: 
		   
		   
					break;
		   case 4: 
		   
		   
		   
		            break;
		   case 5: 
		   
		   
		   
					break;
		   case 6: 
		   
		   
					break;
		   case 7: 
		   
		             break;
		   
		   
		  
		  
		  
	  }
   }
}
