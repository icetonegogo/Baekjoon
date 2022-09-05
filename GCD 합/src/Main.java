import java.io.*;
import java.security.PublicKey;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=n;
			int arr[]=new int[100];
			int k=0;
			long sum=0;
			while(m-->0) {
				arr[k]=Integer.parseInt(st.nextToken());
				k++;
			}
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					sum+=GCD(arr[i], arr[j]);
				}
			}
			sb.append(sum+"\n");
		}
		System.out.println(sb);
	}
	public static int GCD(int a,int b) {
		if(b==0) return a;
		else return GCD(b, a%b);
	}
}
// sum을 int로 쓸경우 오버플로우가 일어나 오답처리됨