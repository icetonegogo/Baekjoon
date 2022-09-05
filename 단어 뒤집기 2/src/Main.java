import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		Stack<Character> stack=new Stack<>();
		String S=br.readLine();
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='<') {
				while(!stack.empty()) {
					sb.append(stack.pop());
				}
				
				while(S.charAt(i)!='>') {
					sb.append(S.charAt(i));
					i++;
				}
				sb.append('>');
			
			}
			else if(S.charAt(i)==' ') {
				while(!stack.empty()) {
					sb.append(stack.pop());
				}
				sb.append(' ');
			}
			else stack.push(S.charAt(i));
		}
		while(!stack.empty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}
}