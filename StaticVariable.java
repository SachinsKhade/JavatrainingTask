package Demo;

//Type of Variable
public class StaticVariable {
	// static variable
	static int a = 1000;
	static int b = 2000;

	public static void main(String[] args) {
		System.out.println(StaticVariable.a);
		System.out.println(StaticVariable.b);

		StaticVariable var = new StaticVariable();
		var.Method2();
	}

	void Method2() {
		System.out.println(StaticVariable.a);
		System.out.println(StaticVariable.b);
	}
}
