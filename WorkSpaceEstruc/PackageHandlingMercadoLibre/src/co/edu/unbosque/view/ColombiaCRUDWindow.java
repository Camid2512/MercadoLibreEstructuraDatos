package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColombiaCRUDWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2771132745796486433L;

	private JLabel mainImage;
	private JButton create, read, update, delete, filter;

	public ColombiaCRUDWindow() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("CRUD Colombia");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		create = new JButton();
		create.setBounds(641, 176, 585, 72);
		create.setToolTipText("CREAR");
		create.setBackground(new Color(0, 0, 0, 0));
		create.setOpaque(false);
		create.setContentAreaFilled(false);
		create.setBorderPainted(false);
		add(create);

		delete = new JButton();
		delete.setBounds(641, 276, 585, 72);
		delete.setToolTipText("ELIMINAR");
		delete.setBackground(new Color(0, 0, 0, 0));
		delete.setOpaque(false);
		delete.setContentAreaFilled(false);
		delete.setBorderPainted(false);
		add(delete);

		update = new JButton();
		update.setBounds(641, 374, 585, 72);
		update.setToolTipText("ACTUALIZAR");
		update.setBackground(new Color(0, 0, 0, 0));
		update.setOpaque(false);
		update.setContentAreaFilled(false);
		update.setBorderPainted(false);
		add(update);

		read = new JButton();
		read.setBounds(641, 471, 585, 72);
		read.setToolTipText("MOSTRAR TODOS LOS PAQUETES");
		read.setBackground(new Color(0, 0, 0, 0));
		read.setOpaque(false);
		read.setContentAreaFilled(false);
		read.setBorderPainted(false);
		add(read);

		filter = new JButton();
		filter.setBounds(641, 561, 585, 72);
		filter.setToolTipText("FILTRAR");
		filter.setBackground(new Color(0, 0, 0, 0));
		filter.setOpaque(false);
		filter.setContentAreaFilled(false);
		filter.setBorderPainted(false);
		add(filter);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/CRUD colombia.png").getImage();

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

	public JButton getCreate() {
		return create;
	}

	public void setCreate(JButton create) {
		this.create = create;
	}

	public JButton getRead() {
		return read;
	}

	public void setRead(JButton read) {
		this.read = read;
	}

	public JButton getUpdate() {
		return update;
	}

	public void setUpdate(JButton update) {
		this.update = update;
	}

	public JButton getDelete() {
		return delete;
	}

	public void setDelete(JButton delete) {
		this.delete = delete;
	}

	public JButton getFilter() {
		return filter;
	}

	public void setFilter(JButton filter) {
		this.filter = filter;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
