package nursing;

import handler.HandlerFocus;
import handler.HandlerMotion;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.image.BufferedImage;
//import java.sql.SQLException;
import java.util.Date;

import javax.swing.ButtonGroup;
//import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
//import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import doctors.Doctor;

public class NursInfo extends JFrame {

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
					NursInfo frame = new NursInfo();
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
	public NursInfo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\programs java\\hospital\\resource\\s.jpeg"));
		setTitle("Hospital management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1450, 705);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
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
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(176, 134, 187, 27);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(176, 171, 187, 27);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(176, 207, 187, 27);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
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
		
		txtWebsite = new JTextField();
		txtWebsite.setBounds(727, 91, 187, 27);
		contentPane.add(txtWebsite);
		txtWebsite.setColumns(10);
		
		txtQualification = new JTextField();
		txtQualification.setBounds(727, 216, 187, 26);
		contentPane.add(txtQualification);
		txtQualification.setColumns(10);
		
		comDepartement = new JComboBox();
		comDepartement.setModel(new DefaultComboBoxModel(new String[] {"General", "Xray", "Emergency", "Accounting", "Reception", "Pharmacy", "Emergency", "Cardiology", "Geriatrics", "Gynaecology", "Paediatrics"}));
		comDepartement.setBounds(727, 176, 187, 27);
		contentPane.add(comDepartement);
		
		txtAcademies = new JTextField();
		txtAcademies.setBounds(727, 261, 187, 26);
		contentPane.add(txtAcademies);
		txtAcademies.setColumns(10);
		
		JLabel lblDays = new JLabel("Days : ");
		lblDays.setBounds(997, 54, 139, 31);
		lblDays.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblDays.setForeground(new Color(0, 0, 128));
		contentPane.add(lblDays);
		ButtonGroup button_group=new ButtonGroup();
		
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
		
		btnSave = new JButton("Save ");
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
		btnSave.setBounds(366, 399, 95, 31);
		contentPane.add(btnSave);
		
		btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnClear.setForeground( Color.white);
		btnClear.setBackground(new Color(20,30,60));
		btnClear.setBounds(496, 399, 112, 31);
		contentPane.add(btnClear);
		
		btnRemove = new JButton("Remove");
		
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRemove.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnRemove.setForeground( Color.white);
		btnRemove.setBackground(new Color(20,30,60));
		btnRemove.setBounds(630, 399, 111, 31);
		contentPane.add(btnRemove);
		
		btnDaysSave = new JButton("Save");
		btnDaysSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnDaysSave.setForeground( Color.white);
		btnDaysSave.setBackground(new Color(20,30,60));
		btnDaysSave.setBounds(941, 399, 109, 31);
		contentPane.add(btnDaysSave);
		
		btnDadysDelete = new JButton("Delete");
		btnDadysDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDadysDelete.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnDadysDelete.setForeground( Color.white);
		btnDadysDelete.setBackground(new Color(20,30,60));
		btnDadysDelete.setBounds(1091, 399, 103, 31);
		contentPane.add(btnDadysDelete);
		
		JLabel lblDoctorInformation = new JLabel("Nurse information");
		lblDoctorInformation.setIcon(new ImageIcon("F:\\programs java\\hospital\\resource\\nurs.png"));
		lblDoctorInformation.setForeground(new Color(0, 0, 128));
		lblDoctorInformation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblDoctorInformation.setBounds(100, 32, 237, 50);
		contentPane.add(lblDoctorInformation);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(822, 463, 510, 192);
		contentPane.add(scrollPane);
		
		
		tableDays = new JTable();
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
		scrollPane_1.setViewportView(tableInfo);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(getClass().getResource("/images/9.jpg")));
		label_1.setBounds(0,-22,1381,738);
		contentPane.add(label_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 11, 97, 21);
		contentPane.add(menuBar);
	}
}
