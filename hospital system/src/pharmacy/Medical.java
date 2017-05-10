package pharmacy;

import investigation.investigation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.security.auth.callback.TextInputCallback;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.TextArea;
import java.awt.Button;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import net.proteanit.sql.DbUtils;
import nursing.NursInfo;
import doctors.Doctor;
import patient.Panel;
import patient.Patient;
import patient.PatientStatus;
import report.Report;
import sqlconnection.SQLCon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Medical extends JFrame {

	private Panel contentPane;
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
	private String name , Specification;
	JComboBox<String> comboBox;
	private int price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medical frame = new Medical("","");
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
	public Medical(String name , String spc) {
		this.name = name;
		this.Specification = spc;
		price = 0 ;
		
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
		mntmPatientRegisrations.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Patient(name,Specification).setVisible(true);
				
			}
		});
		mnPatientRegistration.add(mntmPatientRegisrations);
		
		JMenu mnDoctorManagement = new JMenu("Doctor management");
		menuBar_1.add(mnDoctorManagement);
		
		JMenuItem mntmDoctorInformation = new JMenuItem("doctor information");
		mnDoctorManagement.add(mntmDoctorInformation);
		
		mntmDoctorInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Doctor(name,Specification).setVisible(true);
				
			}
		});
		
		
		JMenuItem mntmPatientStatus = new JMenuItem("patient status");
		mnDoctorManagement.add(mntmPatientStatus);
		
		mntmPatientStatus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(name,Specification).setVisible(true);
			}
		});
		
		
		
		JMenu mnPharmacyManagement = new JMenu("Pharmacy management");
		menuBar_1.add(mnPharmacyManagement);
//********************************************************************************************
		
		JMenuItem mntmMedicamentInformation = new JMenuItem("medicament information");
		mnPharmacyManagement.add(mntmMedicamentInformation);
		
		mntmMedicamentInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new Medical(name,Specification).setVisible(true);
				
				
			}
		});
		
		
		
		
		JMenu mnInvestigations = new JMenu("Investigations");
		menuBar_1.add(mnInvestigations);
		
		JMenuItem mntmInvestigationType = new JMenuItem("investigation type");
		mnInvestigations.add(mntmInvestigationType);
		
		mntmInvestigationType.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new investigation(name,Specification).setVisible(true);
			}
		});
		
		
		JMenuItem mntmPatientStatus_1 = new JMenuItem("patient status");
		mnInvestigations.add(mntmPatientStatus_1);
		
		mntmPatientStatus_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(name,Specification).setVisible(true);
			}
		});
		
		
		
		
		JMenu mnNursing = new JMenu("Nursing");
		menuBar_1.add(mnNursing);
		
		JMenuItem mntmNurseInformation = new JMenuItem("nurse information");
		mnNursing.add(mntmNurseInformation);
		
		mntmNurseInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new NursInfo(name,Specification).setVisible(true);
			}
		});
		
		
		JMenuItem mntmPatientStatus_2 = new JMenuItem("patient status");
		mnNursing.add(mntmPatientStatus_2);
		
		mntmPatientStatus_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(name,Specification).setVisible(true);
			}
		});
		
		JMenu mnAdminManagement = new JMenu("Admin management");
		menuBar_1.add(mnAdminManagement);
		
		JMenuItem mntmDoctorInformation_1 = new JMenuItem("doctor information");
		mnAdminManagement.add(mntmDoctorInformation_1);
		
		mntmDoctorInformation_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Doctor(name,Specification).setVisible(true);
				
			}
		});
		
		
		
		
		
		JMenuItem mntmNurseInformation_1 = new JMenuItem("nurse information");
		mnAdminManagement.add(mntmNurseInformation_1);
		
		mntmNurseInformation_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new NursInfo(name,Specification).setVisible(true);
			}
		});
		
		
		
		JMenuItem mntmPharmacyInformation = new JMenuItem("pharmacy information");
		mnAdminManagement.add(mntmPharmacyInformation);
		
		mntmPharmacyInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new Medical(name,Specification).setVisible(true);
				
				
			}
		});
		
		JMenuItem mntmInvestigationInformation = new JMenuItem("investigation information");
		mnAdminManagement.add(mntmInvestigationInformation);
		
		mntmInvestigationInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new investigation(name,Specification).setVisible(true);
			}
		});
		
		
		
		
		JMenuItem mntmPatientInformation = new JMenuItem("patient information");
		mnAdminManagement.add(mntmPatientInformation);
		
		
		mntmPatientInformation .addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Patient(name,Specification).setVisible(true);
				
			}
		});
		
		
		JMenu mnReport = new JMenu(" Reports");
		menuBar_1.add(mnReport);
		
		JMenuItem mntmPatientReport = new JMenuItem("patient report");
		mnReport.add(mntmPatientReport);
	
		mntmPatientReport.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new Report(name,Specification).setVisible(true);
			}
		});
		
		JLabel lblDocname = new JLabel("DR : ");
		lblDocname.setText("DR : "+name);
		lblDocname.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblDocname.setBounds(20, 629, 189, 26);
		contentPane.add(lblDocname);
		
		
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
		txtSearch.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				ResultSet searchRs;
				if(comboBox.getSelectedIndex()== 0){
					if(!txtSearch.getText().trim().equals("")){
						 searchRs = SQLCon.SQLConnection("select * from patient_statues where ssn = "+Integer.parseInt(txtSearch.getText()));
					}else{
						searchRs = SQLCon.SQLConnection("select * from patient_statues ");

					}
					tablePatientInfo.setModel(DbUtils.resultSetToTableModel(searchRs));
					
				}else if (comboBox.getSelectedIndex() == 1){
					 searchRs = SQLCon.SQLConnection("select * from product where ProductName LIKE '%"+txtSearch.getText()+"%'");
					tableMedical.setModel(DbUtils.resultSetToTableModel(searchRs));
				}
			
				
			}
		});
		txtSearch.setFont(new Font("Georgia", Font.ITALIC, 18));
		txtSearch.setBounds(520, 114, 333, 36);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				ResultSet searchRs;
				if(comboBox.getSelectedIndex()== 0){
					if(!txtSearch.getText().trim().equals("")){
						 searchRs = SQLCon.SQLConnection("select * from patient_statues where ssn = "+Integer.parseInt(txtSearch.getText()));
					}else{
						searchRs = SQLCon.SQLConnection("select * from patient_statues ");

					}
					tablePatientInfo.setModel(DbUtils.resultSetToTableModel(searchRs));
					
				}else if (comboBox.getSelectedIndex() == 1){
					 searchRs = SQLCon.SQLConnection("select * from product where ProductName LIKE '%"+txtSearch.getText()+"%'");
					tableMedical.setModel(DbUtils.resultSetToTableModel(searchRs));
				}
			}
		});
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
		
		ResultSet rs = SQLCon.SQLConnection("select * from patient_statues");
		tablePatientInfo.setModel(DbUtils.resultSetToTableModel(rs));
		scrollPane.setViewportView(tablePatientInfo);
		
		//********************************
		
		tablePatientInfo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
				int row = tablePatientInfo.getSelectedRow();
				txtID.setText(tablePatientInfo.getValueAt(row, 0).toString());
				txtAreaDiscription.setText(tablePatientInfo.getValueAt(row, 1).toString());
				
				JTable temp = new JTable();
				temp.setModel(DbUtils.resultSetToTableModel(SQLCon.SQLConnection("select name from patient"
						+ " where ssn = "+Integer.parseInt(txtID.getText()))));
				txtName.setText(temp.getValueAt(0, 0).toString());
			}
		});
		
		//******************************
		
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
		ResultSet rss = SQLCon.SQLConnection("select * from product");
		tableMedical.setModel(DbUtils.resultSetToTableModel(rss));
		
		tableMedical.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				int row = tableMedical.getSelectedRow();
				txtMedicalId.setText(tableMedical.getValueAt(row, 0).toString());
				txtMedicalName.setText(tableMedical.getValueAt(row, 1).toString());
				txtPrice.setText(tableMedical.getValueAt(row,3).toString());
			}
		});
		
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
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				 int x = Integer.parseInt(txtPrice.getText().split(" ")[0]);
				price += x;
				
			}
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		btnAdd.setBackground(new Color(20, 50, 80));
		btnAdd.setBounds(841, 388, 171, 33);
		contentPane.add(btnAdd);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				int x = JOptionPane.showConfirmDialog(null, "the total price : "+price+"\n do you want to containue calculate ?");
				if(x==1)
					price = 0;
				
				
				
			}
		});
		btnCalculate.setForeground(Color.WHITE);
		btnCalculate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		btnCalculate.setBackground(new Color(20, 50, 80));
		btnCalculate.setBounds(1022, 388, 171, 33);
		contentPane.add(btnCalculate);
		
		btnClearInfo = new JButton("Clear");
		btnClearInfo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				txtMedicalId.setText("");
				txtMedicalName.setText("");
				txtPrice.setText("");
				txtID.setText("");
				txtName.setText("");
				txtAreaDiscription.setText("");
				
			}
		});
		btnClearInfo.setForeground(Color.WHITE);
		btnClearInfo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		btnClearInfo.setBackground(new Color(20, 50, 80));
		btnClearInfo.setBounds(272, 388, 252, 33);
		contentPane.add(btnClearInfo);
		
		comboBox = new JComboBox<String>();
		comboBox.setBackground(new Color(220,30,50));
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Patient SSN", "Medicine Name"}));
		comboBox.setBounds(322, 114, 188, 36);
		contentPane.add(comboBox);
		
		
		
		
		
	}
}
