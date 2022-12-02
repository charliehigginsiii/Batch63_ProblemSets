package ProblemSet_7;

import java.util.ArrayList;
import java.util.LinkedList;

public class DuplicateRemover {
	public void removeDuplicates(ArrayList<Integer>list) {
		String accumulator="";
		for(int i=0;i<list.size();i++) {
			if(accumulator.contains(" "+list.get(i)+" ")) {
				list.remove(i);
				i--;
			}else {
				accumulator+=list.get(i)+" ";
			}
			
		}
	}
public static void main(String[]args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(5);
	list.add(15);
	list.add(6);
	list.add(23);
	list.add(4);
	list.add(23);
	list.add(15);
	list.add(2);
	list.add(10);
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ");
	}
	System.out.println();
	new DuplicateRemover().removeDuplicates(list);
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ");
	}
	
}

}
