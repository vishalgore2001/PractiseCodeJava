import java.io.*;
class FileReaderApp
{
	public static void main(String x[])throws Exception
	{
		FileReader fr =new FileReader("E:\\FileHandlingPractise\\new\\first.txt");
		
	    BufferedReader fb =new BufferedReader(fr);
	      String data;
		   while((data=fb.readLine())!=null)
		   {    Thread.sleep(1000);
			   System.out .println(data);
		   }
	}
}

