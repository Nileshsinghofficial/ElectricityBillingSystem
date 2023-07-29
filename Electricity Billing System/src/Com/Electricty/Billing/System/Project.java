package Com.Electricty.Billing.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
        String atype,meter;
        Project(String atype, String meter){
            this.atype = atype;
            this.meter = meter;
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            ImageIcon i1 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\Projectscr1.jpg");
            Image i2 = i1.getImage().getScaledInstance(1536,853, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            add(image);

        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);

        JMenu master = new JMenu("Master");
        master.setForeground(Color.BLUE);
        master.setFont(new Font("Seguin Print" ,Font.BOLD, 16));


        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("Seguin Print",Font.BOLD,14));
        newcustomer.setBackground(new Color(0x123456));
        newcustomer.setForeground(new Color(249,255, 251));
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\signup.png");
        Image image1 = icon1.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        newcustomer.setIcon(new ImageIcon(image1));
        newcustomer.setMnemonic('N');
        newcustomer.addActionListener(this);
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_MASK));
        master.add(newcustomer);

        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("Seguin Print",Font.BOLD,14));
        customerdetails.setBackground(new Color(0x123456));
        customerdetails.setForeground(new Color(249,255, 251));
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\customerdetail.png");
        Image image2 = icon2.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        customerdetails.setIcon(new ImageIcon(image2));
        customerdetails.setMnemonic('C');
        customerdetails.addActionListener(this);
        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_MASK));
        master.add(customerdetails);

        JMenuItem depositdetails = new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("Seguin Print",Font.BOLD,14));
        depositdetails.setBackground(new Color(0x123456));
        depositdetails.setForeground(new Color(249,255, 251));
        ImageIcon icon3 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\depositdetail.png");
        Image image3 = icon3.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        depositdetails.setIcon(new ImageIcon(image3));
        depositdetails.setMnemonic('D');
        depositdetails.addActionListener(this);
        depositdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,KeyEvent.CTRL_MASK));
        master.add(depositdetails);

        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("Seguin Print",Font.BOLD,14));
        calculatebill.setBackground(new Color(0x123456));
        calculatebill.setForeground(new Color(249,255, 251));
        ImageIcon icon4 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\calculator.png");
        Image image4 = icon4.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        calculatebill.setIcon(new ImageIcon(image4));
        calculatebill.setMnemonic('A');
        calculatebill.addActionListener(this);
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_MASK));
        master.add(calculatebill);

        JMenu info = new JMenu("Information");
        info.setForeground(Color.RED);
        info.setFont(new Font("Seguin Print" ,Font.BOLD, 16));


        JMenuItem  updateinformation = new JMenuItem("Update Information");
        updateinformation.setFont(new Font("Seguin Print",Font.BOLD,14));
        updateinformation.setBackground(new Color(0x123456));
        updateinformation.setForeground(new Color(249,255, 251));
        ImageIcon icon5 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\Update.png");
        Image image5 = icon5.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        updateinformation.setIcon(new ImageIcon(image5));
        updateinformation.setMnemonic('U');
        updateinformation.addActionListener(this);
        updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,KeyEvent.CTRL_MASK));
        info.add(updateinformation);

        JMenuItem viewinformation = new JMenuItem("View Information");
        viewinformation.setFont(new Font("Seguin Print",Font.BOLD,14));
        viewinformation.setBackground(new Color(0x123456));
        viewinformation.setForeground(new Color(249,255, 251));
        ImageIcon icon6 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\Viewinfo.png");
        Image image6 = icon6.getImage().getScaledInstance(18,18,Image.SCALE_SMOOTH);
        viewinformation.setIcon(new ImageIcon(image6));
        viewinformation.setMnemonic('V');
        viewinformation.addActionListener(this);
        viewinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_MASK));
        info.add(viewinformation);

        JMenu user = new JMenu("User");
        user.setForeground(Color.BLUE);
        user.setFont(new Font("Seguin Print" ,Font.BOLD, 16));


        JMenuItem  paybill = new JMenuItem("Pay Bill");
        paybill.setFont(new Font("Seguin Print",Font.BOLD,14));
        paybill.setBackground(new Color(0x123456));
        paybill.setForeground(new Color(249,255, 251));
        ImageIcon icon7 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\paybill.png");
        Image image7 = icon7.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        paybill.setIcon(new ImageIcon(image7));
        paybill.setMnemonic('P');
        paybill.addActionListener(this);
        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_MASK));
        user.add(paybill);

        JMenuItem billdetails = new JMenuItem("Bill Details");
        billdetails.setFont(new Font("Seguin Print",Font.BOLD,14));
        billdetails.setBackground(new Color(0x123456));
        billdetails.setForeground(new Color(249,255, 251));
        ImageIcon icon8 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\billdetail.png");
        Image image8 = icon8.getImage().getScaledInstance(18,18,Image.SCALE_SMOOTH);
        billdetails.setIcon(new ImageIcon(image8));
        billdetails.setMnemonic('B');
        billdetails.addActionListener(this);
        billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,KeyEvent.CTRL_MASK));
        user.add(billdetails);

        JMenu report = new JMenu("Report");
        report.setForeground(Color.RED);
        report.setFont(new Font("Seguin Print" ,Font.BOLD, 16));


        JMenuItem  generatebill  = new JMenuItem("Generate Bill");
        generatebill.setFont(new Font("Seguin Print",Font.BOLD,14));
        generatebill.setBackground(new Color(0x123456));
        generatebill.setForeground(new Color(249,255, 251));
        ImageIcon icon9 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\generatebill.png");
        Image image9 = icon9.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        generatebill.setIcon(new ImageIcon(image9));
        generatebill.setMnemonic('G');
        generatebill.addActionListener(this);
        generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,KeyEvent.CTRL_MASK));
        report.add(generatebill);

        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.blue);
        utility.setFont(new Font("Seguin Print" ,Font.BOLD, 16));


        JMenuItem notepad  = new JMenuItem("Notepad");
        notepad.setFont(new Font("Seguin Print",Font.BOLD,14));
        notepad.setBackground(new Color(0x123456));
        notepad.setForeground(new Color(249,255, 251));
        ImageIcon icon10 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\notepad.png");
        Image image10 = icon10.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        notepad.setIcon(new ImageIcon(image10));
        notepad.setMnemonic('O');
        notepad.addActionListener(this);
        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_MASK));
        utility.add(notepad);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("Seguin Print",Font.BOLD,14));
        calculator.setBackground(new Color(0x123456));
        calculator.setForeground(new Color(249,255, 251));
        ImageIcon icon11 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\calculator.png");
        Image image11 = icon11.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        calculator.setIcon(new ImageIcon(image11));
        calculator.setMnemonic('L');
        calculator.addActionListener(this);
        calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,KeyEvent.CTRL_MASK));
        utility.add(calculator);

        JMenu mexit = new JMenu("Exit");
        mexit.setForeground(Color.RED);
        mexit.setFont(new Font("Seguin Print" ,Font.BOLD, 16));


        JMenuItem exit = new JMenuItem("Exit");
        exit.setFont(new Font("Seguin Print",Font.BOLD,14));
        exit.setBackground(new Color(0x123456));
        exit.setForeground(new Color(249,255, 251));
        ImageIcon icon12 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\exit.png");
        Image image12 = icon12.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        exit.setIcon(new ImageIcon(image12));
        exit.setMnemonic('X');
        exit.addActionListener(this);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_MASK));
        mexit.add(exit);

        if(atype.equals("Admin")){
            mb.add(master);
        } else{
            mb.add(info);
            mb.add(user);
            mb.add(report);
        }

        mb.add(utility);
        mb.add(mexit);

        setLayout(new FlowLayout());


        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       String msg = ae.getActionCommand();
       if(msg.equals("New Customer")){
           new NewCustomer();

       } else if (msg.equals("Customer Details")) {
           new CustomerDetails();

       }else if (msg.equals("Deposit Details")) {
           new DepositDetails();

       }else if (msg.equals("Calculate Bill")) {
           new CalculateBill();
       }else if (msg.equals("View Information")) {
               new ViewInformation(meter);
       }else if (msg.equals("Update Information")){
               new UpdateInformation(meter);
       }else if (msg.equals("Bill Details")){
               new BillDetails(meter);
       }else if (msg.equals("Notepad")){
                try{
                        Runtime.getRuntime().exec("notepad.exe");
                }catch (Exception e){
                  e.printStackTrace();
                }
       }else if (msg.equals("Calculator")){
               try{
                       Runtime.getRuntime().exec("calc.exe");
               }catch (Exception e){
                       e.printStackTrace();
               }
       } else if (msg.equals("Exit")) {
               setVisible(false);
               new Login();
       } else if (msg.equals("Pay Bill")) {
               new PayBill(meter);
       } else if (msg.equals("Generate Bill")) {
               new GenerateBill(meter);
       }
    }

    public static void main(String[] args) {
        new Project("", "");

    }


}
