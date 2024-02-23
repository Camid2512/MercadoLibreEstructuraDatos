package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.BranchDTO;
import co.edu.unbosque.model.CountryDTO;
import co.edu.unbosque.model.PackageDTO;
import co.edu.unbosque.model.persistence.BranchDAO;
import co.edu.unbosque.model.persistence.CountryDAO;
import co.edu.unbosque.model.persistence.PackageDAO;
import co.edu.unbosque.view.ColombiaCRUDWindow;
import co.edu.unbosque.view.CreateWindow;
import co.edu.unbosque.view.MainWindow;
import co.edu.unbosque.view.SelPackageDeleteWindow;
import co.edu.unbosque.view.SelectCountryWindow;

public class Controller implements ActionListener {

	private PackageDAO packDAO;
	private BranchDAO branDAO;
	private CountryDAO counDAO;

	private MainWindow mainWin;
	private SelectCountryWindow selCountryWin;
	private ColombiaCRUDWindow colCrudWin;
	private CreateWindow createWin;
	private SelPackageDeleteWindow deleteWin;

	private String countryActual;
	private String currencyActual;

	public Controller() {
		// TODO Auto-generated constructor stub
		packDAO = new PackageDAO();
		branDAO = new BranchDAO();
		counDAO = new CountryDAO();

		mainWin = new MainWindow();
		selCountryWin = new SelectCountryWindow();
		colCrudWin = new ColombiaCRUDWindow();
		createWin = new CreateWindow();
		deleteWin = new SelPackageDeleteWindow();

		addReaders();
	}

	public void run() {

		mainWin.setVisible(true);

	}

	public void addReaders() {

		mainWin.getNextStep().addActionListener(this);
		mainWin.getNextStep().setActionCommand("INICIO APP");

		mainWin.getExit().addActionListener(this);
		mainWin.getExit().setActionCommand("EXIT");

		selCountryWin.getExit().addActionListener(this);
		selCountryWin.getExit().setActionCommand("EXIT");

		selCountryWin.getBack().addActionListener(this);
		selCountryWin.getBack().setActionCommand("BACK SEL COUNTRY");

		selCountryWin.getColBtn().addActionListener(this);
		selCountryWin.getColBtn().setActionCommand("COLOMBIA CRUD");

		colCrudWin.getExit().addActionListener(this);
		colCrudWin.getExit().setActionCommand("EXIT");

		colCrudWin.getBack().addActionListener(this);
		colCrudWin.getBack().setActionCommand("BACK CRUD COLOMBIA");

		colCrudWin.getCreate().addActionListener(this);
		colCrudWin.getCreate().setActionCommand("CREATE COL");

		colCrudWin.getDelete().addActionListener(this);
		colCrudWin.getDelete().setActionCommand("DELETE COL");

		createWin.getExit().addActionListener(this);
		createWin.getExit().setActionCommand("EXIT");

		createWin.getBack().addActionListener(this);
		createWin.getBack().setActionCommand("BACK CREATE");

		createWin.getCreate().addActionListener(this);
		createWin.getCreate().setActionCommand("CREATE NEW PACKAGE");

		deleteWin.getExit().addActionListener(this);
		deleteWin.getExit().setActionCommand("EXIT");

		deleteWin.getBack().addActionListener(this);
		deleteWin.getBack().setActionCommand("BACK DELETE");

		deleteWin.getDelete().addActionListener(this);
		deleteWin.getDelete().setActionCommand("DELETE PACKAGE");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		switch (e.getActionCommand()) {
		case "EXIT": {

			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;

		}

		case "INICIO APP": {
			selCountryWin.setVisible(true);
			mainWin.setVisible(false);
			break;
		}
		case "BACK SEL COUNTRY": {
			mainWin.setVisible(true);
			selCountryWin.setVisible(false);
			break;

		}
		case "COLOMBIA CRUD": {
			countryActual = "COLOMBIA";
			currencyActual = "COP";
			colCrudWin.setVisible(true);
			selCountryWin.setVisible(false);
			break;
		}
		case "BACK CRUD COLOMBIA": {

			selCountryWin.setVisible(true);
			colCrudWin.setVisible(false);
			break;

		}
		case "CREATE COL": {

			createWin.setVisible(true);
			colCrudWin.setVisible(false);
			break;
		}
		case "BACK CREATE": {
			if (countryActual.equals("COLOMBIA") && currencyActual.equals("COP")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("MEXICO") && currencyActual.equals("MXV")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;
			}
			if (countryActual.equals("ARGENTINA") && currencyActual.equals("ARS")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("PERU") && currencyActual.equals("PEN")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("VENEZUELA") && currencyActual.equals("VEF")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("CHILE") && currencyActual.equals("CLP")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("ECUADOR") && currencyActual.equals("USD")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("GUATEMALA") && currencyActual.equals("GTQ")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("CUBA") && currencyActual.equals("CUP")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("BOLIVIA") && currencyActual.equals("BOV")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("REPUBLICA DOMINICANA") && currencyActual.equals("DOP")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;
			}
			if (countryActual.equals("HONDURAS") && currencyActual.equals("HNL")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("PARAGUAY") && currencyActual.equals("PYG")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;
			}
			if (countryActual.equals("EL SALVADOR") && currencyActual.equals("SVC")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("NICARAGUA") && currencyActual.equals("NIO")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("COSTA RICA") && currencyActual.equals("CRC")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("PUERTO RICO") && currencyActual.equals("USD")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("PANAMA") && currencyActual.equals("USD")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("URUGUAY") && currencyActual.equals("UYU")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("JAMAICA") && currencyActual.equals("JMD")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("TRINIDAD Y TOBAGO") && currencyActual.equals("TTD")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("HAITI") && currencyActual.equals("USD")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("GUYANA") && currencyActual.equals("EUR")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("SURINAM") && currencyActual.equals("SRD")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			if (countryActual.equals("BELICE") && currencyActual.equals("BZD")) {

				colCrudWin.setVisible(true);
				createWin.setVisible(false);
				break;

			}
			break;
		}
		case "BACK DELETE": {
			if (countryActual.equals("COLOMBIA") && currencyActual.equals("COP")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("MEXICO") && currencyActual.equals("MXV")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;
			}
			if (countryActual.equals("ARGENTINA") && currencyActual.equals("ARS")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("PERU") && currencyActual.equals("PEN")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("VENEZUELA") && currencyActual.equals("VEF")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("CHILE") && currencyActual.equals("CLP")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("ECUADOR") && currencyActual.equals("USD")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("GUATEMALA") && currencyActual.equals("GTQ")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("CUBA") && currencyActual.equals("CUP")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("BOLIVIA") && currencyActual.equals("BOV")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("REPUBLICA DOMINICANA") && currencyActual.equals("DOP")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;
			}
			if (countryActual.equals("HONDURAS") && currencyActual.equals("HNL")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("PARAGUAY") && currencyActual.equals("PYG")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;
			}
			if (countryActual.equals("EL SALVADOR") && currencyActual.equals("SVC")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("NICARAGUA") && currencyActual.equals("NIO")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("COSTA RICA") && currencyActual.equals("CRC")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("PUERTO RICO") && currencyActual.equals("USD")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("PANAMA") && currencyActual.equals("USD")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("URUGUAY") && currencyActual.equals("UYU")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("JAMAICA") && currencyActual.equals("JMD")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("TRINIDAD Y TOBAGO") && currencyActual.equals("TTD")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("HAITI") && currencyActual.equals("USD")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("GUYANA") && currencyActual.equals("EUR")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("SURINAM") && currencyActual.equals("SRD")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			if (countryActual.equals("BELICE") && currencyActual.equals("BZD")) {

				colCrudWin.setVisible(true);
				deleteWin.setVisible(false);
				break;

			}
			break;

		}
		case "CREATE NEW PACKAGE": {
			createNewPackage();
			createWin.getSerialNumber().setText("");
			createWin.getPackageContent().setText("");
			createWin.getTransmitterName().setText("");
			createWin.getReceiverName().setText("");
			createWin.getWeight().setText("");
			break;
		}

		case "DELETE COL": {

			countryActual = "COLOMBIA";
			currencyActual = "COLOMBIA";
			deleteWin.setVisible(true);
			colCrudWin.setVisible(false);
			break;

		}

		default:
			break;
		}

	}

	public void createNewPackage() {

		long serialNumber = Long.parseLong(createWin.getSerialNumber().getText());
		String packageContent = createWin.getPackageContent().getText();
		String transmitterName = createWin.getTransmitterName().getText();
		String receiverName = createWin.getReceiverName().getText();
		float weight = Float.parseFloat(createWin.getWeight().getText());

		PackageDTO aux = new PackageDTO(serialNumber, packageContent, transmitterName, receiverName, weight);

		packDAO.create(aux);

		BranchDTO newBranch = new BranchDTO(counDAO.createCountry(countryActual, currencyActual),
				packDAO.getPackageList());

		branDAO.create(newBranch);

		System.out.println(branDAO.read());

	}

	public boolean exitConfirm() {

		int response = JOptionPane.showOptionDialog(mainWin, "¿ESTA SEGURO QUE QUIERE CERRAR EL APLICATIVO?", "¿SALIR?",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		return confirmation;

	}
}
