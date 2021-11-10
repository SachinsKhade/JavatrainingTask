package LogicalProgram;

import java.util.*;

public class Arrayl1 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();// Creating ArrayList

		// Adding Objects in ArrayList
		alist.add("Apple");
		alist.add("Banana");
		alist.add("Mango");
		alist.add("Grapes");
		// Printing The ArrayList
		System.out.println(alist);
		// Count ArrayList Size
		int total;
		total = alist.size();
		System.out.println(total);
		for (int i = 0; i < total; i++) {
			System.out.println(alist.get(i));
		}

	}

}
