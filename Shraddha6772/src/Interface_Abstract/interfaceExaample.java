package Interface_Abstract;

interface WaterBottleInterface{
	
	String color="Blue";
	
	void fillUp();
	void pourout();
	
}

public class interfaceExaample implements WaterBottleInterface {

	public static void main(String[] args) {

		System.out.println(color);

		interfaceExaample ex = new interfaceExaample();
		ex.fillUp();
		
	}

	@Override
	public void fillUp() {

		System.out.println("Its Filled");
	}

	@Override
	public void pourout() {

		System.out.println();
		
	}

}
