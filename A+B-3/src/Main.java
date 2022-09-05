import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int i;
		int arr[]= new int[t];
		for(i=0;i<t;i++) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			arr[i]=A+B;
		}
		for(i=0;i<t;i++) System.out.println(arr[i]);
		// for(int k: arr) 로 쓰는방법이 있음
	}
}
