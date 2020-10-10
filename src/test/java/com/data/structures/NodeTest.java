package com.data.structures;
import org.junit.*;
import org.junit.Assert;
public class NodeTest {
	@Test
	public void given3NumbersWhenLinkedShouldPass() {
		Node<Integer>myFirst = new Node<>(56);
		Node<Integer>mySecond = new Node<>(30);
		Node<Integer>myThird = new Node<>(70);
		myFirst.setNext(mySecond);
		mySecond.setNext(myThird);
		//MyFirst.getNext() == mySecond /*address*/
		//5d22bbb7 == 5d22bbb7
		boolean result = myFirst.getNext().equals(mySecond) &&
				mySecond.getNext().equals(myThird);
		Assert.assertTrue(result);
	}
	
	
}
