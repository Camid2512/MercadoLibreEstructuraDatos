package co.edu.unbosque.model;

import java.io.Serializable;

import co.edu.unbosque.util.linkedlist.MyLinkedList;

public class BranchDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2680132445883215085L;
	private CountryDTO country;
	private MyLinkedList<PackageDTO> packageList;

	public BranchDTO() {
		// TODO Auto-generated constructor stub
	}

	public BranchDTO(CountryDTO country, MyLinkedList<PackageDTO> packageList) {
		super();
		this.country = country;
		this.packageList = packageList;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public MyLinkedList<PackageDTO> getPackageList() {
		return packageList;
	}

	public void setPackageList(MyLinkedList<PackageDTO> packageList) {
		this.packageList = packageList;
	}

	@Override
	public String toString() {
		return "BranchDTO [country=" + country + ", packageList=" + packageList + "]";
	}

}
