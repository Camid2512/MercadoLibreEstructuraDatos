package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1865397045744303071L;

	private JButton nextStep;
	private JLabel mainImage;

	public MainWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Mercado Libre");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		nextStep = new JButton();
		nextStep.setBounds(464, 527, 351, 64);
		nextStep.setToolTipText("Ingresa al sistema");
		nextStep.setBackground(new Color(0, 0, 0, 0));
		nextStep.setOpaque(false);
		nextStep.setContentAreaFilled(false);
		nextStep.setBorderPainted(false);
		add(nextStep);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/menu.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	public JButton getNextStep() {
		return nextStep;
	}

	public void setNextStep(JButton nextStep) {
		this.nextStep = nextStep;
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

}
