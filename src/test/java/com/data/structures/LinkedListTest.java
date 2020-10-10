package com.data.structures;

import org.junit.Test;

import com.data.structure.INode;

import org.junit.Assert;

public class LinkedListTest {
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedFromEnd() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		MyLinkedList list = new MyLinkedList();
		list.addEnd(firstNode);
		list.addEnd(secondNode);
		list.addEnd(thirdNode);
		list.print();
	}

	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedFromFront() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyLinkedList list = new MyLinkedList();
		list.addFront(firstNode);
		list.addFront(secondNode);
		list.addFront(thirdNode);
		list.print();
	}

	@Test
	public void given2NumberWhenAddedToLinkedListShouldBeAddNextKeyInMiddle() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(70);
		Node<Integer> thirdNode = new Node<Integer>(30);
		MyLinkedList list = new MyLinkedList();
		list.addFront(firstNode);
		list.addFront(secondNode);
		list.print();
		list.middle(thirdNode);
		list.print();
	}

	@Test
	public void given3NumberWhenAddedToLinkedListShouldBePopHeadKey() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyLinkedList list = new MyLinkedList();
		list.addFront(firstNode);
		list.addFront(secondNode);
		list.addFront(thirdNode);
		list.print();
		INode pop = list.pop();
		list.print();
		Assert.assertEquals(firstNode, pop);
	}
}
