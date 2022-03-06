package JavaSE8;

// Function example 1: to check the length of the string.
import java.util.function.Function;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		Function<String, Integer> fun = s -> s.length();
		System.out.println(fun.apply("Hello"));
	}

}