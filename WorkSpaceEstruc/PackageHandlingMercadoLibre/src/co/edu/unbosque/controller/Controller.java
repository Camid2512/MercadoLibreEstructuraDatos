package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.BranchDTO;
import co.edu.unbosque.model.PackageDTO;
import co.edu.unbosque.model.persistence.BranchDAO;
import co.edu.unbosque.model.persistence.CountryDAO;
import co.edu.unbosque.model.persistence.PackageDAO;
import co.edu.unbosque.view.ArgentinaCRUDWindow;
import co.edu.unbosque.view.BeliceCRUDWindow;
import co.edu.unbosque.view.BoliviaCRUDWindow;
import co.edu.unbosque.view.ChileCRUDWindow;
import co.edu.unbosque.view.ColombiaCRUDWindow;
import co.edu.unbosque.view.CostaRicaCRUDWindow;
import co.edu.unbosque.view.CreateWindow;
import co.edu.unbosque.view.CubaCRUDWindow;
import co.edu.unbosque.view.EcuadorCRUDWindow;
import co.edu.unbosque.view.ElSalvadorCRUDWindow;
import co.edu.unbosque.view.FilterWindow;
import co.edu.unbosque.view.GuatemalaCRUDWindow;
import co.edu.unbosque.view.GuyanaCRUDWindow;
import co.edu.unbosque.view.HaitiCRUDWindow;
import co.edu.unbosque.view.HondurasCRUDWindow;
import co.edu.unbosque.view.JamaicaCRUDWindow;
import co.edu.unbosque.view.MainWindow;
import co.edu.unbosque.view.MexicoCRUDWindow;
import co.edu.unbosque.view.NicaraguaCRUDWindow;
import co.edu.unbosque.view.PanamaCRUDWindow;
import co.edu.unbosque.view.ParaguayCRUDWindow;
import co.edu.unbosque.view.PeruCRUDWindow;
import co.edu.unbosque.view.PuertoRicoCRUDWindow;
import co.edu.unbosque.view.RepDominicanaCRUDWindow;
import co.edu.unbosque.view.SelPackageDeleteWindow;
import co.edu.unbosque.view.SelectCountryWindow;
import co.edu.unbosque.view.SelectFilterTypeWindow;
import co.edu.unbosque.view.SelectPackageUpdateWindow;
import co.edu.unbosque.view.SurinamCRUDWindow;
import co.edu.unbosque.view.TriniYTobCRUDWindow;
import co.edu.unbosque.view.UpdateWindow;
import co.edu.unbosque.view.UruguayCRUDWindow;
import co.edu.unbosque.view.VenezuelaCRUDWindow;

public class Controller implements ActionListener {

	private PackageDAO packDAO;
	private BranchDAO branDAO;
	private CountryDAO counDAO;

	private ColombiaCRUDWindow colCrudWin;
	private SurinamCRUDWindow surinamCrudWin;
	private MexicoCRUDWindow mexCrudWin;
	private ArgentinaCRUDWindow argCrudWin;
	private VenezuelaCRUDWindow vnzlaCrudWin;
	private PeruCRUDWindow perCrudWin;
	private ChileCRUDWindow chCrudWin;
	private EcuadorCRUDWindow ecCrudWin;
	private GuatemalaCRUDWindow guaCrudWin;
	private CubaCRUDWindow cubCrudWin;
	private BoliviaCRUDWindow bolCrudWin;
	private RepDominicanaCRUDWindow rdCrudWin;
	private HondurasCRUDWindow honCrudWin;
	private ParaguayCRUDWindow parCrudWin;
	private ElSalvadorCRUDWindow salvCrudWin;
	private NicaraguaCRUDWindow nicCrudWin;
	private CostaRicaCRUDWindow crCrudWin;
	private PuertoRicoCRUDWindow prCrudWin;
	private PanamaCRUDWindow panCrudWin;
	private UruguayCRUDWindow uruCrudWin;
	private JamaicaCRUDWindow jamCrudWin;
	private TriniYTobCRUDWindow triniTobCrudWin;
	private HaitiCRUDWindow haiCrudWin;
	private GuyanaCRUDWindow guyCrudWin;
	private BeliceCRUDWindow belCrudWin;

	private MainWindow mainWin;
	private SelectCountryWindow selCountryWin;
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

		colCrudWin = new ColombiaCRUDWindow();
		surinamCrudWin = new SurinamCRUDWindow();
		mexCrudWin = new MexicoCRUDWindow();
		argCrudWin = new ArgentinaCRUDWindow();
		vnzlaCrudWin = new VenezuelaCRUDWindow();
		perCrudWin = new PeruCRUDWindow();
		chCrudWin = new ChileCRUDWindow();
		ecCrudWin = new EcuadorCRUDWindow();
		guaCrudWin = new GuatemalaCRUDWindow();
		cubCrudWin = new CubaCRUDWindow();
		bolCrudWin = new BoliviaCRUDWindow();
		rdCrudWin = new RepDominicanaCRUDWindow();
		honCrudWin = new HondurasCRUDWindow();
		parCrudWin = new ParaguayCRUDWindow();
		salvCrudWin = new ElSalvadorCRUDWindow();
		nicCrudWin = new NicaraguaCRUDWindow();
		crCrudWin = new CostaRicaCRUDWindow();
		prCrudWin = new PuertoRicoCRUDWindow();
		panCrudWin = new PanamaCRUDWindow();
		uruCrudWin = new UruguayCRUDWindow();
		jamCrudWin = new JamaicaCRUDWindow();
		triniTobCrudWin = new TriniYTobCRUDWindow();
		haiCrudWin = new HaitiCRUDWindow();
		guyCrudWin = new GuyanaCRUDWindow();
		belCrudWin = new BeliceCRUDWindow();

		mainWin = new MainWindow();
		selCountryWin = new SelectCountryWindow();
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

		selCountryWin.getSurinamBtn().addActionListener(this);
		selCountryWin.getSurinamBtn().setActionCommand("SURINAM CRUD");

		selCountryWin.getMexicoBtn().addActionListener(this);
		selCountryWin.getMexicoBtn().setActionCommand("MEXICO CRUD");

		selCountryWin.getVenezuelBtn().addActionListener(this);
		selCountryWin.getVenezuelBtn().setActionCommand("VENEZUELA CRUD");

		selCountryWin.getArgentinBtn().addActionListener(this);
		selCountryWin.getArgentinBtn().setActionCommand("ARGENTINA CRUD");

		selCountryWin.getPeruBtn().addActionListener(this);
		selCountryWin.getPeruBtn().setActionCommand("PERU CRUD");

		selCountryWin.getChileBtn().addActionListener(this);
		selCountryWin.getChileBtn().setActionCommand("CHILE CRUD");

		selCountryWin.getEcuadorBtn().addActionListener(this);
		selCountryWin.getEcuadorBtn().setActionCommand("ECUADOR CRUD");

		selCountryWin.getGuatBtn().addActionListener(this);
		selCountryWin.getGuatBtn().setActionCommand("GUATEMALA CRUD");

		selCountryWin.getCubaBtn().addActionListener(this);
		selCountryWin.getCubaBtn().setActionCommand("CUBA CRUD");

		selCountryWin.getBolBtn().addActionListener(this);
		selCountryWin.getBolBtn().setActionCommand("BOLIVIA CRUD");

		selCountryWin.getRepDomBtn().addActionListener(this);
		selCountryWin.getRepDomBtn().setActionCommand("REPUBLICA DOMINICANA CRUD");

		selCountryWin.getHonduBtn().addActionListener(this);
		selCountryWin.getHonduBtn().setActionCommand("HONDURAS CRUD");

		selCountryWin.getParaguayBtn().addActionListener(this);
		selCountryWin.getParaguayBtn().setActionCommand("PARAGUAY CRUD");

		selCountryWin.getSalvadorBtn().addActionListener(this);
		selCountryWin.getSalvadorBtn().setActionCommand("EL SALVADOR CRUD");

		selCountryWin.getNicaraguaBtn().addActionListener(this);
		selCountryWin.getNicaraguaBtn().setActionCommand("NICARAGUA CRUD");

		selCountryWin.getCostRicaBtn().addActionListener(this);
		selCountryWin.getCostRicaBtn().setActionCommand("COSTA RICA CRUD");

		selCountryWin.getPuertRicoBtn().addActionListener(this);
		selCountryWin.getPuertRicoBtn().setActionCommand("PUERTO RICO CRUD");

		selCountryWin.getPanamaBtn().addActionListener(this);
		selCountryWin.getPanamaBtn().setActionCommand("PANAMA CRUD");

		selCountryWin.getUruguayBtn().addActionListener(this);
		selCountryWin.getUruguayBtn().setActionCommand("URUGUAY CRUD");

		selCountryWin.getJamaicaBtn().addActionListener(this);
		selCountryWin.getJamaicaBtn().setActionCommand("JAMAICA CRUD");

		selCountryWin.getTrinTobaBtn().addActionListener(this);
		selCountryWin.getTrinTobaBtn().setActionCommand("TRINIDAD Y TOBAGO CRUD");

		selCountryWin.getHaitiBtn().addActionListener(this);
		selCountryWin.getHaitiBtn().setActionCommand("HAITI CRUD");

		selCountryWin.getGuyanaBtn().addActionListener(this);
		selCountryWin.getGuyanaBtn().setActionCommand("GUYANA CRUD");

		selCountryWin.getBeliceBtn().addActionListener(this);
		selCountryWin.getBeliceBtn().setActionCommand("BELICE CRUD");

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
		colCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE COL");

		surinamCrudWin.getExit().addActionListener(this);
		surinamCrudWin.getExit().setActionCommand("EXIT");

		surinamCrudWin.getBack().addActionListener(this);
		surinamCrudWin.getBack().setActionCommand("BACK CRUD SURINAM");

		surinamCrudWin.getCreate().addActionListener(this);
		surinamCrudWin.getCreate().setActionCommand("CREATE SURINAM");

		surinamCrudWin.getDelete().addActionListener(this);
		surinamCrudWin.getDelete().setActionCommand("DELETE SURINAM");

		surinamCrudWin.getUpdate().addActionListener(this);
		surinamCrudWin.getUpdate().setActionCommand("SELECT UPDATE SURINAM");

		surinamCrudWin.getFilter().addActionListener(this);
		surinamCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE SURINAM");

		mexCrudWin.getExit().addActionListener(this);
		mexCrudWin.getExit().setActionCommand("EXIT");

		mexCrudWin.getBack().addActionListener(this);
		mexCrudWin.getBack().setActionCommand("BACK CRUD MEXICO");

		mexCrudWin.getCreate().addActionListener(this);
		mexCrudWin.getCreate().setActionCommand("CREATE MEXICO");

		mexCrudWin.getDelete().addActionListener(this);
		mexCrudWin.getDelete().setActionCommand("DELETE MEXICO");

		mexCrudWin.getUpdate().addActionListener(this);
		mexCrudWin.getUpdate().setActionCommand("SELECT UPDATE MEXICO");

		mexCrudWin.getFilter().addActionListener(this);
		mexCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE MEXICO");

		argCrudWin.getExit().addActionListener(this);
		argCrudWin.getExit().setActionCommand("EXIT");

		argCrudWin.getBack().addActionListener(this);
		argCrudWin.getBack().setActionCommand("BACK CRUD ARGENTINA");

		argCrudWin.getCreate().addActionListener(this);
		argCrudWin.getCreate().setActionCommand("CREATE ARG");

		argCrudWin.getDelete().addActionListener(this);
		argCrudWin.getDelete().setActionCommand("DELETE ARG");

		argCrudWin.getUpdate().addActionListener(this);
		argCrudWin.getUpdate().setActionCommand("SELECT UPDATE ARG");

		argCrudWin.getFilter().addActionListener(this);
		argCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE ARG");

		vnzlaCrudWin.getExit().addActionListener(this);
		vnzlaCrudWin.getExit().setActionCommand("EXIT");

		vnzlaCrudWin.getBack().addActionListener(this);
		vnzlaCrudWin.getBack().setActionCommand("BACK CRUD VENEZUELA");

		vnzlaCrudWin.getCreate().addActionListener(this);
		vnzlaCrudWin.getCreate().setActionCommand("CREATE VNZLA");

		vnzlaCrudWin.getDelete().addActionListener(this);
		vnzlaCrudWin.getDelete().setActionCommand("DELETE VNZLA");

		vnzlaCrudWin.getUpdate().addActionListener(this);
		vnzlaCrudWin.getUpdate().setActionCommand("SELECT UPDATE VNZLA");

		vnzlaCrudWin.getFilter().addActionListener(this);
		vnzlaCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE VNZLA");

		perCrudWin.getExit().addActionListener(this);
		perCrudWin.getExit().setActionCommand("EXIT");

		perCrudWin.getBack().addActionListener(this);
		perCrudWin.getBack().setActionCommand("BACK CRUD PERU");

		perCrudWin.getCreate().addActionListener(this);
		perCrudWin.getCreate().setActionCommand("CREATE PER");

		perCrudWin.getDelete().addActionListener(this);
		perCrudWin.getDelete().setActionCommand("DELETE PER");

		perCrudWin.getUpdate().addActionListener(this);
		perCrudWin.getUpdate().setActionCommand("SELECT UPDATE PER");

		perCrudWin.getFilter().addActionListener(this);
		perCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE PER");

		chCrudWin.getExit().addActionListener(this);
		chCrudWin.getExit().setActionCommand("EXIT");

		chCrudWin.getBack().addActionListener(this);
		chCrudWin.getBack().setActionCommand("BACK CRUD CHILE");

		chCrudWin.getCreate().addActionListener(this);
		chCrudWin.getCreate().setActionCommand("CREATE CH");

		chCrudWin.getDelete().addActionListener(this);
		chCrudWin.getDelete().setActionCommand("DELETE CH");

		chCrudWin.getUpdate().addActionListener(this);
		chCrudWin.getUpdate().setActionCommand("SELECT UPDATE CH");

		chCrudWin.getFilter().addActionListener(this);
		chCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE CH");

		ecCrudWin.getExit().addActionListener(this);
		ecCrudWin.getExit().setActionCommand("EXIT");

		ecCrudWin.getBack().addActionListener(this);
		ecCrudWin.getBack().setActionCommand("BACK CRUD ECUADOR");

		ecCrudWin.getCreate().addActionListener(this);
		ecCrudWin.getCreate().setActionCommand("CREATE EC");

		ecCrudWin.getDelete().addActionListener(this);
		ecCrudWin.getDelete().setActionCommand("DELETE EC");

		ecCrudWin.getUpdate().addActionListener(this);
		ecCrudWin.getUpdate().setActionCommand("SELECT UPDATE EC");

		ecCrudWin.getFilter().addActionListener(this);
		ecCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE EC");

		guaCrudWin.getExit().addActionListener(this);
		guaCrudWin.getExit().setActionCommand("EXIT");

		guaCrudWin.getBack().addActionListener(this);
		guaCrudWin.getBack().setActionCommand("BACK CRUD GUATEMALA");

		guaCrudWin.getCreate().addActionListener(this);
		guaCrudWin.getCreate().setActionCommand("CREATE GUA");

		guaCrudWin.getDelete().addActionListener(this);
		guaCrudWin.getDelete().setActionCommand("DELETE GUA");

		guaCrudWin.getUpdate().addActionListener(this);
		guaCrudWin.getUpdate().setActionCommand("SELECT UPDATE GUA");

		guaCrudWin.getFilter().addActionListener(this);
		guaCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE GUA");

		cubCrudWin.getExit().addActionListener(this);
		cubCrudWin.getExit().setActionCommand("EXIT");

		cubCrudWin.getBack().addActionListener(this);
		cubCrudWin.getBack().setActionCommand("BACK CRUD CUBA");

		cubCrudWin.getCreate().addActionListener(this);
		cubCrudWin.getCreate().setActionCommand("CREATE CUB");

		cubCrudWin.getDelete().addActionListener(this);
		cubCrudWin.getDelete().setActionCommand("DELETE CUB");

		cubCrudWin.getUpdate().addActionListener(this);
		cubCrudWin.getUpdate().setActionCommand("SELECT UPDATE CUB");

		cubCrudWin.getFilter().addActionListener(this);
		cubCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE CUB");

		bolCrudWin.getExit().addActionListener(this);
		bolCrudWin.getExit().setActionCommand("EXIT");

		bolCrudWin.getBack().addActionListener(this);
		bolCrudWin.getBack().setActionCommand("BACK CRUD BOLIVIA");

		bolCrudWin.getCreate().addActionListener(this);
		bolCrudWin.getCreate().setActionCommand("CREATE BOL");

		bolCrudWin.getDelete().addActionListener(this);
		bolCrudWin.getDelete().setActionCommand("DELETE BOL");

		bolCrudWin.getUpdate().addActionListener(this);
		bolCrudWin.getUpdate().setActionCommand("SELECT UPDATE BOL");

		bolCrudWin.getFilter().addActionListener(this);
		bolCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE BOL");

		rdCrudWin.getExit().addActionListener(this);
		rdCrudWin.getExit().setActionCommand("EXIT");

		rdCrudWin.getBack().addActionListener(this);
		rdCrudWin.getBack().setActionCommand("BACK CRUD REPUBLICA DOMINICANA");

		rdCrudWin.getCreate().addActionListener(this);
		rdCrudWin.getCreate().setActionCommand("CREATE RD");

		rdCrudWin.getDelete().addActionListener(this);
		rdCrudWin.getDelete().setActionCommand("DELETE RD");

		rdCrudWin.getUpdate().addActionListener(this);
		rdCrudWin.getUpdate().setActionCommand("SELECT UPDATE RD");

		rdCrudWin.getFilter().addActionListener(this);
		rdCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE RD");

		honCrudWin.getExit().addActionListener(this);
		honCrudWin.getExit().setActionCommand("EXIT");

		honCrudWin.getBack().addActionListener(this);
		honCrudWin.getBack().setActionCommand("BACK CRUD HONDURAS");

		honCrudWin.getCreate().addActionListener(this);
		honCrudWin.getCreate().setActionCommand("CREATE HON");

		honCrudWin.getDelete().addActionListener(this);
		honCrudWin.getDelete().setActionCommand("DELETE HON");

		honCrudWin.getUpdate().addActionListener(this);
		honCrudWin.getUpdate().setActionCommand("SELECT UPDATE HON");

		honCrudWin.getFilter().addActionListener(this);
		honCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE HON");

		parCrudWin.getExit().addActionListener(this);
		parCrudWin.getExit().setActionCommand("EXIT");

		parCrudWin.getBack().addActionListener(this);
		parCrudWin.getBack().setActionCommand("BACK CRUD PARAGUAY");

		parCrudWin.getCreate().addActionListener(this);
		parCrudWin.getCreate().setActionCommand("CREATE PAR");

		parCrudWin.getDelete().addActionListener(this);
		parCrudWin.getDelete().setActionCommand("DELETE PAR");

		parCrudWin.getUpdate().addActionListener(this);
		parCrudWin.getUpdate().setActionCommand("SELECT UPDATE PAR");

		parCrudWin.getFilter().addActionListener(this);
		parCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE PAR");

		salvCrudWin.getExit().addActionListener(this);
		salvCrudWin.getExit().setActionCommand("EXIT");

		salvCrudWin.getBack().addActionListener(this);
		salvCrudWin.getBack().setActionCommand("BACK CRUD EL SALVADOR");

		salvCrudWin.getCreate().addActionListener(this);
		salvCrudWin.getCreate().setActionCommand("CREATE SALV");

		salvCrudWin.getDelete().addActionListener(this);
		salvCrudWin.getDelete().setActionCommand("DELETE SALV");

		salvCrudWin.getUpdate().addActionListener(this);
		salvCrudWin.getUpdate().setActionCommand("SELECT UPDATE SALV");

		salvCrudWin.getFilter().addActionListener(this);
		salvCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE SALV");

		nicCrudWin.getExit().addActionListener(this);
		nicCrudWin.getExit().setActionCommand("EXIT");

		nicCrudWin.getBack().addActionListener(this);
		nicCrudWin.getBack().setActionCommand("BACK CRUD NICARAGUA");

		nicCrudWin.getCreate().addActionListener(this);
		nicCrudWin.getCreate().setActionCommand("CREATE NIC");

		nicCrudWin.getDelete().addActionListener(this);
		nicCrudWin.getDelete().setActionCommand("DELETE NIC");

		nicCrudWin.getUpdate().addActionListener(this);
		nicCrudWin.getUpdate().setActionCommand("SELECT UPDATE NIC");

		nicCrudWin.getFilter().addActionListener(this);
		nicCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE NIC");

		crCrudWin.getExit().addActionListener(this);
		crCrudWin.getExit().setActionCommand("EXIT");

		crCrudWin.getBack().addActionListener(this);
		crCrudWin.getBack().setActionCommand("BACK CRUD COSTA RICA");

		crCrudWin.getCreate().addActionListener(this);
		crCrudWin.getCreate().setActionCommand("CREATE CR");

		crCrudWin.getDelete().addActionListener(this);
		crCrudWin.getDelete().setActionCommand("DELETE CR");

		crCrudWin.getUpdate().addActionListener(this);
		crCrudWin.getUpdate().setActionCommand("SELECT UPDATE CR");

		crCrudWin.getFilter().addActionListener(this);
		crCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE CR");

		prCrudWin.getExit().addActionListener(this);
		prCrudWin.getExit().setActionCommand("EXIT");

		prCrudWin.getBack().addActionListener(this);
		prCrudWin.getBack().setActionCommand("BACK CRUD PUERTO RICO");

		prCrudWin.getCreate().addActionListener(this);
		prCrudWin.getCreate().setActionCommand("CREATE PR");

		prCrudWin.getDelete().addActionListener(this);
		prCrudWin.getDelete().setActionCommand("DELETE PR");

		prCrudWin.getUpdate().addActionListener(this);
		prCrudWin.getUpdate().setActionCommand("SELECT UPDATE PR");

		prCrudWin.getFilter().addActionListener(this);
		prCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE PR");

		panCrudWin.getExit().addActionListener(this);
		panCrudWin.getExit().setActionCommand("EXIT");

		panCrudWin.getBack().addActionListener(this);
		panCrudWin.getBack().setActionCommand("BACK CRUD PANAMA");

		panCrudWin.getCreate().addActionListener(this);
		panCrudWin.getCreate().setActionCommand("CREATE PAN");

		panCrudWin.getDelete().addActionListener(this);
		panCrudWin.getDelete().setActionCommand("DELETE PAN");

		panCrudWin.getUpdate().addActionListener(this);
		panCrudWin.getUpdate().setActionCommand("SELECT UPDATE PAN");

		panCrudWin.getFilter().addActionListener(this);
		panCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE PAN");

		uruCrudWin.getExit().addActionListener(this);
		uruCrudWin.getExit().setActionCommand("EXIT");

		uruCrudWin.getBack().addActionListener(this);
		uruCrudWin.getBack().setActionCommand("BACK CRUD URUGUAY");

		uruCrudWin.getCreate().addActionListener(this);
		uruCrudWin.getCreate().setActionCommand("CREATE URU");

		uruCrudWin.getDelete().addActionListener(this);
		uruCrudWin.getDelete().setActionCommand("DELETE URU");

		uruCrudWin.getUpdate().addActionListener(this);
		uruCrudWin.getUpdate().setActionCommand("SELECT UPDATE URU");

		uruCrudWin.getFilter().addActionListener(this);
		uruCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE URU");

		jamCrudWin.getExit().addActionListener(this);
		jamCrudWin.getExit().setActionCommand("EXIT");

		jamCrudWin.getBack().addActionListener(this);
		jamCrudWin.getBack().setActionCommand("BACK CRUD JAMAICA");

		jamCrudWin.getCreate().addActionListener(this);
		jamCrudWin.getCreate().setActionCommand("CREATE JAM");

		jamCrudWin.getDelete().addActionListener(this);
		jamCrudWin.getDelete().setActionCommand("DELETE JAM");

		jamCrudWin.getUpdate().addActionListener(this);
		jamCrudWin.getUpdate().setActionCommand("SELECT UPDATE JAM");

		jamCrudWin.getFilter().addActionListener(this);
		jamCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE JAM");

		triniTobCrudWin.getExit().addActionListener(this);
		triniTobCrudWin.getExit().setActionCommand("EXIT");

		triniTobCrudWin.getBack().addActionListener(this);
		triniTobCrudWin.getBack().setActionCommand("BACK CRUD TRINIDAD Y TOBAGO");

		triniTobCrudWin.getCreate().addActionListener(this);
		triniTobCrudWin.getCreate().setActionCommand("CREATE TYT");

		triniTobCrudWin.getDelete().addActionListener(this);
		triniTobCrudWin.getDelete().setActionCommand("DELETE TYT");

		triniTobCrudWin.getUpdate().addActionListener(this);
		triniTobCrudWin.getUpdate().setActionCommand("SELECT UPDATE TYT");

		triniTobCrudWin.getFilter().addActionListener(this);
		triniTobCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE TYT");

		haiCrudWin.getExit().addActionListener(this);
		haiCrudWin.getExit().setActionCommand("EXIT");

		haiCrudWin.getBack().addActionListener(this);
		haiCrudWin.getBack().setActionCommand("BACK CRUD HAITI");

		haiCrudWin.getCreate().addActionListener(this);
		haiCrudWin.getCreate().setActionCommand("CREATE HAI");

		haiCrudWin.getDelete().addActionListener(this);
		haiCrudWin.getDelete().setActionCommand("DELETE HAI");

		haiCrudWin.getUpdate().addActionListener(this);
		haiCrudWin.getUpdate().setActionCommand("SELECT UPDATE HAI");

		haiCrudWin.getFilter().addActionListener(this);
		haiCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE HAI");

		guyCrudWin.getExit().addActionListener(this);
		guyCrudWin.getExit().setActionCommand("EXIT");

		guyCrudWin.getBack().addActionListener(this);
		guyCrudWin.getBack().setActionCommand("BACK CRUD GUYANA");

		guyCrudWin.getCreate().addActionListener(this);
		guyCrudWin.getCreate().setActionCommand("CREATE GUY");

		guyCrudWin.getDelete().addActionListener(this);
		guyCrudWin.getDelete().setActionCommand("DELETE GUY");

		guyCrudWin.getUpdate().addActionListener(this);
		guyCrudWin.getUpdate().setActionCommand("SELECT UPDATE GUY");

		guyCrudWin.getFilter().addActionListener(this);
		guyCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE GUY");

		belCrudWin.getExit().addActionListener(this);
		belCrudWin.getExit().setActionCommand("EXIT");

		belCrudWin.getBack().addActionListener(this);
		belCrudWin.getBack().setActionCommand("BACK CRUD BELICE");

		belCrudWin.getCreate().addActionListener(this);
		belCrudWin.getCreate().setActionCommand("CREATE BEL");

		belCrudWin.getDelete().addActionListener(this);
		belCrudWin.getDelete().setActionCommand("DELETE BEL");

		belCrudWin.getUpdate().addActionListener(this);
		belCrudWin.getUpdate().setActionCommand("SELECT UPDATE BEL");

		belCrudWin.getFilter().addActionListener(this);
		belCrudWin.getFilter().setActionCommand("SELECT FILTER TYPE BEL");

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
		case "DELETE COL": {

			deleteWin.setVisible(true);
			colCrudWin.setVisible(false);
			fillBoxSelectDeletePackage(0);
			break;

		}
		case "SELECT UPDATE COL": {

			fillBoxSelectUpdatePackage(0);
			selPackUpdateWin.setVisible(true);
			colCrudWin.setVisible(false);
			break;

		}
		case "SELECT FILTER TYPE COL": {

			selFilterTypeWin.setVisible(true);
			colCrudWin.setVisible(false);
			break;
		}
		case "SURINAM CRUD": {
			countryActual = "SURINAM";
			currencyActual = "SRD";
			surinamCrudWin.setVisible(true);
			selCountryWin.setVisible(false);
			break;
		}
		case "BACK CRUD SURINAM": {

			selCountryWin.setVisible(true);
			surinamCrudWin.setVisible(false);
			break;

		}
		case "CREATE SURINAM": {

			createWin.setVisible(true);
			surinamCrudWin.setVisible(false);
			break;
		}
		case "DELETE SURINAM": {

			deleteWin.setVisible(true);
			surinamCrudWin.setVisible(false);
			fillBoxSelectDeletePackage(0);
			break;

		}
		case "SELECT UPDATE SURINAM": {

			fillBoxSelectUpdatePackage(0);
			selPackUpdateWin.setVisible(true);
			surinamCrudWin.setVisible(false);
			break;

		}
		case "SELECT FILTER TYPE SURINAM": {

			selFilterTypeWin.setVisible(true);
			surinamCrudWin.setVisible(false);
			break;
		}
		case "MEXICO CRUD": {
			countryActual = "MEXICO";
			currencyActual = "MXV";
			mexCrudWin.setVisible(true);
			selCountryWin.setVisible(false);
			break;
		}
		case "BACK CRUD MEXICO": {

			selCountryWin.setVisible(true);
			mexCrudWin.setVisible(false);
			break;

		}
		case "CREATE MEXICO": {

			createWin.setVisible(true);
			mexCrudWin.setVisible(false);
			break;
		}
		case "DELETE MEXICO": {

			deleteWin.setVisible(true);
			mexCrudWin.setVisible(false);
			fillBoxSelectDeletePackage(0);
			break;

		}
		case "SELECT UPDATE MEXICO": {

			fillBoxSelectUpdatePackage(0);
			selPackUpdateWin.setVisible(true);
			mexCrudWin.setVisible(false);
			break;

		}
		case "SELECT FILTER TYPE MEXICO": {

			selFilterTypeWin.setVisible(true);
			mexCrudWin.setVisible(false);
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
		case "BACK CREATE": {
			backCreate();
			createWin.getSerialNumber().setText("");
			createWin.getPackageContent().setText("");
			createWin.getTransmitterName().setText("");
			createWin.getReceiverName().setText("");
			createWin.getWeight().setText("");
			break;
		}

		case "DELETE PACKAGE": {
			deletePackage();
			backDelete();
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

			mexCrudWin.setVisible(true);
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

			surinamCrudWin.setVisible(true);
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

			mexCrudWin.setVisible(true);
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

			surinamCrudWin.setVisible(true);
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

			mexCrudWin.setVisible(true);
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

			surinamCrudWin.setVisible(true);
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

			mexCrudWin.setVisible(true);
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

			surinamCrudWin.setVisible(true);
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
