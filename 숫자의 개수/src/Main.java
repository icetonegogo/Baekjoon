import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int X=A*B*C;
		String s=Integer.toString(X);
		
		for(int i=0;i<10;i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)-'0'==i)
					count++;
			}
			System.out.println(count);
		}
	}
}