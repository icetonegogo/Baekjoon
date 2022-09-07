import java.io.*;
import java.util.StringTokenizer;

class Main{
	public static int queue[];
	public static int end=0;
	public static int start=0;
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine());
		queue=new int[N];
		while(N-->0) {
			st=new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push": {
				push(Integer.parseInt(st.nextToken()));
				break;
			}
			case "pop" :{
				sb.append(pop()+"\n");
				break;
			}
			case "size" :{
				sb.append((end-start)+"\n");
				break;
			}
			case "empty" :{
				sb.append(empty()+"\n");
				break;
			}
			case "front":{
				sb.append(front()+"\n");
				break;
			}
			case "back" :{
				sb.append(back()+"\n");
				break;
			}
		}	
		}
		System.out.println(sb);
	}
	public static void push(int X) {
		queue[end]=X;
		end++;
	}
	public static int pop() {
		if (end-start==0) return -1;
		int tmp=queue[start];
		start++;
		return tmp;
	}
	public static int empty(){
		if (end-start==0) return 1;
		else return 0;
	}
	public static int front() {
		if(end-start==0) return -1;
		return queue[start];
	}
	public static int back() {
		if(end-start==0) return -1;
		return queue[end-1];
	}
}