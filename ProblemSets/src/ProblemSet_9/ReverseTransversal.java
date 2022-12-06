package ProblemSet_9;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseTransversal {
	public void transverseLinkedListReverse(LinkedList list) {
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
	}
	public static void main(String[]args) {
		ReverseTransversal Iterator =new ReverseTransversal();
		Iterator.transverseLinkedListReverse(new LinkedList(Arrays.asList(5,6,3,2)));
	}

}
