/*
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		int j;
		char i;
		for(i='a';i<'z';i++) {
			for(j=0;j<S.length();j++) {
				if(S.charAt(j)==i) {
					System.out.print(j+" ");
					break;
				}
			}
			if(S.charAt(j)!=i) System.out.print("-1 ");
		}
	}
}
*/
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        for (char c = 'a' ; c <= 'z' ; c++)
            System.out.print(word.indexOf(c) + " ");
    }
}
//https://st-lab.tistory.com/62 <-- 배열으로 해결하는 방식