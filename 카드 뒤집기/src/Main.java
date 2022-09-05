/*
import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder s=new StringBuilder();
		StringBuffer sb;
		int N=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine()," ");
			while(st.nextToken()!="\n") {
				sb=new StringBuffer(st.nextToken());
				sb.reverse();
				s.append(sb+" ");
			}
			s.append("\n");
		}
		System.out.println(s);		
	}
}
*/
