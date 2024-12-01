import java.io.File;
class  CreateFolderApp	
{
	public static  void main(String x[])
	{
		File f= new  File("E:\\FileHandlingPractiseFileCreation\\new");
         boolean check=f.exists();		 
		 boolean b= f.mkdir();
		
		  if (check){
			    System.out.println("Foder alredy Created ");
		  }
		  else{
		  if(b){
			    System.out.println("Folder  Created Succesfully");
		  }
		   else{
			   System.out.println("Folder is not Created!! , Some problem is there");
		   }
		  }
     
	} 
}