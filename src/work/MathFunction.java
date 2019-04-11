package work;

public class MathFunction {
	public static void main(String[] args) {
		Number n1 = new Number(1);
		Number n2 = new Number(2);
		int sum = MathFunction.answer(n1.getValue(), n2.getValue());
		System.out.println("面向对象："+sum);
	}
	public static int answer(int x, int y) {
		return x + y;
	}
}
