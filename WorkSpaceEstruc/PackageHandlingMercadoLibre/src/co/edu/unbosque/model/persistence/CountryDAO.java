package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.CountryDTO;
import co.edu.unbosque.util.linkedlist.MyLinkedList;

public class CountryDAO {

	private MyLinkedList<CountryDTO> countryList;

	public CountryDAO() {
		// TODO Auto-generated constructor stub

		countryList = new MyLinkedList<>();

	}

	public void createCountry(Object obj) {

		CountryDTO colombia = new CountryDTO("Colombia", "COP");
		CountryDTO mexico = new CountryDTO("Mexico", "MXV");
		CountryDTO argentina = new CountryDTO("Argentina", "ARS");
		CountryDTO peru = new CountryDTO("Peru", "PEN");
		CountryDTO venezuela = new CountryDTO("Venezuela", "VEF");
		CountryDTO chile = new CountryDTO("Chile", "CLP");
		CountryDTO ecuador = new CountryDTO("Ecuador", "USD");
		CountryDTO guatemala = new CountryDTO("Guatemala", "GTQ");
		CountryDTO cuba = new CountryDTO("Cuba", "CUP");
		CountryDTO bolivia = new CountryDTO("Bolivia", "BOV");
		CountryDTO dominicanRepublic = new CountryDTO("Republica Dominicana", "DOP");
		CountryDTO honduras = new CountryDTO("Honduras", "HNL");
		CountryDTO paraguay = new CountryDTO("Paraguay", "PYG");
		CountryDTO salvador = new CountryDTO("El Salvador", "SVC");
		CountryDTO nicaragua = new CountryDTO("Nicaragua", "NIO");
		CountryDTO costaRica = new CountryDTO("Costa Rica", "CRC");
		CountryDTO puertoRico = new CountryDTO("Puerto Rico", "USD");
		CountryDTO panama = new CountryDTO("Panama", "USD");
		CountryDTO uruguay = new CountryDTO("Uruguay", "UYU");
		CountryDTO jamaica = new CountryDTO("Jamaica", "JMD");
		CountryDTO trinidadYTobago = new CountryDTO("Trinidad y Tobago", "TTD");
		CountryDTO haiti = new CountryDTO("Haiti", "USD");
		CountryDTO guyana = new CountryDTO("Guyana", "EUR");
		CountryDTO surinam = new CountryDTO("Surinam", "SRD");
		CountryDTO belice = new CountryDTO("Belice", "BZD");

		countryList.addLast(colombia);
		countryList.addLast(mexico);
		countryList.addLast(argentina);
		countryList.addLast(peru);
		countryList.addLast(venezuela);
		countryList.addLast(chile);
		countryList.addLast(ecuador);
		countryList.addLast(guatemala);
		countryList.addLast(cuba);
		countryList.addLast(bolivia);
		countryList.addLast(dominicanRepublic);
		countryList.addLast(honduras);
		countryList.addLast(paraguay);
		countryList.addLast(salvador);
		countryList.addLast(nicaragua);
		countryList.addLast(costaRica);
		countryList.addLast(puertoRico);
		countryList.addLast(panama);
		countryList.addLast(uruguay);
		countryList.addLast(jamaica);
		countryList.addLast(trinidadYTobago);
		countryList.addLast(haiti);
		countryList.addLast(guyana);
		countryList.addLast(surinam);
		countryList.addLast(belice);

	}

}
