
/*
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int alphabet[] = new int[26];
		for (int i = 0; i < S.length(); i++) {
			alphabet[S.charAt(i) - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			sb.append(alphabet[i] + " ");
		}
		System.out.println(sb);
	}
}
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		String S = sc.nextLine();

		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);

			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}

		for (int i = 0; i < 26; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}