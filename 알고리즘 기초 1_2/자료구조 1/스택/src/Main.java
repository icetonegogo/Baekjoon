import java.io.*;
import java.util.*;

class Main{
	public static int stack[];
	public static int size=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		stack=new int[N];
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push": {
				push(Integer.parseInt(st.nextToken()));
				break;
			}
			case "pop":{
				sb.append(pop()+"\n");
				break;
			}
			case "size": {
				sb.append(size+"\n");
				break;
			}
			case "empty": {
				sb.append(empty()+"\n");
				break;
			}
			case "top": {
				sb.append(top()+"\n");
				break;
			}
			}
		
		}
		System.out.println(sb);
	}
	public static void push(int X) {
		stack[size]=X;
		size++;
	}
	public static int pop() {
		if(size==0) return -1;
		else {
			int tmp=stack[size-1];
			size-=1;
			return tmp;
		}
	}
	public static int empty() {
		if(size==0) return 1;
		else return 0;
	}
	public static int top() {
		if(size==0) return -1;
		else return stack[size-1];
	}
}	