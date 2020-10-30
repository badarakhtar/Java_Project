package IACSD.COM;

import java.util.ArrayList;

public class DisplayArrayList {
	public static void main(String[] args) {
		ArrayList<String> city=new ArrayList<>();
		city.add("Pune");
		city.add("Bengaluru");
		city.add("Prayagraj");
		city.add("Patna");
		city.add("Lucknow");
		System.out.println("Displaying city list through foreach");
		city.forEach(str->System.out.print(str+" "));
		System.out.println();
		System.out.println(".............");
		ArrayList<String> names=new ArrayList<>();
		names.add("BADAR");
		names.add("RAMESH");
		names.add("SHYAM");
		names.add("RAM");
		names.add("SITA");
		System.out.println("Displaying name list through for each");
		names.forEach(System.out::println);
	}
}
