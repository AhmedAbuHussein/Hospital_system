package patient;
//This is patient status design Salwa Ahmed Handler Merna EZZ
import investigation.investigation;

import java.awt.Color;

import handler.HandlerFocus;
import handler.HandlerMotion;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import net.proteanit.sql.DbUtils;
import nursing.NursInfo;
import report.Report;
import sqlconnection.SQLCon;

import javax.swing.JComboBox;

import login.MainMenu;
import pharmacy.Medical;
import doctors.Doctor;

public class PatientStatus extends JFrame {

	private Panel contentPane;
	private JLabel label;
	private JTextField txtSearch;
	private JButton btnSearch;
	
	private JScrollPane scrollPane;
	private JTable table , table1;
	private HandlerMotion hdm;
	private HandlerFocus hdf;
	
	
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
	private JComboBox<String> comboBox;
	private String Name,specification;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientStatus frame = new PatientStatus("Ahmed","");
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
	public PatientStatus(String name,String spc) {
		this.Name=name;
		this.specification=spc;
		setTitle("Patient Status");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/hos.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1378, 740);
		setLocationRelativeTo(null);
		createFrame();
	}

	private void createFrame(){
		
		//***************************************************MENU BAR ********************************************************************
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		

		JMenu mnPatientRegistration = new JMenu("Patient Registration");
		menuBar.add(mnPatientRegistration);
		
		JMenuItem mntmPatientRegisrations = new JMenuItem("Patient regisrations");
		mnPatientRegistration.add(mntmPatientRegisrations);
		mntmPatientRegisrations.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Patient patient=new Patient(Name,specification);
				patient.setVisible(true);
			}
		});
		
		JMenu mnDoctorManagement = new JMenu("Doctor management");
		menuBar.add(mnDoctorManagement);
		
		JMenuItem mntmDoctorInformation = new JMenuItem("doctor information");
		mnDoctorManagement.add(mntmDoctorInformation);
		
        mntmDoctorInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				Doctor doctor=new Doctor(Name,specification);
				doctor.setVisible(true);
			}
		});
		JMenuItem mntmPatientStatus = new JMenuItem("patient status");
		mnDoctorManagement.add(mntmPatientStatus);
		mntmPatientStatus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				PatientStatus patient=new PatientStatus(Name,specification);
				patient.setVisible(true);
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
				Medical medical=new Medical(Name,specification);
				medical.setVisible(true);
			}
		});
		JMenu mnInvestigations = new JMenu("Investigations");
		menuBar.add(mnInvestigations);
		
		JMenuItem mntmInvestigationType = new JMenuItem("investigation type");
		mnInvestigations.add(mntmInvestigationType);
		mntmInvestigationType.addActionListener(new ActionListener() {			
				public void actionPerformed(ActionEvent arg0) {
					
					dispose();
					investigation investigation=new investigation(Name,specification);
					investigation.setVisible(true);
				}
			});
		JMenuItem mntmPatientStatus_1 = new JMenuItem("patient status");
		mnInvestigations.add(mntmPatientStatus_1);
       mntmPatientStatus_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				PatientStatus patient=new PatientStatus(Name,specification);
				patient.setVisible(true);
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
				NursInfo nurse=new NursInfo(Name,specification);
				nurse.setVisible(true);
			}
		});
		
		JMenuItem mntmPatientStatus_2 = new JMenuItem("patient status");
		mnNursing.add(mntmPatientStatus_2);
        mntmPatientStatus_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				PatientStatus patient=new PatientStatus(Name,specification);
				patient.setVisible(true);
			}
		});
		
		JMenu mnAdminManagement = new JMenu("Admin management");
		menuBar.add(mnAdminManagement);
		
		JMenuItem mntmDoctorInformation_1 = new JMenuItem("doctor information");
		mnAdminManagement.add(mntmDoctorInformation_1);
		 mntmDoctorInformation_1.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					
					dispose();
					Doctor doctor=new Doctor(Name,specification);
					doctor.setVisible(true);
				}
			});
		JMenuItem mntmNurseInformation_1 = new JMenuItem("nurse information");
		mnAdminManagement.add(mntmNurseInformation_1);
		mntmNurseInformation_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				NursInfo nurse =new NursInfo(Name,specification);
				nurse.setVisible(true);
			}
		});
		
		JMenuItem mntmPharmacyInformation = new JMenuItem("pharmacy information");
		mnAdminManagement.add(mntmPharmacyInformation);
		mntmPharmacyInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				Medical medical=new Medical(Name,specification);
				medical.setVisible(true);
			}
		});
		
		JMenuItem mntmInvestigationInformation = new JMenuItem("investigation information");
		mnAdminManagement.add(mntmInvestigationInformation);
		mntmInvestigationInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				investigation investigation=new investigation(Name,specification);
				investigation.setVisible(true);
			}
		});
		JMenuItem mntmPatientInformation = new JMenuItem("patient information");
		mnAdminManagement.add(mntmPatientInformation);
		mntmPatientInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				Patient patient =new Patient(Name,specification);
				patient.setVisible(true);
			}
		});
		JMenu mnReport = new JMenu(" Reports");
		menuBar.add(mnReport);
		
		JMenuItem mntmPatientReport = new JMenuItem("patient report");
		mnReport.add(mntmPatientReport);
		mntmPatientReport .addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				Report report=new Report(Name,specification);
				report.setVisible(true);
			}
		});
		
		contentPane = new Panel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		hdm =  new HandlerMotion();
		hdf = new HandlerFocus();
		
		
		
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
				
				JLabel lblDocname = new JLabel("");
				lblDocname.setText("DR : "+Name);
				lblDocname.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
				lblDocname.setBounds(10, 629, 167, 26);
				contentPane.add(lblDocname);
				
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
				
				txtSearch = new JTextField();
				txtSearch.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
				txtSearch.setBounds(589, 132, 292, 26);
				txtSearch.addFocusListener(hdf);
				txtSearch.setColumns(10);
				txtSearch.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						
						ResultSet rss;
						if(comboBox.getSelectedItem().toString().equals("ssn")){
							
							if(txtSearch.getText().equals(""))
								rss= SQLCon.SQLConnection("select * from patient_statues");
							else{
								 rss= SQLCon.SQLConnection("select * from patient_statues where ssn = "+Integer.parseInt(txtSearch.getText()));
								 table.setModel(DbUtils.resultSetToTableModel(rss));
							}
						}else if(comboBox.getSelectedItem().toString().equals("Name")){
							
							if(txtSearch.getText().equals(""))
								rss= SQLCon.SQLConnection("select * from patient_statues");
							else{
								rss = SQLCon.SQLConnection("select ssn from patient "
										+ "where Name LIKE '%"+txtSearch.getText()+"%'");
								table1.setModel(DbUtils.resultSetToTableModel(rss));
								
								 rss= SQLCon.SQLConnection("select * from patient_statues "
								 		+ "where ssn = "+Integer.parseInt(table1.getValueAt(0, 0).toString()));
								 table.setModel(DbUtils.resultSetToTableModel(rss));
							}
							
						}
						
					}
				});
				contentPane.add(txtSearch);
				btnSearch = new JButton("Search");
				btnSearch .addMouseListener(hdm);
				btnSearch.setBackground(new Color(20,40,80));
				btnSearch.setForeground(Color.WHITE);
				btnSearch.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
				btnSearch.setBounds(891, 132, 118, 26);
				
				btnSearch.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						ResultSet rss;
						if(comboBox.getSelectedItem().toString().equals("ssn")){
							
							if(txtSearch.getText().equals(""))
								rss= SQLCon.SQLConnection("select * from patient_statues");
							else{
								 rss= SQLCon.SQLConnection("select * from patient_statues where ssn = "+Integer.parseInt(txtSearch.getText()));
								 table.setModel(DbUtils.resultSetToTableModel(rss));
							}
						}else if(comboBox.getSelectedItem().toString().equals("Name")){
							
							if(txtSearch.getText().equals("")){
								rss= SQLCon.SQLConnection("select * from patient_statues");
							 	table.setModel(DbUtils.resultSetToTableModel(rss));
							}else{
								rss = SQLCon.SQLConnection("select ssn from patient "
										+ "where Name LIKE '%"+txtSearch.getText()+"%'");
								table1.setModel(DbUtils.resultSetToTableModel(rss));
								
								 rss= SQLCon.SQLConnection("select * from patient_statues "
								 		+ "where ssn = "+Integer.parseInt(table1.getValueAt(0, 0).toString()));
								 table.setModel(DbUtils.resultSetToTableModel(rss));
							}
							
						}
						
						
					}
					});
				
				contentPane.add(btnSearch);
				
				scrollPane = new JScrollPane();
				scrollPane.setBounds(30, 475, 1303, 155);
				contentPane.add(scrollPane);
				
				table1 = new JTable();
				
				table = new JTable();
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
				ResultSet rs = SQLCon.SQLConnection("select * from patient_statues");
				table.setModel(DbUtils.resultSetToTableModel(rs));
				table.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e){
					 
						int row = table.getSelectedRow();
						txtId.setText(table.getValueAt(row, 0).toString());
						txtPatientStatus.setText(table.getValueAt(row, 1).toString());
						txtInvestigation.setText(table.getValueAt(row, 2).toString());
						
						ResultSet rss = SQLCon.SQLConnection("select Name from patient "
								+ "where SSN= "+Integer.parseInt(txtId.getText()));
						
						table1.setModel(DbUtils.resultSetToTableModel(rss));
						
						
						txtFirstName.setText(table1.getValueAt(0, 0).toString().split(" ")[0]);
						txtLastName.setText(table1.getValueAt(0, 0).toString().split(" ")[1]);
						txtFirstName.setEditable(false);
						txtLastName.setEditable(false);
						txtId.setEditable(false);
					
					}
					
				});
				
				
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
				txtId.addFocusListener(hdf);
				txtId.setBounds(589, 228, 292, 26);
				contentPane.add(txtId);
				txtId.setColumns(10);
				
				txtFirstName = new JTextField();
				txtFirstName.setColumns(10);
				txtFirstName.addFocusListener(hdf);
				txtFirstName.setBounds(589, 283, 292, 26);
				contentPane.add(txtFirstName);
				
				txtLastName = new JTextField();
				txtLastName.setColumns(10);
				txtLastName.addFocusListener(hdf);
				txtLastName.setBounds(589, 347, 292, 26);
				contentPane.add(txtLastName);
				
				btnUpdate = new JButton("Update");
				btnUpdate.addMouseListener(hdm);
				btnUpdate.setBackground(new Color(20,30,60));
				btnUpdate.setForeground(Color.WHITE);
				btnUpdate.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
				btnUpdate.setBounds(488, 404, 125, 41);
				contentPane.add(btnUpdate);
				
				btnUpdate.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						if(txtId.getText().equals("")||txtInvestigation.getText().equals(""))
						{
							JOptionPane.showMessageDialog(null, "may be id or text area is empty ckeck it out");
							return;
						}
						else
						{
							try
							{
								String sql="update patient_statues set doctor_report='" + txtPatientStatus.getText()+"'where ssn = " +Integer.parseInt( txtId.getText());
				                SQLCon.SQLConn(sql);
				                ResultSet rs = SQLCon.SQLConnection("select * from patient_statues ");
				        		table.setModel(DbUtils.resultSetToTableModel(rs));
				                JOptionPane.showMessageDialog(null, "UPDATED Successfully");
							}
							catch(Exception ex)
							{
								ex.getMessage();
							}
						}
						


					}
				});
				
				btnExit = new JButton("Exit");
				btnExit .addMouseListener(hdm);
				btnExit.setForeground(Color.WHITE);
				btnExit.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
				btnExit.setBackground(new Color(120, 30, 60));
				btnExit.setBounds(756, 404, 125, 41);
				btnExit.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						new MainMenu(Name,specification).setVisible(true);
						dispose();
					}
				});
				contentPane.add(btnExit);
				
				btnClear = new JButton("Clear");
				btnClear.setForeground(Color.WHITE);
				btnClear  .addMouseListener(hdm);
				btnClear.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
				btnClear.setBackground(new Color(20, 50, 60));
				btnClear.setBounds(619, 404, 125, 41);
				contentPane.add(btnClear);
				btnClear.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						txtId.setText("");
						txtSearch.setText("");
						txtFirstName.setText("");
						txtLastName.setText("");
						txtInvestigation.setText("");
						txtPatientStatus.setText("");
						txtFirstName.setEditable(true);
						txtLastName.setEditable(true);
						txtId.setEditable(true);


						
					}
				});
				
				JScrollPane scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(933, 343, 400, 121);
				contentPane.add(scrollPane_2);
				
				txtInvestigation = new JTextArea();
				txtInvestigation.addFocusListener(hdf);
				txtInvestigation.setWrapStyleWord(true);
				txtInvestigation.setEditable(false);
			
				txtInvestigation.setLineWrap(true);
				txtInvestigation.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
				scrollPane_2.setViewportView(txtInvestigation);
				
				JLabel lblPatientInvestigation = new JLabel("Patient Investigation");
				lblPatientInvestigation.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
				lblPatientInvestigation.setBounds(932, 316, 227, 26);
				contentPane.add(lblPatientInvestigation);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(30, 343, 400, 121);
				contentPane.add(scrollPane_1);
				
				txtPatientStatus = new JTextArea();
				txtPatientStatus.addFocusListener(hdf);
				txtPatientStatus.setWrapStyleWord(true);
				
				txtPatientStatus.setLineWrap(true);
				txtPatientStatus.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
				scrollPane_1.setViewportView(txtPatientStatus);
				
				JLabel label_1 = new JLabel("Patient Status");
				label_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
				label_1.setBounds(30, 316, 155, 26);
				contentPane.add(label_1);
				
				comboBox = new JComboBox<String>();
				comboBox.setBackground(new Color(220,30,50));
				comboBox.setForeground(Color.WHITE);
				comboBox.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 18));
				comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"ssn", "Name"}));
			
				comboBox.setBounds(469, 132, 110, 24);
				contentPane.add(comboBox);
				
				
				
				
				
				
		//***********************************************************************************************************************************
		
	}
}

