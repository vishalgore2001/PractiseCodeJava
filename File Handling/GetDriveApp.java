import java.io.*;

class GetDriveApp{
public static void main(String x[]){

   File f[]= File.listRoots();
      
     System.out.println("Yor Dives as  Belows");
    for( int i=0;i<f.length;i++){
		   
		   
		   long usedspace=f[i].getTotalSpace()/1073741824-f[i].getFreeSpace()/1073741824;
		System.out.println("Total Space "+ f[i]+"\t " + f[i].getTotalSpace()/1073741824 + "GB \t Free  Space " + f[i].getFreeSpace()/1073741824 + " GB \n");
		System.out.println(" Dive " + f[i] +" used spce  = " +usedspace+ " GB");
	     
		
	}
	

}

}