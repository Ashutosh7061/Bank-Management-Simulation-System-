package bank.magagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;
    JButton b1,b2;
    TextField entAmount;

    Withdrawl(String pin){

        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1500,830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAW IS RS.10,000");
        label1.setForeground(Color.RED);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(486,180,700,35);
        l3.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(487,220,400,35);
        l3.add(label2);


        entAmount = new TextField();
        entAmount.setBackground(new Color(65,125,128));
        entAmount.setForeground(Color.WHITE);
        entAmount.setBounds(460,260,320,25);
        entAmount.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(entAmount);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setUndecorated(true);  //Remove cross,minimize and other options
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = entAmount.getText();
                Date date = new Date();
                if (amount.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to Withdraw");
                } else {
                    Con c = new Con();  //This is the connection class object
                    String q = "select * from bank where pin='" + pin + "'";
                    ResultSet resultSet = c.statement.executeQuery(q);
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("typr").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("Insert into bank values('" + pin + "','" + date + "','Withdrawl','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs." + amount + " debited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }

            } catch (Exception E) {
                E.printStackTrace();
            }
        }
        else if(e.getSource()==b2){
            setVisible(false);
            new main_class(pin);
        }

    }

    public static void main(String[] args) {
        new Withdrawl("");

    }
}
