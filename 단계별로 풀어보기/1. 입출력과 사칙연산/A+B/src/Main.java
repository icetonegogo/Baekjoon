import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// nextInt()는 다믕으로 입력받는 정수를 받습니다
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A + B);
		sc.close(); // 열었던 scanner를 닫아주는 코드입니다
	}
}
