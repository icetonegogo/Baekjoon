/*import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=N;i++) {
			int count=0;
			int num=N;
			for(int j=1;j<=i;j++) {
				if(i%j==0) count++;
			}
			if(count==2) {
				while(num%i==0) {
					num/=i;
					System.out.println(i);
				}
			}
		}
	}
}
*/

/*
 import java.util.Scanner;
 
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
 
		for (int i = 2; i <= Math.sqrt(N); i++) {	// ���� i * i <= N
			while (N % i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		if (N != 1) {
			System.out.println(N);
		}
	}
}
*/

import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine()); 
		for(int i=2;i<=Math.sqrt(N);i++) {
			while(N%i==0) {
				System.out.println(i);
				N/=i;
			}	
		}
		if(N!=1) System.out.println(N);
	}
}