import java.util.Scanner;

public class spellBee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        String spelling = sc.nextLine();
	        char[] s = str.toCharArray();
	        char[] s1 = spelling.toCharArray();
	        int count = 0;
	        int diff = 0;
	        int slen = s.length;
	        int s1len = s1.length;
	        int a,b = 0;
	        
	        if(slen > s1len) {
	        	 a = s1len;
	        }else {
	        	 a = slen;
	        }
	        
	        if(slen > s1len) {
	        	 b = slen;
	        }else {
	        	 b = s1len;
	        }
	        
	        for(int i=0; i<a; i++) {
	        	if(i<b) {
	        		if(s[i] != s1[i]) 
	        			count++;
	        	}
	        	else i++;
	        	}
	        
	        if(count == 0) {
	        	System.out.println(spelling+" is correct");
	        }
	        else if(count<=2 && count>0) {
	        	System.out.println(spelling+" is almost there");
	        }
	        else {
	        	System.out.println(spelling+" is wrong");
	        }
	}

}
