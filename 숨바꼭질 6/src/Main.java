import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		int N=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		int arr[]=new int[100000];
		int k=0;
		int x=N;
		int gcd_num;
		int p = 0;
		st=new StringTokenizer(br.readLine());
		if(N==1) {
			int l=Integer.parseInt(st.nextToken())-S;
			if (l<0) l*=-1;
			System.out.println(l);
			System.exit(0);
		}
		while(N-->0) {
			int tmp=Integer.parseInt(st.nextToken());
			if (tmp>S) arr[k++]=tmp-S;
			else arr[k++]=S-tmp;
		}
		gcd_num=GCD(arr[0], arr[1]);
		for(int i=2;i<x;i++) {
			p=GCD(gcd_num, arr[i]);
		}
		System.out.println(p);
	}
	public static int GCD(int a,int b) {
		if(b==0) return a;
		else return GCD(b, a%b);
	}
}