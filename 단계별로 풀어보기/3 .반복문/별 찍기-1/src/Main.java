import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int t,i;
		for(i=1;i<=N;i++) {
			for(t=1;t<=i;t++) System.out.printf("*");
			System.out.printf("\n");
		}
	}
}