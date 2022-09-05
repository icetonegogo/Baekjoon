
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		int tmp;
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		for(int k=0;k<N;k++) {
			for(int j=0;j<N-1;j++){
				if(arr[j]>arr[j+1]) {
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}
	}
}



/*import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
        
		
		boolean[] arr = new boolean[2001];
		
		for(int i = 0; i < N; i++) {
			arr[in.nextInt() + 1000] = true;
		}
 
		// 정렬 과정이 따로 필요 없음
		
		for(int i = 0; i < 2001; i++) {
			if(arr[i]) {
				System.out.println(i - 1000);
			}
		}
	}
}
*/