package Polymorphism;

class Animal{
	
	int z;
	public Animal(int a){
		System.out.println("Animal Constructor");
	}
	public void move(){
		
		System.out.println("Animal can move"+ z);
	}
	
}
class Dog extends Animal{
	
	public Dog(int x,int y){
		
		super(x);
		super.z=50;
		System.out.println("Dog Constructor"+x);
	}
	public void move(){

		System.out.println("Dog can move and run");
		
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Dog obj = new Dog(20,40);
		obj.move();
		
	}

}
