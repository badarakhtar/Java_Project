package IACSD.JAVA8;

public class TestConsumer {
public static void main(String[] args) {
	Consumer c=new Consumer();
	c.max(10, 20);
	c.min(34, 56);
	
//	MathOperation mp=new MathOperation() {
//		
//		@Override
//		public void min(int i, int j) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void max(int i, int j) {
//			// TODO Auto-generated method stub
//			
//		}
//	};
	
	MathOperation o=new Consumer();
	o.max(100, 10);
	o.min(90, 9);
}
}
