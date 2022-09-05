import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int num=N%5;
		if(N%5==0) System.out.println(N/5);
		else {
			for(int i=(N/5);i>=0;i--) {
			
				if(num%3==0) {
					System.out.println(i+num/3);
					System.exit(0);
				}
				num+=5;
			}
			System.out.println("-1");
		}
	}
}