package work;

public class Divide {
	public static void main(String[] args) {
		Num c1 = new Num(6);
		Num c2 = new Num(2);
		int divide = Divide.com(c1.getNum(),c2.getNum());
		System.out.println("面向对象:"+divide);
	}
	public static int com(int x,int y) {
		return x / y;
	}
}
