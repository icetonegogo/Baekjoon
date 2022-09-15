
/*
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
				if(i==0) count--;
				else if(i==s.length()-1) count--;
			}
		}
		System.out.println(count+1);
	} <-- 내가 의도한거
}m
*/
/*
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
				if(i==0) count--;
				else if(i==s.length()-1) count--;
			}
		}
		System.out.println(count+1);
	} <-- 의도한거 정답 
}
*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		sc.close();

		StringTokenizer st = new StringTokenizer(S, " ");

		System.out.println(st.countTokens());
	}
}