import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[15][15];
		for(int i=0;i<15;i++) {
			arr[0][i]=i+1;
			arr[i][0]=1;
		}
		for(int j=1;j<15;j++) {
			for(int q=1;q<15;q++) {
				arr[j][q]=arr[j-1][q]+arr[j][q-1];
			}
		}
		int t=sc.nextInt();
		for(int z=0;z<t;z++) {
			int k=sc.nextInt();
			int n=sc.nextInt();
			System.out.println(arr[k][n-1]);
		}
	}
}
