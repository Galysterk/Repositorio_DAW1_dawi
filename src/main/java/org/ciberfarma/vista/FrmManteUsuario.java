package org.ciberfarma.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmManteUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtUsuario;
	private JTextField txtClave;
	private JTextField txtFecha;
	private JTextField txtTipo;
	private JTextField txtEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmManteUsuario frame = new FrmManteUsuario();
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
	public FrmManteUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblmantdeUsuarios = new JLabel("Mantenimiento de Usuarios");
		lblmantdeUsuarios.setBounds(10, 11, 137, 14);
		contentPane.add(lblmantdeUsuarios);
		
		JLabel lblcodUsuario = new JLabel("Codigo: ");
		lblcodUsuario.setBounds(10, 36, 76, 14);
		contentPane.add(lblcodUsuario);
		
		JLabel lblnomUsuario = new JLabel("Nombre: ");
		lblnomUsuario.setBounds(10, 62, 76, 14);
		contentPane.add(lblnomUsuario);
		
		JLabel lblapeUsuario = new JLabel("Apellido: ");
		lblapeUsuario.setBounds(10, 87, 76, 14);
		contentPane.add(lblapeUsuario);
		
		JLabel lblusuUsuario = new JLabel("Usuario: ");
		lblusuUsuario.setBounds(10, 112, 76, 14);
		contentPane.add(lblusuUsuario);
		
		JLabel lblclaUsuario = new JLabel("Clave: ");
		lblclaUsuario.setBounds(10, 137, 76, 14);
		contentPane.add(lblclaUsuario);
		
		JLabel lblfecUsuario = new JLabel("Fecha: ");
		lblfecUsuario.setBounds(10, 162, 46, 14);
		contentPane.add(lblfecUsuario);
		
		JLabel lbltipUsuario = new JLabel("Tipo: ");
		lbltipUsuario.setBounds(10, 187, 76, 14);
		contentPane.add(lbltipUsuario);
		
		JLabel lblestUsuario = new JLabel("Estado: ");
		lblestUsuario.setBounds(10, 212, 46, 14);
		contentPane.add(lblestUsuario);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(96, 33, 150, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(96, 59, 150, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(96, 84, 150, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(96, 109, 150, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtClave = new JTextField();
		txtClave.setBounds(96, 134, 150, 20);
		contentPane.add(txtClave);
		txtClave.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(96, 159, 150, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(96, 184, 150, 20);
		contentPane.add(txtTipo);
		txtTipo.setColumns(10);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(96, 209, 150, 20);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(335, 32, 89, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(335, 133, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(335, 83, 89, 23);
		contentPane.add(btnActualizar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(335, 183, 89, 23);
		contentPane.add(btnConsultar);
	}
}
