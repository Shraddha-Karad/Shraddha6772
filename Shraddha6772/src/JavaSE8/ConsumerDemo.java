package JavaSE8;

//Consumer example 1: Take a single argument and print the value.
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> con = s -> System.out.println(s);
		con.accept("Hello World");
	}

}