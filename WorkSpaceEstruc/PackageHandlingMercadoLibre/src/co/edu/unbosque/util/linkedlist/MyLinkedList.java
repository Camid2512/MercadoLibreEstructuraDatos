package co.edu.unbosque.util.linkedlist;

public class MyLinkedList<E> {

	protected Node<E> first;

	public MyLinkedList() {
		this.first = null;
	}

	public Node<E> getFirst() {
		return first;
	}

	public void setFirst(Node<E> first) {
		this.first = first;
	}

	public boolean isEmpty() {

		return (this.first == null);
	}

	public void add(E info) {

		Node<E> newNode = new Node<>(info);
		newNode.setNext(this.first);
		this.first = newNode;
	}

	public void insert(E info, Node<E> previous) {

		if (previous != null) {

			Node<E> newNode = new Node<>(info);
			newNode.setNext(previous.getNext());
			previous.setNext(newNode);

		}
	}

	public void addLast(E info) {

		Node<E> lastNode = getLastNode();

		if (lastNode != null) {
			insert(info, lastNode);
		} else {
			this.first = new Node<>(info);
		}

	}

	public E extract() {

		E data = null;

		if (this.first != null) {

			data = this.first.getInfo();
			this.first = first.getNext();

		}
		return data;
	}

	public E extract(Node<E> previous) {

		E data = null;

		if (previous != null && previous.getNext() != null) {

			data = previous.getNext().getInfo();
			previous.setNext(previous.getNext().getNext());

		}
		return data;

	}

	public int size() {

		int size = 0;

		Node<E> current = this.first;

		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;

	}

	public String print() {
		return this.toString();
	}

	public Node<E> get(E info) {

		Node<E> targetNode = null;
		Node<E> currentNode = this.first;

		while (currentNode != null && !currentNode.getInfo().equals(info)) {

			currentNode = currentNode.getNext();

		}
		if (currentNode != null) {
			targetNode = currentNode;
		}
		return targetNode;

	}

	public Node<E> get(int index) {

		Node<E> targetNode = null;
		Node<E> currentNode = this.first;

		int counter = 0;

		while (currentNode != null && counter < index) {

			currentNode = currentNode.getNext();
			counter++;

		}

		if (currentNode != null) {

			targetNode = currentNode;

		}
		return targetNode;

	}

	public Node<E> getLastNode() {

		Node<E> currentNode = this.first;

		while (currentNode != null && currentNode.getNext() != null) {

			currentNode = currentNode.getNext();

		}

		return currentNode;

	}

	public int indexOf(E info) {

		Node<E> currentNode = this.first;

		int infoPosition = -1;

		if (!isEmpty()) {

			infoPosition = 0;
			while (currentNode != null && !currentNode.getInfo().equals(info)) {

				infoPosition++;
				currentNode = currentNode.getNext();

			}

		}
		return infoPosition;
	}

	public int numberOfOcurrences(E info) {

		int cont = 0;
		Node<E> currentNode = this.first;

		while (currentNode != null) {

			if (currentNode.getInfo().equals(info)) {
				cont++;
			}
			currentNode = currentNode.getNext();

		}

		return cont;

	}

	public E extractLast() {

		E info = null;
		Node<E> currentNode = this.first;

		int listSize = size();

		if (!isEmpty()) {
			if (listSize == 1) {
				info = currentNode.getInfo();
				this.first = null;
			} else {
				Node<E> previousLastNode = get(listSize - 2);
				info = extract(previousLastNode);
			}
		}
		return info;

	}

	public String print(int pos) {

		StringBuilder sb = new StringBuilder();
		int cont = 0;
		Node<E> currentNode = this.first;

		if (!isEmpty()) {
			while (currentNode != null && cont < pos) {
				currentNode = currentNode.getNext();
				cont++;
			}
			while (currentNode != null) {
				sb.append(currentNode.getInfo().toString());
				if (currentNode.getNext() != null) {
					sb.append(" -> ");
				}
				currentNode = currentNode.getNext();
			}
		}

		return sb.toString();

	}

	public String toString() {

		String textList = "";
		Node<E> currentNode = this.first;

		while (currentNode != null) {

			textList += currentNode.getInfo().toString();
			if (currentNode.getNext() != null) {
				textList += " -> ";
			}
			currentNode = currentNode.getNext();

		}

		return textList;

	}

}
