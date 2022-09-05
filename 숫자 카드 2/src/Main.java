/*
import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> card=new HashMap<>();
		HashMap<Integer, Integer> num=new HashMap<>();
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			card.put(i, Integer.parseInt(st.nextToken()));
		}
		int M=Integer.parseInt(br.readLine());
		StringTokenizer st2=new StringTokenizer(br.readLine());
		for(int i=1;i<=M;i++) {
			num.put(Integer.parseInt(st2.nextToken()),0);
		}
		for(int key:num.keySet()) {
			int cnt=0;
			for(int k=1;k<=N;k++) {
				if(key==card.get(k)) {
					cnt++;
					num.replace(key, cnt);
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int key:num.keySet()) {
			sb.append(num.get(key)+" ");
		}
		System.out.println(sb);
	}
}
*/

/*
import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> card=new HashMap<>();
		LinkedHashMap<Integer, Integer> num=new LinkedHashMap<>();
		
		int N=Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			card.put(i, Integer.parseInt(st.nextToken()));
		}
		int M=Integer.parseInt(br.readLine());
		StringTokenizer st2=new StringTokenizer(br.readLine());
		for(int i=1;i<=M;i++) {
			num.put(Integer.parseInt(st2.nextToken()),0);
		}
		for(int key:num.keySet()) {
			int cnt=0;
			for(int k=1;k<=N;k++) {
				if(key==card.get(k)) {
					cnt++;
					num.replace(key, cnt);
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int key:num.keySet()) {
			sb.append(num.get(key)+" ");
		}
		System.out.println(sb);
	}
}  
*/

import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
 
			// upperBound�� lowerBound�� ���� ���� ���Ѵ�.
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		System.out.println(sb);
	}
 
	private static int lowerBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		// lo�� hi�� ������ �� ���� �ݺ�
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // �߰���ġ�� ���Ѵ�.
 
			/*
			 *  key ���� �߰� ��ġ�� ������ �۰ų� ���� ���
			 *  
			 *  (�ߺ� ���ҿ� ���� �������� Ž���ϵ��� ��踦 ������.)
			 */
			if (key <= arr[mid]) {
				hi = mid;
			}
 
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;
	}
 
	private static int upperBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		// lo�� hi�� ������ �� ���� �ݺ�
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // �߰���ġ�� ���Ѵ�.
 
			// key���� �߰� ��ġ�� ������ ���� ���
			if (key < arr[mid]) {
				hi = mid;
			}
			// �ߺ������� ��� else���� ó���ȴ�.
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;
	}
	
	
}
