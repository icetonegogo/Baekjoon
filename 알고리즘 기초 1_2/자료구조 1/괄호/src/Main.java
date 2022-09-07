import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		Stack<Character> stack=new Stack<>();
		int N=Integer.parseInt(br.readLine());
		while(N-->0) {
			String str=br.readLine();
			char tmp='0';
			for(char ch:str.toCharArray()) {
				if(ch=='(') {
					stack.push('(');
				}
				else {
					if(!stack.empty())
					stack.pop();
					else {
						tmp=ch;
						break;
					}
				}
			}
			if(!stack.empty()||tmp==')') {
				sb.append("NO"+"\n");
			}
			else {
				sb.append("YES"+"\n");
			}
			stack.clear();
		}
		System.out.println(sb);
	}
}