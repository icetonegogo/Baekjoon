import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int h=sc.nextInt();   //시
		int m=sc.nextInt();   //분
		if(m<45) {
			if(h==1) System.out.println("0 "+(15+m));
			else if(h==0) System.out.println("23 "+(15+m));
			else System.out.printf("%d %d",h-1,m+15);
		}
		//else if(m==45) System.out.println(h);
		else System.out.printf("%d %d",h,m-45);
	}
}