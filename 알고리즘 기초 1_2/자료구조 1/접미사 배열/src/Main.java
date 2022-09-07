import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		String arr[]=new String[S.length()];
		for(int i=0;i<S.length();i++) {
			int k=i;
			arr[i]="";
			while(k<S.length()) {
				arr[i]+=S.charAt(k);
				k++;
			}
		}
		Arrays.sort(arr);
		for(String Str:arr) {
			System.out.println(Str);
		}
	}	
}
/*
Arrays.sort(arr, new Comparator<String>() {

@Override
public int compare(String o1, String o2) {
	return o1.compareTo(o2);
}
});
*/