package UdemyCodingRound2025;

public class LinkedListRunner2 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.nextReference = new Node(20);
		head.nextReference.nextReference = new Node(30);
		head.nextReference.nextReference.nextReference = new Node(40);
		traverseLinkedList(head);
		traverseLinkedList(reverseLinkedList(head));
	}

	private static Node reverseLinkedList(Node head) {
		Node current=head;
		Node next=null;
		Node prev=null;
		while(current!=null) {
			next=current.nextReference;
			current.nextReference=prev
		}
		
		return prev;
	}

	public static void traverseLinkedList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.getData() + "  ");
			current = current.nextReference;
		}
	}
}
