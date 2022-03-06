package JavaSE8;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> sup = () -> Math.random();
		System.out.println(sup.get());
	}
}