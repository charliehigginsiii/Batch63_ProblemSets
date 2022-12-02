package ProblemSet_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Linkedlist {
	public static void main(String[]args) {
		LinkedList<Integer> linkedlist=new LinkedList<>();
		linkedlist.add(5);
		linkedlist.add(15);
		linkedlist.add(6);
		linkedlist.add(4);
		linkedlist.add(23);
		linkedlist.add(2);
		linkedlist.add(10);
		linkedlist.addFirst(18);
		linkedlist.addLast(25);
		for(int i=0;i<linkedlist.size();i++) {
			System.out.print(linkedlist.get(i)+" ");
		}
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(50);
		arraylist.add(90);
		arraylist.add(51);
		arraylist.add(98);
		Collection<Integer> merged = Stream.of(linkedlist,arraylist)
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
		linkedlist=new LinkedList<>(merged);
		for(int i=0;i<linkedlist.size();i++) {
			System.out.print(linkedlist.get(i)+" ");
		}
		
	}
}
