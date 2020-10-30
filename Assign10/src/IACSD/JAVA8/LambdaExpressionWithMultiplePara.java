package IACSD.JAVA8;

@FunctionalInterface
interface MyFuncInterfaceWithManyPara {
	void add(int i, int j, int k);
}

public class LambdaExpressionWithMultiplePara {
	public static void main(String[] args) {
		MyFuncInterfaceWithManyPara many = (m, n, o) -> {
			//int l = i + j + k;
			int l=m+n+o;
			System.out.println("Addition: " + l);
		};
		many.add(10, 20, 30);
	}
}
