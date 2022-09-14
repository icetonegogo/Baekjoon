import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int cook = sc.nextInt(); // 요리 시간

		m = m + h * 60 + cook;

		h = m / 60;
		m = m % 60;
		if (h > 23) {
			h = h - 24;
		}
		System.out.println(h + " " + m);
	}
}
