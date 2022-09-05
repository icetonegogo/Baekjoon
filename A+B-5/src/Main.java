/*
import java.util.*;


class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=1;
		int B=1;
		int i=0;
		int arr[]=new int[100];
		while(A!=0&&B!=0) {
			A=sc.nextInt();
			B=sc.nextInt();
			if(A!=0&&B!=0) {
			   arr[i]=A+B;
			   i++;
			}
		} 
		for(int t=0;t<i;t++) System.out.println(arr[t]);
	}
}
*/
import java.util.Scanner;
 
public class Main {
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
				
		while(true){
		
			int A=in.nextInt();
			int B=in.nextInt();
		
			if(A==0 && B==0){
				in.close();
				break;
			}
			System.out.println(A+B);
		}
	}
}