package Demo;

//Type of Variable
public class instanceVariable {
	// instance variables
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		// Accessing instance variable inside static method
		instanceVariable var = new instanceVariable();
		System.out.println(var.a);
		System.out.println(var.b);
		var.method1();// user define method must called by user inside main
						// method
	}

	// Accessing instance variable inside Instance method
	void method1() {
		System.out.println(a);
		System.out.println(b);
	}
}
