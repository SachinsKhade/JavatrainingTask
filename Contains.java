package StringProgram;

public class Contains {

	public static void main(String[] args) {
		String name,fullname;
		name="Sachin";
		fullname="SachinKhade";
		name.toUpperCase();
		System.out.println(name);
		if(fullname.contains(name))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}

	}

}
