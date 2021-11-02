package MethodsProgram;

public class Method2 {
	void m1(int a, char ch)// local variable
	{
		System.out.println("Merhod M1 ");
		System.out.println(a);
		System.out.println(ch);
	}

	static void m2(String name, double salary) {
		System.out.println("Method M2");
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {

		// Method calling with parameter

		Method2 test = new Method2();
		test.m1(10, 'a');
		Method2.m2("Sachin", 50000.00);

	}

}
