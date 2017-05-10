package report;
//this is jui & handler for report by shymaa hossny


import handler.HandlerFocus;
import handler.HandlerMotion;
import investigation.investigation;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;

import net.proteanit.sql.DbUtils;
import nursing.NursInfo;
import patient.Patient;
import patient.PatientStatus;
import pharmacy.Medical;
import sqlconnection.SQLCon;
import doctors.Doctor;

public class Report extends JFrame {

	private Panal contentPane;
	private JLabel lblLogo;
	private JLabel lblLogoIcon;
	private JLabel lblLogoIcon3;
	private JLabel lblLogoIcon2;
	private JLabel lblLogo_1;
	private JLabel lblDate;
	private JLabel label;
	private JLabel lblHeader;
	private JTextField txtsearch;
	private JTextField txtSsn;
	private JTextField txtPatientName;
	
	private JTable table,temp;
	private HandlerMotion hdm;
	private HandlerFocus hdf;
	private JTextArea txtDocReport, txtInves;
	private String name,spc;
	private JButton btnReport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report("","");
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
	public Report(String name,String spc) {
		this.name=name;
		this.spc=spc;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1730, 735);
		setLocationRelativeTo(null);
		

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
				new Doctor(Report.this.name,Report.this.spc).setVisible(true);
			}
			
		});
		
		JMenuItem mntmPatientStatus = new JMenuItem("patient status");
		mnDoctorManagement.add(mntmPatientStatus);
		mntmPatientStatus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(Report.this.name,Report.this.spc).setVisible(true);
				
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
		        new Medical(Report.this.name,Report.this.spc).setVisible(true);
				
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
				new investigation(Report.this.name,Report.this.spc).setVisible(true);
			}
			
		});
		
		JMenuItem mntmPatientStatus_1 = new JMenuItem("patient status");
		mnInvestigations.add(mntmPatientStatus_1);
		mntmPatientStatus_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(Report.this.name,Report.this.spc).setVisible(true);
				
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
				new  NursInfo(Report.this.name,Report.this.spc).setVisible(true);
			}
		});
		
		JMenuItem mntmPatientStatus_2 = new JMenuItem("patient status");
		mnNursing.add(mntmPatientStatus_2);
		mntmPatientStatus_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new PatientStatus(Report.this.name,Report.this.spc).setVisible(true);
				
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
      new Doctor(Report.this.name,Report.this.spc).setVisible(true);				
			}
		});
		
		
		JMenuItem mntmNurseInformation_1 = new JMenuItem("nurse information");
		mnAdminManagement.add(mntmNurseInformation_1);
mntmNurseInformation_1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new  NursInfo(Report.this.name,Report.this.spc).setVisible(true);
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
				new investigation(Report.this.name,Report.this.spc).setVisible(true);
				
			}
		});
		
		
		JMenuItem mntmPatientInformation = new JMenuItem("patient information");
		mnAdminManagement.add(mntmPatientInformation);
		mntmPatientInformation.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				new Patient(Report.this.name,Report.this.spc).setVisible(true);
				
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
				new Report(Report.this.name,Report.this.spc).setVisible(true);
				
			}
		});
		
		
		JMenuItem mntmPharmacyReport = new JMenuItem("pharmacy report");
		mnReport.add(mntmPharmacyReport);
		mntmPharmacyReport.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				new Report(Report.this.name,Report.this.spc).setVisible(true);
				
				
			}
		});
		
		
		
		
		
		contentPane = new Panal();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		hdm =  new HandlerMotion();
		hdf = new HandlerFocus();
		//********************************** logo *****************************//
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
			
	    label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("/Images/header.png")));
		label.setBounds(0, 629, 1387, 72);
		contentPane.add(label);
			
		
		
		txtsearch = new JTextField();
		txtsearch.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			
					int ssn = Integer.parseInt(txtsearch.getText());
					
					String sql;
					
					if(txtsearch.getText().trim().equals(""))
						sql = "select * from patient_statues";
					else
					sql = "select * from patient_statues where ssn ="+ssn;
					
					ResultSet rs = SQLCon.SQLConnection(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
							
			}
				
			}
		);
		txtsearch.setBounds(543, 104, 202, 32);
		txtsearch.addFocusListener(hdf);
		contentPane.add(txtsearch);
		txtsearch.setColumns(10);
		txtsearch.addActionListener(new The_Handeler());
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try{
					int ssn = Integer.parseInt(txtsearch.getText());
					
					String sql;
					
					if(txtsearch.getText().trim().equals(""))
						sql = "select * from patient_statues";
					else
					sql = "select * from patient_statues where ssn ="+ssn;
					
					ResultSet rs = SQLCon.SQLConnection(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));

				
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
							
			}
		});
		btnNewButton.addActionListener(new The_Handeler());
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground( Color.white);
		btnNewButton.addMouseListener(hdm);
		btnNewButton.setBackground(new Color(20,30,60));
		btnNewButton.setBounds(781, 103, 125, 32);
		contentPane.add(btnNewButton);
		
		
		
		
		
		
		
		
	
		
		txtSsn = new JTextField();
		txtSsn.setBounds(156, 219, 413, 40);
		txtSsn.addFocusListener(hdf);
		contentPane.add(txtSsn);
		txtSsn.setColumns(10);
		
		
		JLabel lblSsn = new JLabel("search by ssn");
		lblSsn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsn.setForeground(new Color(0, 0, 0));
		lblSsn.setBounds(408, 106, 125, 28);
		lblSsn.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSsn.setBackground(new Color(20,30,60));		
		contentPane.add(lblSsn);
		
		
		JLabel lblNewLabel = new JLabel("Patient SSN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(157, 185, 113, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Doctor Report");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(156, 278, 114, 23);
		contentPane.add(lblNewLabel_1);
		
		txtPatientName = new JTextField();
		txtPatientName.setBounds(781, 219, 413, 40);
		txtPatientName.addFocusListener(hdf);
		contentPane.add(txtPatientName);
		txtPatientName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Patient Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(781, 194, 125, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Investigation Report");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(781, 283, 172, 18);
		contentPane.add(lblNewLabel_3);
		
		btnReport = new JButton("Report PDF");
		btnReport.addActionListener(new The_Handeler());
		btnReport.setForeground( Color.white);
		btnReport.addMouseListener(hdm);
		btnReport.setBackground(new Color(20,30,60));
		btnReport.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReport.setBounds(620, 352, 125, 32);
		contentPane.add(btnReport);
		
		
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(505, 648, -278, -134);
		contentPane.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(881, 627, -628, -129);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(156, 414, 1038, 216);
		contentPane.add(scrollPane_2);
		temp = new JTable();
		
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
		table.setModel(DbUtils.resultSetToTableModel(rs));
		
		
		
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
			
			
				
				int row = table.getSelectedRow();
				txtSsn.setText(table.getValueAt(row, 0).toString());
				txtDocReport.setText(table.getValueAt(row, 1).toString());
				txtInves.setText(table.getValueAt(row, 2).toString());
				
				ResultSet rss = SQLCon.SQLConnection("select name from patient "
						+ "where SSN = "+Integer.parseInt(table.getValueAt(row, 0).toString()));
				temp.setModel(DbUtils.resultSetToTableModel(rss));
				txtPatientName.setText(temp.getValueAt(0, 0).toString());
			}
		});
		
		scrollPane_2.setViewportView(table);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(156, 312, 413, 72);
		contentPane.add(scrollPane_3);
		
		txtDocReport = new JTextArea();
		txtDocReport.setLineWrap(true);
		txtDocReport.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		txtDocReport.addFocusListener(hdf);
		txtDocReport.setWrapStyleWord(true);
		scrollPane_3.setViewportView(txtDocReport);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(781, 312, 413, 72);
		contentPane.add(scrollPane_4);
		
		txtInves = new JTextArea();
		txtInves.setLineWrap(true);
		txtInves.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		txtInves.addFocusListener(hdf);
		txtInves.setWrapStyleWord(true);
		scrollPane_4.setViewportView(txtInves);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				txtDocReport.setText("");
				txtPatientName.setText("");
				txtInves.setText("");
				txtSsn.setText("");
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnClear.setBackground(new Color(20, 30, 60));
		btnClear.setBounds(620, 309, 125, 32);
		contentPane.add(btnClear);
		
		JLabel lblNewLabel_4 = new JLabel("Dr : ");
		lblNewLabel_4.setBounds(10, 650, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(66, 648, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblDr = new JLabel("Dr :");
		lblDr.setBounds(39, 650, 46, 14);
		contentPane.add(lblDr);
		
		
		
		/*JLabel lblNewLabel_5 = new JLabel(new Date()+"");
		lblNewLabel_5.setBounds(543, 71, 202, 22);
		contentPane.add(lblNewLabel_5);*/
	}
	private class The_Handeler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btnReport){
				
				JTable temp = new JTable();
				if(!txtSsn.getText().trim().equals("")){
					temp.setModel(DbUtils.resultSetToTableModel(SQLCon.SQLConnection("select * from patient"
							+ " where SSN = "+Integer.parseInt(txtSsn.getText()))));
					String[]listString ={"SSN : "+temp.getValueAt(0, 0).toString(),"Name : "+temp.getValueAt(0, 1).toString()
										,"Gender : "+temp.getValueAt(0, 2).toString(),"Phone : "+temp.getValueAt(0, 3).toString()
										,"Age : "+temp.getValueAt(0, 4).toString(),"Address : "+temp.getValueAt(0, 5).toString()
										,"Marital Statues : "+temp.getValueAt(0, 6).toString(),"Weight : "+temp.getValueAt(0, 7).toString(),};
					
					temp.setModel(DbUtils.resultSetToTableModel(SQLCon.SQLConnection("select * from patient_statues"
							+ " where SSN = "+Integer.parseInt(txtSsn.getText()))));
					String []tableHeader={"SSN","Doctor Report","Investigation report","Investigation Type"};
					String []tableData = {table.getValueAt(0, 0).toString(),
										  table.getValueAt(0, 1).toString(),
										  table.getValueAt(0, 2).toString(),
										  table.getValueAt(0, 3).toString()};
					
					
					try {
						String file ="E:\\"+JOptionPane.showInputDialog(null, "Enter Report File Name")+".pdf";
						
			             Document document = new Document();
			             PdfWriter.getInstance(document, new FileOutputStream(file));
			             document.open();
			             TextPDF.addTitlePage(document,name,"");
			             TextPDF.addContent(document,listString,tableHeader,tableData);
			             document.close();
			             JOptionPane.showMessageDialog(null, "Done Successful");
				     } catch (Exception ee) {
				             ee.printStackTrace();
				     }
				}else{
					JOptionPane.showMessageDialog(null, "plz select patient in table");
					return;
				}
			}else{
				ResultSet rss;
				if(txtsearch.getText().equals(""))
				{
					rss=SQLCon.SQLConnection("select * from patient_statues");
					table.setModel(DbUtils.resultSetToTableModel(rss));
				}
				else
				{
					rss=SQLCon.SQLConnection("select * from patient_statues where ssn="+Integer.parseInt(txtsearch.getText()));
					table.setModel(DbUtils.resultSetToTableModel(rss));
				}
			}
		}
	}
}
