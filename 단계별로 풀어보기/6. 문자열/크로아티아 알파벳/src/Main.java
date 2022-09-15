import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int cnt = 1;
		for (int i = 1; i < s.length(); i++) {
			cnt++;
			if (s.charAt(i) == '=' && s.charAt(i - 1) == 'c') {
				cnt--;
			} else if (s.charAt(i) == '-' && s.charAt(i - 1) == 'c') {
				cnt--;
			} else if ((s.charAt(i - 1) == 'l' || s.charAt(i - 1) == 'n') && s.charAt(i) == 'j') {
				cnt--;
			} else if (s.charAt(i) == '=' && s.charAt(i - 1) == 'z' && i > 1) {
				if (s.charAt(i - 2) == 'd') {
					cnt -= 2;
				} else
					cnt--;
			} else if (s.charAt(i) == '-' && s.charAt(i - 1) == 'd') {
				cnt--;
			} else if (s.charAt(i) == '=' && s.charAt(i - 1) == 's') {
				cnt--;
			} else if (s.charAt(i) == '=' && s.charAt(i - 1) == 'z') {
				cnt--;
			}
		}
		System.out.println(cnt);
	}
}
