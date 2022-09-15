import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt[] = new int[26];
		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				cnt[s.charAt(i) - 'a']++;
			} else {
				cnt[s.charAt(i) - 'A']++;
			}
		}
		int max = -1;
		char c = '?';
		for (int i = 0; i < 26; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				c = (char) (i + 65);
			} else if (cnt[i] == max) {
				c = '?';
			}
		}
		System.out.println(c);
	}
}