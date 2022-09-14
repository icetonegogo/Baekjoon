/*
 import java.util.*;
 

class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int i=0;
		int copy=N;
		while(true) {
			N=(N%10)*10+(((N/10)+(N%10))%10);
			i++;
			if(N==copy) {
				//System.out.println(i);
				break;
			}
		}
		System.out.println(i);
	}
}
/*
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		in.close();
        
		int cnt = 0;
		int copy = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
*/

import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int origin = N;
		int cnt = 0;
		while (true) {

			N = (N / 10 + N % 10) % 10 + (N % 10) * 10;
			cnt++;

			if (N == origin) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
