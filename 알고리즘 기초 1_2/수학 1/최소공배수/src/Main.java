
import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		while(N-->0) {
			st=new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			int d=num(A, B);
			sb.append(A*B/d).append("\n");
		}
		System.out.println(sb);
	}
	public static int num(int A,int B) {
		while(B!=0) {
			int ram=A%B;
			A=B;
			B=ram;
		}
		return A;
	}
}

