package login;

import handler.HandlerMotion;
import investigation.investigation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuItem;

import nursing.NursInfo;
import patient.Patient;
import patient.PatientStatus;
import pharmacy.Medical;
import report.Report;
import doctors.Doctor;

public class MainMenu extends JFrame {
	
	private HandlerMotion HDM ;
	private JButton btnPatientRegistration;
	private JButton btnNursing;
	private JButton btnDoctorManagement;
	private JButton btnPharmacy;
	private JButton btnReports;
	private JButton btnInvestgation;
	private String name ,spc;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private nursing.Panel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu("","");
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
	public MainMenu(String name,String spc) {
		this.name = name;
		this.spc = spc;
		
		HDM = new HandlerMotion();
		setTitle("Hospital Management System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/Images/hos.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1300, 730);
		setLocationRelativeTo(null);
		
		contentPane = new nursing.Panel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		//***************************************************************************************
		
		

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		

		JMenu mnDoctorManagement = new JMenu("Doctor management");
		menuBar.add(mnDoctorManagement);
		
		JMenuItem mntmDoctorInformation = new JMenuItem("doctor information");
		mnDoctorManagement.add(mntmDoctorInformation);
		
		mntmDoctorInformation.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new Doctor(MainMenu.this.name , MainMenu.this.spc).setVisible(true);
			}
			
		});
		
		JMenuItem mntmPatientStatus = new JMenuItem("patient status");
		mnDoctorManagement.add(mntmPatientStatus);
		mntmPatientStatus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(MainMenu.this.name , MainMenu.this.spc).setVisible(true);
				
			}
			
		});
		
		
		
		JMenu mnPharmacyManagement = new JMenu("Pharmacy management");
		menuBar.add(mnPharmacyManagement);
		
		JMenuItem mntmMedicamentInformation = new JMenuItem("medicament information");
		mnPharmacyManagement.add(mntmMedicamentInformation);
		mntmMedicamentInformation.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
		        new Medical(MainMenu.this.name , MainMenu.this.spc).setVisible(true);
				
			}
			
		}
		);
		
		
		JMenu mnInvestigations = new JMenu("Investigations");
		menuBar.add(mnInvestigations);
		
		JMenuItem mntmInvestigationType = new JMenuItem("investigation type");
		mnInvestigations.add(mntmInvestigationType);
		mntmInvestigationType.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new investigation(MainMenu.this.name , MainMenu.this.spc).setVisible(true);
			}
			
		});
		
		JMenuItem mntmPatientStatus_1 = new JMenuItem("patient status");
		mnInvestigations.add(mntmPatientStatus_1);
		mntmPatientStatus_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(MainMenu.this.name , MainMenu.this.spc).setVisible(true);
				
			}
		});
		
		
		JMenu mnNursing = new JMenu("Nursing");
		menuBar.add(mnNursing);
		
		
		
		JMenuItem mntmNurseInformation = new JMenuItem("nurse information");
		mnNursing.add(mntmNurseInformation);
		mntmNurseInformation.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new  NursInfo(MainMenu.this.name , MainMenu.this.spc).setVisible(true);
			}
		});
		
		JMenuItem mntmPatientStatus_2 = new JMenuItem("patient status");
		mnNursing.add(mntmPatientStatus_2);
		mntmPatientStatus_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(MainMenu.this.name , MainMenu.this.spc).setVisible(true);
				
			}
		});
		
		JMenu mnAdminManagement = new JMenu("Admin management");
		menuBar.add(mnAdminManagement);
		
		JMenuItem mntmDoctorInformation_1 = new JMenuItem("doctor information");
		mnAdminManagement.add(mntmDoctorInformation_1);
		
		mntmDoctorInformation_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				new Doctor(MainMenu.this.name , MainMenu.this.spc).setVisible(true);				
			}
		});
		
		
		JMenuItem mntmNurseInformation_1 = new JMenuItem("nurse information");
		mnAdminManagement.add(mntmNurseInformation_1);
mntmNurseInformation_1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new  NursInfo(MainMenu.this.name , MainMenu.this.spc).setVisible(true);
			}
		});
		
		
		JMenuItem mntmPharmacyInformation = new JMenuItem("pharmacy information");
		mnAdminManagement.add(mntmPharmacyInformation);
		
		
		JMenuItem mntmInvestigationInformation = new JMenuItem("investigation information");
		mnAdminManagement.add(mntmInvestigationInformation);
		mntmInvestigationInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				new investigation(MainMenu.this.name , MainMenu.this.spc).setVisible(true);
				
			}
		});
		
		
		JMenuItem mntmPatientInformation = new JMenuItem("patient information");
		mnAdminManagement.add(mntmPatientInformation);
		mntmPatientInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				new Patient(MainMenu.this.name , MainMenu.this.spc).setVisible(true);
				
			}
		});
		
		
		JMenu mnReport = new JMenu(" Reports");
		menuBar.add(mnReport);
		
		JMenuItem mntmPatientReport = new JMenuItem("patient report");
		mnReport.add(mntmPatientReport);
		mntmPatientReport.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new Report(MainMenu.this.name,MainMenu.this.spc).setVisible(true);
				
			}
		});
		
	//****************************************************************************************
		
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
		
		JLabel lblDocname = new JLabel("");
		lblDocname.setText("Dr : "+this.name);
		lblDocname.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblDocname.setBounds(22, 629, 175, 26);
		contentPane.add(lblDocname);
		
		JLabel lblHeader = new JLabel("");
		lblHeader.setIcon(new ImageIcon(Medical.class.getResource("/Images/header.png")));
		lblHeader.setBounds(0, 0, 1387, 78);
		contentPane.add(lblHeader);
		
		
	//**************************************************************************************************************
		
		btnPatientRegistration = new JButton("Patient Registration");
		btnPatientRegistration.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				new Patient(MainMenu.this.name, MainMenu.this.spc).setVisible(true);
				dispose();
				
			}
		});
		btnPatientRegistration.addMouseListener(new HandlerMotion());
		btnPatientRegistration.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnPatientRegistration.setForeground(Color.WHITE);
		btnPatientRegistration.setBackground(Color.DARK_GRAY);
		btnPatientRegistration.setIcon(new ImageIcon(MainMenu.class.getResource("/Images/resption.png")));
		btnPatientRegistration.setBounds(331, 352, 236, 78);
		contentPane.add(btnPatientRegistration);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MainMenu.class.getResource("/Images/header.png")));
		label.setBounds(0, 629, 1387, 78);
		contentPane.add(label);
		
		btnNursing = new JButton("Nursing");
		btnNursing.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				new NursInfo(MainMenu.this.name, MainMenu.this.spc).setVisible(true);
				dispose();
				
			}
		});
		btnNursing.addMouseListener(HDM);
		btnNursing.setIcon(new ImageIcon(MainMenu.class.getResource("/Images/nurs.png")));
		btnNursing.setForeground(Color.WHITE);
		btnNursing.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnNursing.setBackground(Color.DARK_GRAY);
		btnNursing.setBounds(577, 352, 236, 78);
		contentPane.add(btnNursing);
		
		btnDoctorManagement = new JButton("Doctor Management");
		btnDoctorManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Doctor(MainMenu.this.name,MainMenu.this.spc).setVisible(true);
				dispose();
			}
		});
		btnDoctorManagement.addMouseListener(HDM);
		btnDoctorManagement.setIcon(new ImageIcon(MainMenu.class.getResource("/Images/doc.png")));
		btnDoctorManagement.setForeground(Color.WHITE);
		btnDoctorManagement.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnDoctorManagement.setBackground(Color.DARK_GRAY);
		btnDoctorManagement.setBounds(823, 352, 236, 78);
		contentPane.add(btnDoctorManagement);
		
		btnPharmacy = new JButton("Pharmacy");
		btnPharmacy.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				new Medical(MainMenu.this.name, MainMenu.this.spc).setVisible(true);
				dispose();
			}
		});

		btnPharmacy.addMouseListener(HDM);
		btnPharmacy.setIcon(new ImageIcon(MainMenu.class.getResource("/Images/pharm.png")));
		btnPharmacy.setForeground(Color.WHITE);
		btnPharmacy.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnPharmacy.setBackground(Color.DARK_GRAY);
		btnPharmacy.setBounds(577, 441, 236, 78);
		contentPane.add(btnPharmacy);
		
		btnReports = new JButton("Reports");
		btnReports.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				new Report(MainMenu.this.name, MainMenu.this.spc).setVisible(true);
				dispose();
			}
		});

		btnReports.addMouseListener(HDM);
		btnReports.setIcon(new ImageIcon(MainMenu.class.getResource("/Images/rep.png")));
		btnReports.setForeground(Color.WHITE);
		btnReports.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnReports.setBackground(Color.DARK_GRAY);
		btnReports.setBounds(823, 441, 236, 78);
		contentPane.add(btnReports);
		
		btnInvestgation = new JButton("Investgations");
		btnInvestgation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				new investigation(MainMenu.this.name, MainMenu.this.spc).setVisible(true);
				dispose();
			}
		});

		btnInvestgation.addMouseListener(HDM);
		btnInvestgation.setIcon(new ImageIcon(MainMenu.class.getResource("/Images/invs.png")));
		btnInvestgation.setForeground(Color.WHITE);
		btnInvestgation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnInvestgation.setBackground(Color.DARK_GRAY);
		btnInvestgation.setBounds(331, 441, 236, 78);
		contentPane.add(btnInvestgation);
	}
}
