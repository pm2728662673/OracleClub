package work;

public class NewMath {
	public static void main(String[] args) {
		NewTest v1 = new NewTest(7);
		NewTest v2 = new NewTest(5);
		int delete = NewMath.Newnumbers(v1.getValues(),v2.getValues());
		System.out.println("面向对象:"+delete);
	}
	public static int Newnumbers(int x,int y) {
		return x - y;
	}
}

