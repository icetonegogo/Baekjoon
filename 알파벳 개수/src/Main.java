import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		int alphabet[]=new int[26];
		for(int i=0;i<S.length();i++) {
			alphabet[S.charAt(i)-'a']++;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++) {
			sb.append(alphabet[i]+" ");
		}
		System.out.println(sb);
	}
}