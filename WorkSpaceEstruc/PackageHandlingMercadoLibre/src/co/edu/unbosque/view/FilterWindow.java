package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FilterWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5181181913778235457L;

	private JLabel mainImage;
	private JButton exit, back, filter;
	private JTextField searchWord;

	public FilterWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("FILTRO");
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

		back = new JButton();
		back.setBounds(46, 670, 70, 32);
		back.setToolTipText("ATRAS");
		back.setBackground(new Color(0, 0, 0, 0));
		back.setOpaque(false);
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		add(back);

		searchWord = new JTextField();
		searchWord.setBounds(320, 376, 633, 46);
		searchWord.setBackground(new Color(0, 0, 0, 0));
		searchWord.setOpaque(false);
		searchWord.setBorder(new EmptyBorder(15, 15, 15, 15));
		searchWord.setFont(new Font("Arial", 1, 25));
		searchWord.setToolTipText("INGRESE LA PALABRA CLAVE");
		searchWord.setForeground(Color.white);
		add(searchWord);

		filter = new JButton();
		filter.setBounds(521, 459, 238, 55);
		filter.setToolTipText("ACTUALIZAR");
		filter.setBackground(new Color(0, 0, 0, 0));
		filter.setOpaque(false);
		filter.setContentAreaFilled(false);
		filter.setBorderPainted(false);
		add(filter);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/filtrar.png").getImage();

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

	public JButton getExit() {
		return exit;
	}

	public void setExit(JButton exit) {
		this.exit = exit;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}

	public JButton getFilter() {
		return filter;
	}

	public void setFilter(JButton filter) {
		this.filter = filter;
	}

	public JTextField getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(JTextField searchWord) {
		this.searchWord = searchWord;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
