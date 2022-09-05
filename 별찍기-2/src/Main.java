 import java.util.*;
 
 class Main{
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int N=sc.nextInt();
		 int i,t,j;
		 int arr[]=new int[N];
		 for(i=1;i<=N;i++) {
			 for(t=0;t<N-i;t++) System.out.printf(" ");
			 for(j=0;j<i;j++) System.out.printf("*");
			 System.out.printf("\n");
		 }
			
			 
			 
		 
		 
	 }
 }