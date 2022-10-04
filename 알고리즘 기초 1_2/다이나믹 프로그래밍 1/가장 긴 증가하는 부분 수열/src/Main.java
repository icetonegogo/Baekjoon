import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int prev = 0;
		int count = 0;
		st = new StringTokenizer(br.readLine());
		while (N-- > 0) {
			int now = Integer.parseInt(st.nextToken());
			if (now > prev) {
				prev = now;
				count++;
			}
		}
		System.out.println(count);
	}
}