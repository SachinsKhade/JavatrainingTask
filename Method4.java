package MethodsProgram;

public class Method4 {
	void m1() {
		System.out.println("M1 Method");
	}

	void m1(int a) {
		System.out.println("M2 Method");
	}

	public static void main(String[] args) {

		Method4 Test = new Method4();
		Test.m1();
		Test.m1(10);
	}

}
