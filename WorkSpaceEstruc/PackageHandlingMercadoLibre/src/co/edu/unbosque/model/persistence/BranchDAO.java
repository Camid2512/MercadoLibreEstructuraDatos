package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.BranchDTO;
import co.edu.unbosque.util.linkedlist.MyLinkedList;

public class BranchDAO {

	private MyLinkedList<BranchDTO> branchList;

	private CountryDAO countryToAdd;
	private PackageDAO packageList;

	public BranchDAO() {
		// TODO Auto-generated constructor stub

		branchList = new MyLinkedList<>();

	}

	public void create(Object obj) {

		BranchDTO newBranch = new BranchDTO();

		branchList.addLast(newBranch);

	}

	public void writeFile() {

	}

}
