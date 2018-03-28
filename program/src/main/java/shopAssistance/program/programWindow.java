package shopAssistance.program;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class programWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtNazwaProduktu;
	private JTextField txtKategoriaProduktu;
	private JTextField txtKodProdutku;
	private JTextField txtCena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					programWindow frame = new programWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public programWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1142, 511);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpcje = new JMenu("Opcje");
		menuBar.add(mnOpcje);
		
		JMenuItem mntmDodajNowy = new JMenuItem("Dodaj nowy");
		mnOpcje.add(mntmDodajNowy);
		
		JMenuItem mntmInfo = new JMenuItem("Info");
		menuBar.add(mntmInfo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSprzedaTowarw = new JLabel("Sprzedaż towarów");
		lblSprzedaTowarw.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblSprzedaTowarw.setBounds(12, 13, 186, 34);
		contentPane.add(lblSprzedaTowarw);
		
		JLabel lblWyszukiwarkaTowaru = new JLabel("Wyszukiwarka towaru");
		lblWyszukiwarkaTowaru.setBounds(12, 60, 186, 16);
		contentPane.add(lblWyszukiwarkaTowaru);
		
		txtNazwaProduktu = new JTextField();
		txtNazwaProduktu.setText("Nazwa produktu");
		txtNazwaProduktu.setBounds(12, 89, 158, 22);
		contentPane.add(txtNazwaProduktu);
		txtNazwaProduktu.setColumns(10);
		
		txtKategoriaProduktu = new JTextField();
		txtKategoriaProduktu.setText("Kategoria produktu");
		txtKategoriaProduktu.setBounds(12, 124, 158, 22);
		contentPane.add(txtKategoriaProduktu);
		txtKategoriaProduktu.setColumns(10);
		
		txtKodProdutku = new JTextField();
		txtKodProdutku.setText("Kod produtku");
		txtKodProdutku.setBounds(12, 159, 158, 22);
		contentPane.add(txtKodProdutku);
		txtKodProdutku.setColumns(10);
		
		txtCena = new JTextField();
		txtCena.setText("Cena");
		txtCena.setBounds(12, 194, 158, 22);
		contentPane.add(txtCena);
		txtCena.setColumns(10);
		
		JLabel lblListaProdukt = new JLabel("Lista produktów");
		lblListaProdukt.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblListaProdukt.setBounds(622, 13, 163, 34);
		contentPane.add(lblListaProdukt);
		
		TextField textField = new TextField();
		textField.setBounds(622, 60, 392, 180);
		contentPane.add(textField);
		
		Button button = new Button("Wyszukaj");
		button.setBounds(245, 192, 79, 24);
		contentPane.add(button);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(10, 265, 382, 148);
		contentPane.add(textField_1);
		
		JLabel lblWyszukaneProdukty = new JLabel("Wyszukane produkty");
		lblWyszukaneProdukty.setBounds(12, 243, 158, 16);
		contentPane.add(lblWyszukaneProdukty);
		
		Button button_1 = new Button("Dodaj");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(245, 157, 79, 24);
		contentPane.add(button_1);
	}
}
