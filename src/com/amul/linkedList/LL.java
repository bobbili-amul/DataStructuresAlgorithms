
package com.amul.linkedList;

class LL {
	Node head = null;

	class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
		}

	}

	public void addFirst(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;

		}

		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;

	}

	public void display() {
		Node tempNode = head;

		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;

		}

	}

	public static void main(String[] args) {
		LL l1 = new LL();
		l1.addFirst("aa");
		l1.addFirst("bb");
		l1.addLast("mm");
		l1.display();
		System.out.println();
		System.out.println("end");
		System.out.println(l1.head);
	}
}
