
/*import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=1;i<=N;i++) {
			if(num(i)==1) cnt++;
		}
		if(N==1000) cnt--;
		System.out.println(cnt);
	}
	public static int num(int n){
		int a,b,c;
		if(n<100) return 1;
		else {
			c=n%10;
			n/=10;
			b=n%10;
			n/=10;
			a=n%10;
			n/=10;
			if(a-b==b-c) return 1;
		}
		return 0;
	}
}
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(arithmetic_sequence(sc.nextInt()));
		sc.close();

	}

	public static int arithmetic_sequence(int num) {
		int cnt = 0;

		if (num < 100) {
			return num;
		}

		else {
			cnt = 99;

			for (int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}