/*
import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		prime_num();
		while(true) {
			int N=Integer.parseInt(br.readLine());
			if(N==0) break;
			int cnt=0;
			
			for(int i=N+1;i<=2*N;i++) {
				if(!arr[i]) cnt++;
			}
			System.out.println(cnt);
		}
		
	}
	static boolean arr[]=new boolean[246913];
	
	public static void prime_num() {
		arr[0]=arr[1]=true;
		for(int i=2;i<=Math.sqrt(arr.length);i++) {
			if(arr[i]) continue;
			for(int j=i*i;j<arr.length;j+=i) {
				arr[j]=true;
			}
		}
	}
}
*/
import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st=new StringTokenizer(br.readLine());
		//int N=Integer.parseInt(st.nextToken());
		//int M=Integer.parseInt(st.nextToken());
		prime_num();
		
		StringBuilder sb=new StringBuilder();
		while(true) {
			int cnt=0;
			int n=Integer.parseInt(br.readLine());
			if(n==0) break;
			for(int i=n+1;i<=2*n;i++) {
				if (!arr[i]) cnt++;
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}
	public static boolean arr[]=new boolean[1000001];
	public static void prime_num() {
		arr[0]=arr[1]=true;
		for(int i=2;i<Math.sqrt(arr.length);i++) {
			if(arr[i]) {
				continue;
			}
			for(int j=i*i;j<arr.length;j+=i) {
				arr[j]=true;
			}
		}
	}
}
