import java.io.*;

class Main {
	static int arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while (N-- > 0) {
			int num = Integer.parseInt(br.readLine());
			arr = new int[num + 1];
			arr[1] = 1;
			arr[2] = 2;
			System.out.println(plus(num));
		}
	}

	public static int plus(int n) {
		if (arr[n] == 0) {
			
		}
		return arr[n];
	}
}