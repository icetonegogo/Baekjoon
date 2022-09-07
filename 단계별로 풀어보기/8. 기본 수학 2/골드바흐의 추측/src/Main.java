/*
import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		prime_num();
		int N=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++) {
			int n=Integer.parseInt(br.readLine());
			int up=n/2;
			int down=n/2;
			while(true) {
				if(!arr[up]&&!arr[down]) {
					sb.append(down+" "+up+"\n");
					break;
				}
				up++;
				down--;
			}
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
*/
import java.util.*;
import java.io.*;

class Main{
	public static boolean etc[]=new boolean[1000001];
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int n;
		etc_num();
		while((n =Integer.parseInt(br.readLine()))!=0) {
			for(int i=2;i<=n;i++) {
				if(!etc[i]&&!etc[n-i]) {
					sb.append(n+" = "+i+" + "+(n-i)+"\n");
					break;
				}
				if(i>n/2) {
					sb.append( "Goldbach's conjecture is wrong."+"\n");
					break;
				}
				
			}
		}
		System.out.println(sb);
	}
	public static void etc_num() {
		etc[0]=etc[1]=true;
		for(int i=2;i*i<1000001;i++) {
			if(etc[i]) continue;
			for(int j=i*i;j<1000001;j+=i) {
				etc[j]=true;
			}
		}
	}
}