
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import patient.Patient;
import patient.PatientStatus;
import pharmacy.Medical;
import report.Report;
import sqlconnection.SQLCon;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.Date;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

import doctors.Doctor;
import net.proteanit.sql.DbUtils;
import nursing.NursInfo;

public class investigation extends JFrame {

	
	
	private String name;
	private String spc ;
	private JPanel contentPane;
	private JTable table;
	private JTextArea textAreaInves;
	private JLabel invest;
	private JComboBox comboBox;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JLabel inves;
	private JTextField txtSsn;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					investigation frame = new investigation(" "," ");
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
	public investigation(String name,String spc ) {
		this.name = name;
		this.spc = spc;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//************Icon For The bage*****************
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Patient.class.getResource("/Images/invs.png")));
		
		//*************************************
		
		//setBounds(100, 100, 450, 300);
		setSize(1735, 735);
		setLocationRelativeTo(null);// to be the window in the center of screen
		
		// ***************the bar in the head of bage*****************
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		
		JMenu mnPatientRegistration = new JMenu("Patient Registration");
		menuBar_1.add(mnPatientRegistration);
		
		JMenuItem mntmPatientRegisrations = new JMenuItem("Patient regisrations");
		mntmPatientRegisrations.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Patient(investigation.this.name,investigation.this.spc).setVisible(true);
				
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
				new Doctor(investigation.this.name,investigation.this.spc).setVisible(true);
				
			}
		});
		
		
		JMenuItem mntmPatientStatus = new JMenuItem("patient status");
		mnDoctorManagement.add(mntmPatientStatus);
		
		mntmPatientStatus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(investigation.this.name,investigation.this.spc).setVisible(true);
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
				new Medical(investigation.this.name,investigation.this.spc).setVisible(true);
				
				
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
				new investigation(investigation.this.name,investigation.this.spc).setVisible(true);
			}
		});
		
		
		JMenuItem mntmPatientStatus_1 = new JMenuItem("patient status");
		mnInvestigations.add(mntmPatientStatus_1);
		
		mntmPatientStatus_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(investigation.this.name,investigation.this.spc).setVisible(true);
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
				new NursInfo(investigation.this.name,investigation.this.spc).setVisible(true);
			}
		});
		
		
		JMenuItem mntmPatientStatus_2 = new JMenuItem("patient status");
		mnNursing.add(mntmPatientStatus_2);
		
		mntmPatientStatus_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(investigation.this.name,investigation.this.spc).setVisible(true);
			}
		});
		
		JMenu mnAdminManagement = new JMenu("Admin management");
		menuBar_1.add(mnAdminManagement);
		
		JMenuItem mntmDoctorInformation_1 = new JMenuItem("doctor information");
		mnAdminManagement.add(mntmDoctorInformation_1);
		
		mntmDoctorInformation_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Doctor(investigation.this.name,investigation.this.spc).setVisible(true);
				
			}
		});
		
		
		
		
		
		JMenuItem mntmNurseInformation_1 = new JMenuItem("nurse information");
		mnAdminManagement.add(mntmNurseInformation_1);
		
		mntmNurseInformation_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new NursInfo(investigation.this.name,investigation.this.spc).setVisible(true);
			}
		});
		
		
		
		JMenuItem mntmPharmacyInformation = new JMenuItem("pharmacy information");
		mnAdminManagement.add(mntmPharmacyInformation);
		
		mntmPharmacyInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new Medical(investigation.this.name,investigation.this.spc).setVisible(true);
				
				
			}
		});
		
		JMenuItem mntmInvestigationInformation = new JMenuItem("investigation information");
		mnAdminManagement.add(mntmInvestigationInformation);
		
		mntmInvestigationInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new investigation(investigation.this.name,investigation.this.spc).setVisible(true);
			}
		});
		
		
		
		
		JMenuItem mntmPatientInformation = new JMenuItem("patient information");
		mnAdminManagement.add(mntmPatientInformation);
		
		
		mntmPatientInformation .addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Patient(investigation.this.name,investigation.this.spc).setVisible(true);
				
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
				new Report(investigation.this.name,investigation.this.spc).setVisible(true);
			}
		});
		
		
		
		//************************************************
		
		
		contentPane = new panel();// the new variable in the panel to put the componant in the panel
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		/*
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(58, 0, 47, 46);
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/Images/nurs.png")));
		contentPane.add(lblNewLabel_1);
		*/
		/*
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(104, 0, 40, 46);
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/Images/sh2.png")));
		contentPane.add(lblNewLabel_2);
		*/
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(350, 0, 40, 46);
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/Images/sh4.png")));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(313, 0, 689, 50);
		lblNewLabel_4.setIcon(new ImageIcon("D:\\sw project\\hospital system\\res\\Images\\log2.png"));
		contentPane.add(lblNewLabel_4);
		
		//*****************Header*****************
	/*
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setBounds(0, 0, 1384, 58);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/Images/header.png")));
		contentPane.add(lblNewLabel);
		*/
		//******************* buttons*******************
		
		JButton btnSave = new JButton("Save");
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				     
				if(txtSsn.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "fill snn");
					return;
				}
				else
				{
					
				
					try
					{
						
                        ResultSet rss;								
                        String sql = "INSERT INTO patient_statues(ssn,patient_investigation,investigation_type) "
                        		+ "VALUES ("+Integer.parseInt(txtSsn.getText())+",'"+textAreaInves.getText()+"','"+comboBox.getSelectedItem().toString()+"')";
                        SQLCon.SQLConn(sql);
                        
                        
                        
		                JOptionPane.showMessageDialog(null, "insert Successfully");
		                rss=SQLCon.SQLConnection("select * from patient_statues");
		                table.setModel(DbUtils.resultSetToTableModel(rss));
		                
					}
					catch (Exception ex) {
	                    JOptionPane.showMessageDialog(null, ex.getMessage());
	                }
				}
			}
				
				
				
			
		});
		
		
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
		
		//*****************handling clear button*****************
		
		btnClear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				txtSsn.setText(" ");
				   txtLastName.setText(" ");
					textAreaInves.setText("");
					txtFirstName.setText(" ");
					comboBox.setSelectedIndex(0);
				
					
					
				
			}
		});
		
		
		//************************footer**************
		JLabel lblDocname = new JLabel("DR : ");
		lblDocname.setText("DR : "+this.name);
		lblDocname.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblDocname.setBounds(20, 629, 189, 26);
		contentPane.add(lblDocname);

		/*
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(-91, 646, 1518, 33);
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("/Images/header.png")));
		contentPane.add(lblNewLabel_5);
		*/
		
		//****************** date*****************
		
		 JLabel lblDate = new JLabel(new Date()+"");
			lblDate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			lblDate.setBounds(577, 74, 236, 26);
			contentPane.add(lblDate);
		//****************************************
			
			//**************TextFields****************
			
			txtSsn = new JTextField();
			txtSsn.setBounds(270, 161, 343, 22);
			
			txtSsn.setColumns(10);
			txtSsn.setForeground(Color.BLACK);
			
			txtSsn.setFont(new Font("Times New Roman", Font.ITALIC, 17));
			txtSsn.setBackground(Color.WHITE);
			contentPane.add(txtSsn);
			
			txtFirstName = new JTextField();
			txtFirstName.setForeground(Color.BLACK);
			
			txtFirstName.setFont(new Font("Times New Roman", Font.ITALIC, 17));
			txtFirstName.setBackground(Color.WHITE);
			txtFirstName.setColumns(10);
			txtFirstName.setBounds(270, 201, 343, 26);
			contentPane.add(txtFirstName);
			
			 txtLastName = new JTextField();
			txtLastName.setForeground(Color.BLACK);
			
			txtLastName.setFont(new Font("Times New Roman", Font.ITALIC, 17));
			txtLastName.setBackground(Color.WHITE);
			txtLastName.setColumns(10);
			txtLastName.setBounds(270, 241, 343, 26);
			contentPane.add(txtLastName);
			
			//********************** investegation report**********
			 invest = new JLabel("investegation report");
			invest.setForeground(new Color(25, 25, 112));
			invest.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			invest.setBackground(Color.LIGHT_GRAY);
			invest.setBounds(920, 159, 191, 26);
			contentPane.add(invest);
			
			//*******************labels*************
			lblNewLabel_6 = new JLabel("SSN");
			lblNewLabel_6.setBounds(104, 164, 56, 16);
			lblNewLabel_6.setForeground(new Color(25, 25, 112));
			lblNewLabel_6.setBackground(Color.LIGHT_GRAY);
			lblNewLabel_6.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			contentPane.add(lblNewLabel_6);
			
			
			
			
			
			
			 inves = new JLabel("investigation Type: ");
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
			
			ResultSet rs = SQLCon.SQLConnection("select * from patient_statues"); 
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			table.addMouseListener(new MouseAdapter() {
				public void  mouseClicked(MouseEvent e)
				{
					TableModel m = table.getModel();
					int row = table.getSelectedRow();
					txtSsn.setText(m.getValueAt(row, 0).toString());
					comboBox.setSelectedItem(m.getValueAt(row, 3));
				    textAreaInves.setText(m.getValueAt(row, 2).toString());
				    
				    JTable temp = new JTable();
				    temp.setModel(DbUtils.resultSetToTableModel(SQLCon.SQLConnection("select name from patient "
				    		+ "where ssn = "+Integer.parseInt(m.getValueAt(row, 0).toString()))));
				    txtFirstName.setText(temp.getValueAt(0, 0).toString().split(" ")[0]);
					txtLastName.setText(temp.getValueAt(0, 0).toString().split(" ")[1]);
					
				}
				
			});
			
			table.setBounds(462, 395, 724, 238);
			scrollPane.setViewportView(table);
			
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"C.B.C","R.B.C","W.B.C","Hb_Hgb","E.S.R"}));
			comboBox.setBounds(270, 280, 343, 29);
			contentPane.add(comboBox);
			
			JScrollPane scrpane = new JScrollPane();
			scrpane.setBounds(778, 189, 470, 158);
			contentPane.add(scrpane);
			
			
			table.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					
					int row = table.getSelectedRow();
					//setText(table.getValueAt(row, 0).toString());
					
					
				}
				
				
			}
			
					
					
					
					
					
					
					
					);
			
			
			
			
			
			
			
			
			
			
			//************************ Text Area of investigation*************************
			textAreaInves = new JTextArea();
			textAreaInves.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			textAreaInves.setWrapStyleWord(true);
			textAreaInves.setLineWrap(true);
			scrpane.setViewportView(textAreaInves);
			
		
			
		
			
			
		
			
		
	
	}
}
