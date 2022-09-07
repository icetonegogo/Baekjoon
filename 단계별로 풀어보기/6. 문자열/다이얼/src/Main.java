import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		String arr[]={"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		int cnt=0;
		for(int k=0;k<S.length();k++) {   
		    for(int i=0;i<8;i++) {
			    for(int j=0;j<arr[i].length();j++) {
			    	if (arr[i].charAt(j)==S.charAt(k)) {
			    		cnt=cnt+i+3;
			    	}
			    }
		    }
		}
		System.out.println(cnt);
	}
}
/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
 
		int count = 0;
		int k = s.length();
        
		for(int i = 0; i < k; i++) {
        
			switch(s.charAt(i)) {
            
			case 'A' : case 'B': case 'C' : 
				count += 3;
				break;
                
			case 'D' : case 'E': case 'F' :
				count += 4; 
				break;
                
			case 'G' : case 'H': case 'I' :
				count += 5; 
				break;
                
			case 'J' : case 'K': case 'L' : 
				count += 6;
				break;
                
			case 'M' : case 'N': case 'O' :
				count += 7;
				break;
                
			case 'P' : case 'Q': case 'R' : case 'S' : 
				count += 8; 
				break;
                
			case 'T' : case 'U': case 'V' : 
				count += 9;
				break;
                
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				count += 10;
				break;
			}
		}		
		System.out.print(count);
	}
}
*/