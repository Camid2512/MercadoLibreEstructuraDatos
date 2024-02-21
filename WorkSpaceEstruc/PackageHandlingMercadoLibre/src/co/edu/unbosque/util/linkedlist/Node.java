package co.edu.unbosque.util.linkedlist;

import java.io.Serializable;

public class Node<E> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6055614459874892065L;
	private E info;
	private Node<E> next;

//REPRESENTAR EL NODO
	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(E info) {
		this(info, null);
	}

	public Node(E info, Node<E> next) {
		super();
		this.info = info;
		this.next = next;
	}

	public E getInfo() {
		return info;
	}

	public void setInfo(E info) {
		this.info = info;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (info != null) {
			return info.toString();
		} else {

			return null;
		}
	}

}
