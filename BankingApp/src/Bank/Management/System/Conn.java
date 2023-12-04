package Bank.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection con;
    Statement stmt;

    Conn() {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "admin");
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }


}
