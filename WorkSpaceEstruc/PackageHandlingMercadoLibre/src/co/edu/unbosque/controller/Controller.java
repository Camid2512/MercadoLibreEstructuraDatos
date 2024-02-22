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
import co.edu.unbosque.view.MainWindow;
import co.edu.unbosque.view.SelectCountryWindow;

public class Controller implements ActionListener {

	private PackageDAO packDAO;
	private BranchDAO branDAO;
	private CountryDAO counDAO;

	private MainWindow mainWin;
	private SelectCountryWindow selCountryWin;
	private ColombiaCRUDWindow colCrudWin;
	private CreateWindow createWin;

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

		selCountryWin.getColBtn().addActionListener(this);
		selCountryWin.getColBtn().setActionCommand("COLOMBIA CRUD");

		colCrudWin.getCreate().addActionListener(this);
		colCrudWin.getCreate().setActionCommand("CREATE COL");

		createWin.getCreate().addActionListener(this);
		createWin.getCreate().setActionCommand("CREATE NEW PACKAGE");
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
		case "COLOMBIA CRUD": {
			countryActual = "COLOMBIA";
			currencyActual = "COP";
			colCrudWin.setVisible(true);
			selCountryWin.setVisible(false);
			break;
		}
		case "CREATE COL": {

			createWin.setVisible(true);
			colCrudWin.setVisible(false);
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
