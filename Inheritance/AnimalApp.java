/*6.WAP to create the abstract class name as Animal with method makeSound() 
and its two child classes name as Dog and Cat.
We need to inherit the Animal class in Dog and Cat and override the
makeSound() method in it and
 write the message as per sound as his category.
*/
//=================================================================================
import java.util.Scanner ;
class AnimalApp{
	public static void main(String x[]){
	  Scanner sc=new  Scanner (System.in);
	  
	  Dog d=new Dog();
	  d.makeSound();
	  Cat c=new Cat();
	  c.makeSound();
		
	}
}

abstract class Animal{
	abstract void makeSound();
}
class Dog extends Animal{
	void makeSound(){
		System.out.println(" Boow Boow Boow .... ");
	}
}
class  Cat extends Animal{
	void makeSound(){
		System.out.println("Meew meew meew ......");
	}
	
}