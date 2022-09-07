 /*
  import java.util.*;
  
 
 class Main{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int cnt=0;
		String arr1[]=new String[N];
		String arr2[]=new String[M];
		sc.nextLine();
		for(int i=0;i<N;i++) {
			arr1[i]=sc.nextLine();
		}
		for(int i=0;i<M;i++) {
			arr2[i]=sc.nextLine();
		}
		for(int j=0;j<N;j++) {
			for(int k=0;k<M;k++) {
				if(arr1[j].equals(arr2[k])) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	 }
 }
*/
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		HashSet<String> map=new HashSet<>();
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int cnt=0;
		for(int i=0;i<N;i++) {
			map.add(br.readLine());
		}
		for(int i=0;i<M;i++) {
			if(map.contains(br.readLine())) cnt++;
		}
		System.out.println(cnt);
	}
}