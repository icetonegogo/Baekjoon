import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String s=br.readLine();
		int sum=0;
		int tmp_sum=0;
		int num=1;
		int ten=1;
		for(int i=s.length()-1;i>=0;i--) {
			if(num==4) {
				sum+=tmp_sum*ten;
				num=1;
				ten*=10;
			}
			int x=s.charAt(i)-'0';
			tmp_sum+=x*num;
			num*=2;
		}
		System.out.println(sum);
	}
}