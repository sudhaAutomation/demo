package basics;

public class SwapingNumbers {

	public static void main(String[] args) {
		// Swaping means interchanges the values of the 2 variable values
		int x = 10;
		int y = 20;
		// 1.by using the third variable
		// int z = x;
		// x = y;
		// y = z;
		
		// 2.without using the third variable,by +,- operator
		// x=x+y;//30
		// y=x-y;//30-20=10
		// x=x-y;
		
		// 3.without using the third variable,by using *,/ operator
		// x = x * y;//200
		// y = x / y;//(200/20)=10
		// x = x / y;//(200/10)=20
		
		// 4 by using XOR^
		 x = x ^ y;//use binary code of the 10 and 20
		 y = x ^ y;
		 x = x ^ y;
		System.out.println("x vslue is " + x);
		System.out.println("y vslue is " + y);
	}

}
