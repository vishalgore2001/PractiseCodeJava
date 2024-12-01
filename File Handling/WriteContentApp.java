
/*1.Write a Java program to create a file and write contents, save and close the file.
2.Write a Java  program to read file contents and display on console.
3.Write a Java  program to read numbers from a file and write even, odd and prime numbers to separate file.
4.Write a Java  program to append content to a file.
5.Write a Java  program to compare two files.
6.Write a Java program to copy contents from one file to another file.
7.Write a Java  program to merge two file to third file.
8.Write a Java  program to count characters, words and lines in a text file.
9.Write a Java  program to remove a word from text file.
10.Write a Java  program to remove specific line from a text file.
11.Write a Java  program to remove empty lines from a text file.
12.Write a Java  program to find occurrence of a word in a text file.
==================================================================================
1.Write a Java program to create a file and write contents, save and close the file.

*/
import java.util.Scanner;
import java.io.*;
 class WriteContentApp{
	public static void main(String x[])throws Exception{
		Scanner sc =new Scanner (System.in);
	    // File Creation
		 File f= new File("E:\\FileHandlingPractise\\SecondFolder\\Assigment.txt");
		 boolean check= f.createNewFile();
		  if(check){
			  System.out.println(" File is  created ......");
		  }
		  else{
			  System.out.println("File not  CREATED some  problem  is there");
		  }
		  // After  Creattion
		 //inserting content in that file 
		 System.out.println("Enter the data which you want to insert");
		  String str=sc.nextLine();
		  FileWriter fw=new FileWriter("E:\\FileHandlingPractise\\SecondFolder\\Assigment.txt");
             fw.write(str);
			System.out.println("Data saved .......");
			
		  fw.close();
		 
		  
		 
	}
 }