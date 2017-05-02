package report;
//this is jui & handler for report by shymaa hossny


import handler.HandlerFocus;
import handler.HandlerMotion;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.ScrollPane;
import java.util.Date;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Report extends JFrame {

	private Panal contentPane;
	private JLabel lblLogo;
	private JLabel lblLogoIcon;
	private JLabel lblLogoIcon3;
	private JLabel lblLogoIcon2;
	private JLabel lblLogo_1;
	private JLabel lblDate;
	private JLabel label;
	private JLabel lblHeader;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTable table;
	private HandlerMotion hdm;
	private HandlerFocus hdf;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1730, 735);
		setLocationRelativeTo(null);
		
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

		
		
		contentPane = new Panal();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		hdm =  new HandlerMotion();
		hdf = new HandlerFocus();
		//********************************** logo *****************************//
		 lblLogo = new JLabel("");
			lblLogo.setIcon(new ImageIcon(getClass().getResource("/Images/hos.png")));
			lblLogo.setBounds(1200, 0, 84, 64);
			contentPane.add(lblLogo);
			
			lblLogoIcon = new JLabel("");
			lblLogoIcon.setIcon(new ImageIcon(getClass().getResource("/Images/sh4.png")));
			lblLogoIcon.setBounds(188, 0, 40, 64);
			contentPane.add(lblLogoIcon);
			
		    lblLogoIcon3 = new JLabel("");
			lblLogoIcon3.setIcon(new ImageIcon(getClass().getResource("/Images/sh1.png")));
			lblLogoIcon3.setBounds(87, 0, 40, 64);
			contentPane.add(lblLogoIcon3);
			
			lblLogoIcon2 = new JLabel("");
			lblLogoIcon2.setIcon(new ImageIcon(getClass().getResource("/Images/sh2.png")));
			lblLogoIcon2.setBounds(137, 0, 40, 64);
			contentPane.add(lblLogoIcon2);
			
			lblLogo_1 = new JLabel("logo2");
			lblLogo_1.setIcon(new ImageIcon(getClass().getResource("/Images/log2.png")));
			lblLogo_1.setBounds(390, 0, 530, 64);
			contentPane.add(lblLogo_1);
			
		    lblDate = new JLabel(new Date()+"");
			lblDate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			lblDate.setBounds(577, 74, 236, 26);
			contentPane.add(lblDate);
			
			lblHeader = new JLabel("");
			lblHeader.setIcon(new ImageIcon(getClass().getResource("/Images/header.png")));
			lblHeader.setBounds(0, 0, 1387, 78);
			contentPane.add(lblHeader);
			
			//***************************************Footer ************************************************
			
		    label = new JLabel("");
			label.setIcon(new ImageIcon(getClass().getResource("/Images/header.png")));
			label.setBounds(0, 629, 1387, 78);
			contentPane.add(label);
			
		
		
		
		
		
		
	
		textField = new JTextField();
		textField.setBounds(543, 104, 202, 32);
		textField.addFocusListener(hdf);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground( Color.white);
		btnNewButton.addMouseListener(hdm);
		btnNewButton.setBackground(new Color(20,30,60));
		btnNewButton.setBounds(781, 103, 125, 32);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 219, 413, 40);
		textField_1.addFocusListener(hdf);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Patient SSN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(157, 185, 113, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Doctor Report");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(156, 278, 114, 23);
		contentPane.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(781, 219, 413, 40);
		textField_3.addFocusListener(hdf);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Patient Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(781, 194, 125, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Investigation Report");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(781, 283, 172, 18);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Report PDF");
		btnNewButton_1.setForeground( Color.white);
		btnNewButton_1.addMouseListener(hdm);
		btnNewButton_1.setBackground(new Color(20,30,60));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(620, 352, 125, 32);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(505, 648, -278, -134);
		contentPane.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(881, 627, -628, -129);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(156, 414, 1038, 216);
		contentPane.add(scrollPane_2);
		
		table = new JTable(){
		
		public Component prepareRenderer(TableCellRenderer r,int data,int column){
			Component c = super.prepareRenderer(r,data,column);
			if(data % 2 == 0){
				c.setBackground(Color.white);
				c.setForeground(Color.black);
			}else{
				c.setBackground(Color.LIGHT_GRAY);
				c.setForeground(new Color(200,60,50));
			}
			return c;
		}
		
	};
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane_2.setViewportView(table);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(156, 312, 413, 72);
		contentPane.add(scrollPane_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		textArea.addFocusListener(hdf);
		textArea.setWrapStyleWord(true);
		scrollPane_3.setViewportView(textArea);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(781, 312, 413, 72);
		contentPane.add(scrollPane_4);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		textArea_1.addFocusListener(hdf);
		textArea_1.setWrapStyleWord(true);
		scrollPane_4.setViewportView(textArea_1);
		
		/*JLabel lblNewLabel_5 = new JLabel(new Date()+"");
		lblNewLabel_5.setBounds(543, 71, 202, 22);
		contentPane.add(lblNewLabel_5);*/
	}
}
