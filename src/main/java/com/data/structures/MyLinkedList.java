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

}
