
// Consider a unsorted linkedlist of integers. Write a code that removes the duplicates

package listAndMap;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<>();
		
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(2);
		
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
		
		System.out.println(list);
	}

}
