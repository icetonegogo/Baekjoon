import java.lang.reflect.Array;
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		int cnt[]=new int[8001];
		double sum=0;
		int max=0;
		int max1[]=new int[8001];
		int count2=0;
		int maxj=0;
		int high;
		int min=40000;
		int k=1;
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			cnt[arr[i]+4000]++;
		}	
		System.out.println((int)Math.round((double)sum / N));
		
		
		boolean flag=false;
		
		for(int j=0;j<8001;j++) {
			if(cnt[j]>max) {
				max=cnt[j];
				maxj=j-4000;
				flag=true;
			}
			else if(cnt[j]==max&&flag==true) {
				maxj=j-4000;
				flag=false;
			}
		}
		
		
		
		Arrays.sort(arr);
		System.out.println(arr[N/2]);
		System.out.println(maxj);
		System.out.println(arr[N-1]-arr[0]);
	}
}
/*
import java.lang.reflect.Array;
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		int cnt[]=new int[8000];
		int count=0;
		int max=0;
		int max1[]=new int[60];
		int count2=0;
		int maxj=0;
		int high;
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			count+=arr[i];
			cnt[arr[i]]++;
		}	
		if(((count/N)%1)>0.5) count=count/N+1;
		else count=count/N;
		System.out.println(count);
		for(int j=0;j<8000;j++) {
			if(cnt[j]>max) {
				max=cnt[j];
				maxj=j;
			}
			else if(cnt[j]==max&&max1[count2]<j) {
				max1[count2+1]=j;
				count2++;
			}
		}
		Arrays.sort(max1);
		if(maxj!=max1[count2]) high=maxj;
		else high=max1[count2];
		Arrays.sort(arr);
		System.out.println(arr[N/2+1]);
		System.out.println(high);
		System.out.println(arr[N-1]-arr[0]);
	}
}
*/