/*5) WAP to Encrypt the string using a constructor
Here we need to create the class name as Encrypt with a following constructor and method.
Input string : abcdabcdccddaabb
Ouput : a4b4c4d4

*/
//=======================================================================


import java .util.Scanner ;

class EncryptStringApp{
	public static void main(String x[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the string ");
	String str =sc.nextLine();
	Encrypt E =new Encrypt(str);
			E.beforeEncrypt();
			E.afterEncrypt();
	}
}

class Encrypt{
	private String name;
	//private String enString;
	private StringBuilder enString= new StringBuilder();
	Encrypt(String str){
		this.name =str;
	       boolean flag=false;
		   char c[] = new char[name.length()];
		for(int i=0;i<name.length();i++){
			 char ch='v';
			int count =1;
			
			if(flag==true)
			{
				for(int k=0;c[k]!='\0';k++)
				{
					if(c[k]==name.charAt(i)){	
					flag=true;
					break;
					}
					else{
						flag=false;
						
					}
				}				
			}
			
			if(flag){
				continue;
			}
			else{
			for(int j=i+1;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j)){
					ch=name.charAt(i);
					flag=true;
					c[i]=ch;
					++count;
				}
				
			}
			System.out.println("Count of " +name.charAt(i)+" is "+count);
			enString.append(ch).append(count);
		}
		}
		
		
	}
	
	public void beforeEncrypt(){
		System.out.println("Before encrypt your string is "+ name);
	}
	public void afterEncrypt(){
		System.out.println("After Encrypt your string is "+ enString);
	}
	
	
}