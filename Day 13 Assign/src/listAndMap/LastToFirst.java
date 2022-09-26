package listAndMap;

// Write a code that moves the last node of linkedlist to the first :

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LastToFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Integer temp, temp1;
		temp = list.get(0);
		temp1 = list.get(list.size() - 1);
		list.set(0, temp1);
		list.set(list.size()-1, temp);
		
		System.out.println(list);
	}

}
