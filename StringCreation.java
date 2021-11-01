package StringProgram;

public class StringCreation {

	public static void main(String[] args) {
		// String Creation without using new operator
		String s1 = "verve";
		String s2 = "Tech";
		String s3 = "verve";
		System.out.println(s1 == s2);// f
		System.out.println(s1 ==s3);// T
		System.out.println(s2 ==s3);// F
//Using new operator
		String sn1=new String("sachin");
		String sn2=new String("Sachi");
		String sn3=new String("Sachin");
		System.out.println(sn1==sn2);//F
		System.out.println(sn1==sn3);//F
		System.out.println(sn2==sn3);//F
		System.out.println(sn1.contains(sn3.toLowerCase()));
	}

}
