package Com.Electricty.Billing.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
        c = DriverManager.getConnection("jdbc:mysql://localhost/ebs","root", "1234");
        s = c.createStatement();
    } catch (Exception e){
            e.printStackTrace();

        }
    }
}
