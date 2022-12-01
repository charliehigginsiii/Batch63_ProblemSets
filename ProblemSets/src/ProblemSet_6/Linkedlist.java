package ProblemSet_6;

public class Linkedlist {
	Node head=null;
	public class Node{
		Node next=null;
		int number=0;
		public Node(int number) {
			this.number=number;
		}
	}
	public void addElementatEnd(int number) {
		if(head==null) {
			head=new Node(number);
		}else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=new Node(number);
		}
	}
	public void removeDuplicates() {
		Node temp=head;
		while(temp!=null) {
			if(temp.number==temp.next.number) {
				head=temp.next;
			}
		}
	}
	public void deleteElement(int num) {
		Node current=head;
		Node prev=null;
		while(current!=null && current.number==num) {
			
			head=current.next;
		}
		while(current!=null && current.number!=num) {
			prev=current;
			current=current.next;
		}
		prev.next=current.next;
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.number);
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[]args) {
		Linkedlist obj=new Linkedlist();
		obj.addElementatEnd(5);
		obj.addElementatEnd(2);
		obj.addElementatEnd(3);
		obj.addElementatEnd(3);
		obj.addElementatEnd(5);
		obj.display();
		obj.deleteElement(2);
		obj.display();
		obj.removeDuplicates();
		obj.display();
	}
	

}
