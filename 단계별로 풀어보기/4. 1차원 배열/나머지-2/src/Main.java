import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		int remain=0;
		for(int i=0;i<42;i++) {
			int count=0;
			for(int j=0;j<10;j++) {
				if(arr[j]%42==i) {
					count++;
				}
			}
			if(count!=0) {
				remain++;
			}
		}
		System.out.println(remain);
		
	}
}