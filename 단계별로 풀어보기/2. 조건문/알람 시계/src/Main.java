import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt(); // 시
		int m = sc.nextInt(); // 분
		if (m < 45) {
			if (h == 0)
				System.out.println("23 " + (15 + m));
			else
				System.out.println((h - 1) + " " + (m + 15));
		} else
			System.out.println(h + " " + (m - 45));
		sc.close();
	}
}