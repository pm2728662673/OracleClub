package work;

public class Compute {
	public static void main(String[] args) {
		Factor n3 = new Factor(3);
		Factor n4 = new Factor(5);
		int results = Compute.result(n3.getOne(),n4.getOne());
		System.out.println("�������:"+results);
	}
	public static int result(int x,int y) {
		return x * y;
	}
}
