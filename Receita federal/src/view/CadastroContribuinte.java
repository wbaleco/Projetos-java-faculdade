package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class CadastroContribuinte extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeContribuinte;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroContribuinte frame = new CadastroContribuinte();
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
	public CadastroContribuinte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Yu Mincho Light", Font.PLAIN, 14));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cadastro de contribuinte", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(64, 64, 64)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Yu Mincho Light", Font.PLAIN, 16));
		lblNome.setBounds(30, 42, 46, 14);
		panel.add(lblNome);
		
		txtNomeContribuinte = new JTextField();
		txtNomeContribuinte.setToolTipText("Informe o nome do contribuinte");
		txtNomeContribuinte.setBounds(75, 41, 307, 20);
		panel.add(txtNomeContribuinte);
		txtNomeContribuinte.setColumns(10);
		
		JLabel lbl = new JLabel("RG");
		lbl.setFont(new Font("Yu Mincho Light", Font.PLAIN, 16));
		lbl.setBounds(30, 214, 46, 14);
		panel.add(lbl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Yu Mincho Light", Font.PLAIN, 16));
		panel_1.setBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Escolha tipo de pessoa", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(64, 64, 64)), "Escolha tipo de pessoa", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		panel_1.setBounds(75, 94, 307, 86);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("F\u00CDSICA");
		rdbtnNewRadioButton.setFont(new Font("Yu Mincho Light", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(23, 40, 85, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnJurdica = new JRadioButton("JUR\u00CDDICA");
		rdbtnJurdica.setFont(new Font("Yu Mincho Light", Font.PLAIN, 14));
		rdbtnJurdica.setBounds(139, 40, 109, 23);
		panel_1.add(rdbtnJurdica);
		
		textField = new JTextField();
		textField.setBounds(75, 213, 118, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setFont(new Font("Yu Mincho Light", Font.PLAIN, 16));
		lblCnpj.setBounds(203, 212, 46, 19);
		panel.add(lblCnpj);
		
		textField_1 = new JTextField();
		textField_1.setBounds(248, 211, 134, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("Button.background"));
		panel_2.setBounds(416, 42, 193, 189);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\Walter\\Pictures\\student13.png"));
		btnCadastrar.setFont(new Font("Yu Mincho Light", Font.PLAIN, 14));
		btnCadastrar.setBounds(10, 12, 173, 33);
		panel_2.add(btnCadastrar);
		btnCadastrar.setPreferredSize(new Dimension(95, 25));
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.setFont(new Font("Yu Mincho Light", Font.PLAIN, 14));
		btnAlterar.setBounds(39, 56, 118, 33);
		panel_2.add(btnAlterar);
		btnAlterar.setPreferredSize(new Dimension(95, 25));
		
		JButton btnNewButton = new JButton("LIMPAR");
		btnNewButton.setFont(new Font("Yu Mincho Light", Font.PLAIN, 14));
		btnNewButton.setBounds(39, 101, 118, 33);
		panel_2.add(btnNewButton);
		btnNewButton.setPreferredSize(new Dimension(95, 25));
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Yu Mincho Light", Font.PLAIN, 14));
		btnCancelar.setBounds(39, 146, 118, 33);
		panel_2.add(btnCancelar);
		btnCancelar.setPreferredSize(new Dimension(95, 25));
	}
}
