package work;

public class FinalFunction {
	public static void main(String[] args) {
		FinalTest F1 = new FinalTest(9);
		FinalTest F2 = new FinalTest(8);
		int fun = FinalFunction.numb(F1.getFinalTest(),F2.getFinalTest());
		System.out.println("面向对象:"+fun);
	}
	public static int numb(int x,int y) {
		return x % y;
	}
}
