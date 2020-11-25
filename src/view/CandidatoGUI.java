package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CandidatoGUI extends JFrame {
	private JLabel lblInscricao;
	private JLabel lblNome;
	private JTextField txtNome;
	private JLabel lblCpf;
	private JTextField txtCpf;
	private JLabel lblCargo;
	private JRadioButton rdbtnEf;
	private JRadioButton rdbtnEm;
	private JRadioButton rdbtnEs;
	private JButton btnLimpar;
	private JButton btnEnviar;
	ButtonGroup gb;

	public CandidatoGUI() {
		setTitle("CONCURSO - INSCRI\u00C7\u00C3O");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 401);
		getContentPane().setLayout(null);
		
		lblInscricao = new JLabel("INSCRICAO DE CANDIDATO");
		lblInscricao.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInscricao.setBounds(117, 26, 170, 14);
		getContentPane().add(lblInscricao);
		
		lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(117, 66, 44, 14);
		getContentPane().add(lblNome);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCpf.setBounds(117, 122, 44, 14);
		getContentPane().add(lblCpf);
		
		lblCargo = new JLabel("CARGO");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCargo.setBounds(117, 173, 44, 14);
		getContentPane().add(lblCargo);
		
		txtNome = new JTextField();
		txtNome.setBounds(117, 91, 204, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(117, 142, 204, 20);
		getContentPane().add(txtCpf);
		
		rdbtnEf = new JRadioButton("Professor Ensino Fundamental");
		rdbtnEf.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnEf.setBounds(117, 194, 204, 23);
		getContentPane().add(rdbtnEf);
		
		rdbtnEm = new JRadioButton("Professor Ensino Medio");
		rdbtnEm.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnEm.setBounds(117, 220, 204, 23);
		getContentPane().add(rdbtnEm);
		
		rdbtnEs = new JRadioButton("Professor Ensino Superior");
		rdbtnEs.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnEs.setBounds(117, 246, 176, 23);
		getContentPane().add(rdbtnEs);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimpar.setBounds(117, 289, 89, 23);
		getContentPane().add(btnLimpar);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				
				if(nome.equals("") ||cpf.equals("")) {
					JOptionPane.showMessageDialog(getContentPane(), "Voce deve preencher todos os campos", "Atençao", 1);
				}
				else {
					JOptionPane.showMessageDialog(getContentPane(), "DADOS CADASTRADOS COM SUCESSO!", "Mensage", 1);
				}
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnviar.setBounds(216, 289, 89, 23);
		getContentPane().add(btnEnviar);
		
		gb = new ButtonGroup();
		gb.add(rdbtnEf);
		gb.add(rdbtnEm);
		gb.add(rdbtnEs);
		
	}
	
	public void limpar() {
		txtNome.setText("");
		txtCpf.setText("");
		
		if(rdbtnEf.isSelected()||rdbtnEm.isSelected()||rdbtnEs.isSelected()) {
			gb.clearSelection();
		}
	}
	
	
}
