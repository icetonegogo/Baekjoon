import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int arr[]=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i)-'0';
		}
		Arrays.sort(arr);
		for(int j=str.length()-1;j>=0;j--) {
			System.out.print(arr[j]);
		}
	}
}