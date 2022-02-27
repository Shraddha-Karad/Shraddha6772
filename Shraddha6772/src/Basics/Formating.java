package Basics;

import java.util.Scanner;

public class Formating {

	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
         String s1=sc.next();
         int x=sc.nextInt();
         
         
         for(int i=0;i<3;i++){
            
             System.out.printf("%-15s%03d%n",s1,x);
         }    
 }
	
}
