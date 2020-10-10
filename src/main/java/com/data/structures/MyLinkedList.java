package com.data.structures;

import com.data.structure.*;

public class MyLinkedList {
	INode head;
	INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addEnd(INode node) {
		if (head == null) {
			this.head = node;
			this.tail = node;
		} else {
			node.setNext(head);
			this.head = node;
		}

	}

	public void addFront(INode node) {
		if (head == null) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.setNext(node);
			this.tail = tail.getNext();
		}

	}

	public void print() {
		INode temp = head;
		while (temp != null) {
			System.out.print(temp.getKey() + "->");
			temp = temp.getNext();
		}
		System.out.println("");
	}

}
