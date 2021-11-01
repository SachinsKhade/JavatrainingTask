package StringProgram;

public class Contains1 {

	public static void main(String[] args) {
		String expurl, acturl;
		expurl = "Gmail";
		acturl = "welcome to Gmail.com";

		if (acturl.toLowerCase().contains(expurl.toLowerCase())) {
			System.out.println("Tess Pass");
		} else {
			System.out.println("Test Fail");
		}
	}

}
