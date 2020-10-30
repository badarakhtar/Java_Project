package IACSD.COM;

public class Test {
	public static void main(String[] args) {
		MathInterface1 mi = () -> {
			System.out.println("Calling print method of Interface using lambda expression");
		};
		mi.print();
		System.out.println(".....................");
		MathInterface2 mi2 = (i, j) -> {
			System.out.println("Calling add method through functional interface");
			int k = i + j;
			System.out.println("Addition: " + k);
		};
		mi2.add(5, 11);
		System.out.println(".................");
		MathInterface3 mi3 = (str1, str2) -> {
			System.out.println("Calling concatStr method functional Interface");
			String str3 = str1.concat(str2);
			System.out.println(str3);
			return str3;
		};
		mi3.concatStr("BADAR", " AKHTAR");
	}
}
