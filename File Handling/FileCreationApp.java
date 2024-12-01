import java.io.File;
class FileCreationApp
{
	public static void main(String x[])throws Exception
	{
	      File f= new File("E:\\FileHandlingPractise\\FolderCreatedUsingFileHandling\\vishal.doc");
	 boolean b=f.isDirectory();
	  sif(b){
		   System.out.println("  folder is present");
	   }
	   else{
		   System.out.println("Folder is not present in given path");
	   }
	   f.createNewFile();
	    if(f.isFile()){
			System.out.println("File created");
		}
		else{
			System.out.println("File  not created , some  problem is thee plz go and cheak where problem get occured");
		}
} }
