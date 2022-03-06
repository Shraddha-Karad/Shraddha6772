package Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c, usr;
		ArrayList<Book0> bookList = new ArrayList<Book0>();

		do {
			Book0 b = new Book0();

			System.out.println("::::MENU::::");
			System.out.println("1. ADD A BOOK");
			System.out.println("2. Display Records ");
			System.out.println("3. DELETE A BOOK ");
			System.out.println("4. UPDATE A BOOK ");
			System.out.println("5. SEARCH");
			System.out.println("0. EXIT	");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				System.out.println("Enter Book Id ");
				b.setBookId(sc.nextInt());
				System.out.println("Enter the Book name ");
				b.setBookName(sc.next());
				sc.nextLine();
				System.out.println("Enter the Book Author Name ");
				b.setAuthorName(sc.nextLine());
				System.out.println("Enter the Book Price ");
				b.setBookPrice(sc.nextFloat());

				b.add(b);
				bookList.add(b);

				break;
			case 2:
				b.display(bookList);
				break;
			case 3:
				// DELETE METHOD

				System.out.println("Enter the Bookid to be deleted");
				int r = sc.nextInt();

				boolean found = false;
				found = delete(b);
				Iterator<Book0> i = bookList.iterator();
				while (i.hasNext()) {
					Book0 b1 = (Book0) i.next();

					if (b1.getBookId() == r) {
						System.out.println(b1.getBookId());
						i.remove();
						found = true;

						break;
					}

				}

				break;

			case 4: // UPDATE METHOD

				Book0 b3 = new Book0();
				System.out.println("Enter the Bookid to be Updated");
				int u = sc.nextInt();

				boolean found4 = false;

				ListIterator<Book0> bb = bookList.listIterator();
				while (bb.hasNext()) {
					Book0 e = (Book0) bb.next();
					if (e.getBookId() == u) {
						System.out.println("Enter the new Id");
						int BookId = sc.nextInt();

						System.out.println("Enter New Book name");
						String bookname = sc.next();

						System.out.println("Enter author name ");
						String authorName = sc.next();

						System.out.println("Enter the New Price");
						float price = sc.nextFloat();

						bb.set(new Book0(BookId, bookname, authorName, price));

						found4 = true;
					}

				}
				if (found4 == true) {
					System.out.println("Id Found Updated !");
				} else {
					System.out.println("Not Exist");
				}
				/*
				 * Iterator<Book> i3 = bookList.iterator(); while (i3.hasNext())
				 * { Book b2 = (Book) i3.next();
				 * 
				 * if (b2.getBookId() == u) {
				 * System.out.println("Enter Book Id ");
				 * b2.setBookId(sc.nextInt());
				 * 
				 * System.out.println("Enter the Book name ");
				 * b2.setBookName(sc.next()); sc.nextLine();
				 * 
				 * System.out.println("Enter the Book Author Name ");
				 * b2.setAuthorName(sc.nextLine());
				 * 
				 * System.out.println("Enter the Book Price ");
				 * b2.setBookPrice(sc.nextFloat());
				 * 
				 * System.out.println(b2.getBookId());
				 * 
				 * b2.add(b2); bookList.add(b2); } else {
				 * System.out.println("Not Exist"); } }
				 */
				// ob.update();
				break;

			case 5:
				// SEARCH METHOD
				boolean found2 = false;
				System.out.println("Enter Id to search");
				int id = sc.nextInt();
				System.out.println("-------------------------------");

				boolean found3 = false;

				Iterator i2 = bookList.iterator();
				while (i2.hasNext()) {
					Book0 b1 = (Book0) i2.next();

					if (b1.getBookId() == id) {
						System.out.println(b1.toString());
						System.out.println("Present");
						found = true;
						break;
					} else
						System.out.println("Not Present");
				}

				// found2 = b.search(b,id);
				break;

			case 0:
				System.exit(0);
			}

			System.out.println("Press any key to continue and press 0 to Exit !");
			c = sc.nextInt();
		} while (c != 0);

	}

	private static boolean delete(Book0 b) {
		// TODO Auto-generated method stub
		return false;
	}

}





class Book0 {

	// ArrayList<Book> bookList = new ArrayList<Book>();
	int usr;
	Scanner s = new Scanner(System.in);
	int i = 0, c = 0, r = 0;

	private int BookId;
	private String BookName;
	private String AuthorName;
	private float BookPrice;
	
	
	Book0(int BookId,String BookName, String AuthorName,Float BookPrice)
	{
		this.BookId = BookId;
		this.BookName = BookName;
		this.AuthorName = AuthorName;
		this.BookPrice = BookPrice;
	}

	public Book0() {
	}

	// @Override
	public String toString() {
		return "Book [BookId=" + BookId + "]";
	}

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		this.BookId = bookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		this.BookName = bookName;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		this.AuthorName = authorName;
	}

	public float getBookPrice() {
		return BookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.BookPrice = bookPrice;
	}

	public void display(ArrayList<Book0> arr) {

		System.out.println("BOOK ID\t\tBOOK NAME\tAUTHOR NAME\tBOOK PRICE");
		for (Book0 book : arr) {

			System.out.printf("%-15d%-15s%-10s%4f%n", book.BookId, book.BookName, book.AuthorName, book.BookPrice);

			// System.out.println("Book ID: "+book.BookId);
			// System.out.println("Book Name: "+book.BookName);
			// System.out.println("Author Name: "+book.AuthorName);
			// System.out.println("Book Price: "+book.BookPrice);

		}
	}

	public void add(Book0 b) {
		this.BookId = BookId;
		this.BookName = BookName;
		this.AuthorName = AuthorName;
		this.BookPrice = BookPrice;
	}

	/*public void delete(Book b) {
		ArrayList<Book> bookList = new ArrayList<Book>();

		System.out.println("Enter the Bookid to be deleted");
		r = s.nextInt();

		for (i = 0; i < bookList.size(); i++) {
			if (BookId == r) {

				bookList.remove(b);

				// BookId =0;
				// BookName = " ";
				// AuthorName = " ";
				// BookPrice = 0;
			}
		}
		System.out.println("Entered Id is Deleted from List.");
		display(bookList);

	}*/

	
	public boolean delete(Book0 b){
		
		System.out.println("Enter the Bookid to be deleted");
		int r = s.nextInt();

		
		ArrayList<Book0> bookList = new ArrayList<Book0>();
		
		boolean found =false;
		
		Iterator<Book0> i = bookList.iterator();
		while (i.hasNext()) {
			Book0 b1 = (Book0) i.next();

			if (b1.getBookId() == r) {
				System.out.println(b1.getBookId());
				i.remove();
				found = true;

				break;
			}

		}
		
	/*	boolean found = false;

		Iterator<Book> i = bookList.iterator();
		while (i.hasNext()) {
			Book b1 = (Book) i.next();

			if (b1.getBookId() == r) 
			{
				System.out.println(b1.getBookId());
				i.remove();
				found = true;
				
				break;
			}
			
		}*/
		return found;
		
		
		/*boolean found = false;

		Iterator<Book> i = bookList.iterator();
		while (i.hasNext()) {
			Book b1 = (Book) i.next();

			if (b1.getBookId() == id) 
			{
				System.out.println(b1.getBookId());
				((List<Book>) b1).remove(i);
				found = true;
				
				break;
			}
		}
		return found;*/
	}
		
	
	public boolean search(Book0 b,int id) {
		

		ArrayList<Book0> bookList = new ArrayList<Book0>();
		
		
		boolean found = false;

		Iterator i = bookList.iterator();
		while (i.hasNext()) {
			Book0 b1 = (Book0) i.next();

			if (b1.getBookId() == id) {
				System.out.println(b1.toString());
				found = true;
				break;
			}
		}
		if (found == true) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}
		return found;
	}
	
	
		
}
	
	/*
	 * public void add(int usr) { this.usr = usr; for (i = 0; i < usr; i++) {
	 * System.out.println("Enter Bookname and Bookid "); Bookname[i] = s.next();
	 * Bookid[i] = s.nextInt();
	 * 
	 * } display();
	 * 
	 * }
	 * 
	 * @Override void display() {
	 * System.out.println("----THE UPDATED RECORDS OF BOOKS ARE----");
	 * System.out.println("BOOK Id        Bookname"); for (i = 0; i <
	 * Bookid.length; i++) { if (Bookid[i] != 0) {
	 * System.out.printf("%-10d%-10s%n", Bookid[i], Bookname[i]); } } }
	 */
	/*
	 * public void search() {
	 * 
	 * System.out.println("Enter the Bookid you want to search"); r =
	 * s.nextInt(); for (i = 0; i < Bookid.length; i++) { if (Bookid[i] == r) {
	 * break; } } System.out.println(" "); System.out.println(" ");
	 * System.out.println("---DETAILS OF THE SPECIFIED Book IS---");
	 * System.out.println("BOOK NAME       BOOK ID");
	 * System.out.print(Bookname[i] + "         "); System.out.print(Bookid[i]);
	 * System.out.println(" "); System.out.println(" ");
	 * System.out.println(" ");
	 * 
	 * }
	 * 
	 * public void delete() {
	 * System.out.println("Enter the Bookid to be deleted"); 
	 * r = s.nextInt();
	 * 
	 * for (i = 0; i < Bookid.length; i++) { if (Bookid[i] == r) { Bookid[i] =
	 * 0; Bookname[i] = " "; } } display();
	 * 
	 * }
	 * 
	 * public void update() {
	 * System.out.println("Enter the Bookid to be updated"); 
	 * r = s.nextInt();
	 * 
	 * for (i = 0; i < Bookid.length; i++) 
	 * { if (Bookid[i] == r) {
	 * System.out.println("Enter the new Bookname and Bookid"); 
	 * Bookname[i] =
	 * s.next(); Bookid[i] = s.nextInt(); 
	 * } } 
	 * display(); }
	 */

	



// }
