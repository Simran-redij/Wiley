package listAndMap;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Given the 'n' nuts and 'n' bolts, consider one to one mapping between them. Write a code that finds 
// all the matches between the nuts and the bolts with minimum number of iterations
// char[] nuts = {'$', '%', '#', '&', '@'}
// char[] bolts = {'@', '#', '$', '%', '&'}

public class NutsAndBolds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<Character> list1 = new LinkedList<>();
		List<Character> list2 = new LinkedList<>();
		int flag = 0;

		list1.add('$');
		list1.add('%');
		list1.add('#');
		list1.add('&');
		list1.add('@');
		
		list2.add('@');
		list2.add('#');
		list2.add('$');
		list2.add('%');
		list2.add('#');
		
		for(int i=0; i<list1.size(); i++) {
			if(list1.get(i) == list2.get(i)) {
				System.out.println("Element "+list1.get(i)+" are same at index "+i);
				flag = 1;
			}
		}
		
		if(flag == 0) {
			System.out.println("Both lists don't have same characters at same places");
		}
	}

}
