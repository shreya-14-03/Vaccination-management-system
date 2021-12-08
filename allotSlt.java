/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccine.management.system;

/**
 *
 * @author MANOJ
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class AllotSlot extends JFrame implements ActionListener{

    private JPanel contentPane;
    JDateChooser dateChooser;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    private JButton b1,b2,b3,b4;

    public static void main(String[] args) {
	new AllotSlot().setVisible(true);
			
    }

    public AllotSlot() {
        setBounds(300, 200, 900, 500);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("lot_id");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(new Color(47, 79, 79));
	l1.setBounds(30, 63, 100, 23);
	contentPane.add(l1);
        
        JLabel l2= new JLabel("Vaccine_type");
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setForeground(new Color(47, 79, 79));
	l2.setBounds(30, 97,100,23);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Centre name");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(30, 131,100,23);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Doses available");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(30, 165, 100, 23);
	contentPane.add(l4);

	JLabel l5 = new JLabel("Price");
	l5.setForeground(new Color(47, 79, 79));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(30, 198, 100, 23);
	contentPane.add(l5);



	t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(126, 66, 86, 20);
	contentPane.add(t1);
	
	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b1.setBounds(234, 59, 100, 30);
        
	contentPane.add(b1);

	t2 = new JTextField();
	t2.setEditable(false);
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setBounds(126, 100, 208, 20);
	contentPane.add(t2);
	t2.setColumns(10);

	t3 = new JTextField();
	t3.setEditable(false);
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(126, 131, 208, 20);
	contentPane.add(t3);

	t4 = new JTextField();
	t4.setEditable(false);
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(126, 168, 208, 20);
	contentPane.add(t4);
        
        t5 = new JTextField();
        t5.setEditable(false);
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(126, 198, 208, 20);
	contentPane.add(t5);

	


	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Allot-Slot",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setFont(new Font("Tahoma", Font.BOLD, 14));
	panel.setBounds(10, 38, 345, 288);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);

	JLabel l6 = new JLabel("User_id");
	l6.setForeground(new Color(47, 79, 79));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(384, 63, 100, 23);
	contentPane.add(l6);

	JLabel l7 = new JLabel("Name");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(384, 103, 100, 23);
	contentPane.add(l7);

	JLabel l8 = new JLabel("Father's Name");
	l8.setForeground(new Color(47, 79, 79));
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(384, 147, 100, 23);
	contentPane.add(l8);

	JLabel l9 = new JLabel("State");
	l9.setForeground(new Color(47, 79, 79));
	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
	l9.setBounds(384, 187, 100, 23);
	contentPane.add(l9);

	JLabel l10 = new JLabel("City");
	l10.setForeground(new Color(47, 79, 79));
	l10.setFont(new Font("Tahoma", Font.BOLD, 14));
	l10.setBounds(384, 233, 100, 23);
	contentPane.add(l10);

	JLabel l11 = new JLabel("Age");
	l11.setForeground(new Color(47, 79, 79));
	l11.setFont(new Font("Tahoma", Font.BOLD, 14));
	l11.setBounds(384, 284, 100, 23);
	contentPane.add(l11);

	

	
        t6 = new JTextField();
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	
	t6.setBounds(508, 66, 86,20);
	contentPane.add(t6);

	b2 = new JButton("Search");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b2.setBounds(604, 59, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

        
        t7 = new JTextField();
	t7.setForeground(new Color(47, 79, 79));
	t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t7.setEditable(false);
	t7.setColumns(10);
	t7.setBounds(508, 106, 208, 20);
	contentPane.add(t7);

	t8 = new JTextField();
	t8.setForeground(new Color(47, 79, 79));
	t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t8.setEditable(false);
	t8.setColumns(10);
	t8.setBounds(508, 150, 208, 20);
	contentPane.add(t8);

	t9 = new JTextField();
	t9.setForeground(new Color(47, 79, 79));
	t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t9.setEditable(false);
	t9.setColumns(10);
	t9.setBounds(508, 190, 208, 20);
	contentPane.add(t9);

	t10 = new JTextField();
	t10.setForeground(new Color(47, 79, 79));
	t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t10.setEditable(false);
	t10.setColumns(10);
	t10.setBounds(508, 233, 208, 20);
	contentPane.add(t10);
        
        t11= new JTextField();
	t11.setForeground(new Color(47, 79, 79));
	t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t11.setEditable(false);
	t11.setColumns(10);
	t11.setBounds(508, 284, 208, 20);
	contentPane.add(t11);

	

	

	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new TitledBorder(new LineBorder(new Color(70, 130, 180), 2, true), "User-Details",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
	panel_1.setForeground(new Color(0, 100, 0));
	panel_1.setBounds(360, 38, 378, 372);
        panel_1.setBackground(Color.WHITE);
	contentPane.add(panel_1);
        
	JLabel l15 = new JLabel(" Date of Vaccination :");
	l15.setForeground(new Color(105, 105, 105));
	l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l15.setBounds(20, 340, 118, 26);
	contentPane.add(l15);

	dateChooser = new JDateChooser();
	dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(137, 337, 200, 29);
	contentPane.add(dateChooser);

	b3 = new JButton("Allot");
	b3.addActionListener(this);
	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b3.setBounds(47, 377, 118, 33);
	b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

	b4 = new JButton("Back");
	b4.addActionListener(this);
	b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b4.setBounds(199, 377, 100, 33);
	b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        contentPane.add(b4);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from vaccine where lot_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t2.setText(rs.getString("vaccine_type"));
                    t3.setText(rs.getString("centre_name"));
                    t4.setText(rs.getString("doses_available"));
                    t5.setText(rs.getString("price"));
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b2){
                String sql = "select * from user where user_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t6.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t7.setText(rs.getString("name"));
                    t8.setText(rs.getString("father_name"));
                    t9.setText(rs.getString("state"));
                    t10.setText(rs.getString("city"));
                    t11.setText(rs.getString("age"));
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b3){
                    try{
                String sql = "insert into allotSlot(vaccine_type, username, centre_name, dateOfvaccination) values(?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t2.getText());
		st.setString(2, t7.getText());
		st.setString(3, t3.getText());
		st.setString(4, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
		int i = st.executeUpdate();
		if (i > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Slot Alloted..!");
		else
                    JOptionPane.showMessageDialog(null, "error");
                    }catch(Exception e){
                        e.printStackTrace();
                                }
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
            
            con.c.close();
        }catch(Exception e){
            
        }
    }
}
