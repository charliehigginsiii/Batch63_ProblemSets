package ProblemSet_8;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[]args) {
		LinkedList<Integer> linkedlist=new LinkedList<>();
		linkedlist.add(5);
		linkedlist.add(6);
		linkedlist.add(15);
		linkedlist.add(3);
		for(int i=0;i<linkedlist.size();i++) {
			System.out.print(linkedlist.get(i)+" ");
		}
	}

}
