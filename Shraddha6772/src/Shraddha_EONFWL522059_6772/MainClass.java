package Shraddha_EONFWL522059_6772;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c, usr;
		ArrayList<Book> bookList = new ArrayList<Book>();

		do {
			Book b = new Book();

			System.out.println("::::MENU::::");
			System.out.println("1. ADD A BOOK");
			System.out.println("2. DISPLAY BOOK Records ");
			System.out.println("3. DELETE A BOOK ");
			System.out.println("4. UPDATE A BOOK ");
			System.out.println("5. SEARCH A BOOK");
			System.out.println("0. EXIT	");
			System.out.println("=================================================================");
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
				System.out.println("=================================================================");

				
				b.add(b);
				bookList.add(b);

				break;
			case 2:
				b.display(bookList);
				System.out.println("=================================================================");

				break;
				
			case 3:
				// DELETE METHOD

				System.out.println("Enter the Bookid to be deleted");
				int r = sc.nextInt();

				boolean found = false;
				found = delete(b);
				Iterator<Book> i = bookList.iterator();
				while (i.hasNext()) {
					Book b1 = (Book) i.next();

					if (b1.getBookId() == r) {
//						System.out.println(b1.getBookId());
						i.remove();
						found = true;

						break;
					}

				}
				System.out.println("=================================================================");

				break;

			case 4: // UPDATE METHOD

				Book b3 = new Book();
				System.out.println("Enter the Bookid to be Updated");
				int u = sc.nextInt();

				boolean found4 = false;
				
				ListIterator<Book> bb = bookList.listIterator();
				while(bb.hasNext())
				{
					Book e = (Book) bb.next();
					if(e.getBookId() == u)
					{
						System.out.println("Enter the new Id");
						int BookId = sc.nextInt();
					
						System.out.println("Enter New Book name");
						String bookname = sc.nextLine();
//						sc.nextLine();
						System.out.println("Enter author name ");
						String authorName = sc.nextLine();
						
						System.out.println("Enter the New Price");
						float price = sc.nextFloat();
					
						
						bb.set(new Book(BookId,bookname,authorName,price));
						
						found4 = true;
					}
					
				}
				if(found4 == true)
				{
					System.out.println("Id Found and Updated Successfully !");
				}
				else
				{
					System.out.println("Id Does Not Exist");
				}
				System.out.println("=================================================================");

				break;

			case 5:
				// SEARCH METHOD
//				boolean found2 = false;
				System.out.println("Enter Id to search");
				int id = sc.nextInt();
//				System.out.println("-----------------------------------------------------------------");

				boolean found3 = false;

				Iterator i2 = bookList.iterator();
				while (i2.hasNext()) {
					Book b1 = (Book) i2.next();

					if (b1.getBookId() == id) {
						System.out.println(b1.toString());
						System.out.println("Present");
						found3 = true;
						break;
					} 
					
				}
				if(found3 == false)
					System.out.println("Not Present");
				System.out.println("=================================================================");

				// found2 = b.search(b,id);
				break;

			case 0:
				System.exit(0);
			}

			System.out.println("Press any key to continue and press 0 to Exit !");
			c = sc.nextInt();
			System.out.println("=================================================================");
		} while (c != 0);

	}

	private static boolean delete(Book b) {
		// TODO Auto-generated method stub
		return false;
	}
}






























/*Iterator<Book> i3 = bookList.iterator();
while (i3.hasNext()) {
	Book b2 = (Book) i3.next();

	if (b2.getBookId() == u) {
		System.out.println("Enter Book Id ");
		b2.setBookId(sc.nextInt());

		System.out.println("Enter the Book name ");
		b2.setBookName(sc.next());
		sc.nextLine();

		System.out.println("Enter the Book Author Name ");
		b2.setAuthorName(sc.nextLine());

		System.out.println("Enter the Book Price ");
		b2.setBookPrice(sc.nextFloat());

		System.out.println(b2.getBookId());

		b2.add(b2);
		bookList.add(b2);
	} else {
		System.out.println("Not Exist");
	}
}
*/
// ob.update();
