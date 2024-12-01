import java.io.File;
class  DescribeFolderApp
{
	public static void main(String x[])
	{    File f =new File("E:\\GIRI Theory Notes\\java notes");
	  // listFiles::  this method is used to fetch all files in the given path location which is in the  array formate    
			 File list[]= f.listFiles();
			   for(int i=0;i<list.length;i++){
				        
				      if(list[i].isDirectory()){
						  System.out.println(list[i]);
					  }
				  
			   }
	}

}
 