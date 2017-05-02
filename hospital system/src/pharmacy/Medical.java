package pharmacy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.TextArea;
import java.awt.Button;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import patient.Panel;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Medical extends JFrame {

	private Panel contentPane;
	
	private JMenuBar menuBar;
	private JMenu btnPatintList;
	private JMenu btnNursingList;
	private JMenu btnDoctorsList;
	private JMenu btnAdminList;
	private JMenu btnPharmacyList;
	private JMenu btnReportsList;
	private JMenu btnInvestgationList;
	private JMenu btnLaundryList;
	private JMenu btnSearchList;
	
	private JMenuItem mntmChangePasswordDoctors;
	private JMenuItem mntmDoctorRegistration;
	private JMenuItem mntmPatientStatusDoctor;
	private JMenuItem mntmChangePasswordNursing;
	private JMenuItem mntmNursingRegistration;
	private JMenuItem mntmPatientStatusNursing;
	private JTextField txtSearch;
	private JScrollPane scrollPane;
	private JTable tablePatientInfo;
	private JLabel lblName;
	private JTextField txtName;
	private JTextField txtID;
	private JLabel lblId;
	private JTextField txtPrice;
	private JLabel lblPrice;
	private JScrollPane scrollPane_1;
	private JTable tableMedical;
	private JLabel lblDescription;
	private JScrollPane scrollPane_2;
	private JTextField txtMedicalId;
	private JLabel lblMedicalId;
	private JTextField txtMedicalName;
	private JLabel lblMedicalName;
	private JTextArea txtAreaDiscription;
	private JButton btnAdd;
	private JButton btnCalculate;
	private JButton btnClearInfo;
	private JButton btnSearch;
	
	JComboBox<String> comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medical frame = new Medical();
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
	public Medical() {
		setTitle("Pharmacy");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Medical.class.getResource("/Images/hos.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1370,740);
		setLocationRelativeTo(null);
		createFrame();	
	}
	
	private void createFrame(){
		contentPane = new Panel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		
		JMenu mnPatientRegistration = new JMenu("Patient Registration");
		menuBar_1.add(mnPatientRegistration);
		
		JMenuItem mntmPatientRegisrations = new JMenuItem("Patient regisrations");
		mnPatientRegistration.add(mntmPatientRegisrations);
		
		JMenuItem mntmSearchPatientDetails = new JMenuItem("Search Patient details");
		mnPatientRegistration.add(mntmSearchPatientDetails);
		
		JMenu mnDoctorManagement = new JMenu("Doctor management");
		menuBar_1.add(mnDoctorManagement);
		
		JMenuItem mntmDoctorInformation = new JMenuItem("doctor information");
		mnDoctorManagement.add(mntmDoctorInformation);
		
		JMenuItem mntmPatientStatus = new JMenuItem("patient status");
		mnDoctorManagement.add(mntmPatientStatus);
		
		JMenuItem mntmChangePassword = new JMenuItem("change password");
		mnDoctorManagement.add(mntmChangePassword);
		
		JMenu mnPharmacyManagement = new JMenu("Pharmacy management");
		menuBar_1.add(mnPharmacyManagement);
		
		JMenuItem mntmMedicamentInformation = new JMenuItem("medicament information");
		mnPharmacyManagement.add(mntmMedicamentInformation);
		
		JMenuItem mntmChangePassword_1 = new JMenuItem("change password");
		mnPharmacyManagement.add(mntmChangePassword_1);
		
		JMenu mnInvestigations = new JMenu("Investigations");
		menuBar_1.add(mnInvestigations);
		
		JMenuItem mntmInvestigationType = new JMenuItem("investigation type");
		mnInvestigations.add(mntmInvestigationType);
		
		JMenuItem mntmPatientStatus_1 = new JMenuItem("patient status");
		mnInvestigations.add(mntmPatientStatus_1);
		
		JMenuItem mntmChangePassword_2 = new JMenuItem("change password");
		mnInvestigations.add(mntmChangePassword_2);
		
		JMenu mnNursing = new JMenu("Nursing");
		menuBar_1.add(mnNursing);
		
		JMenuItem mntmNurseInformation = new JMenuItem("nurse information");
		mnNursing.add(mntmNurseInformation);
		
		JMenuItem mntmPatientStatus_2 = new JMenuItem("patient status");
		mnNursing.add(mntmPatientStatus_2);
		
		JMenuItem mntmChangePassword_3 = new JMenuItem("change password");
		mnNursing.add(mntmChangePassword_3);
		
		JMenu mnAdminManagement = new JMenu("Admin management");
		menuBar_1.add(mnAdminManagement);
		
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
		menuBar_1.add(mnReport);
		
		JMenuItem mntmPatientReport = new JMenuItem("patient report");
		mnReport.add(mntmPatientReport);
		
		JMenuItem mntmPharmacyReport = new JMenuItem("pharmacy report");
		mnReport.add(mntmPharmacyReport);
		
		JMenuItem mntmLaundryReport = new JMenuItem("laundry report");
		mnReport.add(mntmLaundryReport);
		
		JMenu mnLaundryManagement = new JMenu("Laundry management");
		menuBar_1.add(mnLaundryManagement);
	
		
	//************************************************** LOGO *******************************************************************************
		
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Medical.class.getResource("/Images/hos.png")));
		lblLogo.setBounds(1200, 0, 84, 64);
		contentPane.add(lblLogo);
		
		JLabel lblLogoIcon = new JLabel("");
		lblLogoIcon.setIcon(new ImageIcon(Medical.class.getResource("/Images/sh4.png")));
		lblLogoIcon.setBounds(188, 0, 40, 64);
		contentPane.add(lblLogoIcon);
		
		JLabel lblLogoIcon3 = new JLabel("");
		lblLogoIcon3.setIcon(new ImageIcon(Medical.class.getResource("/Images/sh1.png")));
		lblLogoIcon3.setBounds(87, 0, 40, 64);
		contentPane.add(lblLogoIcon3);
		
		JLabel lblLogoIcon2 = new JLabel("");
		lblLogoIcon2.setIcon(new ImageIcon(Medical.class.getResource("/Images/sh2.png")));
		lblLogoIcon2.setBounds(137, 0, 40, 64);
		contentPane.add(lblLogoIcon2);
		
		JLabel lblLogo_1 = new JLabel("logo2");
		lblLogo_1.setIcon(new ImageIcon(Medical.class.getResource("/Images/log2.png")));
		lblLogo_1.setBounds(390, 0, 530, 64);
		contentPane.add(lblLogo_1);
		
		
		
		JLabel lblDate = new JLabel(new Date()+"");
		lblDate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDate.setBounds(577, 74, 236, 26);
		contentPane.add(lblDate);
		
		JLabel lblHeader = new JLabel("");
		lblHeader.setIcon(new ImageIcon(Medical.class.getResource("/Images/header.png")));
		lblHeader.setBounds(0, 0, 1387, 78);
		contentPane.add(lblHeader);
		
		//***************************************Footer ************************************************
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Medical.class.getResource("/Images/header.png")));
		label.setBounds(0, 629, 1387, 78);
		contentPane.add(label);
		
		txtSearch = new JTextField();
		txtSearch.setFont(new Font("Georgia", Font.ITALIC, 18));
		txtSearch.setBounds(520, 114, 333, 36);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(new Color(20,30,60));
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnSearch.setBounds(869, 111, 132, 36);
		contentPane.add(btnSearch);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 432, 691, 197);
		contentPane.add(scrollPane);
		
		tablePatientInfo = new JTable();
		tablePatientInfo.setModel(new DefaultTableModel(
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
		tablePatientInfo.setFont(new Font("Tahoma", Font.BOLD, 14));
		scrollPane.setViewportView(tablePatientInfo);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(714, 432, 630, 197);
		contentPane.add(scrollPane_1);
		
		tableMedical = new JTable();
		tableMedical.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
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
		scrollPane_1.setViewportView(tableMedical);
		
		lblName = new JLabel("Name");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblName.setBounds(122, 231, 96, 36);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Georgia", Font.ITALIC, 18));
		txtName.setColumns(10);
		txtName.setBounds(228, 231, 333, 36);
		contentPane.add(txtName);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Georgia", Font.ITALIC, 18));
		txtID.setColumns(10);
		txtID.setBounds(228, 184, 333, 36);
		contentPane.add(txtID);
		
		lblId = new JLabel("ID");
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblId.setBounds(122, 184, 96, 36);
		contentPane.add(lblId);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Georgia", Font.ITALIC, 18));
		txtPrice.setColumns(10);
		txtPrice.setBounds(881, 278, 333, 36);
		contentPane.add(txtPrice);
		
		lblPrice = new JLabel("Price");
		lblPrice.setForeground(Color.BLACK);
		lblPrice.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblPrice.setBounds(714, 278, 139, 36);
		contentPane.add(lblPrice);
		
		lblDescription = new JLabel("Description");
		lblDescription.setForeground(Color.BLACK);
		lblDescription.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblDescription.setBounds(87, 278, 112, 26);
		contentPane.add(lblDescription);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(228, 278, 333, 99);
		contentPane.add(scrollPane_2);
		
		txtAreaDiscription = new JTextArea();
		txtAreaDiscription.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 15));
		txtAreaDiscription.setWrapStyleWord(true);
		txtAreaDiscription.setLineWrap(true);
		txtAreaDiscription.setColumns(3);
		txtAreaDiscription.setRows(2);
		scrollPane_2.setViewportView(txtAreaDiscription);
		
		txtMedicalId = new JTextField();
		txtMedicalId.setFont(new Font("Georgia", Font.ITALIC, 18));
		txtMedicalId.setColumns(10);
		txtMedicalId.setBounds(881, 184, 333, 36);
		contentPane.add(txtMedicalId);
		
		lblMedicalId = new JLabel("Medical ID");
		lblMedicalId.setForeground(Color.BLACK);
		lblMedicalId.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblMedicalId.setBounds(714, 183, 139, 36);
		contentPane.add(lblMedicalId);
		
		txtMedicalName = new JTextField();
		txtMedicalName.setFont(new Font("Georgia", Font.ITALIC, 18));
		txtMedicalName.setColumns(10);
		txtMedicalName.setBounds(881, 231, 333, 36);
		contentPane.add(txtMedicalName);
		
		lblMedicalName = new JLabel("Medical Name");
		lblMedicalName.setForeground(Color.BLACK);
		lblMedicalName.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
		lblMedicalName.setBounds(714, 231, 139, 36);
		contentPane.add(lblMedicalName);
		
		btnAdd = new JButton("Add");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		btnAdd.setBackground(new Color(20, 50, 80));
		btnAdd.setBounds(841, 388, 171, 33);
		contentPane.add(btnAdd);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.setForeground(Color.WHITE);
		btnCalculate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		btnCalculate.setBackground(new Color(20, 50, 80));
		btnCalculate.setBounds(1022, 388, 171, 33);
		contentPane.add(btnCalculate);
		
		btnClearInfo = new JButton("Clear");
		btnClearInfo.setForeground(Color.WHITE);
		btnClearInfo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		btnClearInfo.setBackground(new Color(20, 50, 80));
		btnClearInfo.setBounds(272, 388, 252, 33);
		contentPane.add(btnClearInfo);
		
		comboBox = new JComboBox<String>();
		comboBox.setBackground(new Color(220,30,50));
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Search Selection-", "Patient Info", "Medicine Info"}));
		comboBox.setBounds(322, 114, 188, 36);
		contentPane.add(comboBox);
		
		
		
		
		
	}
}
