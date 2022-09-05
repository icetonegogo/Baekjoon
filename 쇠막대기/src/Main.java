import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack=new Stack<>();
		int n=0; //레이저의 개수
		String s=br.readLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='('&&s.charAt(i+1)==')') {
				n++;
			}
			else if(s.charAt(i)=='(') {
				stack.push(s.charAt(i));
			}
			else stack.pop();
		}
	}
}