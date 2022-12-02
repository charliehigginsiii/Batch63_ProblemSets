package ProblemSet_7;

import java.util.LinkedList;

public class ElementCheck {
	public int getElementPosition(LinkedList<Integer> linkedlist, int targetelement) {
		int index=-1;
		for(int i=0;i<linkedlist.size();i++) {
			if(linkedlist.get(i)==targetelement) {
				index=i;
			}
		}
		return index;
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
		int indexOfElement=new ElementCheck().getElementPosition(list, 7);
		if(indexOfElement>=0) {
			System.out.println("The Element can be found at index "+indexOfElement);
		}else {
			System.out.println("Element cannot be found");
		}
	}

}
