import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> map=new HashMap<>();
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int cnt=0;
		StringBuilder sb=new StringBuilder();
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0;i<N;i++) {
			map.put(br.readLine(), 0);
		}
		for(int i=0;i<M;i++) {
			String str=br.readLine();
			if(map.containsKey(str)) {
				arr.add(str);
				cnt++;
			}
		}
		/*
		StringBuilder sb=new StringBuilder();
		for(String key: map.keySet()) {
			if(map.get(key)==1) {
				sb.append(key+"\n");
				cnt++;
			}
		}
		
		Arrays.sort(arr,new Comparator<String>() {
			//@Override
			public int compare(String s1,String s2) {
				return s1.compareTo(s2);
			}
		});
		*/
		Collections.sort(arr);
		System.out.println(cnt);
		for(String string: arr)
		System.out.println(string);
	}
}