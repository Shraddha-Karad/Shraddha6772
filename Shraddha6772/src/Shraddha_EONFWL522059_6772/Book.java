package Shraddha_EONFWL522059_6772;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Book {

	int usr;
	Scanner s = new Scanner(System.in);
	int i = 0, c = 0, r = 0;

	private int BookId;
	private String BookName;
	private String AuthorName;
	private float BookPrice;
	
	
	Book(int BookId,String BookName, String AuthorName,Float BookPrice)
	{
		this.BookId = BookId;
		this.BookName = BookName;
		this.AuthorName = AuthorName;
		this.BookPrice = BookPrice;
	}

	public Book() {
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

	public void display(ArrayList<Book> arr) {

		
		System.out.println("BOOK ID\t"+"   "+"BOOK NAME\tAUTHOR NAME\tBOOK PRICE");
		for (Book book : arr) {

			System.out.printf("%-15d%-15s%-10s%f%n", book.BookId, book.BookName, book.AuthorName, book.BookPrice);

		
		}
	}

	public void add(Book b) {
		this.BookId = BookId;
		this.BookName = BookName;
		this.AuthorName = AuthorName;
		this.BookPrice = BookPrice;
	}
	
	public boolean delete(Book b){
		
		System.out.println("Enter the Bookid to be deleted");
		int r = s.nextInt();

		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		boolean found =false;
		
		Iterator<Book> i = bookList.iterator();
		while (i.hasNext()) {
			Book b1 = (Book) i.next();

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
		
	}
		
	
	public boolean search(Book b,int id) {
		

		ArrayList<Book> bookList = new ArrayList<Book>();
		
		
		boolean found = false;

		Iterator i = bookList.iterator();
		while (i.hasNext()) {
			Book b1 = (Book) i.next();

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
	
	