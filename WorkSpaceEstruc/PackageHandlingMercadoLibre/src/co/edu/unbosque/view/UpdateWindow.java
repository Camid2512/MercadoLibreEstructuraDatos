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

public class UpdateWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5763212285548645794L;

	private JLabel mainImage;
	private JTextField serialNumber, packageContent, transmitterName, receiverName, weight;
	private JButton create, exit, back;

	public UpdateWindow() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("UPDATE");
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

		serialNumber = new JTextField();
		serialNumber.setBounds(599, 197, 633, 47);
		serialNumber.setBackground(new Color(0, 0, 0, 0));
		serialNumber.setOpaque(false);
		serialNumber.setBorder(new EmptyBorder(15, 15, 15, 15));
		serialNumber.setFont(new Font("Arial", 1, 25));
		serialNumber.setToolTipText("INGRESE EL NUMERO DE SERIE DEL PAQUETE");
		serialNumber.setForeground(Color.white);
		add(serialNumber);

		packageContent = new JTextField();
		packageContent.setBounds(599, 272, 633, 47);
		packageContent.setBackground(new Color(0, 0, 0, 0));
		packageContent.setOpaque(false);
		packageContent.setBorder(new EmptyBorder(15, 15, 15, 15));
		packageContent.setFont(new Font("Arial", 1, 25));
		packageContent.setToolTipText("INGRESE EL CONTENIDO DEL PAQUETE");
		packageContent.setForeground(Color.white);
		add(packageContent);

		transmitterName = new JTextField();
		transmitterName.setBounds(599, 351, 633, 47);
		transmitterName.setBackground(new Color(0, 0, 0, 0));
		transmitterName.setOpaque(false);
		transmitterName.setBorder(new EmptyBorder(15, 15, 15, 15));
		transmitterName.setFont(new Font("Arial", 1, 25));
		transmitterName.setToolTipText("INGRESE EL NOMBRE DEL QUE ENVIA EL PAQUETE");
		transmitterName.setForeground(Color.white);
		add(transmitterName);

		receiverName = new JTextField();
		receiverName.setBounds(599, 430, 633, 47);
		receiverName.setBackground(new Color(0, 0, 0, 0));
		receiverName.setOpaque(false);
		receiverName.setBorder(new EmptyBorder(15, 15, 15, 15));
		receiverName.setFont(new Font("Arial", 1, 25));
		receiverName.setToolTipText("INGRESE EL NOMBRE DEL QUE RECIBE EL PAQUETE");
		receiverName.setForeground(Color.white);
		add(receiverName);

		weight = new JTextField();
		weight.setBounds(599, 503, 633, 47);
		weight.setBackground(new Color(0, 0, 0, 0));
		weight.setOpaque(false);
		weight.setBorder(new EmptyBorder(15, 15, 15, 15));
		weight.setFont(new Font("Arial", 1, 25));
		weight.setToolTipText("INGRESE EL PESO DEL PAQUETE EN KG");
		weight.setForeground(Color.white);
		add(weight);

		create = new JButton();
		create.setBounds(384, 654, 201, 61);
		create.setToolTipText("CREAR PAQUETE NUEVO");
		create.setBackground(new Color(0, 0, 0, 0));
		create.setOpaque(false);
		create.setContentAreaFilled(false);
		create.setBorderPainted(false);
		add(create);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/crear.png").getImage();

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

	public JTextField getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(JTextField serialNumber) {
		this.serialNumber = serialNumber;
	}

	public JTextField getPackageContent() {
		return packageContent;
	}

	public void setPackageContent(JTextField packageContent) {
		this.packageContent = packageContent;
	}

	public JTextField getTransmitterName() {
		return transmitterName;
	}

	public void setTransmitterName(JTextField transmitterName) {
		this.transmitterName = transmitterName;
	}

	public JTextField getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(JTextField receiverName) {
		this.receiverName = receiverName;
	}

	public JTextField getWeight() {
		return weight;
	}

	public void setWeight(JTextField weight) {
		this.weight = weight;
	}

	public JButton getCreate() {
		return create;
	}

	public void setCreate(JButton create) {
		this.create = create;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

}
