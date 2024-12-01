/*1. Write the code to implement the concept of inheritance for Vehicles. You are required to
implement inheritance between classes. You have to write four classes in java i.e. one superclass,
two sub classes and one driver class.
Vehicle is the super class whereas Bus and Truck are sub classes of Vehicle class. Transport is a driver
class which contains main method.
*/
//==========================================================================================================
import java.util.Scanner ;
class TransportApp{
	public static void main(String x[]){
	Scanner sc=new Scanner (System.in);
	
	
	
	
	}
}
class Vehicle{
	String model;
	int reg_no;
	int speed;
	int  fuelcapacity;
	int fuelconsumption;
	int d;
	 Vehicle(String model,int reg_no,int speed,int fuelcapacity,int fuelconsumption){
		 this.model=model;
		 this.reg_no=reg_no;
		 this.speed=speed;
		 this.fuelcapacity=fuelcapacity;
		 this.fuelconsumption=fuelconsumption;
	 }
	 public String getModelName(){
		 return  model;
	 }
	 public int getRegno(){
		 return reg_no;
	 }
	 public int getSpeed(){
		 return speed;
	 }
	 public int getFuelcapacity(){
		 return fuelcapacity;
	 }
	 public int getFuelconsumption() {
		 return fuelconsumption;
	 }
	 public  int  feulNeeded(int distance){
		 this.d=distance;
		 float fule=60;
		 return System.out.println("Fule needed for " + distance+ " km is"+ distance/fule+ " ltr");
	
	 }
	 public int distanceCovered(int time ){
		 int speed
		 return System.out.println("Speed is "+ d/t);
		 
		 
	 }
		 
}
class Bus extends Vehicle{
	
}
class Truck extends Vehicle{
	
}