import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double arr[] = new double[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextDouble();
		}
		Arrays.sort(arr);
		double sum = 0;

		for (int j = 0; j < N; j++) {
			double new1 = arr[j] / arr[N - 1] * 100;
			sum = sum + new1;
		}
		System.out.println(sum / N);
		sc.close();
	}
}