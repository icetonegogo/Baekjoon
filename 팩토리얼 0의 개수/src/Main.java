/*
import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int two=0;
		int five=0;
		for(int i=1;i<=N;i++) {
			if(i%2==0) two++;
			if(i%5==0) five++;
		}
		System.out.println(Math.min(two, five));
	}
}
2�� 5�� ������ ������� �ϴ� ��츦 �������� ����
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
                 
        int cnt_of_2 = 0;
        int cnt_of_5 = 0;
         
        // factorial ������� �߿��� 2�� 5�� ���� ������ �ľ��Ѵ�.
        for(int i=1; i<=N; i++) {
            int target = i;
             
            // ���μ� �����ϸ� 2�� ������ �ľ��Ѵ�.
            while((target % 2 == 0)) {
                cnt_of_2++;
                target = target / 2;
            }
             
            // ���μ� �����Ͽ� 5�� ������ �ľ��Ѵ�.
            while((target % 5 == 0)) {
                cnt_of_5++;
                target = target / 5;
            }
        }
         
        System.out.println(Math.min(cnt_of_2, cnt_of_5));
    }
}