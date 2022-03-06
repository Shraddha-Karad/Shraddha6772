package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student1 {
	int rollno, age;
	String name;

	Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "rollno=" + rollno + ", age=" + age + ", name=" + name;
	}

}

class StudentSortByRollNo implements Comparator<Student1> {
	@Override
	public int compare(Student1 o1, Student1 o2) {
		if (o1.rollno == o2.rollno) {
			return 0;
		} else if (o1.rollno > o2.rollno) {
			return 1;
		} else {
			return -1;
		}
	}

}

class StudentSortByName implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {

		return o1.name.compareTo(o2.name);
	}

}

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student1> list = new ArrayList();
		list.add(new Student1(1, "Arti", 16));
		list.add(new Student1(3, "Geeta", 23));
		list.add(new Student1(2, "Neha", 18));
		// System.out.println(list+"\n");
		// Collectios.sort(list);

		System.out.println("Sort by roll no ");
		Collections.sort(list,new StudentSortByRollNo());
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("Sort by name ");
		Collections.sort(list,new StudentSortByName());
		Iterator itr1 = list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
	}
}
