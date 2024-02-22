package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.ColombiaCRUDWindow;
import co.edu.unbosque.view.CreateWindow;
import co.edu.unbosque.view.MainWindow;
import co.edu.unbosque.view.SelectCountryWindow;

public class Controller implements ActionListener {

	private MainWindow mainWin;
	private SelectCountryWindow selCountryWin;
	private ColombiaCRUDWindow colCrudWin;
	private CreateWindow createWin;

	private String countryActual;
	private String currencyActual;

	public Controller() {
		// TODO Auto-generated constructor stub

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
		case "INICIO APP": {
			selCountryWin.setVisible(true);
			mainWin.setVisible(false);
			break;
		}
		case "COLOMBIA CRUD": {
			colCrudWin.setVisible(true);
			selCountryWin.setVisible(false);
			break;
		}
		case "CREATE COL": {

			createWin.setVisible(true);
			colCrudWin.setVisible(false);
			break;
		}
		default:
			break;
		}

	}

}
