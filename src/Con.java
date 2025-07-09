package bank.magagement.system;

import java.sql.*;

public class Con {
    Connection connection;

    Statement statement;

    public Con(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Myworld@4321");
            statement=connection.createStatement();

        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
