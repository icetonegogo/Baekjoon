import java.util.*;

import javax.swing.plaf.synth.SynthProgressBarUI;

import java.io.*;

class Main{
	public static void main(String[] args) throws IOException {
		Queue<Integer> queue=new LinkedList<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(stringTokenizer.nextToken());
		int K=Integer.parseInt(stringTokenizer.nextToken());
		for(int i=1;i<=N;i++){
			queue.add(i);
		}
		StringBuilder sb=new StringBuilder();
		sb.append("<");
		while(true) {
			for(int i=0;i<K-1;i++) {
				queue.add(queue.poll());
			}
			sb.append(queue.poll());
			if (queue.isEmpty()) {
				break;
			}
			sb.append(", ");
		}
		sb.append(">");
		System.out.println(sb);
	}
}