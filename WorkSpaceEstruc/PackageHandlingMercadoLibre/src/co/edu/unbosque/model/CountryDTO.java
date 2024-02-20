package co.edu.unbosque.model;

public class CountryDTO {

	private String countryName;
	private String currencyType;

	public CountryDTO() {
		// TODO Auto-generated constructor stub
	}

	public CountryDTO(String countryName, String currencyType) {
		super();
		this.countryName = countryName;
		this.currencyType = currencyType;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	@Override
	public String toString() {
		return "CountryDTO [Country=" + countryName + ", Currency=" + currencyType + "]";
	}

}
