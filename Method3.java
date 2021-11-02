package MethodsProgram;

class X {
}

class Emp {
}

class Y {
}

class Student {
}

public class Method3 {

	void m1(X x, Emp e) {
		System.out.println("M1 Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method3 t = new Method3();
		X x = new X();
		Emp e1 = new Emp();
		t.m1(x, e1);

	}

}
