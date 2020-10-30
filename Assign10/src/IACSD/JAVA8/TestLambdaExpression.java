package IACSD.JAVA8;

public class TestLambdaExpression {
	public static void main(String[] args) {
		// MyFunctionalInterface1 if1=()->{};
		MyFunctionalInterface1 if1 = () -> {
			System.out.println("This is functional interface with no parameters ");
		};
		if1.show();
	}
}
