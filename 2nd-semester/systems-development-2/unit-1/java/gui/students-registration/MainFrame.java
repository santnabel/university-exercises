import javax.swing.*;
public class MainFrame {
public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame window = new JFrame();
			window.setSize(280, 304);
			window.setTitle("Form");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setLocationRelativeTo(null);
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			
			JLabel lblName = new JLabel("Name:");
			lblName.setBounds(47, 20, 50, 15);
			panel.add(lblName);
			JTextField txtName = new JTextField(30);
			txtName.setBounds(100, 20, 155, 15);
			panel.add(txtName);
			
			JLabel lblID = new JLabel("Student ID:");
			lblID.setBounds(18,50,150,15);
			panel.add(lblID);
			JTextField txtID = new JTextField(9);
			txtID.setBounds(100, 50, 90, 15);
			panel.add(txtID);
			
			JLabel lblAge = new JLabel("Age:");
			lblAge.setBounds(60, 80, 50, 15);
			panel.add(lblAge);
			JTextField txtAge = new JTextField(2);
			txtAge.setBounds(100, 80, 27, 15);
			panel.add(txtAge);
			
			JLabel lblGender = new JLabel("Gender:");
			lblGender.setBounds(39,110,50,15);
			panel.add(lblGender);
			JRadioButton rdbGender1 = new JRadioButton("Male");
			rdbGender1.setBounds(95, 110, 55, 20);
			JRadioButton rdbGender2 = new JRadioButton("Female");
			rdbGender2.setBounds(150, 110, 70, 20);
			ButtonGroup btnGroup = new ButtonGroup(); // The ButtonGroup method is to make sure only one of the options can be selected.
			btnGroup.add(rdbGender1);
			btnGroup.add(rdbGender2);
			panel.add(rdbGender1);
			panel.add(rdbGender2);
			
			JLabel lblCareer = new JLabel("Career:");
			lblCareer.setBounds(44, 140, 50, 15);
			panel.add(lblCareer);
			String[] Careers = {"Systems Engineering", "Administration", "Accountancy", "Law"};
			JComboBox<String> bxCareers = new JComboBox<>(Careers);
			bxCareers.setBounds(100, 138, 140, 22);
			panel.add(bxCareers);
			
			JLabel lblScholarship = new JLabel("Scholarship:");
			lblScholarship.setBounds(12, 170, 150, 15);
			panel.add(lblScholarship);
			JCheckBox ckbScholarship = new JCheckBox("Active");
			ckbScholarship.setBounds(96, 170, 150, 15);
			panel.add(ckbScholarship);
			
			JLabel lblTransport = new JLabel("Transport:");
			lblTransport.setBounds(24,200,150,15);
			panel.add(lblTransport);
			JCheckBox ckbTransport = new JCheckBox("School Transportation");
			ckbTransport.setBounds(96, 200, 160, 15);
			panel.add(ckbTransport);
			
			JButton btnData = new JButton("Show Data");
			btnData.setBounds(8, 235, 98, 27);
			panel.add(btnData);
			btnData.addActionListener(e -> {
				if (txtName.getText().equals("") || txtID.getText().equals("") || txtAge.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "You need to fill all the labels.");
					return;
				}
				String Name = txtName.getText();
				String ID = txtID.getText();
				String Age = txtAge.getText();
				String Gender = rdbGender1.isSelected()?"Male" : "Female";
				String Career = bxCareers.getSelectedItem().toString();
				String Scholarship = ckbScholarship.isSelected()?"Active" : "Not activate";
				String Transportation = ckbTransport.isSelected()?"School" : "Other";
				JOptionPane.showMessageDialog(window, "Name: " + Name + "\nID: " + ID + "\nAge: " + Age + "\nGender: " + Gender + "\nCareer: " + Career + "\nScholarship: " + Scholarship + "\nTransport: " 
						+ Transportation);
			});
			
			JButton btnClean = new JButton("Clean");
			btnClean.setBounds(112, 235, 68, 27);
			panel.add(btnClean);
			btnClean.addActionListener( e -> {
				txtName.setText(null);
				txtID.setText(null);
				txtAge.setText(null);
				btnGroup.clearSelection();
				bxCareers.setSelectedIndex(0);
				ckbScholarship.setSelected(false);
				ckbTransport.setSelected(false);
			});
			
			JButton btnExit = new JButton("Exit");
			btnExit.setBounds(215, 235, 57, 27);
			panel.add(btnExit);
			btnExit.addActionListener(e -> {
				System.exit(0);
			});
			
			window.add(panel);
			window.setVisible(true);
		});
	}
}