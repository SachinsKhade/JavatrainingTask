package StringProgram;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dob = "01/Jan/1988";
		String[] x = dob.split("/");
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);

	}

}
