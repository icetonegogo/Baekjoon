import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		String arr[]=S.split(" ");
		char c;
		int A=0;
		int B=0;
		A=(arr[0].charAt(0)-'0')+(arr[0].charAt(1)-'0')*10+(arr[0].charAt(2)-'0')*100;
		B=(arr[1].charAt(0)-'0')+(arr[1].charAt(1)-'0')*10+(arr[1].charAt(2)-'0')*100;
        if(A>B) System.out.println(A);
        else System.out.println(B);
        //System.out.println(A > B ? A : B); <-- 위의 두줄을 합침
	}
}
/*
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
        
        in.close();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B);
	
	}
}
*/