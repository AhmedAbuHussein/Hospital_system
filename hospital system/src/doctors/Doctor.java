package doctors;

import handler.HandlerFocus;
import handler.HandlerMotion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
//import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;
import sqlconnection.SQLCon;
//import java.awt.image.BufferedImage;
//import java.sql.SQLException;
//import javax.swing.JComboBox;

public class Doctor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtWebsite;
	private JTextField txtQualification;
	private JTextField txtAcademies;
	
	private JButton btnSave;
	private JButton btnClear;
	private JButton btnRemove;
	private JButton btnDaysSave;
	private JButton btnDadysDelete;
	private JComboBox comDay;
	private JComboBox comYear;
	private JComboBox comMonth;
	private JComboBox comBlood;
	private JComboBox comTimeFromHour;
	private JComboBox comTimeFromMinute;
	private JComboBox comTimeToHour;
	private JComboBox comTimeToMinute;
	
	private JRadioButton rdbSaturday;
	private JRadioButton rdbSunday;
	private JRadioButton rdbMonday;
	private JRadioButton rdbTuseday;
	private JRadioButton rdbWedensday;
	private JRadioButton rdbThurthday;
	private JRadioButton rdbFriday;	
	
	private JTable tableDays;
	private JTable tableInfo;
	private JComboBox comDepartement;
	
		
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor frame = new Doctor();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Doctor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\programs java\\hospital\\resource\\s.jpeg"));
		setTitle("Hospital management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1450, 705);
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

		

		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);

	HandlerMotion	hdm =  new HandlerMotion();
	HandlerFocus	hdf = new HandlerFocus();
		
		JLabel lblHospitalSystem = new JLabel("Hospital System");
		lblHospitalSystem.setIcon(new ImageIcon(getClass().getResource("/images/sh4.png")));
		lblHospitalSystem.setBounds(511, 0, 403, 89);
		lblHospitalSystem.setForeground(new Color(178, 34, 34));
		lblHospitalSystem.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(lblHospitalSystem);
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setBounds(73, 91, 101, 21);
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblId.setForeground(new Color(0, 0, 128));
		contentPane.add(lblId);
		
		JLabel lblFirstName = new JLabel("First Name : ");
		lblFirstName.setBounds(73, 134, 101, 21);
		lblFirstName.setForeground(new Color(0, 0, 128));
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name : ");
		lblLastName.setBounds(73, 174, 101, 22);
		lblLastName.setForeground(new Color(0, 0, 128));
		lblLastName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblLastName);
		
		JLabel lblPhone = new JLabel("Phone : ");
		lblPhone.setBounds(73, 216, 101, 22);
		lblPhone.setForeground(new Color(0, 0, 128));
		lblPhone.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblPhone);
		
		JLabel lblDateOfBirth = new JLabel("Date of birth : ");
		lblDateOfBirth.setBounds(73, 249, 101, 26);
		lblDateOfBirth.setForeground(new Color(0, 0, 128));
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblDateOfBirth);
		
		JLabel lblBlood = new JLabel("Blood Group : ");
		lblBlood.setBounds(73, 286, 101, 22);
		lblBlood.setForeground(new Color(0, 0, 128));
		lblBlood.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblBlood);
		
		JLabel lblEmail = new JLabel("E-mail : ");
		lblEmail.setBounds(73, 335, 93, 21);
		lblEmail.setForeground(new Color(0, 0, 128));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblEmail);
		
		txtId = new JTextField();
		txtId.setBounds(176, 91, 187, 27);
		contentPane.add(txtId);
		txtId.setColumns(10);
		txtId.addFocusListener(hdf);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(176, 134, 187, 27);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		txtFirstName.addFocusListener(hdf);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(176, 171, 187, 27);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		txtLastName.addFocusListener(hdf);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(176, 207, 187, 27);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		txtPhone.addFocusListener(hdf);
		
	    comDay = new JComboBox();
	    comDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comDay.setBounds(176, 253, 55, 21);
		contentPane.add(comDay);
		
		comMonth = new JComboBox();
		comMonth.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comMonth.setBounds(241, 253, 55, 21);
		contentPane.add(comMonth);
		
		comYear = new JComboBox();
		comYear.setModel(new DefaultComboBoxModel(new String[] {"1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970"}));
		comYear.setBounds(306, 253, 55, 21);
		contentPane.add(comYear);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(176, 331, 187, 27);
		txtEmail.addFocusListener(hdf);
		
		comBlood = new JComboBox();
		comBlood.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		comBlood.setBounds(177, 286, 186, 20);
		contentPane.add(comBlood);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblWebsite = new JLabel("Website : ");
		lblWebsite.setBounds(595, 100, 66, 18);
		lblWebsite.setForeground(new Color(0, 0, 128));
		lblWebsite.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblWebsite);
		
		JLabel lblAddress = new JLabel("Address : ");
		lblAddress.setBounds(595, 133, 75, 22);
		lblAddress.setForeground(new Color(0, 0, 128));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblAddress);
		
		JLabel lblDepartment = new JLabel("Departement : ");
		lblDepartment.setBounds(595, 174, 111, 22);
		lblDepartment.setForeground(new Color(0, 0, 128));
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblDepartment);
		
		JLabel lblQualification = new JLabel("Qualification : ");
		lblQualification.setBounds(595, 216, 93, 22);
		lblQualification.setForeground(new Color(0, 0, 128));
		lblQualification.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblQualification);
		
		JLabel lblAcademies = new JLabel("Academies : ");
		lblAcademies.setBounds(595, 262, 93, 22);
		lblAcademies.setForeground(new Color(0, 0, 128));
		lblAcademies.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblAcademies);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(727, 131, 187, 29);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		txtAddress.addFocusListener(hdf);
		
		txtWebsite = new JTextField();
		txtWebsite.setBounds(727, 91, 187, 27);
		contentPane.add(txtWebsite);
		txtWebsite.setColumns(10);
		txtWebsite.addFocusListener(hdf);
		
		txtQualification = new JTextField();
		txtQualification.setBounds(727, 216, 187, 26);
		contentPane.add(txtQualification);
		txtQualification.setColumns(10);
		txtQualification.addFocusListener(hdf);
		comDepartement = new JComboBox();
		comDepartement.setModel(new DefaultComboBoxModel(new String[] {"General", "Xray", "Emergency", "Accounting", "Reception", "Pharmacy", "Emergency", "Cardiology", "Geriatrics", "Gynaecology", "Paediatrics"}));
		comDepartement.setBounds(727, 176, 187, 27);
		contentPane.add(comDepartement);
		
		txtAcademies = new JTextField();
		txtAcademies.setBounds(727, 261, 187, 26);
		contentPane.add(txtAcademies);
		txtAcademies.setColumns(10);
		txtAcademies.addFocusListener(hdf);
		JLabel lblDays = new JLabel("Days : ");
		lblDays.setBounds(997, 54, 139, 31);
		lblDays.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblDays.setForeground(new Color(0, 0, 128));
		contentPane.add(lblDays);
		final ButtonGroup button_group=new ButtonGroup();
		
		rdbSaturday = new JRadioButton("Saturday");
		rdbSaturday.setBounds(997, 91, 109, 23);
		rdbSaturday.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbSaturday.setForeground(new Color(0, 0, 128));
		contentPane.add(rdbSaturday);
		
		rdbSunday = new JRadioButton("Sunday");
		rdbSunday.setBounds(997, 118, 109, 23);
		rdbSunday.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbSunday.setForeground(new Color(0, 0, 128));
		contentPane.add(rdbSunday);
		
		rdbMonday = new JRadioButton("Monday");
		rdbMonday.setForeground(new Color(0, 0, 128));
		rdbMonday.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbMonday.setBounds(997, 144, 109, 23);
		contentPane.add(rdbMonday);
		
		rdbTuseday = new JRadioButton("Tuseday");
		rdbTuseday.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbTuseday.setForeground(new Color(0, 0, 128));
		rdbTuseday.setBounds(997, 175, 109, 23);
		contentPane.add(rdbTuseday);
		
		rdbWedensday = new JRadioButton("Wedensday");
		rdbWedensday.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbWedensday.setForeground(new Color(0, 0, 128));
		rdbWedensday.setBounds(997, 211, 109, 23);
		contentPane.add(rdbWedensday);
		
		rdbThurthday = new JRadioButton("Thurthday");
		rdbThurthday.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbThurthday.setForeground(new Color(0, 0, 128));
		rdbThurthday.setBounds(997, 241, 109, 23);
		contentPane.add(rdbThurthday);
		
		rdbFriday = new JRadioButton("Friday");
		rdbFriday.setForeground(new Color(0, 0, 128));
		rdbFriday.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbFriday.setBounds(997, 273, 109, 23);
		contentPane.add(rdbFriday);
		button_group.add(rdbSaturday);
		button_group.add(rdbSunday);
		button_group.add( rdbMonday);
		button_group.add(rdbTuseday);
		button_group.add(rdbWedensday);
		button_group.add(rdbThurthday);
		button_group.add(rdbFriday);
		
		
		JLabel lblTimeFrom = new JLabel("Time from : ");
		lblTimeFrom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblTimeFrom.setForeground(new Color(0, 0, 128));
		lblTimeFrom.setBounds(1128, 91, 122, 21);
		contentPane.add(lblTimeFrom);
		
		comTimeFromHour = new JComboBox();
		comTimeFromHour.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comTimeFromHour.setBounds(1125, 119, 66, 22);
		contentPane.add(comTimeFromHour);
		
		comTimeFromMinute = new JComboBox();
		comTimeFromMinute.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comTimeFromMinute.setBounds(1201, 119, 66, 22);
		contentPane.add(comTimeFromMinute);
		
		JLabel lblTimeTo = new JLabel("Time to : ");
		lblTimeTo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblTimeTo.setForeground(new Color(0, 0, 128));
		lblTimeTo.setBounds(1128, 171, 122, 22);
		contentPane.add(lblTimeTo);
		
		btnSave = new JButton("Update ");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtId.getText().equals(""))
				{
					 JOptionPane.showMessageDialog(null,"please enter your id");
					 return;
				}
				else
				{
					try
					{
						String sql="update doctor_information set name='" + txtFirstName.getText()+" "+txtLastName.getText() + "',phone='"+Integer.parseInt(txtPhone.getText())+"',date_of_birth='" + comYear.getSelectedItem().toString()+"/"+comMonth.getSelectedItem().toString() +"/"+comDay.getSelectedItem().toString()+ "',blood_group='" +comBlood.getSelectedItem().toString() + "',e_mail='" + txtEmail.getText()+ "',website='" + txtWebsite.getText() + "',address='" + txtAddress.getText() + "',department='" + comDepartement.getSelectedItem().toString() + "',qualification='" + txtQualification.getText()+ "',academics='" + txtAcademies.getText()+ "' where ssn='" +Integer.parseInt( txtId.getText())+ "'";
		                SQLCon.SQLConn(sql);
		                ResultSet rs = SQLCon.SQLConnection("select * from doctor_information");
		        		tableInfo.setModel(DbUtils.resultSetToTableModel(rs));
		                JOptionPane.showMessageDialog(null, "UPDATED Successfully");
					}
					catch (Exception ex) {
	                    JOptionPane.showMessageDialog(null, ex.getMessage());
	                }
				}
				
				
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnSave.setForeground( Color.white);
		
		comTimeToHour = new JComboBox();
		comTimeToHour.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comTimeToHour.setBounds(1125, 216, 66, 22);
		contentPane.add(comTimeToHour);
		
		comTimeToMinute = new JComboBox();
		comTimeToMinute.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comTimeToMinute.setBounds(1201, 216, 66, 22);
		contentPane.add(comTimeToMinute);
		btnSave.setBackground(new Color(20,30,60));
		btnSave.setBounds(372, 410, 95, 31);
		contentPane.add(btnSave);
		btnSave.addMouseListener(hdm);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtId.setText("");
				txtFirstName.setText("");
				txtLastName.setText("");
				txtPhone.setText("");
				txtEmail.setText("");
				txtWebsite.setText("");
				txtAddress.setText("");
				txtAcademies.setText("");
				txtQualification.setText("");
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnClear.setForeground( Color.white);
		btnClear.setBackground(new Color(20,30,60));
		btnClear.setBounds(518, 410, 112, 31);
		contentPane.add(btnClear);
		btnClear.addMouseListener(hdm);
		
		btnRemove = new JButton("Delete");
		
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtId.getText().equals(""))
				{
				    JOptionPane.showMessageDialog(null, "choose your ssn");
				}
				else
				{
					
					try
					{
						int val = JOptionPane.showConfirmDialog(null, "Do you realy want to delete");
		                if (val == 0)
		                {
		                	 String sql_delete="delete from nurse_information where ssn='" + txtId.getText() + "'";
							 SQLCon.SQLConn(sql_delete);
							 ResultSet rs = SQLCon.SQLConnection("select * from nurse_information");
							 tableInfo.setModel(DbUtils.resultSetToTableModel(rs));
							 txtId.setText("");
								txtFirstName.setText("");
								txtLastName.setText("");
								txtPhone.setText("");
								txtEmail.setText("");
								txtWebsite.setText("");
								txtAddress.setText("");
								txtAcademies.setText("");
								txtQualification.setText("");
						     JOptionPane.showMessageDialog(null, "DELETED successfully");
		                }
		                else
		                {
		                	return;
		                }
						
					}
				
	             catch (Exception ex) {
	                JOptionPane.showMessageDialog(null, ex.getMessage());
	            }
				}
				
			}
		});
		btnRemove.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnRemove.setForeground( Color.white);
		btnRemove.setBackground(new Color(20,30,60));
		btnRemove.setBounds(681, 410, 111, 31);
		contentPane.add(btnRemove);
		btnRemove.addMouseListener(hdm);
		
		btnDaysSave = new JButton("Update");
		btnDaysSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String day = null;
				if(rdbSaturday.isSelected()) day = rdbSaturday.getText();
				else if(rdbSunday.isSelected())day = rdbSunday.getText();
				else if(rdbMonday.isSelected())day = rdbMonday.getText();
				else if(rdbTuseday.isSelected())day = rdbTuseday.getText();
				else if(rdbWedensday.isSelected())day = rdbWedensday.getText();
				else if(rdbThurthday.isSelected())day = rdbThurthday.getText();
				else if(rdbFriday.isSelected())day = rdbFriday.getText();
				
				if(txtId.getText().equals("")||day.equals(null)||comTimeFromHour.getSelectedItem().toString().equals(null)||comTimeFromMinute.getSelectedItem().toString().equals(null)||comTimeToHour.getSelectedItem().toString().equals(null)||comTimeToMinute.getSelectedItem().toString().equals(null))
				{
					JOptionPane.showMessageDialog(null,"please fill all parts ");
					return;
				}
				try
				{
					
					String update_sql="update doctor_schedule set ssn='"+Integer.parseInt(txtId.getText())+"',days='"+day+"',day_from='"+comTimeFromHour.getSelectedItem().toString()+ ":" +comTimeFromMinute.getSelectedItem().toString()+"',day_to='"+comTimeToHour.getSelectedItem().toString()+ ":" +comTimeToMinute.getSelectedItem().toString()+"' where ssn='"+Integer.parseInt(txtId.getText())+"'"; 
					SQLCon.SQLConn(update_sql);
					ResultSet rs = SQLCon.SQLConnection("select * from doctor_schedule");
					tableDays.setModel(DbUtils.resultSetToTableModel(rs));
					JOptionPane.showMessageDialog(null,"Updated is done");
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
				
			}
		});
		btnDaysSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnDaysSave.setForeground( Color.white);
		btnDaysSave.setBackground(new Color(20,30,60));
		btnDaysSave.setBounds(1085, 399, 109, 31);
		contentPane.add(btnDaysSave);
		btnDaysSave.addMouseListener(hdm);
		
		btnDadysDelete = new JButton("Delete");
		btnDadysDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int val = JOptionPane.showConfirmDialog(null, "Do you realy want to delete");
	                if (val == 0)
	                {
	                	String sql_delete="delete from doctor_schedule where ssn=" + Integer.parseInt(txtId.getText());
	    		     	SQLCon.SQLConn(sql_delete);
	    			    ResultSet rs = SQLCon.SQLConnection("select * from doctor_schedule");
	    				tableDays.setModel(DbUtils.resultSetToTableModel(rs));
	    				txtId.setText("");
	    		        JOptionPane.showMessageDialog(null, "DELETED successfully");
	                }
	                else
	                {
	                	JOptionPane.showMessageDialog(null,"wrong choice ");
	                }
				
		
				
			}
		});
		btnDadysDelete.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnDadysDelete.setForeground( Color.white);
		btnDadysDelete.setBackground(new Color(20,30,60));
		btnDadysDelete.setBounds(1229, 399, 103, 31);
		contentPane.add(btnDadysDelete);
		btnDadysDelete.addMouseListener(hdm);
		
		JLabel lblDoctorInformation = new JLabel("Doctor information");
		lblDoctorInformation.setIcon(new ImageIcon("F:\\programs java\\hospital\\resource\\nurs.png"));
		lblDoctorInformation.setForeground(new Color(0, 0, 128));
		lblDoctorInformation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblDoctorInformation.setBounds(100, 32, 237, 50);
		contentPane.add(lblDoctorInformation);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(822, 463, 510, 192);
		contentPane.add(scrollPane);
		
		
		tableDays = new JTable();
		tableDays.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				
				TableModel m = tableDays.getModel();
				int row = tableDays.getSelectedRow();
				txtId.setText(m.getValueAt(row, 0).toString());
				String ssn=txtId.getText();
				String sql="select * from doctor_information where ssn="+Integer.parseInt(ssn);
				ResultSet rss=SQLCon.SQLConnection(sql);
				
				JTable t = new JTable();
				t.setModel(DbUtils.resultSetToTableModel(rss));
				TableModel newModel = t.getModel();
				
				txtFirstName.setText(newModel.getValueAt(0, 1).toString().split(" ")[0]);
				txtLastName.setText(newModel.getValueAt(0, 1).toString().split(" ")[1]);
				txtPhone.setText(newModel.getValueAt(0, 2).toString());
				txtEmail.setText(newModel.getValueAt(0, 5).toString());
				txtWebsite.setText(newModel.getValueAt(0, 6).toString());
				txtAddress.setText(newModel.getValueAt(0, 7).toString());
				txtQualification.setText(newModel.getValueAt(0, 9).toString());
				txtAcademies.setText(newModel.getValueAt(0, 10).toString());
				
			
				
			}
		});
		tableDays.setModel(new DefaultTableModel(
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
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Doctors", "Days", "Time from", "Time to"
			}
		));
		
		ResultSet rst = SQLCon.SQLConnection("select * from doctor_schedule");
		tableDays.setModel(DbUtils.resultSetToTableModel(rst));
		
		scrollPane.setViewportView(tableDays);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(84, 463, 697, 192);
		contentPane.add(scrollPane_1);
		
		
		tableInfo = new JTable();
		
		tableInfo.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "First Name", "Last Name", "Phone", "DOB", "Blood Group", "E-mail", "Website", "Address", "Speciality", "Departement", "Qualification", "Academies"
			}
		));
		tableInfo.addMouseListener(new MouseAdapter() {
			public void  mouseClicked(MouseEvent e)
			{
				TableModel m = tableInfo.getModel();
				int row = tableInfo.getSelectedRow();
				txtId.setText(m.getValueAt(row, 0).toString());
				txtFirstName.setText(m.getValueAt(row, 1).toString().split(" ")[0]);
				txtLastName.setText(m.getValueAt(row, 1).toString().split(" ")[1]);
				txtPhone.setText(m.getValueAt(row, 2).toString());
				txtEmail.setText(m.getValueAt(row, 5).toString());
				txtWebsite.setText(m.getValueAt(row, 6).toString());
				txtAddress.setText(m.getValueAt(row, 7).toString());
				txtQualification.setText(m.getValueAt(row, 9).toString());
				txtAcademies.setText(m.getValueAt(row, 10).toString());
				
				
				
				
			}
			
		});
		scrollPane_1.setViewportView(tableInfo);
		

		ResultSet rs = SQLCon.SQLConnection("select * from doctor_information");
		tableInfo.setModel(DbUtils.resultSetToTableModel(rs));
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Integer.parseInt(txtId.getText())<1)
				{
					JOptionPane.showMessageDialog(null,"Invalid input");
					{
						return;
					}
				}
				if(txtId.getText().equals("")||txtFirstName.getText().equals("")||txtLastName.getText().equals("")||txtPhone.getText().equals("")||txtEmail.getText().equals("")||txtWebsite.getText().equals("")||txtAddress.getText().equals("")||txtQualification.getText().equals("")||txtAcademies.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "please fill all fields ");
					return;
				}
				String email_text=txtEmail.getText();
				
					if(email_text.contains("@")==false||email_text.contains(".com")==false)
					{
						JOptionPane.showMessageDialog(null,"enter email address like that ...@yahoo.com");
						return;
				    }
					if(email_text.startsWith("@")||email_text.startsWith(".com"))
					{
						
					JOptionPane.showMessageDialog(null,"enter email address like that ...@yahoo.com");
					return;
					}
					int x=0,y=0;
					for(int i=0;i<email_text.length();i++)
					{
						if(email_text.charAt(i)=='@')
						{
							x=i;
						}
						if(email_text.charAt(i)=='.')
						{
							y=i;
						}
						
					}
					
					if(x>y)
					{
						JOptionPane.showMessageDialog(null,"enter email address like that ...@yahoo.com");
						return;	
					}
					
					
					String website_text=txtWebsite.getText();
					
					if(website_text.contains("@")==false||website_text.contains(".com")==false)
					{
						JOptionPane.showMessageDialog(null,"enter website address like that ...@yahoo.com");
						return;
				    }
					if(website_text.startsWith("@")||website_text.startsWith(".com"))
					{
						
					JOptionPane.showMessageDialog(null,"enter website address like that ...@yahoo.com");
					return;
					}
					int w=0,z=0;
					for(int i=0;i<website_text.length();i++)
					{
						if(website_text.charAt(i)=='@')
						{
							w=i;
						}
						if(website_text.charAt(i)=='.')
						{
							z=i;
						}
						
					}
					
					if(w>z)
					{
						JOptionPane.showMessageDialog(null,"enter website address like that ...@yahoo.com");
						return;	
					}
					
					
				try {
                    String sql = "select ssn from doctor_information where ssn='" + txtId.getText() + "'";
                    ResultSet rst=SQLCon.SQLConnection(sql);
                    if (rst.next()) {
                        JOptionPane.showMessageDialog(null, "ID already exist");
                        return;
                    }
                    else
                    {
                    	String sql_add="INSERT INTO doctor_information(ssn, name, phone, date_of_birth, blood_group, e_mail, website, address, department, qualification, academics) VALUES ("+Integer.parseInt(txtId.getText())+",'"+ txtFirstName.getText()+" "+txtLastName.getText()+ "'," + Integer.parseInt(txtPhone.getText())+ ",'" + comYear.getSelectedItem().toString()+"/"+comMonth.getSelectedItem().toString()+"/"+comDay.getSelectedItem().toString()+ "','"+ comBlood.getSelectedItem().toString() +"','"+txtEmail.getText()+"','"+txtWebsite.getText()+"','"+txtAddress.getText()+"','"+comDepartement.getSelectedItem().toString()+"','"+txtQualification.getText()+"','"+txtAcademies.getText()+"')";
                        SQLCon.SQLConn(sql_add);
                        ResultSet rs = SQLCon.SQLConnection("select * from doctor_information");
                		tableInfo.setModel(DbUtils.resultSetToTableModel(rs));
    					JOptionPane.showMessageDialog(null,"Added successfully");
    					
                    }
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex.getMessage());
				}
				
				
			}
		});
		btnNewButton.setBounds(248, 410, 101, 28);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setForeground( Color.white);
		btnNewButton.setBackground(new Color(20,30,60));
		contentPane.add(btnNewButton);
		btnNewButton.addMouseListener(hdm);
		
		JButton add_button = new JButton("Add");
		add_button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		add_button.setForeground( Color.white);
		add_button.setBackground(new Color(20,30,60));
		add_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String day = null;
				if(rdbSaturday.isSelected()) day = rdbSaturday.getText();
				else if(rdbSunday.isSelected())day = rdbSunday.getText();
				else if(rdbMonday.isSelected())day = rdbMonday.getText();
				else if(rdbTuseday.isSelected())day = rdbTuseday.getText();
				else if(rdbWedensday.isSelected())day = rdbWedensday.getText();
				else if(rdbThurthday.isSelected())day = rdbThurthday.getText();
				else if(rdbFriday.isSelected())day = rdbFriday.getText();
				if(txtId.getText().equals("")||day.equals(null)||comTimeFromHour.getSelectedItem().toString().equals(null)||comTimeFromMinute.getSelectedItem().toString().equals(null)||comTimeToHour.getSelectedItem().toString().equals(null)||comTimeToMinute.getSelectedItem().toString().equals(null))
				{
					JOptionPane.showMessageDialog(null,"please fill all parts ");
					return;
				}
				  String sql = "select ssn from doctor_schedule where ssn='" + txtId.getText() + "'";
                  ResultSet rs=SQLCon.SQLConnection(sql);
                  try {
					if (rs.next()) {
					      JOptionPane.showMessageDialog(null, "ID already exist");
					      return;
					  }
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                  
			try
			{
					
					String sql_add="INSERT INTO doctor_schedule(ssn,days,day_from,day_to) values("+Integer.parseInt(txtId.getText())+",'"+day+"','"+comTimeFromHour.getSelectedItem().toString()+ ":" +comTimeFromMinute.getSelectedItem().toString()+"', '"+comTimeToHour.getSelectedItem().toString()+ ":"  + comTimeToMinute.getSelectedItem().toString()+"')";
					SQLCon.SQLConn(sql_add);
					JOptionPane.showMessageDialog(null,"Added successfully");
					ResultSet rst = SQLCon.SQLConnection("select * from doctor_schedule");
					tableDays.setModel(DbUtils.resultSetToTableModel(rst));
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex.getMessage());
				}
				
			}
		});
		add_button.setBounds(928, 400, 111, 31);
		contentPane.add(add_button);
		add_button.addMouseListener(hdm);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(getClass().getResource("/images/9.jpg")));
		label_1.setBounds(0,-29,1381,738);
		contentPane.add(label_1);
		
	}
}
