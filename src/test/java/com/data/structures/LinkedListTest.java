package com.data.structures;

import org.junit.Test;

import com.data.structure.INode;

import static org.junit.Assert.assertEquals;

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

	@Test
	public void given3NumberWhenAddedToLinkedListShouldBePopTailKey() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyLinkedList list = new MyLinkedList();
		list.addFront(firstNode);
		list.addFront(secondNode);
		list.addFront(thirdNode);
		list.print();
		INode popLast = list.popLast();
		list.print();
		Assert.assertEquals(thirdNode, popLast);
	}

	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeReturnIndex() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyLinkedList list = new MyLinkedList();
		list.addFront(firstNode);
		list.addFront(secondNode);
		list.addFront(thirdNode);
		list.print();
		int i = list.search(30);
		Assert.assertEquals(1, i);
	}

	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddNodeAfterGiven() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		Node<Integer> newNode = new Node<Integer>(40);
		MyLinkedList list = new MyLinkedList();
		list.addFront(firstNode);
		list.addFront(secondNode);
		list.addFront(thirdNode);
		list.print();
		INode first = secondNode.getNext();
		list.insert(newNode, 30);
		INode sec = newNode.getNext();
		boolean result = false;
		if (first == sec) {
			result = true;
		}
		assertEquals(true, result);
		list.print();
	}

	@Test
	public void given4NumberWhenAddedToLinkedListShouldBeDeleteGivenKey() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		Node<Integer> fourthNode = new Node<Integer>(70);
		MyLinkedList list = new MyLinkedList();
		list.addFront(firstNode);
		list.addFront(secondNode);
		list.addFront(thirdNode);
		list.addFront(fourthNode);
		list.print();
		INode first = thirdNode.getNext();
		list.delete(40);
		INode sec = secondNode.getNext();
		boolean result = false;
		if (first == sec) {
			result = true;
		}
		assertEquals(true, result);
		list.print();
	}

	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeSort() {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		MyOrderedList<Integer> list = new MyOrderedList<>();
		list.sortList(firstNode);
		list.sortList(secondNode);
		list.sortList(thirdNode);
		list.print();
		INode first = list.head;
		INode sec = list.head.getNext();
		INode third = list.head.getNext().getNext();
		boolean result=false;
		if(first == secondNode && sec == thirdNode && third ==firstNode) {
			result=true;
		}
		Assert.assertTrue(result);
	}
}
