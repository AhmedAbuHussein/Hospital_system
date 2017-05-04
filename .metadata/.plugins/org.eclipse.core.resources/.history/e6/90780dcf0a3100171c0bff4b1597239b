
package investigation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import patient.Patient;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.Color;
import java.util.Date;
import java.awt.ScrollPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class investigation extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextArea textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					investigation frame = new investigation();
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
	public investigation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//************Icon For The bage*****************
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Patient.class.getResource("/Images/invs.png")));
		
		//*************************************
		
		setBounds(100, 100, 450, 300);
		setSize(1378, 740);
		
		// ***************the bar in the head of bage*****************
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnPatientRegistration = new JMenu("Patient Registration");
		menuBar.add(mnPatientRegistration);
		
		JMenuItem mntmPatientRegisrations = new JMenuItem("Patient regisrations");
		mnPatientRegistration.add(mntmPatientRegisrations);
		
		JMenuItem mntmSearchPatientDetails = new JMenuItem("Search Patient details");
		mnPatientRegistration.add(mntmSearchPatientDetails);
		
		JMenu mnDoctorManagement = new JMenu("Doctor management");
		menuBar.add(mnDoctorManagement);
		
		JMenuItem mntmDoctorInformation = new JMenuItem("doctor information");
		mnDoctorManagement.add(mntmDoctorInformation);
		
		JMenuItem mntmPatientStatus = new JMenuItem("patient status");
		mnDoctorManagement.add(mntmPatientStatus);
		
		JMenuItem mntmChangePassword = new JMenuItem("change password");
		mnDoctorManagement.add(mntmChangePassword);
		
		JMenu mnPharmacyManagement = new JMenu("Pharmacy management");
		menuBar.add(mnPharmacyManagement);
		
		JMenuItem mntmMedicamentInformation = new JMenuItem("medicament information");
		mnPharmacyManagement.add(mntmMedicamentInformation);
		
		JMenuItem mntmChangePassword_1 = new JMenuItem("change password");
		mnPharmacyManagement.add(mntmChangePassword_1);
		
		JMenu mnInvestigations = new JMenu("Investigations");
		menuBar.add(mnInvestigations);
		
		JMenuItem mntmInvestigationType = new JMenuItem("investigation type");
		mnInvestigations.add(mntmInvestigationType);
		
		JMenuItem mntmPatientStatus_1 = new JMenuItem("patient status");
		mnInvestigations.add(mntmPatientStatus_1);
		
		JMenuItem mntmChangePassword_2 = new JMenuItem("change password");
		mnInvestigations.add(mntmChangePassword_2);
		
		JMenu mnNursing = new JMenu("Nursing");
		menuBar.add(mnNursing);
		
		JMenuItem mntmNurseInformation = new JMenuItem("nurse information");
		mnNursing.add(mntmNurseInformation);
		
		JMenuItem mntmPatientStatus_2 = new JMenuItem("patient status");
		mnNursing.add(mntmPatientStatus_2);
		
		JMenuItem mntmChangePassword_3 = new JMenuItem("change password");
		mnNursing.add(mntmChangePassword_3);
		
		JMenu mnAdminManagement = new JMenu("Admin management");
		menuBar.add(mnAdminManagement);
		
		JMenuItem mntmDoctorInformation_1 = new JMenuItem("doctor information");
		mnAdminManagement.add(mntmDoctorInformation_1);
		
		JMenuItem mntmNurseInformation_1 = new JMenuItem("nurse information");
		mnAdminManagement.add(mntmNurseInformation_1);
		
		JMenuItem mntmPharmacyInformation = new JMenuItem("pharmacy information");
		mnAdminManagement.add(mntmPharmacyInformation);
		
		JMenuItem mntmInvestigationInformation = new JMenuItem("investigation information");
		mnAdminManagement.add(mntmInvestigationInformation);
		
		JMenuItem mntmPatientInformation = new JMenuItem("patient information");
		mnAdminManagement.add(mntmPatientInformation);
		
		JMenuItem mntmChangePassword_4 = new JMenuItem("change password");
		mnAdminManagement.add(mntmChangePassword_4);
		
		JMenu mnReport = new JMenu(" Reports");
		menuBar.add(mnReport);
		
		JMenuItem mntmPatientReport = new JMenuItem("patient report");
		mnReport.add(mntmPatientReport);
		
		JMenuItem mntmPharmacyReport = new JMenuItem("pharmacy report");
		mnReport.add(mntmPharmacyReport);
		
		JMenuItem mntmLaundryReport = new JMenuItem("laundry report");
		mnReport.add(mntmLaundryReport);
		
		JMenu mnLaundryManagement = new JMenu("Laundry management");
		menuBar.add(mnLaundryManagement);
		//************************************************
		
		
		contentPane = new panel();// the new variable in the panel to put the componant in the panel
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(58, 0, 47, 46);
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/Images/nurs.png")));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(104, 0, 40, 46);
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/Images/sh2.png")));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(148, 0, 40, 46);
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/Images/sh4.png")));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(313, 0, 689, 50);
		lblNewLabel_4.setIcon(new ImageIcon("D:\\sw project\\hospital system\\res\\Images\\log2.png"));
		contentPane.add(lblNewLabel_4);
		
		//*****************Header*****************
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setBounds(0, 0, 1384, 58);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/Images/header.png")));
		contentPane.add(lblNewLabel);
		
		//******************* buttons*******************
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(Color.WHITE);
		
		btnSave.setBackground(new Color(20,60,80));
		btnSave.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		btnSave.setBounds(523, 370, 154, 39);
		contentPane.add(btnSave);
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(Color.WHITE);
		
		btnClear.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		btnClear.setBackground(new Color(20, 90, 80));
		btnClear.setBounds(723, 370, 154, 39);
		contentPane.add(btnClear);
		
		
		
		//************************footer**************
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(-91, 646, 1518, 33);
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("/Images/header.png")));
		contentPane.add(lblNewLabel_5);
		
		//****************** date*****************
		
		 JLabel lblDate = new JLabel(new Date()+"");
			lblDate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			lblDate.setBounds(577, 74, 236, 26);
			contentPane.add(lblDate);
			
			JTextField txtFirstName = new JTextField();
			txtFirstName.setForeground(Color.BLACK);
			
			txtFirstName.setFont(new Font("Times New Roman", Font.ITALIC, 17));
			txtFirstName.setBackground(Color.WHITE);
			txtFirstName.setColumns(10);
			txtFirstName.setBounds(270, 201, 343, 26);
			contentPane.add(txtFirstName);
			
			JTextField txtLastName = new JTextField();
			txtLastName.setForeground(Color.BLACK);
			
			txtLastName.setFont(new Font("Times New Roman", Font.ITALIC, 17));
			txtLastName.setBackground(Color.WHITE);
			txtLastName.setColumns(10);
			txtLastName.setBounds(270, 241, 343, 26);
			contentPane.add(txtLastName);
			
			//********************** investegation report**********
			JLabel invest = new JLabel("investegation report");
			invest.setForeground(new Color(25, 25, 112));
			invest.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			invest.setBackground(Color.LIGHT_GRAY);
			invest.setBounds(920, 159, 191, 26);
			contentPane.add(invest);
			
			//*******************labels*************
			JLabel inves = new JLabel("investigation Type: ");
			inves.setForeground(new Color(25, 25, 112));
			inves.setBackground(Color.LIGHT_GRAY);
			inves.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			inves.setBounds(104, 277, 154, 26);
			contentPane.add(inves);
			
			
			JLabel lblFirstName = new JLabel("First Name");
			lblFirstName.setForeground(new Color(25, 25, 112));
			lblFirstName.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			lblFirstName.setBackground(Color.LIGHT_GRAY);
			lblFirstName.setBounds(104, 197, 109, 26);
			contentPane.add(lblFirstName);
			
			JLabel lblLastName = new JLabel("Last Name");
			lblLastName.setForeground(new Color(25, 25, 112));
			lblLastName.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			lblLastName.setBackground(Color.LIGHT_GRAY);
			lblLastName.setBounds(104, 237, 109, 26);
			contentPane.add(lblLastName);
			
			
			
			
			
			//***************************** table****************
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(112, 434, 1136, 166);
			contentPane.add(scrollPane);
			
			
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					
				},
				new String[] {
					"New column", "New column", "New column", "New column"
				}
			));
			
			
			table.setBounds(462, 395, 724, 238);
			scrollPane.setViewportView(table);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"select"}));
			comboBox.setBounds(270, 280, 343, 29);
			contentPane.add(comboBox);
			
			JScrollPane scrpane = new JScrollPane();
			scrpane.setBounds(778, 189, 470, 158);
			contentPane.add(scrpane);
			
			textField = new JTextArea();
			textField.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			textField.setWrapStyleWord(true);
			textField.setLineWrap(true);
			scrpane.setViewportView(textField);
			
			
		
			
		
	
	}
}
