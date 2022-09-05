import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
	public static int start=10000;
	public static int end=10001;
	public static int deque[]=new int[20001];
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine());
		while(N-->0) {
			st=new StringTokenizer(br.readLine());
			switch (st.nextToken()){
				case "push_front": {
					push_front(Integer.parseInt(st.nextToken()));
					break;
				}
				case "push_back": {
					push_back(Integer.parseInt(st.nextToken()));
					break;
				}
				case "pop_front": {
					sb.append(pop_front()+"\n");
					break;
				}
				case "pop_back": {
					sb.append(pop_back()+"\n");
					break;
				}
				case "size": {
					sb.append(end-start-1+"\n");
					break;
				}
				case "empty": {
					if(end-start==1) sb.append(1+"\n");
					else sb.append(0+"\n");
					break;
				}
				case "front": {
					sb.append(front()+"\n");
					break;
				}
				case "back": {
					sb.append(back()+"\n");
					break;
				}
			}
		}
		System.out.println(sb);
	}
	public static void push_front(int X) {
		deque[start]=X;
		start--;
	}
	public static void push_back(int X) {
		deque[end]=X;
		end++;
	}
	public static int pop_front() {
		if(end-start==1) return -1;
		int tmp=deque[start+1];
		deque[start+1]=0;
		start++;
		return tmp;
	}
	public static int pop_back() {
		if(end-start==1) return -1;
		int imp=deque[end-1];
		deque[end-1]=0;
		end--;
		return imp;
	}
	public static int front () {
		if(end-start==1) return -1;
		return deque[start+1];
	}
	public static int back() {
		if(end-start==1) return -1;
		return deque[end-1];
	}
}