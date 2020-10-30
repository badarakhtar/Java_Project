package IACSD.JAVA8;

import java.util.StringJoiner;

public class TestStringJoinerClass {
	public static void main(String[] args) {
		StringJoiner sjoin=new StringJoiner(", ");
		sjoin.add("c");
		sjoin.add("c++");
		sjoin.add("Core Java");
		sjoin.add("Adv Java");
		sjoin.add("C#");
		sjoin.add("Asp.net");
		System.out.println(sjoin);
		System.out.println(".............");
		
		StringJoiner name=new StringJoiner(", ", "Mr. ", " added in batch");
		name.add("BADAR");
		name.add("Akhtar");
		System.out.println(name);
	}
}
