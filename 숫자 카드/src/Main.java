/*
 import java.util.*;
 

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int num[]=new int[N];
		for(int i=0;i<N;i++) {
			num[i]=sc.nextInt();
		}
		int M=sc.nextInt();
		int cmp[]=new int[M];
		for(int i=0;i<M;i++) {
			cmp[i]=sc.nextInt();
		}
		int arr[]=new int[M];
		for(int j=0;j<N;j++) {
			for(int k=0;k<M;k++) {
				if(num[j]==cmp[k]) {
					arr[k]=1;
					break;
				}
			}
		}
		for(int i=0;i<M;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
*/
/*
// 위의 코드에서 StringBuilder로 변환한것
 import java.util.*;
 

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int N=sc.nextInt();
		int num[]=new int[N];
		for(int i=0;i<N;i++) {
			num[i]=sc.nextInt();
		}
		int M=sc.nextInt();
		int cmp[]=new int[M];
		for(int i=0;i<M;i++) {
			cmp[i]=sc.nextInt();
		}
		int arr[]=new int[M];
		for(int k=0;k<M;k++) {
			for(int j=0;j<N;j++){
				if(num[j]==cmp[k]) {
					sb.append(1+" ");
					break;
				}
				else if(j==N-1) {
					sb.append(0+" ");
					break;
				}
			}
		}
		
		System.out.print(sb);
		
	}
}
*/
import java.io.*;
import java.util.*;

import javax.swing.plaf.synth.SynthProgressBarUI;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> map=new HashSet<>();
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			map.add(Integer.parseInt(st.nextToken()));
		}
		int M=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<M;i++) {
			int tmp=Integer.parseInt(st.nextToken());
			if(map.contains(tmp)) {
				sb.append(1+" ");
			}
			else sb.append(0+" ");
		}
		System.out.println(sb);
	}
}
