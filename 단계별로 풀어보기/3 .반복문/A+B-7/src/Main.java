
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int arr[] = new int[t];
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		for (int i = 0; i < t; i++) {
			System.out.println("Case #" + (i + 1) + ": " + arr[i]);
		}
		sc.close();
	}
}
/*
 * import java.util.Scanner;
 * 
 * public class Main { public static void main(String args[]) {
 * 
 * Scanner in = new Scanner(System.in);
 * 
 * int a = in.nextInt();
 * 
 * for (int i = 1; i <= a; i++) { int c = in.nextInt(); int d = in.nextInt();
 * 
 * System.out.println("Case #" + i + ": " + (c + d)); }
 * 
 * in.close(); } <-----개병신 }
 */