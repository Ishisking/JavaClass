package UdemyCodingRound2025;

public class LinkedListRunner {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.nextReference = new Node(20);
		head.nextReference.nextReference = new Node(30);
		head.nextReference.nextReference.nextReference=new Node(40);
		traverseLinkedList(head);
	}

	public static void traverseLinkedList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.getData());
			current=current.nextReference;
		}
	}
}
