package MethodsProgram;

public class Method1 {
	// Creating Instance Method
	void m1() {
		System.out.println("Instance Method M1");
	}

	// Creating Static Method
	static void m2() {
		System.out.println("Static Method M2");
	}

	public static void main(String[] args) {
		// Calling Both static and instance method from main method
		Method1 test = new Method1();
		test.m1();
		Method1.m2();

	}

}
