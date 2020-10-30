package IACSD.JAVA8;

@FunctionalInterface
interface MyFuncInterfaceNoPara{
	void add();
}

public class LambdaExpressionWithNoPara {
public static void main(String[] args) {
	MyFuncInterfaceNoPara if1=()->{
		System.out.println("Lambda Expression with no para");
		int a=10, b=20;
		int c=a+b;
		System.out.println("Add: "+c);
	};
	if1.add();
}
}
