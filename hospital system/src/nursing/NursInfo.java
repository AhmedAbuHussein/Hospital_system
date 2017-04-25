package nursing;

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

public class NursInfo extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private int row;
	private Panel contentPane;
	private JTable table;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtWebsite;
	private JTextField txtAddress;
	private JTextField txtSpeciality;
	private JTextField txtDepartment;
	private JTextField txtQualification;
	private JTextField txtAcademics;
	private JTextField txtId;
	private JTextField txtTimeFrom;
	private JTextField txtTimeTo;
	private JTable table_1;
	
	private JLabel lblImage;
	private JFileChooser file;
	
	
	private JButton btnSave,btnDel, btnClear ,btnDelete , btnSaveDay,btnChooseImage;
	
	private JRadioButton saturday,sunday,monday,tuesday,wednesday,thursday,friday;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NursInfo frame = new NursInfo();
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

	public NursInfo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NursInfo.class.getResource("/Images/hos.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1378, 730);
		setLocationRelativeTo(null);
		
		createFrame();
	}
	
	public void createFrame(){
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		contentPane = new Panel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//************************************************** LOGO *******************************************************************************
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(1200, 0, 84, 64);
		contentPane.add(lblLogo);
		
		JLabel lblLogoIcon = new JLabel("");
	
		lblLogoIcon.setBounds(188, 0, 40, 64);
		contentPane.add(lblLogoIcon);
		
		JLabel lblLogoIcon3 = new JLabel("");
	
		lblLogoIcon3.setBounds(87, 0, 40, 64);
		contentPane.add(lblLogoIcon3);
		
		JLabel lblLogoIcon2 = new JLabel("");
		
		lblLogoIcon2.setBounds(137, 0, 40, 64);
		contentPane.add(lblLogoIcon2);
		
		JLabel lblLogo_1 = new JLabel("logo2");
		
		lblLogo_1.setBounds(390, 0, 530, 64);
		contentPane.add(lblLogo_1);
		
		JLabel lblDate = new JLabel(new Date()+"");
		lblDate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDate.setBounds(577, 74, 236, 26);
		contentPane.add(lblDate);
		
		JLabel lblHeader = new JLabel("");
		lblHeader.setBounds(0, 0, 1387, 78);
		contentPane.add(lblHeader);
		
		//***************************************Footer ************************************************
		
		JLabel label = new JLabel("");
		label.setBounds(0, 629, 1387, 78);
		contentPane.add(label);
		
//********************************************************************************************************************************************************
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 471, 854, 159);
		contentPane.add(scrollPane);
		
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
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.GRAY, Color.LIGHT_GRAY, Color.DARK_GRAY));;
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent m){
				TableModel model2 = table.getModel();
				 row = table.getSelectedRow();
				
				txtId.setText(model2.getValueAt(row, 0).toString());
				txtFirstName.setText(model2.getValueAt(row, 1).toString());
				txtLastName.setText(model2.getValueAt(row, 2).toString());
				txtPhone.setText(model2.getValueAt(row, 3).toString());
				txtEmail.setText(model2.getValueAt(row, 6).toString());
				txtWebsite.setText(model2.getValueAt(row, 7).toString());
				txtAddress.setText(model2.getValueAt(row, 8).toString());
				txtSpeciality.setText(model2.getValueAt(row, 9).toString());
				txtDepartment.setText(model2.getValueAt(row, 10).toString());
				txtQualification.setText(model2.getValueAt(row, 11).toString());
				txtAcademics.setText(model2.getValueAt(row, 12).toString());
				lblImage.setIcon(new ImageIcon(model2.getValueAt(row, 13).toString()));
			
				
				btnSave.setText("Update");
				txtId.setEditable(false);
				
			}
			
		}) ;
		
		
		scrollPane.setViewportView(table);
		
		JLabel lblID = new JLabel("ID : ");
		lblID.setForeground(new Color(25, 25, 112));
		lblID.setBackground(Color.LIGHT_GRAY);
		lblID.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblID.setBounds(44, 131, 109, 26);
		contentPane.add(lblID);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(new Color(25, 25, 112));
		lblFirstName.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblFirstName.setBackground(Color.LIGHT_GRAY);
		lblFirstName.setBounds(44, 172, 109, 26);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(25, 25, 112));
		lblLastName.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblLastName.setBackground(Color.LIGHT_GRAY);
		lblLastName.setBounds(44, 212, 109, 26);
		contentPane.add(lblLastName);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(new Color(25, 25, 112));
		lblPhone.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblPhone.setBackground(Color.LIGHT_GRAY);
		lblPhone.setBounds(44, 255, 109, 26);
		contentPane.add(lblPhone);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setForeground(new Color(25, 25, 112));
		lblDateOfBirth.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblDateOfBirth.setBackground(Color.LIGHT_GRAY);
		lblDateOfBirth.setBounds(44, 299, 109, 26);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setForeground(new Color(25, 25, 112));
		lblBloodGroup.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblBloodGroup.setBackground(Color.LIGHT_GRAY);
		lblBloodGroup.setBounds(44, 341, 109, 26);
		contentPane.add(lblBloodGroup);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(25, 25, 112));
		lblEmail.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblEmail.setBackground(Color.LIGHT_GRAY);
		lblEmail.setBounds(44, 385, 109, 26);
		contentPane.add(lblEmail);
		
		JLabel lblWebsite = new JLabel("Website");
		lblWebsite.setForeground(new Color(25, 25, 112));
		lblWebsite.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblWebsite.setBackground(Color.LIGHT_GRAY);
		lblWebsite.setBounds(504, 131, 109, 26);
		contentPane.add(lblWebsite);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(25, 25, 112));
		lblAddress.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblAddress.setBackground(Color.LIGHT_GRAY);
		lblAddress.setBounds(504, 172, 109, 26);
		contentPane.add(lblAddress);
		
		JLabel lblSpeciality = new JLabel("Speciality");
		lblSpeciality.setForeground(new Color(25, 25, 112));
		lblSpeciality.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblSpeciality.setBackground(Color.LIGHT_GRAY);
		lblSpeciality.setBounds(504, 212, 109, 26);
		contentPane.add(lblSpeciality);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(new Color(25, 25, 112));
		lblDepartment.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblDepartment.setBackground(Color.LIGHT_GRAY);
		lblDepartment.setBounds(504, 255, 109, 26);
		contentPane.add(lblDepartment);
		
		JLabel lblQualification = new JLabel("Qualification");
		lblQualification.setForeground(new Color(25, 25, 112));
		lblQualification.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblQualification.setBackground(Color.LIGHT_GRAY);
		lblQualification.setBounds(504, 299, 109, 26);
		contentPane.add(lblQualification);
		
		JLabel lblAcademics = new JLabel("Academics");
		lblAcademics.setForeground(new Color(25, 25, 112));
		lblAcademics.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblAcademics.setBackground(Color.LIGHT_GRAY);
		lblAcademics.setBounds(504, 341, 109, 26);
		contentPane.add(lblAcademics);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtId.setBounds(179, 131, 282, 26);
		contentPane.add(txtId);
		txtId.setColumns(10);
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(179, 172, 282, 26);
		contentPane.add(txtFirstName);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtLastName.setColumns(10);
		//txtLastName.addFocusListener(HDF);
		txtLastName.setBounds(179, 216, 282, 26);
		contentPane.add(txtLastName);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtPhone.setColumns(10);
		txtPhone.setBounds(179, 259, 282, 26);
		contentPane.add(txtPhone);
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtEmail.setColumns(10);
		txtEmail.setBounds(179, 389, 282, 26);
		contentPane.add(txtEmail);
		
		txtWebsite = new JTextField();
		txtWebsite.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtWebsite.setColumns(10);
		txtWebsite.setBounds(616, 135, 282, 26);
		contentPane.add(txtWebsite);
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtAddress.setColumns(10);
		txtAddress.setBounds(616, 176, 282, 26);
		contentPane.add(txtAddress);
		txtSpeciality = new JTextField();
		txtSpeciality.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtSpeciality.setColumns(10);
		txtSpeciality.setBounds(616, 216, 282, 26);
		contentPane.add(txtSpeciality);
		
		txtDepartment = new JTextField();
		txtDepartment.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtDepartment.setColumns(10);
		txtDepartment.setBounds(616, 259, 282, 26);
		contentPane.add(txtDepartment);
		txtQualification = new JTextField();
		txtQualification.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtQualification.setColumns(10);
		txtQualification.setBounds(616, 303, 282, 26);
		contentPane.add(txtQualification);
		
		txtAcademics = new JTextField();
		txtAcademics.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtAcademics.setColumns(10);
		txtAcademics.setBounds(616, 345, 282, 26);
		contentPane.add(txtAcademics);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new TheHandler());
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(20, 60, 80));
		btnSave.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		btnSave.setBounds(471, 397, 138, 41);
		contentPane.add(btnSave);	
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new TheHandler());
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		btnClear.setBackground(new Color(20, 80, 100));
		btnClear.setBounds(616, 397, 138, 41);
		contentPane.add(btnClear);
		
		btnDel = new JButton("Delete");
		btnDel.setForeground(Color.WHITE);
		btnDel.addActionListener(new TheHandler());
		btnDel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		btnDel.setBackground(new Color(220, 60, 80));
		btnDel.setBounds(762, 397, 138, 41);
		contentPane.add(btnDel);	
		JLabel lblDoctorInformation = new JLabel("Nurseing Information");
		lblDoctorInformation.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblDoctorInformation.setBounds(97, 75, 225, 45);
		contentPane.add(lblDoctorInformation);
		
		JLabel lblDoctorDay = new JLabel("Doctor Schedule");
		lblDoctorDay.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblDoctorDay.setBounds(951, 86, 225, 45);
		contentPane.add(lblDoctorDay);
		JLabel lblDays = new JLabel("Days : ");
		lblDays.setForeground(new Color(25, 25, 112));
		lblDays.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblDays.setBackground(Color.LIGHT_GRAY);
		lblDays.setBounds(968, 131, 109, 26);
		contentPane.add(lblDays);
		JLabel lblTimeFrom = new JLabel("Time From : ");
		lblTimeFrom.setForeground(new Color(25, 25, 112));
		lblTimeFrom.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblTimeFrom.setBackground(Color.LIGHT_GRAY);
		lblTimeFrom.setBounds(951, 331, 109, 23);
		contentPane.add(lblTimeFrom);
		JLabel lblTimeTo = new JLabel("Time To : ");
		lblTimeTo.setForeground(new Color(25, 25, 112));
		lblTimeTo.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		lblTimeTo.setBackground(Color.LIGHT_GRAY);
		lblTimeTo.setBounds(951, 360, 109, 23);
		contentPane.add(lblTimeTo);
		txtTimeFrom = new JTextField();
		txtTimeFrom.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtTimeFrom.setColumns(10);
		txtTimeFrom.setBounds(1071, 329, 256, 26);
		contentPane.add(txtTimeFrom);
		txtTimeTo = new JTextField();
		txtTimeTo.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		txtTimeTo.setColumns(10);
		txtTimeTo.setBounds(1071, 360, 256, 26);
		contentPane.add(txtTimeTo);
		saturday = new JRadioButton("Saturday");
		saturday.setBackground(new Color(255, 228, 181));
		saturday.setBounds(951, 156, 84, 23);
		contentPane.add(saturday);
		sunday = new JRadioButton("Sunday");
		sunday.setBackground(new Color(255, 228, 181));
		sunday.setBounds(951, 182, 84, 23);
		contentPane.add(sunday);
		monday = new JRadioButton("Monday");
		monday.setBackground(new Color(255, 228, 181));
		monday.setBounds(951, 207, 84, 23);
		contentPane.add(monday);
	    tuesday = new JRadioButton("Tuesday ");
		tuesday.setBackground(new Color(255, 228, 181));
		tuesday.setBounds(951, 233, 84, 23);
		contentPane.add(tuesday);
		wednesday = new JRadioButton("Wednesday");
		wednesday.setBackground(new Color(255, 228, 181));
		wednesday.setBounds(951, 259, 84, 23);
		contentPane.add(wednesday);
		thursday = new JRadioButton("Thursday");
		thursday.setBackground(new Color(255, 228, 181));
		thursday.setBounds(951, 285, 84, 23);
		contentPane.add(thursday);
		friday = new JRadioButton("Friday");
		friday.setBackground(new Color(255, 228, 181));
		friday.setBounds(951, 310, 84, 23);
		contentPane.add(friday);	
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(saturday);
		btnGroup.add(sunday);
		btnGroup.add(monday);
		btnGroup.add(tuesday);
		btnGroup.add(wednesday);
		btnGroup.add(thursday);
		btnGroup.add(friday);
		btnSaveDay = new JButton("Save");
		btnSaveDay.setForeground(Color.WHITE);
		btnSaveDay.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		btnSaveDay.setBackground(new Color(20, 60, 80));
		btnSaveDay.setBounds(1001, 397, 138, 41);
		contentPane.add(btnSaveDay);
		btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		btnDelete.setBackground(new Color(20, 80, 100));
		btnDelete.setBounds(1146, 397, 138, 41);
		contentPane.add(btnDelete);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(951, 471, 393, 159);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
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
		final TableModel model ;
	//	table_1.setModel(DbUtils.resultSetToTableModel(SQLCon.SQLConnection("select * from company")));
		model = table_1.getModel();
		
		table_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
				int row = table_1.getSelectedRow();
				int col = table_1.getSelectedColumn();
				System.out.println(model.getValueAt(row, col).toString());
				model.setValueAt(model.getValueAt(row, col),0, 0);
				
				String s =null;
				for(int i=0;i<table_1.getColumnCount();i++){
					s = model.getValueAt(row, i).toString();
					System.out.print(s+" : ");
				}
				System.out.println();
			}
		});
		
		
		
	
		scrollPane_1.setViewportView(table_1);
	
//*********************************************************** set image **********************************************
		lblImage = new JLabel("");
		ImageIcon img = new ImageIcon("C:\\Users\\Ahmed Shaker\\Desktop\\9.png");
		
		lblImage.setIcon(img);
		lblImage.setBackground(Color.GRAY);
		lblImage.setBounds(1152, 83, 167, 186);
		contentPane.add(lblImage);
		
		JLabel lblborder = new JLabel("");
		lblborder.setIcon(new ImageIcon(NursInfo.class.getResource("/Images/border.png")));
		lblborder.setBackground(Color.GRAY);
		lblborder.setBounds(1146, 75, 181, 206);
		contentPane.add(lblborder);
		
		btnChooseImage = new JButton("Choose Image");
		btnChooseImage.addActionListener(new TheHandler());
		lblImage.setLabelFor(btnChooseImage);
		btnChooseImage.setBounds(1181, 285, 115, 23);
		contentPane.add(btnChooseImage);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", ""}));
		comboBox.setBounds(178, 300, 84, 26);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(278, 300, 84, 26);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setBounds(377, 300, 84, 26);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		comboBox_3.setBounds(179, 342, 273, 26);
		contentPane.add(comboBox_3);
		
		
		
//********************************************************************************************************************
	}
	
	private class TheHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==btnClear){
				
			
				
				btnSave.setText("Save");
				txtId.setText("");
				txtId.setEditable(true);
				txtWebsite.setText("");
				txtAcademics.setText("");
				txtAddress.setText("");
				txtDepartment.setText("");
				txtEmail.setText("");
				txtFirstName.setText("");
				txtLastName.setText("");
				txtPhone.setText("");
				txtQualification.setText("");
				txtSpeciality.setText("");
			
				lblImage.setIcon(null);
				
			}
			
			}
		
		
		
			}
}