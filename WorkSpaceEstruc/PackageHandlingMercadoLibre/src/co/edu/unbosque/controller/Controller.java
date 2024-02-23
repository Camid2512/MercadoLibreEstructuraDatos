package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.BranchDTO;
import co.edu.unbosque.model.PackageDTO;
import co.edu.unbosque.model.persistence.BranchDAO;
import co.edu.unbosque.model.persistence.CountryDAO;
import co.edu.unbosque.model.persistence.PackageDAO;
import co.edu.unbosque.view.ColombiaCRUDWindow;
import co.edu.unbosque.view.CreateWindow;
import co.edu.unbosque.view.FilterWindow;
import co.edu.unbosque.view.MainWindow;
import co.edu.unbosque.view.SelPackageDeleteWindow;
import co.edu.unbosque.view.SelectCountryWindow;
import co.edu.unbosque.view.SelectFilterTypeWindow;
import co.edu.unbosque.view.SelectPackageUpdateWindow;
import co.edu.unbosque.view.UpdateWindow;

public class Controller implements ActionListener {

	private PackageDAO packDAO;
	private BranchDAO branDAO;
	private CountryDAO counDAO;

	private MainWindow mainWin;
	private SelectCountryWindow selCountryWin;
	private ColombiaCRUDWindow colCrudWin;
	private CreateWindow createWin;
	private SelPackageDeleteWindow deleteWin;
	private SelectPackageUpdateWindow selPackUpdateWin;
	private UpdateWindow updateWin;
	private SelectFilterTypeWindow selFilterTypeWin;
	private FilterWindow filterWin;

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
		selPackUpdateWin = new SelectPackageUpdateWindow();
		updateWin = new UpdateWindow();
		selFilterTypeWin = new SelectFilterTypeWindow();
		filterWin = new FilterWindow();

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

		colCrudWin.getUpdate().addActionListener(this);
		colCrudWin.getUpdate().setActionCommand("SELECT UPDATE COL");

		colCrudWin.getFilter().addActionListener(this);
		colCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE");

		createWin.getExit().addActionListener(this);
		createWin.getExit().setActionCommand("EXIT");

		createWin.getBack().addActionListener(this);
		createWin.getBack().setActionCommand("BACK CREATE");

		createWin.getCreate().addActionListener(this);
		createWin.getCreate().setActionCommand("CREATE NEW PACKAGE");

		deleteWin.getExit().addActionListener(this);
		deleteWin.getExit().setActionCommand("EXIT");

		deleteWin.getBack().addActionListener(this);
		deleteWin.getBack().setActionCommand("BACK DELETE SELECT");

		deleteWin.getDelete().addActionListener(this);
		deleteWin.getDelete().setActionCommand("DELETE PACKAGE");

		selPackUpdateWin.getExit().addActionListener(this);
		selPackUpdateWin.getExit().setActionCommand("EXIT");

		selPackUpdateWin.getBack().addActionListener(this);
		selPackUpdateWin.getBack().setActionCommand("BACK SELECT UPDATE");

		selPackUpdateWin.getUpdate().addActionListener(this);
		selPackUpdateWin.getUpdate().setActionCommand("SELECT UPDATE");

		updateWin.getExit().addActionListener(this);
		updateWin.getExit().setActionCommand("EXIT");

		updateWin.getBack().addActionListener(this);
		updateWin.getBack().setActionCommand("BACK UPDATE");

		updateWin.getUpdate().addActionListener(this);
		updateWin.getUpdate().setActionCommand("UPDATE PACKAGE");

		selFilterTypeWin.getExit().addActionListener(this);
		selFilterTypeWin.getExit().setActionCommand("EXIT");

		selFilterTypeWin.getBack().addActionListener(this);
		selFilterTypeWin.getBack().setActionCommand("BACK SELECT TYPE FILTER");

		selFilterTypeWin.getFilter().addActionListener(this);
		selFilterTypeWin.getFilter().setActionCommand("FILTER");

		filterWin.getExit().addActionListener(this);
		filterWin.getExit().setActionCommand("EXIT");

		filterWin.getBack().addActionListener(this);
		filterWin.getBack().setActionCommand("BACK FILTER");

		filterWin.getFilter().addActionListener(this);
		filterWin.getFilter().setActionCommand("FILTER PACKAGES");

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
			backCreate();
			createWin.getSerialNumber().setText("");
			createWin.getPackageContent().setText("");
			createWin.getTransmitterName().setText("");
			createWin.getReceiverName().setText("");
			createWin.getWeight().setText("");
			break;
		}
		case "BACK DELETE SELECT": {
			backDelete();
			break;
		}
		case "BACK SELECT UPDATE": {
			backSelUpdate();
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

			deleteWin.setVisible(true);
			colCrudWin.setVisible(false);
			fillBoxSelectDeletePackage(0);
			break;

		}
		case "DELETE PACKAGE": {
			deletePackage();
			backDelete();
			break;
		}
		case "SELECT UPDATE COL": {

			fillBoxSelectUpdatePackage(0);
			selPackUpdateWin.setVisible(true);
			colCrudWin.setVisible(false);
			break;

		}
		case "SELECT UPDATE": {

			selPackUpdateWin.setVisible(false);
			updateWin.setVisible(true);
			setDataToUpdate(0);
			break;
		}
		case "BACK UPDATE": {

			selPackUpdateWin.setVisible(true);
			updateWin.setVisible(false);
			break;
		}
		case "UPDATE PACKAGE": {

			updatePackage();
			selPackUpdateWin.setVisible(true);
			updateWin.setVisible(false);
			break;

		}
		case "SELECT FILTER TYPE": {

			selFilterTypeWin.setVisible(true);
			colCrudWin.setVisible(false);
			break;
		}
		case "BACK SELECT TYPE FILTER": {
			backSelFilter();
			break;

		}
		case "FILTER": {

			filterWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
			break;

		}
		case "FILTER PACKAGES": {
			filterPackages();
			selFilterTypeWin.setVisible(true);
			filterWin.setVisible(false);
			break;

		}
		case "BACK FILTER": {

			selFilterTypeWin.setVisible(true);
			filterWin.setVisible(false);
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
		JOptionPane.showMessageDialog(mainWin, "CREADO CON EXITO");
		System.out.println(branDAO.read());

	}

	public void deletePackage() {
		packDAO.deleteByIndex(
				packDAO.getIndexBySerialNumber(0, Long.parseLong(deleteWin.getSelect().getSelectedItem().toString())));

		JOptionPane.showMessageDialog(mainWin, "ELIMINADO CON EXITO");

	}

	public void updatePackage() {

		long serialNumber = Long.parseLong(updateWin.getSerialNumber().getText());
		String packageContent = updateWin.getPackageContent().getText();
		String transmitterName = updateWin.getTransmitterName().getText();
		String receiverName = updateWin.getReceiverName().getText();
		float weight = Float.parseFloat(updateWin.getWeight().getText());

		packDAO.updateByIndex(
				packDAO.getIndexBySerialNumber(0,
						Long.parseLong(selPackUpdateWin.getSelect().getSelectedItem().toString())),
				Long.toString(serialNumber), packageContent, transmitterName, receiverName, Float.toString(weight));

		JOptionPane.showMessageDialog(mainWin, "ACTUALIZADO CON EXITO");
		System.out.println(packDAO.read());

		System.out.println("-------------");
		System.out.println(branDAO.read());
	}

	public void filterPackages() {

		if (selFilterTypeWin.getSelect().getSelectedItem().toString().equals("Numero de serie")) {

			Long searchNum = Long.parseLong(filterWin.getSearchWord().getText());
			JOptionPane.showMessageDialog(mainWin, packDAO.searchBySerialNumber(0, searchNum));

		} else if (selFilterTypeWin.getSelect().getSelectedItem().toString().equals("Contenido del paquete")) {
			String searchContent = filterWin.getSearchWord().getText();
			JOptionPane.showMessageDialog(mainWin, packDAO.searchByPackageContent(0, searchContent));
		} else if (selFilterTypeWin.getSelect().getSelectedItem().toString().equals("Nombre del emisor")) {
			String searchTransmitter = filterWin.getSearchWord().getText();
			JOptionPane.showMessageDialog(mainWin, packDAO.searchByTransmitterName(0, searchTransmitter));
		} else if (selFilterTypeWin.getSelect().getSelectedItem().toString().equals("Nombre del receptor")) {
			String searchReceptor = filterWin.getSearchWord().getText();
			JOptionPane.showMessageDialog(mainWin, packDAO.searchByRecieverName(0, searchReceptor));
		} else if (selFilterTypeWin.getSelect().getSelectedItem().toString().equals("Peso")) {
			float searchWeight = Float.parseFloat(filterWin.getSearchWord().getText());
			JOptionPane.showMessageDialog(mainWin, packDAO.searchByWeight(0, searchWeight));
		}

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

	public void fillBoxSelectDeletePackage(int cont) {

		if (cont < packDAO.getPackageList().size()) {

			deleteWin.getSelect().addItem(packDAO.getPackageList().get(cont).getInfo().getSerialNumber());
			fillBoxSelectDeletePackage(cont + 1);
		}

		if (cont >= packDAO.getPackageList().size()) {
			return;
		}
	}

	public void updateBoxSelectDeletePackage() {

		deleteWin.getSelect().removeAllItems();

	}

	public void fillBoxSelectUpdatePackage(int cont) {

		if (cont < packDAO.getPackageList().size()) {

			selPackUpdateWin.getSelect().addItem(packDAO.getPackageList().get(cont).getInfo().getSerialNumber());
			fillBoxSelectDeletePackage(cont + 1);
		}

		if (cont >= packDAO.getPackageList().size()) {
			return;
		}
	}

	public void updateBoxSelectUpdatePackage() {

		selPackUpdateWin.getSelect().removeAllItems();

	}

	public void backDelete() {
		if (countryActual.equals("COLOMBIA") && currencyActual.equals("COP")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("MEXICO") && currencyActual.equals("MXV")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();
		}
		if (countryActual.equals("ARGENTINA") && currencyActual.equals("ARS")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("PERU") && currencyActual.equals("PEN")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("VENEZUELA") && currencyActual.equals("VEF")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("CHILE") && currencyActual.equals("CLP")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("ECUADOR") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("GUATEMALA") && currencyActual.equals("GTQ")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("CUBA") && currencyActual.equals("CUP")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("BOLIVIA") && currencyActual.equals("BOV")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("REPUBLICA DOMINICANA") && currencyActual.equals("DOP")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();
		}
		if (countryActual.equals("HONDURAS") && currencyActual.equals("HNL")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("PARAGUAY") && currencyActual.equals("PYG")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();
		}
		if (countryActual.equals("EL SALVADOR") && currencyActual.equals("SVC")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();
		}
		if (countryActual.equals("NICARAGUA") && currencyActual.equals("NIO")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("COSTA RICA") && currencyActual.equals("CRC")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("PUERTO RICO") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("PANAMA") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("URUGUAY") && currencyActual.equals("UYU")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("JAMAICA") && currencyActual.equals("JMD")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("TRINIDAD Y TOBAGO") && currencyActual.equals("TTD")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("HAITI") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("GUYANA") && currencyActual.equals("EUR")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("SURINAM") && currencyActual.equals("SRD")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
		if (countryActual.equals("BELICE") && currencyActual.equals("BZD")) {

			colCrudWin.setVisible(true);
			deleteWin.setVisible(false);
			updateBoxSelectDeletePackage();

		}
	}

	public void backCreate() {
		if (countryActual.equals("COLOMBIA") && currencyActual.equals("COP")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("MEXICO") && currencyActual.equals("MXV")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);
		}
		if (countryActual.equals("ARGENTINA") && currencyActual.equals("ARS")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("PERU") && currencyActual.equals("PEN")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("VENEZUELA") && currencyActual.equals("VEF")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("CHILE") && currencyActual.equals("CLP")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("ECUADOR") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("GUATEMALA") && currencyActual.equals("GTQ")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("CUBA") && currencyActual.equals("CUP")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("BOLIVIA") && currencyActual.equals("BOV")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("REPUBLICA DOMINICANA") && currencyActual.equals("DOP")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);
		}
		if (countryActual.equals("HONDURAS") && currencyActual.equals("HNL")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("PARAGUAY") && currencyActual.equals("PYG")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);
		}
		if (countryActual.equals("EL SALVADOR") && currencyActual.equals("SVC")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);
		}
		if (countryActual.equals("NICARAGUA") && currencyActual.equals("NIO")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("COSTA RICA") && currencyActual.equals("CRC")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("PUERTO RICO") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("PANAMA") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("URUGUAY") && currencyActual.equals("UYU")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("JAMAICA") && currencyActual.equals("JMD")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("TRINIDAD Y TOBAGO") && currencyActual.equals("TTD")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("HAITI") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("GUYANA") && currencyActual.equals("EUR")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("SURINAM") && currencyActual.equals("SRD")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
		if (countryActual.equals("BELICE") && currencyActual.equals("BZD")) {

			colCrudWin.setVisible(true);
			createWin.setVisible(false);

		}
	}

	public void backSelUpdate() {
		if (countryActual.equals("COLOMBIA") && currencyActual.equals("COP")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();

		}
		if (countryActual.equals("MEXICO") && currencyActual.equals("MXV")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("ARGENTINA") && currencyActual.equals("ARS")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();

		}
		if (countryActual.equals("PERU") && currencyActual.equals("PEN")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("VENEZUELA") && currencyActual.equals("VEF")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("CHILE") && currencyActual.equals("CLP")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("ECUADOR") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("GUATEMALA") && currencyActual.equals("GTQ")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("CUBA") && currencyActual.equals("CUP")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("BOLIVIA") && currencyActual.equals("BOV")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("REPUBLICA DOMINICANA") && currencyActual.equals("DOP")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("HONDURAS") && currencyActual.equals("HNL")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("PARAGUAY") && currencyActual.equals("PYG")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("EL SALVADOR") && currencyActual.equals("SVC")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("NICARAGUA") && currencyActual.equals("NIO")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("COSTA RICA") && currencyActual.equals("CRC")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("PUERTO RICO") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("PANAMA") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("URUGUAY") && currencyActual.equals("UYU")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("JAMAICA") && currencyActual.equals("JMD")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("TRINIDAD Y TOBAGO") && currencyActual.equals("TTD")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("HAITI") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("GUYANA") && currencyActual.equals("EUR")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("SURINAM") && currencyActual.equals("SRD")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}
		if (countryActual.equals("BELICE") && currencyActual.equals("BZD")) {

			colCrudWin.setVisible(true);
			selPackUpdateWin.setVisible(false);
			updateBoxSelectUpdatePackage();
		}

	}

	public void backSelFilter() {
		if (countryActual.equals("COLOMBIA") && currencyActual.equals("COP")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);

		}
		if (countryActual.equals("MEXICO") && currencyActual.equals("MXV")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("ARGENTINA") && currencyActual.equals("ARS")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);

		}
		if (countryActual.equals("PERU") && currencyActual.equals("PEN")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("VENEZUELA") && currencyActual.equals("VEF")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("CHILE") && currencyActual.equals("CLP")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("ECUADOR") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("GUATEMALA") && currencyActual.equals("GTQ")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("CUBA") && currencyActual.equals("CUP")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("BOLIVIA") && currencyActual.equals("BOV")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("REPUBLICA DOMINICANA") && currencyActual.equals("DOP")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("HONDURAS") && currencyActual.equals("HNL")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("PARAGUAY") && currencyActual.equals("PYG")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("EL SALVADOR") && currencyActual.equals("SVC")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("NICARAGUA") && currencyActual.equals("NIO")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("COSTA RICA") && currencyActual.equals("CRC")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("PUERTO RICO") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("PANAMA") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("URUGUAY") && currencyActual.equals("UYU")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("JAMAICA") && currencyActual.equals("JMD")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("TRINIDAD Y TOBAGO") && currencyActual.equals("TTD")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("HAITI") && currencyActual.equals("USD")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("GUYANA") && currencyActual.equals("EUR")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("SURINAM") && currencyActual.equals("SRD")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}
		if (countryActual.equals("BELICE") && currencyActual.equals("BZD")) {

			colCrudWin.setVisible(true);
			selFilterTypeWin.setVisible(false);
		}

	}

	public void setDataToUpdate(int cont) {

		updateWin.getSerialNumber().setText(selPackUpdateWin.getSelect().getSelectedItem().toString());

		if (cont < packDAO.getPackageList().size()) {

			updateWin.getPackageContent().setText(packDAO.getPackageList().get(cont).getInfo().getPackageContent());
			updateWin.getTransmitterName().setText(packDAO.getPackageList().get(cont).getInfo().getTransmitterName());
			updateWin.getReceiverName().setText(packDAO.getPackageList().get(cont).getInfo().getReceiverName());
			updateWin.getWeight().setText(Float.toString(packDAO.getPackageList().get(cont).getInfo().getWeight()));

			setDataToUpdate(cont + 1);

		}
		if (cont >= packDAO.getPackageList().size()) {

			return;
		}

	}

}
