import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int prev_w=1;
			int count=0;
			int countW=0;
			int H=sc.nextInt();
			int W=sc.nextInt();
			int N=sc.nextInt();
		    while(true) {
	            if(N<=count+H) {
	             	System.out.println((N-count)*100+prev_w);
	            	break;
	            }
	            else {
	             	prev_w++;
	            	count+=H;
	            }   
	        }
	    }
	}
}