package Shraddha_EONFWL522059_6772;

import java.util.Scanner;

public class BookAtoreManagement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int c, usr;
		Book1 ob = new Book1();

		System.out.println("Welcome to the ABC Book Store!");
		
		do 
		{
			System.out.println("::::MENU::::");
			System.out.println("1. ADD A BOOK ");
			System.out.println("2. SEARCH BOOK DETAILS ");
			System.out.println("3. DELETE OF A BOOK RECORD ");
			System.out.println("4. UPDATE OF A BOOK RECORD ");
			System.out.println("5. EXIT");
			int ch = s.nextInt();

			switch (ch) {
			case 1:
					System.out.println("Enter how many No of books you want to Add : ");
					usr = s.nextInt();
					ob.add(usr);
					break;
			case 2:
//					ob.search();
					break;
			case 3:
//					ob.delete();
					break;
			case 4:
//					ob.update();
					break;
			case 5:
					System.exit(0);
			}

			System.out.println("Press any key other than 5 to do more operations else press 5 to exit");
			c = s.nextInt();
		} while (c != 5);

	}
}

abstract class BookManagement {

	protected String Bookname[];
	protected int Bookid[];

	abstract void display();
}

class Book1 extends BookManagement {

	int usr;

	Scanner s = new Scanner(System.in);
	int i = 0, c = 0, r = 0;

	Book1() {
		Bookid = new int[10];
		Bookname = new String[10];
	}

	public void add(int usr) {
		this.usr = usr;
		for (i = 0; i < usr; i++) {
			System.out.println("Enter Bookname and Bookid ");
			Bookname[i] = s.next();
			Bookid[i] = s.nextInt();

		}
		display();

	}

//	public void search() {
//
//		
//	}

	public void delete() {
		System.out.println("Enter the Bookid to be deleted");
		r = s.nextInt();

		for (i = 0; i < Bookid.length; i++) {
			if (Bookid[i] == r) {
				Bookid[i] = 0;
				Bookname[i] = " ";
			}
		}
		display();

	}

//	public void update() {
//	
//	}

	@Override
	void display() {
		System.out.println("----THE UPDATED RECORDS OF BOOKS ARE----");
		System.out.println("BOOK NAME \t Bookid");
		for (i = 0; i < Bookid.length; i++) {
			if (Bookid[i] != 0) {
				System.out.printf("%-10s%10d%n",Bookname[i],Bookid[i]);
			}
		}
	}

}

// Scanner sc = new Scanner(System.in);
//
// System.out.println("Welcome to the ABC Book Store!");
// System.out.println("Choices: \n1.Create \n2.Rename \n3.Update \n4.Delete");
//
// System.out.println("Enter Your Choice : ");
// int n = sc.nextInt();
//
