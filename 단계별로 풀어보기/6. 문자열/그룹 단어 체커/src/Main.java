import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (check_num(br.readLine()))
				cnt++;
		}
		System.out.println(cnt);
	}

	public static boolean check_num(String s) {
		boolean arr[] = new boolean[26];
		int num = 0;
		char prev = '0';
		for (int i = 0; i < s.length(); i++) {
			char now = s.charAt(i);
			if (arr[now - 'a'] == false) {
				arr[now - 'a'] = true;
				prev = now;
				continue;
			}
			if (now != prev && arr[now - 'a'] == true) {
				return false;
			}
		}
		return true;
	}
}