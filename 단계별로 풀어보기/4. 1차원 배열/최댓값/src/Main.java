import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[9];
		int arr1[]=new int[9];
		for(int i=0;i<9;i++) {
			arr[i]=sc.nextInt();
			arr1[i]=arr[i];
		}
		Arrays.sort(arr1);
		for (int i=0;i<9;i++) {
			if(arr[i]==arr1[8]) {
				System.out.printf("%d\n%d",arr1[8],i+1);
			}
		}
	}
}
//for-each 구문 활용 가능