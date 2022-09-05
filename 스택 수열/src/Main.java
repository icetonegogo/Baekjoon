import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		Stack<Integer> stack=new Stack<>();
		int N=Integer.parseInt(br.readLine());
		int tmp=1;
		while(N-->0) {
			int n=Integer.parseInt(br.readLine());
			if(tmp<=n) {
				for(int i=tmp;i<=n;i++) {
					stack.push(i);
					sb.append("+"+"\n");
				}
				tmp=n+1;
			}
			if(stack.peek()==n) {
				stack.pop();
				sb.append("-"+"\n");
			}
		}
		//if(stack.empty()) System.out.println(sb);
		//else System.out.println("NO");
		System.out.println(sb);
	} 
}