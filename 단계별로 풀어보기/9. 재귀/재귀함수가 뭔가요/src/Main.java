
/*import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		function(n);
		function2(n);
	}
	static int count=0;
	public static void function(int num) {
		for(int i=0;i<count;i++) {
			System.out.printf("____");
		}
		System.out.printf("\"����Լ��� ������?\"\n");
		if(num==0) {
			for(int i=0;i<count;i++) {
				System.out.printf("____");
			}
			System.out.printf("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
			
		}
		else {
			for(int i=0;i<count;i++) {
				System.out.printf("____");
			}
			System.out.printf("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n");
			for(int i=0;i<count;i++) {
				System.out.printf("____");
			}
			System.out.printf("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n");
			for(int i=0;i<count;i++) {
				System.out.printf("____");
			}
			System.out.printf("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");
			count++;
			function(num-1);
		}
	}
	public static void function2(int num) {
		if(num==0) {
			System.out.printf("��� �亯�Ͽ���.");
		}
		else {
			for(int i=count;i>0;i--) {
				System.out.printf("____");
			}
			System.out.printf("��� �亯�Ͽ���.\n");
			count--;
			function2(num-1);
		}
	}
}
*/
import java.util.Scanner;

public class Main {
	// ���� �̸� ���������� �������־ recurTap�� �ʱ�ȭ ������ ���� �ʾ� "��� �亯�Ͽ���" �κп��� ���� ������ �� �Ǿ���.
	// ���������� �������� �ʰ� ���������� �����Ͽ� ��½� line 9���� ������ �޾� ����� ��µ��� �ʴ´�. 
	static String recurTap = "";
	public static void recursive(int n) {
		// ó������ ������ ����.
		String tap = recurTap;
		
		// 0�� �Ǹ� ����ϰ� ��� ����
		if(n == 0) {
			System.out.println(tap + "\"����Լ��� ������?\"");
			System.out.println(tap +"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(tap + "��� �亯�Ͽ���.");
			return;
		}
		// 0�� �Ǳ� �������� ��� �ݺ�
		System.out.println(tap + "\"����Լ��� ������?\"");
		System.out.println(tap + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(tap + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(tap + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		
		// ��͸� ���� ���� ��ĭ ����� �÷��ش�.
		recurTap += "____";
		recursive(n - 1);
		// ��Ϳ��� ���������鼭 ���� ū ����(������ ����) ���� ���� ��µȴ�.
		System.out.println(tap + "��� �亯�Ͽ���.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recursive(n);
	}
}

