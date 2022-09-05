import java.util.Scanner;

class Main{
	static public void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int test=sc.nextInt();
	    if(100>=test&&90<=test) System.out.println("A");
	    else if(89>=test&&80<=test) System.out.println("B");
	    else if(79>=test&&70<=test) System.out.println("C");
	    else if(69>=test&&60<=test) System.out.println("D");
	    else System.out.println("F");
	}
}