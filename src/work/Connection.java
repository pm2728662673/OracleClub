package work;
import java.util.*;
public class Connection {
	public static void main(String[] args) {
		int count = 0;
		Scanner factor = new Scanner(System.in);
		String f1 = factor.nextLine();
		HashMap<Character,Integer> map = new HashMap<>();
		char[] f2 = f1.toCharArray();
		for(char i : f2) {
			if(map.containsKey(i)) {
				//���ڼ�
				count = map.get(i);
				count ++;
				map.put(i, count);
			}else {
				//�����ڼ�
				map.put(i,1);
			}
		}
		System.out.println(map);
	}
}
