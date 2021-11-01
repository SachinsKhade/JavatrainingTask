package StringProgram;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		String st1, st2;
		st1 = "Verve";
		st2 = "verve";

		if (st2.equalsIgnoreCase(st1)) {
			System.out.println("Test Pass");
		} else {

			System.out.println("Test Faile");
		}

	}

}
