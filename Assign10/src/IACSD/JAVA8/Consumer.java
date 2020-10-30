package IACSD.JAVA8;

public class Consumer implements MathOperation {

	@Override
	public void max(int i, int j) {
		// TODO Auto-generated method stub
		if (i > j)
			System.out.println("Max: " + i);
		else
			System.out.println("Max: " + j);
	}

	@Override
	public void min(int i, int j) {
		// TODO Auto-generated method stub
		if (i < j)
			System.out.println("Min: " + i);
		else
			System.out.println("Min: " + j);
	}

	@Override
	public void pow(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
