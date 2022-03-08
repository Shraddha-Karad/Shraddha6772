package JavaSE8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		
		Stream<Integer> obj = list.stream();
		
//		obj.forEach(e->System.out.println(e));;
		
		List<Integer> l2 = list.stream().filter(e -> e > 44).collect(Collectors.toList());
		
		System.out.println(l2);
	}
}
