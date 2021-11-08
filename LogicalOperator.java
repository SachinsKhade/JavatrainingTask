package Operator;

public class LogicalOperator {

	public static void main(String[] args) {
		// logical && Bitwise & Operators

		int a = 10;
		int b = 5;
		int c = 20;
		// Logical && Operator
		System.out.println(a < b && a < c);// false
		System.out.println(a > b & a < c); // True

		/*
		 * System.out.println(a < b && a++ < c);// false
		 * //System.out.println(a); //System.out.println(a < b & a++ < c);
		 * //System.out.println(a);
		 * 
		 */
		// logical || Bitwise | Operators

		System.out.println(a > b || a < c);// True
		System.out.println(a > b | a < c); // True
		System.out.println(a > b || ++a < c);
		System.out.println(a);
		System.out.println(a > b | a++ < c);
		System.out.println(a);

	}

}
