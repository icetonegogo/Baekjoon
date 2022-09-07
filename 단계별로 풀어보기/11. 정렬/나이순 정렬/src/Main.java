import java.io.*;
import java.security.PKCS12Attribute;
import java.text.ParseException;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String s[][]=new String[N][2];
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			s[i][0]=st.nextToken();
			s[i][1]=st.nextToken();
		}
		Arrays.sort(s,new Comparator<String[]>() {
			@Override
			public int compare(String s1[],String s2[]) {
				return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
			}
		});
		for(int i=0;i<N;i++) {
			System.out.println(s[i][0]+" "+s[i][1]);
		}
	}
}