import java.io.*;
import java.util.Scanner;
class WriteFileApp
 {
	public static void main(String x[]) throws Exception
   {
    Scanner sc =new Scanner (System.in);
	System.out.println("Enetr the date which you want  to write in file");
	String data=sc.nextLine();
      FileWriter fr=new FileWriter("E:\\FileHandlingPractise\\new\\first.txt",true);
      BufferedWriter bw =new BufferedWriter(fr);
	  bw.write(data);
	  bw.newLine();
	  bw.close();
	  System.out.println("Data saved succsfully .....");

	}
 }