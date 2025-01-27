package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ventana_principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ventana_principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAñadir = new JButton("Añadir usuario");
		btnAñadir.setBounds(106, 82, 222, 45);
		contentPane.add(btnAñadir);
		
		btnAñadir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		JButton btnVerUsuario = new JButton("Ver usuarios");
		btnVerUsuario.setBounds(106, 138, 222, 45);
		contentPane.add(btnVerUsuario);
		
		btnVerUsuario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton btnBorrarUsuario = new JButton("Borrar usuario");
		btnBorrarUsuario.setBounds(106, 194, 222, 45);
		contentPane.add(btnBorrarUsuario);
		
		
		btnBorrarUsuario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel lblSelecciona = new JLabel("Que quieres hacer");
		lblSelecciona.setBounds(174, 41, 88, 14);
		contentPane.add(lblSelecciona);
	}
}
