import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(function(n));
	}
	
	public static int function(int num) {
		if(num==0) return 0;
		else if(num==1)return 1;
		else return function(num-1)+function(num-2);
	}
}