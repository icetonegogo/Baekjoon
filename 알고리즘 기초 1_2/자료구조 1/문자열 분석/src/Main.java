import java.io.*;
import java.util.*;



class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		StringBuilder sb=new StringBuilder();
		while((s=br.readLine())!=null) {
			int count[]=new int[4];
			for(char ch:s.toCharArray()) {
				if(ch>='a'&&ch<='z') count[0]++;
				else if(ch>='A'&&ch<='Z') count[1]++;
				else if(ch>='0'&&ch<='9') count[2]++;
				else count[3]++;
			}
			for(int i:count) {
				sb.append(i+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}	
}
//(s=br.readLine())!=null