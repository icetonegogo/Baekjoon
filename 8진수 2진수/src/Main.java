import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String s=br.readLine();
		if(s.charAt(0)=='0') {
			System.out.println(0);
			System.exit(0);
		}
		for(int i=0;i<s.length();i++) {
			int x=s.charAt(i)-'0';
			if((x/4)>0) {
				x%=4;
				sb.append('1');
			}
			else sb.append('0');
			if((x/2)>0) {
				x%=2;
				sb.append('1');
			}
			else sb.append('0');
			if(x>0) {
				sb.append('1');
			}
			else sb.append('0');
		}
		while(sb.charAt(0)=='0') {
			sb.deleteCharAt(0);
		}
		
		System.out.println(sb);
	}
}
//0의 경우를 계산해주어야함