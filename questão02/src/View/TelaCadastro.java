package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro window = new TelaCadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Cadastre-se");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 0, 232, 45);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u00C9 rapido e f\u00E1cil");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(20, 40, 117, 18);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nome: ");
		lblNewLabel_2.setBounds(34, 97, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		txtNome = new JTextField();
		txtNome.setBounds(90, 94, 119, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Senha:");
		lblNewLabel_3.setBounds(34, 135, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);

		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(90, 132, 119, 20);
		frame.getContentPane().add(txtSenha);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(TelaCadastro.class.getResource("/View/imagem/Imagem entrada.png")));
		lblNewLabel_4.setBounds(219, 40, 192, 119);
		frame.getContentPane().add(lblNewLabel_4);

		JButton btnNewButton = new JButton("Cadastre-se");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome_usuario;
				String senha_usuario;

				nome_usuario = txtNome.getText();
				senha_usuario = txtSenha.getText();
				if (txtNome.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "O Campo Usuário está vazio");

				}

				boolean valid = false;
				if (senha_usuario.length() < 6) {
					JOptionPane.showMessageDialog(null, "A senha não tem 6 caracteres");
					valid = false;
				}
				String upperCase = "(.*[A-Z].*)";
				if (!senha_usuario.matches(upperCase)) {
					JOptionPane.showMessageDialog(null, "A senha deve conter pelo menos uma letra maiúscula");
					valid = false;
				}
				String upperCase2 = "(.*[a-z].*)";
				if (!senha_usuario.matches(upperCase2)) {
					JOptionPane.showMessageDialog(null, "A senha deve conter pelo menos uma letra minúscula");
					valid = false;
				}
				String numbers = "(.*[0-9].*)";
				if (!senha_usuario.matches(numbers)) {
					JOptionPane.showMessageDialog(null, "A senha deve conter pelo menos um dígito");
					valid = false;
				}
				String specialChars = "(^(?:(?=.*[!@#$%^&*()-+]).*)$)";
				if (!senha_usuario.matches(specialChars)) {
					JOptionPane.showMessageDialog(null,
							"A senha deve conter pelo menos um destes caractere especiais: ! @ # $ % ^ & * ( ) - + ");
					valid = false;
				}
				else if  (valid) {
					JOptionPane.showMessageDialog(null, "Senha cadastrada com sucesso!");
				}
			}

		});

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setBounds(153, 227, 127, 23);
		frame.getContentPane().add(btnNewButton);

	}

}
