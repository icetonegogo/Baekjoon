import java.io.*;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st;
		int arr[][]=new int[N][2];
		int arr_num[]=new int[N];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i==j) continue;
				if(arr[i][0]>arr[j][0]&&arr[i][1]>arr[j][1]) {
					arr_num[j]++;
				}
			}
		}
		for(int k:arr_num)
		System.out.print(k+1+" ");
	}
}