import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		int countnum=0;
		for(int k=0;k<T;k++) {
			int count=0;
		    int N=sc.nextInt();
		    for(int i=1;i<=N;i++) {
		    	if(N%i==0) count++;
		    }
		    if(count==2) countnum++;
	    }
		System.out.println(countnum);
	}
}