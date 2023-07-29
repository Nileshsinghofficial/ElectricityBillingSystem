package Com.Electricty.Billing.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton login, cancel,signup;
    JTextField username, password;
    Choice logginin;
    Login(){
        super("Login Page");
        getContentPane().setBackground(new Color(255,255,255));
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(300,20,100,20);
        add(lblusername);

        username = new JTextField();
        username.setBounds(400,20, 150,20);
        add(username);


        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(300,60,100,20);
        add(lblpassword);

        password = new JTextField();
        password.setBounds(400,60,150,20);
        add(password);

        JLabel lblloginas = new JLabel("Login in as");
        lblloginas.setBounds(300,100,100,20);
        add(lblloginas);

        logginin = new Choice();
        logginin.add("Admin");
        logginin.add("Customer");
        logginin.setBounds(400,100,150,20);
        add(logginin);

        ImageIcon i1 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\logins.png");
        Image i2 = i1.getImage().getScaledInstance(14,16,Image.SCALE_SMOOTH);
        login = new JButton("Login", new ImageIcon(i2));
        login.setBounds(330,160,100,20);
        login.setBackground(new Color(0x123456));
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        ImageIcon i3 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\cancel.png");
        Image i4 = i3.getImage().getScaledInstance(16,16,Image.SCALE_SMOOTH);
        cancel = new JButton("Cancel", new ImageIcon(i4));
        cancel.setBounds(450,160,100,20);
        cancel.setBackground(new Color(0x123456));
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i5 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\signup.png");
        Image i6 = i5.getImage().getScaledInstance(16,16,Image.SCALE_SMOOTH);
        signup = new JButton("Sighup", new ImageIcon(i6));
        signup.setBounds(390,200,100,20);
        signup.setBackground(new Color(0x123456));
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);


        ImageIcon i7 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\loginuser.png");
        Image i8 = i7.getImage().getScaledInstance(230,230,Image.SCALE_SMOOTH);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(20,5,250,250);
        add(image);


        setSize(640,300);
        setLocation(400,200);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            String susername = username.getText();
            String spassword = password.getText();
            String user = logginin.getSelectedItem();

            try{
            Conn c = new Conn();
            String query = "select * from login where username ='"+susername+"' and password = '"+spassword+"' and user= '"+user+"' ";
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){
                String meter = rs.getString("meter_no");
                setVisible(false);
                Thread.sleep(1);
                new Project(user, meter);


            } else {
                JOptionPane.showMessageDialog(null,"Invalid Login");
                username.setText("");
                password.setText("");
            }
            } catch (Exception es){
                es.printStackTrace();
            }

        } else if (e.getSource() == cancel) {
            setVisible(false);

        } else if (e.getSource() == signup) {
            setVisible(false);

            new Signup();

        }


    }

    public static void main(String[] args){
        new Login();

    }


}
