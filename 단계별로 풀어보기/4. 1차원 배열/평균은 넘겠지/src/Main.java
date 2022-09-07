import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		double arr2[]=new double[c];
		for(int i=0;i<c;i++) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			int sum=0;
			double count=0;
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
				sum+=arr[j];
			}
			sum/=n;
			for(int k=0;k<n;k++) {
				if(arr[k]>sum) count++;
			}
			System.out.printf("%.3f%%\n",(count/n)*100);
			//arr2[i]=(count/n)*100;
		}
		//for(int i=0;i<c;i++) System.out.printf("%.3f%%\n",arr2[i]);
	}
}