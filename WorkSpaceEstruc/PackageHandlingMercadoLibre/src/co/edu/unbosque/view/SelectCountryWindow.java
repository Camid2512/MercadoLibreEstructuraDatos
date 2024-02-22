package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelectCountryWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1498687483865480360L;

	private JLabel mainImage;
	private JButton surinamBtn, argentinBtn, venezuelBtn, peruBtn, chileBtn, mexicoBtn, ecuadorBtn, guatBtn, colBtn,
			cubaBtn, bolBtn, repDomBtn, honduBtn, paraguayBtn, salvadorBtn, nicaraguaBtn, costRicaBtn, puertRicoBtn,
			panamaBtn, uruguayBtn, jamaicaBtn, trinTobaBtn, haitiBtn, guyanaBtn, beliceBtn, exit;

	public SelectCountryWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Seleccion Pais");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		exit = new JButton();
		exit.setBounds(1107, 15, 125, 69);
		exit.setToolTipText("SALIR");
		exit.setBackground(new Color(0, 0, 0, 0));
		exit.setOpaque(false);
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		add(exit);

		surinamBtn = new JButton();
		surinamBtn.setBounds(22, 234, 123, 123);
		surinamBtn.setToolTipText("SURINAM");
		surinamBtn.setBackground(new Color(0, 0, 0, 0));
		surinamBtn.setOpaque(false);
		surinamBtn.setContentAreaFilled(false);
		surinamBtn.setBorderPainted(false);
		add(surinamBtn);

		argentinBtn = new JButton();
		argentinBtn.setBounds(165, 234, 123, 123);
		argentinBtn.setToolTipText("ARGENTINA");
		argentinBtn.setBackground(new Color(0, 0, 0, 0));
		argentinBtn.setOpaque(false);
		argentinBtn.setContentAreaFilled(false);
		argentinBtn.setBorderPainted(false);
		add(argentinBtn);

		venezuelBtn = new JButton();
		venezuelBtn.setBounds(300, 234, 123, 123);
		venezuelBtn.setToolTipText("VENEZUELA");
		venezuelBtn.setBackground(new Color(0, 0, 0, 0));
		venezuelBtn.setOpaque(false);
		venezuelBtn.setContentAreaFilled(false);
		venezuelBtn.setBorderPainted(false);
		add(venezuelBtn);

		peruBtn = new JButton();
		peruBtn.setBounds(433, 234, 123, 123);
		peruBtn.setToolTipText("PERU");
		peruBtn.setBackground(new Color(0, 0, 0, 0));
		peruBtn.setOpaque(false);
		peruBtn.setContentAreaFilled(false);
		peruBtn.setBorderPainted(false);
		add(peruBtn);

		chileBtn = new JButton();
		chileBtn.setBounds(573, 234, 123, 123);
		chileBtn.setToolTipText("CHILE");
		chileBtn.setBackground(new Color(0, 0, 0, 0));
		chileBtn.setOpaque(false);
		chileBtn.setContentAreaFilled(false);
		chileBtn.setBorderPainted(false);
		add(chileBtn);

		mexicoBtn = new JButton();
		mexicoBtn.setBounds(708, 234, 123, 123);
		mexicoBtn.setToolTipText("MEXICO");
		mexicoBtn.setBackground(new Color(0, 0, 0, 0));
		mexicoBtn.setOpaque(false);
		mexicoBtn.setContentAreaFilled(false);
		mexicoBtn.setBorderPainted(false);
		add(mexicoBtn);

		ecuadorBtn = new JButton();
		ecuadorBtn.setBounds(845, 234, 123, 123);
		ecuadorBtn.setToolTipText("ECUADOR");
		ecuadorBtn.setBackground(new Color(0, 0, 0, 0));
		ecuadorBtn.setOpaque(false);
		ecuadorBtn.setContentAreaFilled(false);
		ecuadorBtn.setBorderPainted(false);
		add(ecuadorBtn);

		guatBtn = new JButton();
		guatBtn.setBounds(983, 234, 123, 123);
		guatBtn.setToolTipText("GUATEMALA");
		guatBtn.setBackground(new Color(0, 0, 0, 0));
		guatBtn.setOpaque(false);
		guatBtn.setContentAreaFilled(false);
		guatBtn.setBorderPainted(false);
		add(guatBtn);

		colBtn = new JButton();
		colBtn.setBounds(1117, 234, 123, 123);
		colBtn.setToolTipText("COLOMBIA");
		colBtn.setBackground(new Color(0, 0, 0, 0));
		colBtn.setOpaque(false);
		colBtn.setContentAreaFilled(false);
		colBtn.setBorderPainted(false);
		add(colBtn);

		cubaBtn = new JButton();
		cubaBtn.setBounds(28, 372, 123, 123);
		cubaBtn.setToolTipText("CUBA");
		cubaBtn.setBackground(new Color(0, 0, 0, 0));
		cubaBtn.setOpaque(false);
		cubaBtn.setContentAreaFilled(false);
		cubaBtn.setBorderPainted(false);
		add(cubaBtn);

		bolBtn = new JButton();
		bolBtn.setBounds(178, 372, 123, 123);
		bolBtn.setToolTipText("BOLIVIA");
		bolBtn.setBackground(new Color(0, 0, 0, 0));
		bolBtn.setOpaque(false);
		bolBtn.setContentAreaFilled(false);
		bolBtn.setBorderPainted(false);
		add(bolBtn);

		repDomBtn = new JButton();
		repDomBtn.setBounds(336, 372, 123, 123);
		repDomBtn.setToolTipText("REPUBLICA DOMINICANA");
		repDomBtn.setBackground(new Color(0, 0, 0, 0));
		repDomBtn.setOpaque(false);
		repDomBtn.setContentAreaFilled(false);
		repDomBtn.setBorderPainted(false);
		add(repDomBtn);

		honduBtn = new JButton();
		honduBtn.setBounds(496, 372, 123, 123);
		honduBtn.setToolTipText("HONDURAS");
		honduBtn.setBackground(new Color(0, 0, 0, 0));
		honduBtn.setOpaque(false);
		honduBtn.setContentAreaFilled(false);
		honduBtn.setBorderPainted(false);
		add(honduBtn);

		paraguayBtn = new JButton();
		paraguayBtn.setBounds(654, 372, 123, 123);
		paraguayBtn.setToolTipText("PARAGUAY");
		paraguayBtn.setBackground(new Color(0, 0, 0, 0));
		paraguayBtn.setOpaque(false);
		paraguayBtn.setContentAreaFilled(false);
		paraguayBtn.setBorderPainted(false);
		add(paraguayBtn);

		salvadorBtn = new JButton();
		salvadorBtn.setBounds(812, 372, 123, 123);
		salvadorBtn.setToolTipText("SALVADOR");
		salvadorBtn.setBackground(new Color(0, 0, 0, 0));
		salvadorBtn.setOpaque(false);
		salvadorBtn.setContentAreaFilled(false);
		salvadorBtn.setBorderPainted(false);
		add(salvadorBtn);

		nicaraguaBtn = new JButton();
		nicaraguaBtn.setBounds(970, 372, 123, 123);
		nicaraguaBtn.setToolTipText("NICARAGUA");
		nicaraguaBtn.setBackground(new Color(0, 0, 0, 0));
		nicaraguaBtn.setOpaque(false);
		nicaraguaBtn.setContentAreaFilled(false);
		nicaraguaBtn.setBorderPainted(false);
		add(nicaraguaBtn);

		costRicaBtn = new JButton();
		costRicaBtn.setBounds(1128, 372, 123, 123);
		costRicaBtn.setToolTipText("COSTA RICA");
		costRicaBtn.setBackground(new Color(0, 0, 0, 0));
		costRicaBtn.setOpaque(false);
		costRicaBtn.setContentAreaFilled(false);
		costRicaBtn.setBorderPainted(false);
		add(costRicaBtn);

		// TERCERA FILA
		puertRicoBtn = new JButton();
		puertRicoBtn.setBounds(28, 509, 123, 123);
		puertRicoBtn.setToolTipText("COSTA RICA");
		puertRicoBtn.setBackground(new Color(0, 0, 0, 0));
		puertRicoBtn.setOpaque(false);
		puertRicoBtn.setContentAreaFilled(false);
		puertRicoBtn.setBorderPainted(false);
		add(puertRicoBtn);

		panamaBtn = new JButton();
		panamaBtn.setBounds(178, 509, 123, 123);
		panamaBtn.setToolTipText("PANAMA");
		panamaBtn.setBackground(new Color(0, 0, 0, 0));
		panamaBtn.setOpaque(false);
		panamaBtn.setContentAreaFilled(false);
		panamaBtn.setBorderPainted(false);
		add(panamaBtn);

		uruguayBtn = new JButton();
		uruguayBtn.setBounds(336, 509, 123, 123);
		uruguayBtn.setToolTipText("URUGUAY");
		uruguayBtn.setBackground(new Color(0, 0, 0, 0));
		uruguayBtn.setOpaque(false);
		uruguayBtn.setContentAreaFilled(false);
		uruguayBtn.setBorderPainted(false);
		add(uruguayBtn);

		jamaicaBtn = new JButton();
		jamaicaBtn.setBounds(496, 509, 123, 123);
		jamaicaBtn.setToolTipText("JAMAICA");
		jamaicaBtn.setBackground(new Color(0, 0, 0, 0));
		jamaicaBtn.setOpaque(false);
		jamaicaBtn.setContentAreaFilled(false);
		jamaicaBtn.setBorderPainted(false);
		add(jamaicaBtn);

		trinTobaBtn = new JButton();
		trinTobaBtn.setBounds(654, 509, 123, 123);
		trinTobaBtn.setToolTipText("TRINIDAD Y TOBAGO");
		trinTobaBtn.setBackground(new Color(0, 0, 0, 0));
		trinTobaBtn.setOpaque(false);
		trinTobaBtn.setContentAreaFilled(false);
		trinTobaBtn.setBorderPainted(false);
		add(trinTobaBtn);

		haitiBtn = new JButton();
		haitiBtn.setBounds(812, 509, 123, 123);
		haitiBtn.setToolTipText("HAITI");
		haitiBtn.setBackground(new Color(0, 0, 0, 0));
		haitiBtn.setOpaque(false);
		haitiBtn.setContentAreaFilled(false);
		haitiBtn.setBorderPainted(false);
		add(haitiBtn);

		guyanaBtn = new JButton();
		guyanaBtn.setBounds(970, 509, 123, 123);
		guyanaBtn.setToolTipText("GUYANA");
		guyanaBtn.setBackground(new Color(0, 0, 0, 0));
		guyanaBtn.setOpaque(false);
		guyanaBtn.setContentAreaFilled(false);
		guyanaBtn.setBorderPainted(false);
		add(guyanaBtn);

		beliceBtn = new JButton();
		beliceBtn.setBounds(1128, 509, 123, 123);
		beliceBtn.setToolTipText("BELICE");
		beliceBtn.setBackground(new Color(0, 0, 0, 0));
		beliceBtn.setOpaque(false);
		beliceBtn.setContentAreaFilled(false);
		beliceBtn.setBorderPainted(false);
		add(beliceBtn);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/seleccionarpais.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getSurinamBtn() {
		return surinamBtn;
	}

	public void setSurinamBtn(JButton surinamBtn) {
		this.surinamBtn = surinamBtn;
	}

	public JButton getArgentinBtn() {
		return argentinBtn;
	}

	public void setArgentinBtn(JButton argentinBtn) {
		this.argentinBtn = argentinBtn;
	}

	public JButton getVenezuelBtn() {
		return venezuelBtn;
	}

	public void setVenezuelBtn(JButton venezuelBtn) {
		this.venezuelBtn = venezuelBtn;
	}

	public JButton getPeruBtn() {
		return peruBtn;
	}

	public void setPeruBtn(JButton peruBtn) {
		this.peruBtn = peruBtn;
	}

	public JButton getChileBtn() {
		return chileBtn;
	}

	public void setChileBtn(JButton chileBtn) {
		this.chileBtn = chileBtn;
	}

	public JButton getMexicoBtn() {
		return mexicoBtn;
	}

	public void setMexicoBtn(JButton mexicoBtn) {
		this.mexicoBtn = mexicoBtn;
	}

	public JButton getEcuadorBtn() {
		return ecuadorBtn;
	}

	public void setEcuadorBtn(JButton ecuadorBtn) {
		this.ecuadorBtn = ecuadorBtn;
	}

	public JButton getGuatBtn() {
		return guatBtn;
	}

	public void setGuatBtn(JButton guatBtn) {
		this.guatBtn = guatBtn;
	}

	public JButton getColBtn() {
		return colBtn;
	}

	public void setColBtn(JButton colBtn) {
		this.colBtn = colBtn;
	}

	public JButton getCubaBtn() {
		return cubaBtn;
	}

	public void setCubaBtn(JButton cubaBtn) {
		this.cubaBtn = cubaBtn;
	}

	public JButton getBolBtn() {
		return bolBtn;
	}

	public void setBolBtn(JButton bolBtn) {
		this.bolBtn = bolBtn;
	}

	public JButton getRepDomBtn() {
		return repDomBtn;
	}

	public void setRepDomBtn(JButton repDomBtn) {
		this.repDomBtn = repDomBtn;
	}

	public JButton getHonduBtn() {
		return honduBtn;
	}

	public void setHonduBtn(JButton honduBtn) {
		this.honduBtn = honduBtn;
	}

	public JButton getParaguayBtn() {
		return paraguayBtn;
	}

	public void setParaguayBtn(JButton paraguayBtn) {
		this.paraguayBtn = paraguayBtn;
	}

	public JButton getSalvadorBtn() {
		return salvadorBtn;
	}

	public void setSalvadorBtn(JButton salvadorBtn) {
		this.salvadorBtn = salvadorBtn;
	}

	public JButton getNicaraguaBtn() {
		return nicaraguaBtn;
	}

	public void setNicaraguaBtn(JButton nicaraguaBtn) {
		this.nicaraguaBtn = nicaraguaBtn;
	}

	public JButton getCostRicaBtn() {
		return costRicaBtn;
	}

	public void setCostRicaBtn(JButton costRicaBtn) {
		this.costRicaBtn = costRicaBtn;
	}

	public JButton getPuertRicoBtn() {
		return puertRicoBtn;
	}

	public void setPuertRicoBtn(JButton puertRicoBtn) {
		this.puertRicoBtn = puertRicoBtn;
	}

	public JButton getPanamaBtn() {
		return panamaBtn;
	}

	public void setPanamaBtn(JButton panamaBtn) {
		this.panamaBtn = panamaBtn;
	}

	public JButton getUruguayBtn() {
		return uruguayBtn;
	}

	public void setUruguayBtn(JButton uruguayBtn) {
		this.uruguayBtn = uruguayBtn;
	}

	public JButton getJamaicaBtn() {
		return jamaicaBtn;
	}

	public void setJamaicaBtn(JButton jamaicaBtn) {
		this.jamaicaBtn = jamaicaBtn;
	}

	public JButton getTrinTobaBtn() {
		return trinTobaBtn;
	}

	public void setTrinTobaBtn(JButton trinTobaBtn) {
		this.trinTobaBtn = trinTobaBtn;
	}

	public JButton getHaitiBtn() {
		return haitiBtn;
	}

	public void setHaitiBtn(JButton haitiBtn) {
		this.haitiBtn = haitiBtn;
	}

	public JButton getGuyanaBtn() {
		return guyanaBtn;
	}

	public void setGuyanaBtn(JButton guyanaBtn) {
		this.guyanaBtn = guyanaBtn;
	}

	public JButton getBeliceBtn() {
		return beliceBtn;
	}

	public void setBeliceBtn(JButton beliceBtn) {
		this.beliceBtn = beliceBtn;
	}

}
