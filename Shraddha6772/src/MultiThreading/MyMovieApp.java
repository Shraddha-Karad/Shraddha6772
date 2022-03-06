package MultiThreading;

class BookMyShow {
	static int total_tickets = 10;

	synchronized public void bookTickets(int ticket) {
		if (total_tickets >= ticket) {
			total_tickets = total_tickets - ticket;
			System.out.println(ticket + " has bookets has been booked & remaining are" + total_tickets);
		} else {
			System.out.println("Ticket is not booked only " + total_tickets + " are available ");
		}
	}

}

public class MyMovieApp extends Thread {
	static BookMyShow book;
	int t;

	public void run() {
		book.bookTickets(t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book = new BookMyShow();

		MyMovieApp vinitha = new MyMovieApp();
		vinitha.t = 3;
		vinitha.start();

		MyMovieApp dinesh = new MyMovieApp();
		dinesh.t = 5;
		dinesh.start();

	}

}
