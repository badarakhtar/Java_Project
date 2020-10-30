package IACSD.JAVA8;

@FunctionalInterface
interface MyFuncInerfaceReturn{
	//String displayMsg();
	String getInfo(String prodName);
}

public class LambdaExpressionReturn {
public static void main(String[] args) {
//	MyFuncInerfaceReturn ret=()->{
//		System.out.println("In expression");
//		return "This is Returning Something";
//	};
//	String str=ret.displayMsg();
//	System.out.println(str);
	
	
	MyFuncInerfaceReturn ret2=(str)->{
		return "Info About product: "+str;
	};
	String s=ret2.getInfo("Realme");
	System.out.println(s);
}
}
