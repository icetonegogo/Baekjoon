import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack=new Stack<>();
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		while(N-->0) {
			String str=br.readLine();
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)!=' '&&str.charAt(i)!='\n') {
					stack.push(str.charAt(i));
				}
				else {
					while(!stack.empty()) {
						sb.append(stack.pop());
					}
					if(str.charAt(i)==' ')
						sb.append(' ');
					else sb.append('\n');
				}
			} 
			while(!stack.empty()) {
				sb.append(stack.pop());
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
