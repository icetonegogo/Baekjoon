/*
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1[]=new String[3];
		for(int i=0;i<3;i++) {
			s1[i]=sc.next();
		}
		int k;
		for(int j=0;j<3;j++) {
			for(k=2;k<s1[j].length();k++) {
				for(int l=0;l<(int)s1[j].charAt(0);l++) {
					char s=s1[j].charAt[k];
					System.out.print(s1[j].charAt[k]);
				}
			}
		}
		
	}
}
*/
import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for(int i = 0; i < T; i++) {
	
			int R = in.nextInt();
			String S = in.next();	// nextLine() 을 쓰면 error!
			
			for(int j = 0; j < S.length(); j++) {           
				for(int k = 0; k < R; k++) {	// R 만큼 반복 출력
					System.out.print(S.charAt(j));
				}
			}
            
			System.out.println();
		}
	}
}