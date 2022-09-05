import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(function(N));
	}
	public static int function(int num)
	{
		if(num==0) {
			return 1;
		}
		else {
			return num*function(num-1);
		}
	}
}