import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringBuilder sb=new StringBuilder();
		for(char ch:s.toCharArray()) {
			if((ch<='m'&&ch>='a')||(ch>='A')&&ch<='M') sb.append((char)(ch+13));
			else if(ch==' ') sb.append(' ');
			else if(ch>='0'&&ch<='9') sb.append(ch);
			else sb.append((char)(ch-13));
		}
		System.out.println(sb);
	}
}