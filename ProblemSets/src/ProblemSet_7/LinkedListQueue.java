package ProblemSet_7;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
	public static void main(String[]args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(5);
		queue.add(9);
		System.out.println(queue.peek());
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		
	}

}
