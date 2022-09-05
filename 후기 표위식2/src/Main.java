import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String s=br.readLine();
		Stack<Character> sc=new Stack<>();
		Stack<Integer> si=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<'A') {
				sc.push(s.charAt(i));
			}
		}
		while(N-->0) {
			si.push(Integer.parseInt(br.readLine()));
		}
		
	}
}