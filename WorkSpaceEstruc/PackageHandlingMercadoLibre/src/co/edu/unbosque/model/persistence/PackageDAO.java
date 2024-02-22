package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.PackageDTO;
import co.edu.unbosque.util.linkedlist.MyLinkedList;

public class PackageDAO implements CRUDOperation {

	private MyLinkedList<PackageDTO> packageList;

	public PackageDAO() {
		// TODO Auto-generated constructor stub

		packageList = new MyLinkedList<>();

	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub

		packageList.addLast((PackageDTO) obj);

	}

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return packageList.print();
	}

	@Override
	public boolean updateByIndex(int index, String... args) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= packageList.size()) {

			return false;
		} else {
			if (!args[0].isBlank() || !args[0].isEmpty() || !args[0].equals("")) {
				packageList.get(index).getInfo().setSerialNumber(Long.parseLong(args[0]));
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || !args[1].equals("")) {
				packageList.get(index).getInfo().setPackageContent(args[1]);
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || !args[2].equals("")) {
				packageList.get(index).getInfo().setTransmitterName(args[2]);
			}
			if (!args[3].isBlank() || !args[3].isEmpty() || !args[3].equals("")) {
				packageList.get(index).getInfo().setReceiverName(args[3]);
			}
			if (!args[4].isBlank() || !args[4].isEmpty() || !args[4].equals("")) {
				packageList.get(index).getInfo().setWeight(Float.parseFloat(args[4]));
			}
			return true;
		}
	}

	@Override
	public boolean deleteByIndex(int index) {
		if (index < 0 || index >= packageList.size()) {
			return false;
		} else if (index == 0) {
			packageList.extract();
			return true;
		} else {
			packageList.extract(packageList.get(index - 1));
			return true;
		}
	}

	public MyLinkedList<PackageDTO> getPackageList() {
		return packageList;
	}

	public void setPackageList(MyLinkedList<PackageDTO> packageList) {
		this.packageList = packageList;
	}

}
