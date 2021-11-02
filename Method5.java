package MethodsProgram;

public class Method5 {
	void m1() {
		m2();
		System.out.println("m1");
		m2();
	}

	void m2() {
		m3(10);
		System.out.println("M2");
	}

	void m3(int a) {
		System.out.println("m3");
	}

	public static void main(String[] args) {
		// Method Calling

		Method5 T = new Method5();
		T.m1();
	T.m3(10);
	}

}
