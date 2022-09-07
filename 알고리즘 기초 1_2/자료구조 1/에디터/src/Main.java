/*
import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		Stack<Character> stack=new Stack<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine()+'|';
		ArrayList<Character> arr=new ArrayList<>();
		int N=Integer.parseInt(br.readLine());
		int tmp=s.length()-1;
		int cur=tmp;
		for(char ch:s.toCharArray()) {
			arr.add(ch);
		}
		while(N-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String string=st.nextToken();
			switch (string){
				case "L": {
					tmp=s.length()-1;
					if(arr.get(0)=='|') {
						break;
					}
					while(arr.get(tmp)!='|') {
						 stack.push(arr.get(tmp));
						 tmp--;
					 }
					 stack.push(arr.get(tmp-1));
					 arr.set(tmp-1,'|');
					 while(tmp<s.length()) {
						 arr.set(tmp,stack.pop());
						 tmp++;
					 }
					 break;
				}
				case "D": {
					tmp=s.length()-1;
					if(arr.get(tmp)=='|') {
						break;
					}
					while(arr.get(tmp)!='|') {
						 stack.push(arr.get(tmp));
						 tmp--;
					 }
					 arr.set(tmp++,stack.pop());
					 arr.set(tmp++, '|');
					 while(tmp<s.length()) {
						 arr.set(tmp,stack.pop());
						 tmp++;
					 }
					 break;
				}
				case "B": {
					tmp=s.length()-1;
					if(arr.get(0)=='|') {
						break;
					}
					while(arr.get(tmp)!='|') {
						 stack.push(arr.get(tmp));
						 tmp--;
					 }
					arr.remove(tmp-1);
					s=s.substring(0,s.length()-1);
					break;
				}
				case "P": {
					String t=st.nextToken();
					tmp=s.length()-1;
					
					while(arr.get(tmp)!='|') {
						 stack.push(arr.get(tmp));
						 tmp--;
					 }
					arr.set(tmp++, t.charAt(0));
					arr.add(tmp++, '|');
					 while(tmp<s.length()) {
						 arr.set(tmp,stack.pop());
						 tmp++;
					 }
					 s=s+"@";
					 break;
				}
			}
		}
		StringBuilder sBuilder=new StringBuilder();
		for(char ch:arr) {
			if(ch!='|') {
				sBuilder.append(ch);
			}
		}
		System.out.println(sBuilder);
	}
}
*/	
