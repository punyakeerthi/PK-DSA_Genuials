package LinkedListProblems;

public class RemoveNthNodeFromEndOfTheList {

	public static void main(String[] args) {

		RemoveNthNodeFromEndOfTheList rnList = new RemoveNthNodeFromEndOfTheList();
		LinkedList list = new LinkedList();

		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(5);

		list.printList();

		//rnList.removeNthFromEndTWOPASS(list.head, 2);
		
		rnList.removeNthFromEnd(list.head, 2);

		list.printList();
	}

	public Node removeNthFromEnd(Node head, int n) {
		Node dummy = new Node(0);
		dummy.next = head;
		Node currNode = dummy, nthNode = dummy;

		for (int i = 1; i < n + 1; i++) {
			currNode = currNode.next;
		}

		while (currNode.next != null) {
			currNode = currNode.next;
			nthNode = nthNode.next;
		}

		nthNode.next = nthNode.next.next;
		return dummy.next;
	}

	public Node removeNthFromEndTWOPASS(Node head, int n) {
		Node dummy = new Node(0);
		dummy.next = head;
		Node currNode = dummy, prevNode = dummy;

		int count = 0;
		while (currNode != null) {
			count++;
			currNode = currNode.next;

		}

		for (int i = 1; i < count - n; i++) {
			prevNode = prevNode.next;
		}

		prevNode.next = prevNode.next.next;
		return dummy.next;
	}
}
