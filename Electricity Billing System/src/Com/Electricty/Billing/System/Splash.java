package Com.Electricty.Billing.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread t;
    Splash(){
        ImageIcon i1 = new ImageIcon("C:\\Users\\Nilesh Singh\\IdeaProjects\\Electricity Billing System\\src\\Com\\Electricty\\Billing\\System\\Icon\\Uppppp.jpg");
        Image i2 = i1.getImage().getScaledInstance(720,520, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        setVisible(true);


        int x=1;
        for(int i = 1; i<560; i+=4,x+=1){
            setSize(i + x,  i);
            setLocation(750 -((i + x )/2),400-(i/2));
            try{
                Thread.sleep(7);
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        t = new Thread(this);
        t.start();// Call Run Methode

        setVisible(true);
    }
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            setVisible(false);

            new Login();
        }catch (Exception e ){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Splash();
    }


}


