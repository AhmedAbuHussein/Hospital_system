package hospital;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;

import java.awt.Toolkit;
import java.awt.ScrollPane;

import javax.swing.JScrollPane;

public class doctorinfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table;
	private JTable table_1;
	
		
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doctorinfo frame = new doctorinfo();
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
	public doctorinfo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\programs java\\hospital\\resource\\s.jpeg"));
		setTitle("Hospital management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(1450, 705);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setToolTipText("");
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHospitalSystem = new JLabel("Hospital System");
		lblHospitalSystem.setIcon(new ImageIcon(doctorinfo.class.getResource("/images/sh4.png")));
		lblHospitalSystem.setBounds(511, 0, 403, 89);
		lblHospitalSystem.setForeground(new Color(178, 34, 34));
		lblHospitalSystem.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(lblHospitalSystem);
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setBounds(73, 91, 132, 21);
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblId.setForeground(new Color(0, 0, 128));
		contentPane.add(lblId);
		
		JLabel lblNewLabel = new JLabel("First Name : ");
		lblNewLabel.setBounds(73, 134, 132, 21);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name : ");
		lblLastName.setBounds(73, 174, 111, 22);
		lblLastName.setForeground(new Color(0, 0, 128));
		lblLastName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblLastName);
		
		JLabel lblNewLabel_1 = new JLabel("Phone : ");
		lblNewLabel_1.setBounds(73, 216, 101, 22);
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date of birth : ");
		lblNewLabel_2.setBounds(73, 249, 132, 26);
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Blood Group : ");
		lblNewLabel_3.setBounds(73, 286, 111, 22);
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
		label.setBounds(55, 303, 46, 14);
		contentPane.add(label);
		
		JLabel lblEmail = new JLabel("E-mail : ");
		lblEmail.setBounds(73, 341, 132, 21);
		lblEmail.setForeground(new Color(0, 0, 128));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(176, 91, 167, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 134, 167, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(176, 171, 167, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(176, 207, 167, 31);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(176, 249, 167, 29);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(176, 286, 167, 31);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(176, 337, 167, 31);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
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
		
		JLabel lblSpeciality = new JLabel("Speciality : ");
		lblSpeciality.setBounds(595, 174, 75, 22);
		lblSpeciality.setForeground(new Color(0, 0, 128));
		lblSpeciality.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblSpeciality);
		
		JLabel lblNewLabel_4 = new JLabel("Departement : ");
		lblNewLabel_4.setBounds(595, 216, 111, 22);
		lblNewLabel_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Qualification : ");
		lblNewLabel_5.setBounds(595, 258, 93, 22);
		lblNewLabel_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Academies : ");
		lblNewLabel_6.setBounds(606, 311, 93, 22);
		lblNewLabel_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblNewLabel_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(727, 131, 187, 29);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(727, 91, 187, 27);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(727, 175, 187, 27);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(727, 212, 187, 26);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(727, 258, 187, 26);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(727, 303, 187, 30);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblDays = new JLabel("Days : ");
		lblDays.setBounds(997, 54, 139, 31);
		lblDays.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblDays.setForeground(new Color(0, 0, 128));
		contentPane.add(lblDays);
		ButtonGroup button_group=new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Saturday");
		rdbtnNewRadioButton.setBounds(997, 91, 109, 23);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 128));
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Sunday");
		rdbtnNewRadioButton_1.setBounds(997, 118, 109, 23);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 128));
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Monday");
		rdbtnNewRadioButton_2.setForeground(new Color(0, 0, 128));
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnNewRadioButton_2.setBounds(997, 144, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Tuseday");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnNewRadioButton_3.setForeground(new Color(0, 0, 128));
		rdbtnNewRadioButton_3.setBounds(997, 175, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Wedensday");
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnNewRadioButton_4.setForeground(new Color(0, 0, 128));
		rdbtnNewRadioButton_4.setBounds(997, 211, 104, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Thurthday");
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnNewRadioButton_5.setForeground(new Color(0, 0, 128));
		rdbtnNewRadioButton_5.setBounds(997, 241, 109, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Friday");
		rdbtnNewRadioButton_6.setForeground(new Color(0, 0, 128));
		rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnNewRadioButton_6.setBounds(997, 273, 109, 23);
		contentPane.add(rdbtnNewRadioButton_6);
		button_group.add(rdbtnNewRadioButton);
		button_group.add(rdbtnNewRadioButton_1);
		button_group.add( rdbtnNewRadioButton_2);
		button_group.add(rdbtnNewRadioButton_3);
		button_group.add(rdbtnNewRadioButton_4);
		button_group.add(rdbtnNewRadioButton_5);
		button_group.add(rdbtnNewRadioButton_6);
		
		
		JLabel lblNewLabel_7 = new JLabel("Time from : ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_7.setForeground(new Color(0, 0, 128));
		lblNewLabel_7.setBounds(1128, 91, 122, 21);
		contentPane.add(lblNewLabel_7);
		
		textField_13 = new JTextField();
		textField_13.setBounds(1123, 125, 174, 26);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(1128, 216, 169, 22);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblTimeTo = new JLabel("Time to : ");
		lblTimeTo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblTimeTo.setForeground(new Color(0, 0, 128));
		lblTimeTo.setBounds(1128, 171, 122, 22);
		contentPane.add(lblTimeTo);
		
		JButton btnNewButton = new JButton("Save ");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.setBounds(450, 376, 95, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setForeground(new Color(178, 34, 34));
		btnNewButton_1.setBounds(580, 376, 112, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_2.setForeground(new Color(178, 34, 34));
		btnNewButton_2.setBounds(714, 376, 111, 31);
		//btnNewButton_2.addActionListener(hd);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_3.setForeground(new Color(178, 34, 34));
		btnNewButton_3.setBounds(997, 336, 109, 31);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_4.setForeground(new Color(178, 34, 34));
		btnNewButton_4.setBounds(1147, 336, 103, 31);
		contentPane.add(btnNewButton_4);
		
		JLabel lblDoctorInformation = new JLabel("Doctor information");
		lblDoctorInformation.setIcon(new ImageIcon("F:\\programs java\\hospital\\resource\\nurs.png"));
		lblDoctorInformation.setForeground(new Color(0, 0, 128));
		lblDoctorInformation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblDoctorInformation.setBounds(100, 32, 237, 50);
		contentPane.add(lblDoctorInformation);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(822, 463, 510, 192);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
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
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(84, 463, 697, 192);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
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
		scrollPane_1.setViewportView(table_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(doctorinfo.class.getResource("/images/9.jpg")));
		label_1.setBounds(0,0,1487,705);
		contentPane.add(label_1);
	}
}