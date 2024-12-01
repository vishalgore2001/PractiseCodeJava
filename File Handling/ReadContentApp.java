/*2.Write a Java  program to read file contents and display on console.
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
2.Write a Java  program to read file contents and display on console.

*/ 
  import java.io.*;
  class ReadContentApp
  { 
	public static void main(String x[])throws Exception
	{
		    FileReader fr = new FileReader("E:\\FileHandlingPractise\\SecondFolder\\Assigment.txt");
			int content=fr.read();
			while(content!=-1){
				content=fr.read();
				System.out.print((char)content);
			}
	}
  
  }