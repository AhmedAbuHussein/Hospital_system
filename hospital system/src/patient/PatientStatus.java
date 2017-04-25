package patient;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class PatientStatus extends JFrame {

	private Panel contentPane;
	private JLabel label;
	private JTextField txtSearch;
	private JButton btnSearch;
	
	private JScrollPane scrollPane;
	private JTable table;
	
	private JTextField txtId;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JButton btnUpdate;
	private JButton btnExit;
	private JButton btnClear;
	
	private JTextArea txtPatientStatus;
	private JTextArea txtInvestigation;
	
	
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientStatus frame = new PatientStatus();
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
	public PatientStatus() {
		setTitle("Patient Status");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/hos.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1378, 740);
		setLocationRelativeTo(null);
		createFrame();
	}

	private void createFrame(){
		
		contentPane = new Panel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//***************************************************MENU BAR ********************************************************************
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(getClass().getResource("/Images/hos.png")));
		lblLogo.setBounds(1200, 0, 84, 64);
		contentPane.add(lblLogo);
		
		JLabel lblLogoIcon = new JLabel("");
		lblLogoIcon.setIcon(new ImageIcon(getClass().getResource("/Images/sh4.png")));
		lblLogoIcon.setBounds(188, 0, 40, 64);
		contentPane.add(lblLogoIcon);
		
		JLabel lblLogoIcon3 = new JLabel("");
		lblLogoIcon3.setIcon(new ImageIcon(getClass().getResource("/Images/sh1.png")));
		lblLogoIcon3.setBounds(87, 0, 40, 64);
		contentPane.add(lblLogoIcon3);
		
		JLabel lblLogoIcon2 = new JLabel("");
		lblLogoIcon2.setIcon(new ImageIcon(getClass().getResource("/Images/sh2.png")));
		lblLogoIcon2.setBounds(137, 0, 40, 64);
		contentPane.add(lblLogoIcon2);
		
		JLabel lblLogo_1 = new JLabel("logo2");
		lblLogo_1.setIcon(new ImageIcon(getClass().getResource("/Images/log2.png")));
		lblLogo_1.setBounds(390, 0, 530, 64);
		contentPane.add(lblLogo_1);
		
		JLabel lblDate = new JLabel(new Date()+"");
		lblDate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDate.setBounds(577, 74, 236, 26);
		contentPane.add(lblDate);
		
		JLabel lblHeader = new JLabel("");
		lblHeader.setIcon(new ImageIcon(getClass().getResource("/Images/header.png")));
		lblHeader.setBounds(0, 0, 1387, 78);
		contentPane.add(lblHeader);
	


		//************************************************** LOGO *******************************************************************************
		
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
				//label,lblHeader, lblDate ,lblLogo_1 ,lblLogoIcon2,lblLogoIcon3,lblLogoIcon, lblLogo
				label = new JLabel("");
				label.setIcon(new ImageIcon(getClass().getResource("/Images/header.png")));
				label.setBounds(0, 629, 1387, 78);
				contentPane.add(label);
		//*******************************************************************************************************************************
				
				JLabel lblPatientName = new JLabel("Patient Name :");
				lblPatientName.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 14));
				lblPatientName.setBounds(469, 132, 118, 26);
				contentPane.add(lblPatientName);
				
				txtSearch = new JTextField();
				txtSearch.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
				txtSearch.setBounds(589, 132, 292, 26);
				contentPane.add(txtSearch);
				txtSearch.setColumns(10);
				
				btnSearch = new JButton("Search");
			
				btnSearch.setBackground(new Color(20,40,80));
				btnSearch.setForeground(Color.WHITE);
				btnSearch.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
				btnSearch.setBounds(891, 132, 118, 26);
				contentPane.add(btnSearch);
				
				scrollPane = new JScrollPane();
				scrollPane.setBounds(30, 475, 1303, 155);
				contentPane.add(scrollPane);
				
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
					},
					new String[] {
						"New column", "New column", "New column", "New column", "New column", "New column", "New column"
					}
				));
				
				scrollPane.setViewportView(table);
				
				JLabel lblId = new JLabel("ID");
				lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
				lblId.setBounds(488, 228, 95, 26);
				contentPane.add(lblId);
				
				JLabel lblFirstName = new JLabel("First Name");
				lblFirstName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
				lblFirstName.setBounds(488, 283, 95, 26);
				contentPane.add(lblFirstName);
				
				JLabel lblLastName = new JLabel("Last Name");
				lblLastName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
				lblLastName.setBounds(488, 347, 95, 26);
				contentPane.add(lblLastName);
				
				txtId = new JTextField();
				txtId.setBounds(589, 228, 292, 26);
				contentPane.add(txtId);
				txtId.setColumns(10);
				
				txtFirstName = new JTextField();
				txtFirstName.setColumns(10);
				txtFirstName.setBounds(589, 283, 292, 26);
				contentPane.add(txtFirstName);
				
				txtLastName = new JTextField();
				txtLastName.setColumns(10);
				txtLastName.setBounds(589, 347, 292, 26);
				contentPane.add(txtLastName);
				
				btnUpdate = new JButton("Update");
		
				btnUpdate.setBackground(new Color(20,30,60));
				btnUpdate.setForeground(Color.WHITE);
				btnUpdate.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
				btnUpdate.setBounds(488, 404, 125, 41);
				contentPane.add(btnUpdate);
				
				btnExit = new JButton("Exit");
				
				btnExit.setForeground(Color.WHITE);
				btnExit.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
				btnExit.setBackground(new Color(120, 30, 60));
				btnExit.setBounds(756, 404, 125, 41);
				contentPane.add(btnExit);
				
				btnClear = new JButton("Clear");
				btnClear.setForeground(Color.WHITE);
				btnClear.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
				btnClear.setBackground(new Color(20, 50, 60));
				btnClear.setBounds(619, 404, 125, 41);
				contentPane.add(btnClear);
				
				JScrollPane scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(933, 228, 400, 236);
				contentPane.add(scrollPane_2);
				
				txtInvestigation = new JTextArea();
				txtInvestigation.setWrapStyleWord(true);
			
				txtInvestigation.setLineWrap(true);
				txtInvestigation.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
				scrollPane_2.setViewportView(txtInvestigation);
				
				JLabel lblPatientInvestigation = new JLabel("Patient Investigation");
				lblPatientInvestigation.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
				lblPatientInvestigation.setBounds(933, 195, 227, 26);
				contentPane.add(lblPatientInvestigation);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(30, 228, 400, 236);
				contentPane.add(scrollPane_1);
				
				txtPatientStatus = new JTextArea();
				txtPatientStatus.setWrapStyleWord(true);
				
				txtPatientStatus.setLineWrap(true);
				txtPatientStatus.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
				scrollPane_1.setViewportView(txtPatientStatus);
				
				JLabel label_1 = new JLabel("Patient Status");
				label_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
				label_1.setBounds(30, 195, 155, 26);
				contentPane.add(label_1);
				
				
				
		//***********************************************************************************************************************************
		
	}
}