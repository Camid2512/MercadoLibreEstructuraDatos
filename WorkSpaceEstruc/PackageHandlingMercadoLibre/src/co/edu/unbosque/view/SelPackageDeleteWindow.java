package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelPackageDeleteWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8295868685312965358L;

	private JLabel mainImage;
	private JButton exit, back, delete;
	private JComboBox<Long> select;

	public SelPackageDeleteWindow() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Eliminar Paquete");
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

		select = new JComboBox<>();
		select.setBounds(320, 376, 633, 46);
		select.setBackground(new Color(225, 223, 228));
		select.setForeground(Color.black);
		select.setFont(new Font("Arial", 1, 25));
		add(select);

		delete = new JButton();
		delete.setBounds(521, 459, 238, 55);
		delete.setToolTipText("ELIMINAR");
		delete.setBackground(new Color(0, 0, 0, 0));
		delete.setOpaque(false);
		delete.setContentAreaFilled(false);
		delete.setBorderPainted(false);
		add(delete);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/eliminar.png").getImage();

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

	public JButton getDelete() {
		return delete;
	}

	public void setDelete(JButton delete) {
		this.delete = delete;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JComboBox<Long> getSelect() {
		return select;
	}

	public void setSelect(JComboBox<Long> select) {
		this.select = select;
	}

}
