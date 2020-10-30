package IACSD.COM;

import java.util.ArrayList;

public class MethodREF {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(11);
		numbers.add(13);
		numbers.add(17);
		numbers.add(19);
		numbers.add(23);
		System.out.println("----------------------------------------");
		System.out.println("ARRAY LIST USING METHOD REFERENCING:");
		System.out.println("----------------------------------------");
		numbers.forEach(System.out::println);
		System.out.println("----------------------------------------");
	}
}