package IACSD.JAVA8;

import java.util.ArrayList;

public class LambdaExpressionWithForEach {
public static void main(String[] args) {
	
	ArrayList<String> names=new ArrayList<>();
	names.add("Harsh");
	names.add("Kanchan");
	names.add("Badar");
	names.add("Akhtar");
	names.add("Zoom");
	System.out.println(names);
	for (String string : names) {
		System.out.println(string);
	}
	System.out.println(".................");
	//forEach() method
	names.forEach(str->System.out.println(str));
	System.out.println();
	//method referencing
	names.forEach(System.out::println);
}
}
