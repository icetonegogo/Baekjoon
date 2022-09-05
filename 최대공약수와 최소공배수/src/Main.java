import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		sb.append(GCD(n, m)+"\n");
		int num=GCD(n, m);
		int i = 1;
		while(true) {
			if ((num*i)%n==0&&(num*i)%m==0) break;
			else i++;
		}
		sb.append(num*i);
		System.out.println(sb);
	}
	public static int GCD(int a,int b) {
		if(b==0) return a;
		else return GCD(b, a%b);
	}
}