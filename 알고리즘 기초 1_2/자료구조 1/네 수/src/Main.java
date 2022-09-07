import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		long N=Long.parseLong(st.nextToken()+st.nextToken());
		long M=Long.parseLong(st.nextToken()+st.nextToken());
		System.out.println(N+M);
	}
}