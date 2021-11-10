package LogicalProgram;

public class array1 {

	public static void main(String[] args) {
		String[] carName = { "BMW", "Swift", "volvo" };
		System.out.println(carName.length);
		for (int i = 0; i < carName.length; i++) {
			System.out.println(carName[i]);
		}
		carName[2] = "Tesla";
		System.out.println(carName[2]);
	}

}
