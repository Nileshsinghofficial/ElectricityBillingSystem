package Com.Electricty.Billing.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class MeterInfo extends JFrame  implements ActionListener {
    JTextField tfname, tfaddress, tfstate, tfcity, tfemail, tfphone;
    JButton next, cancel;
    JLabel lblmeter;
    Choice meterlocation, metertype,phasecode,billtype;
    String meternumber;
    MeterInfo(String meternumber){
        this.meternumber = meternumber;
        setSize(700, 500);
        setLocation(400, 200);


        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(0x92356BA0, true));
        add(p);

        JLabel heading = new JLabel("Meter Information");
        heading.setBounds(180, 10, 200, 20);
        heading.setFont(new Font("Seguin Print", Font.PLAIN, 24));
        p.add(heading);

        JLabel lblname = new JLabel("Meter Number");
        lblname.setBounds(100, 80, 100, 20);
        p.add(lblname);

        JLabel lblmeternumber = new JLabel(meternumber);
        lblmeternumber.setBounds(240, 80, 100, 20);
        p.add(lblmeternumber);

        JLabel lblmeterno = new JLabel("Meter Location");
        lblmeterno.setBounds(100, 120, 100, 20);
        p.add(lblmeterno);

        meterlocation = new Choice();
        meterlocation.add("Outside");
        meterlocation.add("Inside");
        meterlocation.setBounds(240, 120, 200, 20);
        p.add(meterlocation);


        JLabel lbladdress = new JLabel("Meter Type");
        lbladdress.setBounds(100, 160, 100, 20);
        p.add(lbladdress);

        metertype = new Choice();
        metertype.add("Smart Meter");
        metertype.add("Electric Meter");
        metertype.add("Solar Meter");
        metertype.add("LPG Meter");
        metertype.setBounds(240, 160, 200, 20);
        p.add(metertype);

        JLabel lblcity = new JLabel("Phase Code");
        lblcity.setBounds(100, 200, 100, 20);
        p.add(lblcity);

        phasecode = new Choice();
        phasecode.add("012");
        phasecode.add("013");
        phasecode.add("021");
        phasecode.add("022");
        phasecode.add("031");
        phasecode.add("032");
        phasecode.add("041");
        phasecode.add("055");
        phasecode.setBounds(240, 200, 200, 20);
        p.add(phasecode);

        JLabel lblstate = new JLabel("Bill Type");
        lblstate.setBounds(100, 240, 100, 20);
        p.add(lblstate);

        billtype = new Choice();
        billtype.add("Commercial");
        billtype.add("Individual");
        billtype.add("Industrial");
        billtype.setBounds(240, 240, 200, 20);
        p.add(billtype);

        JLabel lblemail = new JLabel("Days");
        lblemail.setBounds(100, 280, 100, 20);
        p.add(lblemail);

        JLabel lblemails = new JLabel(" 30 Days");
        lblemails.setBounds(240, 280, 100, 20);
        p.add(lblemails);

        JLabel lblphone = new JLabel("Note");
        lblphone.setBounds(100, 320, 100, 20);
        p.add(lblphone);

        JLabel lblphones = new JLabel("By Default Bill is calculated for 30 Days Only");
        lblphones.setBounds(240, 320, 500, 20);
        p.add(lblphones);

        next = new JButton("Submit");
        next.setBounds(220,390,100,25);
        next.setBackground(new Color(0x123456));
        next.setForeground(new Color(255,255,255));
        next.addActionListener(this);
        p.add(next);


        setLayout(new BorderLayout());
        add(p,"Center");
        ImageIcon i1 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\signupp.png");
        Image i2 = i1.getImage().getScaledInstance(140,280, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image,"West");
        getContentPane().setBackground(Color.WHITE);




        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==next){
            String meter = meternumber;
            String location =  meterlocation.getSelectedItem();
            String type =  metertype.getSelectedItem();
            String code = phasecode.getSelectedItem();
            String typebill = billtype.getSelectedItem();
            String days = "30";

            String query = "insert into meter_info values('"+meter+"','"+location+"','"+type+"','"+code+"','"+typebill+"','"+days+"')";

            try{
                Conn c  = new Conn();
                c.s.executeUpdate(query);


                JOptionPane.showMessageDialog(null,"Meter Information Added Successfully");
                setVisible(false);
            } catch (Exception ae){
                ae.printStackTrace();
            }
        } else {
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new MeterInfo("");
    }


}
