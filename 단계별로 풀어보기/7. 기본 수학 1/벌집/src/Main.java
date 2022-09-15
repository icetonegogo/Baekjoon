import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int c = 6;
		int f = 1;
		int i = 1;
		while (true) {
			if (N == 1) {
				break;
			}
			f += c;
			if (N <= f && N > (f - c)) {
				i++;
				break;
			}
			c += 6;
			i++;
		}
		System.out.println(i);
		sc.close();
	}
}