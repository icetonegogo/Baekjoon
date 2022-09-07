import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int cnt=0;
		int n=1;
		do{
			int cp=n;
			while(cp!=0) {
				if(cp%10==6&&(cp/10)%10==6&&(cp/100)%10==6){
					cnt++;
					break;
				}
				cp/=10;
			}
			n++;
		} while(N!=cnt);
		System.out.println(n-1);
	}
}