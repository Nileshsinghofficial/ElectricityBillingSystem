package Com.Electricty.Billing.System;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewInformation extends JFrame implements ActionListener{

    JButton cancel;
    ViewInformation(String meter) {
        setBounds(350, 150, 850, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel heading = new JLabel("VIEW CUSTOMER INFORMATION");
        heading.setBounds(230, 0, 500, 40);
        heading.setFont(new Font("Seguin Print", Font.BOLD, 24));
        add(heading);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(70, 80, 100, 20);
        add(lblname);

        JLabel name = new JLabel("");
        name.setBounds(240, 80, 100, 20);
        add(name);

        JLabel lblmeternumber = new JLabel("Meter Number");
        lblmeternumber.setBounds(70, 140, 100, 20);
        add(lblmeternumber);

        JLabel meternumber = new JLabel("");
        meternumber.setBounds(240, 140, 100, 20);
        add(meternumber);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(70, 200, 100, 20);
        add(lbladdress);

        JLabel address = new JLabel("");
        address.setBounds(240, 200, 200, 20);
        add(address);

        JLabel lblcity = new JLabel("City");
        lblcity.setBounds(70, 260, 100, 20);
        add(lblcity);

        JLabel city = new JLabel("");
        city.setBounds(240, 260, 100, 20);
        add(city);

        JLabel lblstate = new JLabel("State");
        lblstate.setBounds(500, 80, 100, 20);
        add(lblstate);

        JLabel state = new JLabel("");
        state.setBounds(640, 80, 100, 20);
        add(state);

        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(500, 140, 100, 20);
        add(lblemail);

        JLabel email = new JLabel("");
        email.setBounds(640, 140, 200, 20);
        add(email);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(500, 200, 100, 20);
        add(lblphone);

        JLabel phone = new JLabel("");
        phone.setBounds(640, 200, 100, 20);
        add(phone);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where meter_no = '"+meter+"'");
            while(rs.next()) {
                name.setText(rs.getString("name"));
                address.setText(rs.getString("address"));
                city.setText(rs.getString("city"));
                state.setText(rs.getString("state"));
                email.setText(rs.getString("email"));
                phone.setText(rs.getString("phone"));
                meternumber.setText(rs.getString("meter_no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        cancel = new JButton("Cancel");
        cancel.setBackground(new Color(0x123456));
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(350, 340, 100, 25);
        add(cancel);
        cancel.addActionListener(this);

        ImageIcon i1 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\View.png");
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 380, 200, 200);
        add(image);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new ViewInformation("");
    }
}
