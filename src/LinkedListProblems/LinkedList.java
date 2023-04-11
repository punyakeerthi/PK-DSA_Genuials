package LinkedListProblems;

public class LinkedList {

	Node head;

	public void printList() {

		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}

		System.out.println("null");

	}

	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		head = head.next;

	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node secondlast = head;
		while (secondlast.next.next != null) {
			secondlast = secondlast.next;
		}

		secondlast.next = null;

	}

	public void insertLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = newNode;

	}

	public int legthoftheList() {
		int count = 0;
		if (head == null) {
			return 0;
		}

		Node last = head;
		while (last != null) {
			count++;
			last = last.next;
		}

		return count;

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insertLast(1);
		/*
		 * list.insertLast(2); list.insertLast(3); list.insertLast(4);
		 * list.insertLast(5);
		 */
		list.printList();
 
		System.out.println("after");
		list.printList();

	}

}
