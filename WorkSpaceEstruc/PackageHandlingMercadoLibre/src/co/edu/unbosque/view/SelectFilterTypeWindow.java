package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelectFilterTypeWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1096794319769407597L;

	private JLabel mainImage;
	private JButton exit, back, filter;
	private JComboBox<String> select;

	public SelectFilterTypeWindow() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Seleccionar paquete a actualizar");
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
		select.addItem("Numero de serie");
		select.addItem("Contenido del paquete");
		select.addItem("Nombre emisor");
		select.addItem("Nombre receptor");
		select.addItem("Peso");
		select.setBackground(new Color(225, 223, 228));
		select.setForeground(Color.black);
		select.setFont(new Font("Arial", 1, 25));
		add(select);

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
		temporal1 = new ImageIcon("src/Images/selactualizar.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}
}
