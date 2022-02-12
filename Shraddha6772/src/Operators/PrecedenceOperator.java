package Operators;

public class PrecedenceOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5, b=12, c=8, d=10, cal=0;
		
		cal = a+(b*d)/c;
		/*  = 5+(12*10)/8
		 	  5+120/8
		 	  5+15
		 	  20
		 */
		System.out.println(cal);
		
		cal = d/a*c-b;
		/*  = 10/5*8-12
		      2*8-12
		      16-12
		      4
		 */
		
		System.out.println(cal);
		
		cal = d++*2+(++c)/a;
		/*  = 10++*2+(++8)/5
		      10++*2+8/5
		      10*2+8/5
		      20+1.6
		      21.6
		 */
		
		System.out.println(cal);
		
	}

}
