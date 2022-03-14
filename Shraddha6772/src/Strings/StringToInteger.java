package Strings;

public class StringToInteger {
	 
    public static void main(String[] args) {
 
        String str = "1234";
 
        int result = Integer.parseInt(str); // using Integer.parseInt()
        // int result2 = Integer.valueOf(str); //using Integer.valueOf()
 
        System.out.println("The converted int is: " + result);
 
    }
 
}