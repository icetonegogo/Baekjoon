import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		HashMap<String, Integer> str=new HashMap<>();
		HashMap<Integer, String> num=new HashMap<>();
		for(int i=1;i<=N;i++) {
			String s=br.readLine();
			str.put(s, i);
			num.put(i, s);
		}
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=M;i++) {
			String s2=br.readLine();
			if(isNum(s2)) {
				sb.append(num.get(Integer.parseInt(s2))+"\n");
			}
			else sb.append(str.get(s2)+"\n");
		}
		System.out.println(sb+"\n");
	}
	public static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}