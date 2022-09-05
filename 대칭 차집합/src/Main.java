import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> num=new HashSet<>();
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int cnt=N+M;
		st= new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			num.add(Integer.parseInt(st.nextToken()));
		}
		st= new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			if(num.contains(Integer.parseInt(st.nextToken()))) {
				cnt-=2;
			}
		}
		System.out.println(cnt);
	}
}