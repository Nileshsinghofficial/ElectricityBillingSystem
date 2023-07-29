package Com.Electricty.Billing.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;

public class Pay extends JFrame implements ActionListener, WindowListener {

    String meter;
    JButton returnButton;
    JButton openBrowserButton;

    Pay(String meter) {
        this.meter = meter;

        returnButton = new JButton("Back");
        returnButton.setBounds(80, 50, 100, 30);
        returnButton.addActionListener(this);

        openBrowserButton = new JButton("Pay");
        openBrowserButton.setBounds(220, 50, 100, 30);
        openBrowserButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(returnButton);
        buttonPanel.add(openBrowserButton);
        buttonPanel.setBackground(new Color(0x3FB0AC));
        buttonPanel.setForeground(new Color(18, 52, 86));
        buttonPanel.setLayout(null);

        add(buttonPanel);

        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent automatic exit on close
        addWindowListener(this); // Add the window listener to detect window closing
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == returnButton) {
            setVisible(false);
            new PayBill(meter);
        } else if (ae.getSource() == openBrowserButton) {
            openPay();
        }
    }

    public void openPay() {
        try {
            URI uri = new URI("https://paytm.com/electricity-bill-payment/uttar-pradesh/purvanchal-vidyut-vitaran-nigam-limited-puvvnl");
            Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error opening Pay website.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Pay(""));
    }

    // WindowListener methods
    public void windowClosing(WindowEvent e) {
        new PayBill(meter); // Call the PayBill function when the window is closed
        dispose(); // Close the current JFrame
    }

    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}
