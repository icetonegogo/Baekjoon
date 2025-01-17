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
 
			// upperBound와 lowerBound의 차이 값을 구한다.
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		System.out.println(sb);
	}
 
	private static int lowerBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		// lo가 hi랑 같아질 때 까지 반복
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // 중간위치를 구한다.
 
			/*
			 *  key 값이 중간 위치의 값보다 작거나 같을 경우
			 *  
			 *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
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
 
		// lo가 hi랑 같아질 때 까지 반복
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // 중간위치를 구한다.
 
			// key값이 중간 위치의 값보다 작을 경우
			if (key < arr[mid]) {
				hi = mid;
			}
			// 중복원소의 경우 else에서 처리된다.
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;
	}
	
	
}
