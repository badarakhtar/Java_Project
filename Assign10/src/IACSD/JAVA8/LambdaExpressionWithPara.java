package IACSD.JAVA8;

@FunctionalInterface
interface MYFuncInterFaceWithOnePara{
	void increamentValue(int no);
}

public class LambdaExpressionWithPara {
public static void main(String[] args) {
	MYFuncInterFaceWithOnePara one=(no)->{
		System.out.println("Incremented Value: "+(no+100));
	};
	one.increamentValue(5);
}
}
