package ControlFlowStatements;

public class Ifelse {
	int age = 18;

	public static void main(String[] args) {
		Ifelse t = new Ifelse();
		if (t.age >= 18) {
			System.out.println("Eligible for votting");
		} else {
			System.out.println("Not Eligible for votting");
		}
	}

}
