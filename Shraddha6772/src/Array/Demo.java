package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws IOException {

		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			
			BufferedReader br = new BufferedReader(isr); 
			
			System.out.println("Enter the numeeric value ");
			String num = br.readLine();
			
			int n = Integer.parseInt(num);
			float f = Float.parseFloat(num);
			double d = Double.parseDouble(num);
			
			System.out.println("Integer "+n);
			System.out.println("Float "+f);
			System.out.println("Double "+d);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		Scanner s = new Scanner(System.in);
//		
//		int n = s.nextInt();
		
	}

}
