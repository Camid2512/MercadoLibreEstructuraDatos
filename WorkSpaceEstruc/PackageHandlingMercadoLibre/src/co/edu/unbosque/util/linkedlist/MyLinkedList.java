package co.edu.unbosque.util.linkedlist;

import java.io.Serializable;

public class MyLinkedList<E> implements Serializable {
	private static final long serialVersionUID = 8952084267757202536L;
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
		Node<E> newNode = new Node<E>(info);
		newNode.setNext(this.first);
		this.first = newNode;
	}

	public void insert(E info, Node<E> previous) {
		if (previous != null) {
			Node<E> newNode = new Node<E>(info);
			newNode.equals(previous.getNext());
			previous.setNext(newNode);
		}
	}

	public void addLast(E info) {
		Node<E> lastNode = getLastNode();
		if (lastNode != null) {
			insert(info, lastNode);
		} else {
			this.first = new Node<E>(info);
		}
	}

	public E extract() {
		E data = null;
		if (this.first != null) {
			data = this.first.getInfo();
			this.first = this.first.getNext();
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
		return sizeRecursive(this.first);
	}

	private int sizeRecursive(Node<E> current) {
		if (current == null) {
			return 0;
		} else {
			return 1 + sizeRecursive(current.getNext());
		}
	}

	public String print() {
		return this.toString();
	}

	public Node<E> get(E info) {
		return getRecursive(this.first, info);
	}

	private Node<E> getRecursive(Node<E> current, E info) {
		if (current == null || current.getInfo().equals(info)) {
			return current;
		} else {
			return getRecursive(current.getNext(), info);
		}
	}

	public Node<E> get(int pos) {
		return getRecursive(this.first, pos, 0);
	}

	private Node<E> getRecursive(Node<E> current, int pos, int counter) {
		if (current == null || counter >= pos) {
			return current;
		} else {
			return getRecursive(current.getNext(), pos, counter + 1);
		}
	}

	public Node<E> getLastNode() {
		return getLastNodeRecursive(this.first);
	}

	private Node<E> getLastNodeRecursive(Node<E> current) {
		if (current == null || current.getNext() == null) {
			return current;
		} else {
			return getLastNodeRecursive(current.getNext());
		}
	}

	public int indexOf(E info) {
		return indexOfRecursive(this.first, info, 0);
	}

	private int indexOfRecursive(Node<E> current, E info, int index) {
		if (current == null) {
			return -1;
		} else if (current.getInfo().equals(info)) {
			return index;
		} else {
			return indexOfRecursive(current.getNext(), info, index + 1);
		}
	}

	public int numberOfOccurrences(E info) {
		return numberOfOccurrencesRecursive(this.first, info, 0);
	}

	private int numberOfOccurrencesRecursive(Node<E> current, E info, int count) {
		if (current == null) {
			return count;
		} else {
			if (current.getInfo().equals(info)) {
				count++;
			}
			return numberOfOccurrencesRecursive(current.getNext(), info, count);
		}
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
		printRecursive(this.first, pos, 0, sb);
		return sb.toString();
	}

	private void printRecursive(Node<E> current, int pos, int count, StringBuilder sb) {
		if (current == null || count >= pos) {
			return;
		} else if (count < pos) {
			printRecursive(current.getNext(), pos, count + 1, sb);
		}

		if (count >= pos) {
			sb.append(current.getInfo().toString());
			if (current.getNext() != null) {
				sb.append("->");
			}
			printRecursive(current.getNext(), pos, count + 1, sb);
		}
	}

	public String toString() {
		return toStringRecursive(this.first);
	}

	private String toStringRecursive(Node<E> current) {
		if (current == null) {
			return "";
		} else {
			StringBuilder sb = new StringBuilder();
			sb.append(current.getInfo().toString());
			if (current.getNext() != null) {
				sb.append("->\n");
			}
			return sb.toString() + toStringRecursive(current.getNext());
		}
	}
}
