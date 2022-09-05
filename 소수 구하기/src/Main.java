import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		prime_num();
		for(int i=N;i<=M;i++) {
			if(!arr[i]) System.out.println(i);
		}
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