package Basics;

import java.util.Scanner;
 class Book {

	public static void main(String[] args) 
	{

		        Scanner s = new Scanner(System.in);

		        int c, usr;
		        Book1 ob = new Book1();

		        do {
		            System.out.println("::::MENU::::");
		            System.out.println("ENTER 1 FOR ADDING  BOOK DETAIL");
		            System.out.println("ENTER 2 FOR SEARCHING BOOK DETAILS ");
		            System.out.println("ENTER 3 FOR DELETION OF BOOK ");
		            System.out.println("ENTER 4 FOR UPDATION OF BOOK ");
		            System.out.println("ENTER 5 TO EXIT");
		            int ch = s.nextInt();

		            switch (ch) {
		                case 1:
		                    System.out.println("Enter The No Of Books ");
		                    usr = s.nextInt();
		                    ob.add(usr);
		                    break;
		                case 2:
		                    ob.search();
		                    break;
		                case 3:
		                    ob.delete();
		                    break;
		                case 4:
		                    ob.update();
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

		    public void search() {

		        System.out.println("Enter the Bookid you want to search");
		        r = s.nextInt();
		        for (i = 0; i < Bookid.length; i++) {
		            if (Bookid[i] == r) {
		                break;
		            }
		        }
		        System.out.println(" ");
		        System.out.println(" ");
		        System.out.println("---DETAILS OF THE SPECIFIED Book IS---");
		        System.out.println("BOOK NAME       BOOK ID");
		        System.out.print(Bookname[i]+"         ");
		        System.out.print(Bookid[i]);
		        System.out.println(" ");
		        System.out.println(" ");
		        System.out.println(" ");    
		       

		    }

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

		    public void update() {
		        System.out.println("Enter the Bookid to be updated");
		        r = s.nextInt();

		        for (i = 0; i < Bookid.length; i++) {
		            if (Bookid[i] == r) {
		                System.out.println("Enter the new Bookname and Bookid");
		                Bookname[i] = s.next();
		                Bookid	[i] = s.nextInt();
		            }
		        }
		        display();
		    }

		    @Override
		    void display() {
		        System.out.println("----THE UPDATED RECORDS OF BOOKS ARE----");
		        System.out.println("BOOK NAME        Bookid");
		        for (i = 0; i < Bookid.length; i++) {
		            if(Bookid[i]!=0)
		            {              
		            System.out.print(Bookname[i]+"         ");
		            System.out.print(Bookid[i]);
		            System.out.println(" ");
		            }
		        }
		    }
	

	

}
