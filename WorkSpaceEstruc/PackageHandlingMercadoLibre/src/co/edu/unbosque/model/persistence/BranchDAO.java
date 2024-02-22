package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.BranchDTO;
import co.edu.unbosque.util.linkedlist.MyLinkedList;

public class BranchDAO {

	private MyLinkedList<BranchDTO> branchList;

	public BranchDAO() {
		// TODO Auto-generated constructor stub

		branchList = new MyLinkedList<>();

	}

	public void create(Object obj) {

		branchList.addLast((BranchDTO) obj);

	}

	public String read() {
		return branchList.print();
	}

	public void writeFile() {

	}

}
