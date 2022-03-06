package Shraddha_EONFWL522059_6772;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class BookStoreManagement {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		List<String> Al = new ArrayList();
		
//		Al.add("Oasis");
//		Al.add("Public Space Reader");
//		Al.add("The Great Indoors");
//		Al.add("Feminist City");
//		Al.add("Goya");
	
		List Category1 = Arrays.asList("Oasis","Public Space Reader","Feminist City");
        List Category2 = Arrays.asList("Goya","In the house");
   
		
		int c, n;
		Book1 ob = new Book1();

		System.out.println("Welcome to the ABC Book Store!");
		
		do 
		{
			System.out.println("::::MENU::::");
			System.out.println("1. ADD A BOOK ");
			System.out.println("2. SEARCH BOOK DETAILS ");
			System.out.println("3. UPDATE OF A BOOK RECORD ");
			System.out.println("4. DELETE OF A BOOK RECORD ");
			System.out.println("5. DISPLAY OF BOOK RECORDs ");
			System.out.println("6. EXIT");
			int ch = s.nextInt();

			switch (ch) {
			case 1:
					System.out.println("Enter how many No of books you want to Add : ");
					n = s.nextInt();
					ob.add(n);
					break;
			case 2:
					ob.search();
					break;
			case 3:
					ob.update();
					break;
			case 4:
					ob.delete();
					break;
			
			case 5: 
					ob.display();
					break;
			case 6:
					System.exit(0);
			}

			System.out.println("Press any key to Continue and Press 6 to Exit");
			c = s.nextInt();
	
		} while (c != 6);

	}
}

abstract class BookManagement {

	protected String bookName[];
	protected int bookId[];
	protected String authorName[];
	protected float bookPrice[];
	
	abstract void display();
}

class Book1 extends BookManagement {

	int NoOfBooks = 0;

	Scanner s = new Scanner(System.in);
	int i = 0, c = 0, r = 0;

	Book1() {
		bookId = new int[10];
		bookName = new String[10];
		authorName = new String[10];
		bookPrice = new float[10];
	}

	public void add(int n) {
		this.NoOfBooks = n;
		for (i = 0; i < n; i++) {
			
			System.out.println("Enter Book Id");
			bookId[i] = s.nextInt();
			
			
			System.out.println("Enter Bookname ");
			bookName[i] = s.next();
			
			s.nextLine();
			System.out.println("Enter the Author Name ");
			authorName[i] = s.nextLine();
			
			System.out.println("Enter the Book Price ");
			bookPrice[i] = s.nextFloat();
		}
		display();

	}

	public void update() {
		System.out.println("Enter the Bookid to be updated");
		r = s.nextInt();

		for (i = 0; i < bookId.length; i++) 
		{
			if (bookId[i] == r) 
			{
				System.out.println("Enter Book Id");
				bookId[i] = s.nextInt();
				
				System.out.println("Enter Bookname ");
				bookName[i] = s.nextLine();
				
				s.nextLine();
				System.out.println("Enter the Author Name ");
				authorName[i] = s.nextLine();

				System.out.println("Enter the Book Price ");
				bookPrice[i] = s.nextFloat();
			}
		}
		
		display();
	}

	public void delete() {
		System.out.println("Enter the Bookid to be deleted");
		r = s.nextInt();

		for (i = 0; i < bookId.length; i++) {
			if (bookId[i] == r) {
				bookId[i] = 0;
				bookName[i] = " ";
				authorName[i] = " ";
				bookPrice[i] = 0.0f;
			}
		}
		display();

	}

	public void search() {

		System.out.println("Enter the Bookid you want to search");
		r = s.nextInt();
		for (i = 0; i < bookId.length; i++) {
			if (bookId[i] == r) {
				break;
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("---DETAILS OF THE SPECIFIED Book Is---");
		System.out.println("BOOK NAME \t BOOK ID");
		System.out.printf("%-10s%10d%n", bookName[i], bookId[i]);
	}

	@Override
    void display() {
        System.out.println("----THE UPDATED RECORDS OF BOOKS ARE----");
        System.out.println("BOOK Id \t Book Name \t Author Name ");
        for (i = 0; i < bookId.length; i++) {
            if(bookId[i]!=0)
            {              
            	System.out.printf("%-15d%-15s%-15s%n", bookId[i], bookName[i],authorName[i]);
            }
        }
    }
//	@Override
//	void display() {
//		System.out.println("----THE RECORDS OF BOOKS ARE----");
//		System.out.println("BOOK ID \t BOOK NAME");
//		for (i = 0; i < bookId.length; i++) {
//			if (bookId[i] != 0) {
//				System.out.println(bookName[i] +"\t"+ bookId[i]);
////				System.out.printf("%-8d%-10s%n", bookId[i], bookName[i]);
//			}
//		}
//	}

}

