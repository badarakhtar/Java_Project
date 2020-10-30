package IACSD.JAVA8;

public class TestDefaultNethod {
	public static void main(String[] args) {
		ConsumerJava8Interface cos = new ConsumerJava8Interface();
		cos.add();
		cos.show();// interface implemented method get invoked
		MyJvava8Interface.display();// static method from interface
		//cos.done();
	
	}
}
