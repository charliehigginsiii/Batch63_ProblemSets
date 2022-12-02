package ProblemSet_7;

import java.util.LinkedList;

public class SpecificPosition {
	public static void main(String[]args) {
		LinkedList<Integer> list=new LinkedList<>();
		LinkedList<Integer> extralist=new LinkedList<>();
		extralist.add(9);
		extralist.add(5);
		extralist.add(7);
		list.add(5);
		list.add(15);
		list.add(6);
		list.add(4);
		list.add(23);
		list.add(2);
		list.add(10);
		list.add(4, 16);
		list.addAll(6, extralist);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
