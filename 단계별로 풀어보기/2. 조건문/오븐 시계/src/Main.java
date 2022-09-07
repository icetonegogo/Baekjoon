import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		int cook=sc.nextInt();
		
		m+=cook;
		if ((m)>=60) {
			h+=m/60;
			m=m%60;
			
			if(h>23) {
				h=h-24;
			}
		}
		
		System.out.println(h+" "+m);
	}
}
// 시간 문제의 경우 모든 수를 분으로 변환하여 해결하는 방법이 있다