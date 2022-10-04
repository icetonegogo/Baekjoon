import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long dp[] = new long[101];
		dp[1] = 9;
		for (int i = 2; i <= N; i++) {
			dp[i] = (long) ((dp[i - 1] * 2 - Math.pow(i - 1, 2))%1000000000);
		}
		System.out.println(dp[N]);
	}
}