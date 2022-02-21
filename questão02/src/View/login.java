package View;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

import javax.swing.border.TitledBorder;

public class login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPaneLogin;
	private JTextField textFieldNomeDoUsuario;
	private JTextField textFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 420);
		contentPaneLogin = new JPanel();
		contentPaneLogin.setBackground(Color.WHITE);
		contentPaneLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneLogin);
		contentPaneLogin.setLayout(null);

		JPanel panel_1Esquerda = new JPanel();
		panel_1Esquerda.setBackground(SystemColor.inactiveCaption);
		panel_1Esquerda
				.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1Esquerda.setBounds(-6, -16, 312, 403);
		contentPaneLogin.add(panel_1Esquerda);
		panel_1Esquerda.setLayout(null);

		JPanel panelFundo = new JPanel();
		panelFundo.setBounds(6, 16, 300, 381);
		panel_1Esquerda.add(panelFundo);
		panelFundo.setBackground(SystemColor.inactiveCaption);
		panelFundo.setLayout(null);

		JLabel ImagemLogin = new JLabel("");
		ImagemLogin.setBounds(52, 141, 198, 102);
		ImagemLogin.setIcon(new ImageIcon(login.class.getResource("/View/imagem/Imagem entrada.png")));
		panelFundo.add(ImagemLogin);

		Button buttonEntrar = new Button("Entrar");
		buttonEntrar.setFont(new Font("Arial Black", Font.BOLD, 16));
		buttonEntrar.setForeground(Color.WHITE);
		buttonEntrar.setBackground(SystemColor.activeCaption);
		this.dispose();
		buttonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonEntrar.setBounds(351, 226, 306, 32);
		contentPaneLogin.add(buttonEntrar);

		Button buttonCriarNovaConta = new Button("Criar nova conta");
		buttonCriarNovaConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TelaCadastro pi = new TelaCadastro ();

			}

		});

		buttonCriarNovaConta.setFont(new Font("Arial Black", Font.BOLD, 16));
		buttonCriarNovaConta.setForeground(SystemColor.text);
		buttonCriarNovaConta.setBackground(SystemColor.textHighlight);
		buttonCriarNovaConta.setBounds(398, 295, 220, 32);
		contentPaneLogin.add(buttonCriarNovaConta);

		textFieldNomeDoUsuario = new JTextField();
		textFieldNomeDoUsuario.setBounds(351, 77, 246, 20);
		contentPaneLogin.add(textFieldNomeDoUsuario);
		textFieldNomeDoUsuario.setColumns(10);

		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(351, 154, 246, 20);
		contentPaneLogin.add(textFieldSenha);
		textFieldSenha.setColumns(10);

		JLabel lblNewLabelNome = new JLabel("Nome do usu\u00E1rio");
		lblNewLabelNome.setBounds(351, 48, 220, 18);
		contentPaneLogin.add(lblNewLabelNome);

		JLabel lblNewLabelSenha = new JLabel("Senha");
		lblNewLabelSenha.setBounds(351, 129, 46, 14);
		contentPaneLogin.add(lblNewLabelSenha);
	}

}
