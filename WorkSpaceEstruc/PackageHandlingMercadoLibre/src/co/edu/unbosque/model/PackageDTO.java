package co.edu.unbosque.model;

import java.io.Serializable;

public class PackageDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4160775231220528607L;
	private long serialNumber;
	private String packageContent;
	private String transmitterName;
	private String receiverName;
	private float weight;

	public PackageDTO() {
		// TODO Auto-generated constructor stub
	}

	public PackageDTO(long serialNumber, String packageContent, String transmitterName, String receiverName,
			float weight) {
		super();
		this.serialNumber = serialNumber;
		this.packageContent = packageContent;
		this.transmitterName = transmitterName;
		this.receiverName = receiverName;
		this.weight = weight;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getPackageContent() {
		return packageContent;
	}

	public void setPackageContent(String packageContent) {
		this.packageContent = packageContent;
	}

	public String getTransmitterName() {
		return transmitterName;
	}

	public void setTransmitterName(String transmitterName) {
		this.transmitterName = transmitterName;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PackageDTO [serialNumber=" + serialNumber + ", packageContent=" + packageContent + ", transmitterName="
				+ transmitterName + ", receiverName=" + receiverName + ", weight=" + weight + "]";
	}

}
