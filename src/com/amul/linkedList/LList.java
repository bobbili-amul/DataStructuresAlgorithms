package com.amul.linkedList;

public class LList {
	Node head;
	int size;

	LList() {
		this.size = 0;
	}

	class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
			size++;

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

	public void deleteFirst() {
		if (head == null) {
			System.out.print("List is empty");
			return;
		}
		size--;
		head = head.next;

	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		size--;
		if (head.next == null) {
			head = null;
			return;
		}

		Node secondLast = head;
		Node last = secondLast.next;

		while (last.next != null) {
			last = last.next;
			secondLast = secondLast.next;

		}
		secondLast.next = null;

	}

	public int getsize() {
		return size;
	}

	public void display() {
		if (head == null) {
			System.out.println("List is empty");
		}

		Node currentHead = head;
		while (currentHead != null) {
			System.out.print(currentHead.data + " ");
			currentHead = currentHead.next;
		}

	}

	public static void main(String[] args) {
		LList list = new LList();
		list.addFirst("20");
		list.addFirst("30");
		list.addFirst("10");
		list.display();
		System.out.println();
		System.out.println("size is =>" + list.size);
		list.deleteFirst();

		list.display();
		System.out.println();
		System.out.println("size is =>" + list.size);
		list.deleteLast();
		list.display();
		System.out.println();
		System.out.println("size is =>" + list.size);

	}
}
