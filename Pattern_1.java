  class Pattern_1{
public static void main(String x[]){
	
	for(int i=0;i<13;i++){
		for(int j=0;j<13;j++){
			
			if(j>8-i&&j<=7+i){    
				System.out.print("*");
			}
		}
		System.out.println("");
	}
	
	
  }
}
