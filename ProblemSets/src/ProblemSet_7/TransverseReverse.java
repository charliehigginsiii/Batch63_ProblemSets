package ProblemSet_7;

import java.util.LinkedList;

public class TransverseReverse {
	public void reverseTransversal(LinkedList<Integer> list) {
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
	}
	public static void main(String[]args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(5);
		list.add(15);
		list.add(6);
		list.add(4);
		list.add(23);
		list.add(2);
		list.add(10);
		new TransverseReverse().reverseTransversal(list);
	}

}
