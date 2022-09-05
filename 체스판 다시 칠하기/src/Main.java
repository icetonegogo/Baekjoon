import java.util.*;
import java.io.*;

class Main{
	public static boolean arr[][];
	public static int min=64;
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		arr=new boolean[N][M];
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			for(int j=0;j<M;j++) {
				if(str.charAt(j)=='W') {
					arr[i][j]=true;
				}
				else arr[i][j]=false;
			}
		}
		int start_x=N-7;
		int start_y=M-7;
		for(int i=0;i<start_x;i++) {
			for(int j=0;j<start_y;j++) {
				num(i,j);
			}
		}
		System.out.println(min);
	}

	public static void num(int x,int y) {
		int end_x=x+8;
		int end_y=y+8;
		int cnt=0;
		boolean start=arr[x][y];
		for(int i=x;i<end_x;i++) {
			for(int j=y;j<end_y;j++) {
				if(arr[i][j]==start) cnt++;
				start=(!start);
			}
			start=(!start);
		}
		cnt=Math.min(cnt,64-cnt);
		min=Math.min(min, cnt);
	}
}