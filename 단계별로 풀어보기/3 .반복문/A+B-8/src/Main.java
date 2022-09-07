import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int arr[]=new int[t];
		int arr1[]=new int[t];
		int arr2[]=new int[t];
		for(int i=0;i<t;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr1[i]=a;
			arr2[i]=b;
			arr[i]=a+b;
		}
	    for(int i=0;i<t;i++) {
	    	System.out.println("Case #"+(i+1)+": "+arr1[i]+" + "+arr2[i]+" = "+arr[i]);
	    }
	}
}