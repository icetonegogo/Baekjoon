import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int min=1000000000;
		int M=sc.nextInt();
		int N=sc.nextInt();
		for(int i=M;i<=N;i++) {
			int count=0;
			for(int k=1;k<=i;k++) {
				if(i%k==0) {
					count++;
				}
			}
			if(count==2) {
				sum+=i;
			    if(min>i) min=i;
			}
		}
		if(sum==0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}