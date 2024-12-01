class NumberPattern{
public static  void main(String x[]){
	
NumberTr t= new NumberTr();
		//System.out.println("==============================================");
		//System.out.println("Program 1");
		//System.out.println("==============================================");
		//t.showTriangle();
		//System.out.println("==============================================");
	           	//System.out.println("Program 2");
		//System.out.println("==============================================");
		//t.showTriangle2();
		System.out.println("==============================================");
		System.out.println("Program 3");
		System.out.println("==============================================");
		t.showTriangle3();
	}
}


class NumberTr{

 	 void showTriangle(){

		for(int i=1;i<=7;i++){
				for(int j=1;j<=i;j++){
					System.out.print(j);
				}
		System.out.println("");
		}
	 }
		void showTriangle2(){
			for(int i=1;i<=7;i++){	
				for(int j=1;j<=8-i;j++){
					System.out.print(j);
						
				}
			System.out.println("");
			}
		}
	void showTriangle3(){
		
		for(int i=1;i<=7;i++){
				
			for(int j=1;j<=13;j++){
				
				if(j>=8-i&&j<7+i){
					System.out.print("*");
					
				}
				else{
				System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}


	}
	
}