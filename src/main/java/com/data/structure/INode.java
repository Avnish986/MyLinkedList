package com.data.structure;

public interface INode<K extends Comparable<K>> {
	K getKey();

	void setKey(K key);

	INode getNext();

	void setNext(INode next);

}
