package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.CountryDTO;
import co.edu.unbosque.util.linkedlist.MyLinkedList;

public class CountryDAO {

	private MyLinkedList<CountryDTO> countryList;

	public CountryDAO() {
		// TODO Auto-generated constructor stub

		countryList = new MyLinkedList<>();

	}

	public CountryDTO createCountry(String country, String currency) {

		if (country.equals("COLOMBIA") && currency.equals("COP")) {

			CountryDTO colombia = new CountryDTO("Colombia", "COP");
			countryList.addLast(colombia);
			return colombia;

		}
		if (country.equals("MEXICO") && currency.equals("MXV")) {

			CountryDTO mexico = new CountryDTO("Mexico", "MXV");
			countryList.addLast(mexico);
			return mexico;

		}
		if (country.equals("ARGENTINA") && currency.equals("ARS")) {

			CountryDTO argentina = new CountryDTO("Argentina", "ARS");
			countryList.addLast(argentina);
			return argentina;

		}
		if (country.equals("PERU") && currency.equals("PEN")) {

			CountryDTO peru = new CountryDTO("Peru", "PEN");
			countryList.addLast(peru);
			return peru;

		}
		if (country.equals("VENEZUELA") && currency.equals("VEF")) {

			CountryDTO venezuela = new CountryDTO("Venezuela", "VEF");
			countryList.addLast(venezuela);
			return venezuela;

		}
		if (country.equals("CHILE") && currency.equals("CLP")) {

			CountryDTO chile = new CountryDTO("Chile", "CLP");
			countryList.addLast(chile);
			return chile;

		}
		if (country.equals("ECUADOR") && currency.equals("USD")) {

			CountryDTO ecuador = new CountryDTO("Ecuador", "USD");
			countryList.addLast(ecuador);
			return ecuador;

		}
		if (country.equals("GUATEMALA") && currency.equals("GTQ")) {

			CountryDTO guatemala = new CountryDTO("Guatemala", "GTQ");
			countryList.addLast(guatemala);
			return guatemala;

		}
		if (country.equals("CUBA") && currency.equals("CUP")) {

			CountryDTO cuba = new CountryDTO("Cuba", "CUP");
			countryList.addLast(cuba);
			return cuba;

		}
		if (country.equals("BOLIVIA") && currency.equals("BOV")) {

			CountryDTO bolivia = new CountryDTO("Bolivia", "BOV");
			countryList.addLast(bolivia);
			return bolivia;

		}
		if (country.equals("REPUBLICA DOMINICANA") && currency.equals("DOP")) {

			CountryDTO dominicanRepublic = new CountryDTO("Republica Dominicana", "DOP");
			countryList.addLast(dominicanRepublic);
			return dominicanRepublic;

		}
		if (country.equals("HONDURAS") && currency.equals("HNL")) {

			CountryDTO honduras = new CountryDTO("Honduras", "HNL");
			countryList.addLast(honduras);
			return honduras;

		}
		if (country.equals("PARAGUAY") && currency.equals("PYG")) {

			CountryDTO paraguay = new CountryDTO("Paraguay", "PYG");
			countryList.addLast(paraguay);
			return paraguay;

		}
		if (country.equals("EL SALVADOR") && currency.equals("SVC")) {

			CountryDTO salvador = new CountryDTO("El Salvador", "SVC");
			countryList.addLast(salvador);
			return salvador;

		}
		if (country.equals("NICARAGUA") && currency.equals("NIO")) {

			CountryDTO nicaragua = new CountryDTO("Nicaragua", "NIO");
			countryList.addLast(nicaragua);
			return nicaragua;

		}
		if (country.equals("COSTA RICA") && currency.equals("CRC")) {

			CountryDTO costaRica = new CountryDTO("Costa Rica", "CRC");
			countryList.addLast(costaRica);
			return costaRica;

		}
		if (country.equals("PUERTO RICO") && currency.equals("USD")) {

			CountryDTO puertoRico = new CountryDTO("Puerto Rico", "USD");
			countryList.addLast(puertoRico);
			return puertoRico;

		}
		if (country.equals("PANAMA") && currency.equals("USD")) {

			CountryDTO panama = new CountryDTO("Panama", "USD");
			countryList.addLast(panama);
			return panama;

		}
		if (country.equals("URUGUAY") && currency.equals("UYU")) {

			CountryDTO uruguay = new CountryDTO("Uruguay", "UYU");
			countryList.addLast(uruguay);
			return uruguay;

		}
		if (country.equals("JAMAICA") && currency.equals("JMD")) {

			CountryDTO jamaica = new CountryDTO("Jamaica", "JMD");
			countryList.addLast(jamaica);
			return jamaica;

		}
		if (country.equals("TRINIDAD Y TOBAGO") && currency.equals("TTD")) {

			CountryDTO trinidadYTobago = new CountryDTO("Trinidad y Tobago", "TTD");
			countryList.addLast(trinidadYTobago);
			return trinidadYTobago;

		}
		if (country.equals("HAITI") && currency.equals("USD")) {

			CountryDTO haiti = new CountryDTO("Haiti", "USD");
			countryList.addLast(haiti);
			return haiti;

		}
		if (country.equals("GUYANA") && currency.equals("EUR")) {

			CountryDTO guyana = new CountryDTO("Guyana", "EUR");
			countryList.addLast(guyana);
			return guyana;

		}
		if (country.equals("SURINAM") && currency.equals("SRD")) {

			CountryDTO surinam = new CountryDTO("Surinam", "SRD");
			countryList.addLast(surinam);
			return surinam;

		}
		if (country.equals("BELICE") && currency.equals("BZD")) {

			CountryDTO belice = new CountryDTO("Belice", "BZD");
			countryList.addLast(belice);
			return belice;

		}
		return null;
	}

}
