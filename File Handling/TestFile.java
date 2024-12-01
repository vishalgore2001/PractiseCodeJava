import java.io.*;
class TestFile{
public static void main(String x[])throws IOException {
		File f=new File("C:/Users/91935/Pictures/Screenshots/filehandlingfile.txt");
	
	   f.createNewFile();
		if(f.isFile()){
		System.out.println("File is present");
		}
		else{
		System.out.println("File is not present");
		}
		}
		
 
 
}
