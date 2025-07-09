package bank.magagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton savAcc1,savAcc2,savAcc3,savAcc4;

    JCheckBox serReq1,serReq2,serReq3,serReq4,serReq5,serReq6;  //For cheating check box

    JButton submit,cancel;

    String formno;

    Signup3( String formno){   // (-----)TO receive from another class

        this.formno = formno;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        //Scaling the image size
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        //Convert the scaled image to ImageIcon
        ImageIcon i3=new ImageIcon(i2); //Make image to the frame
        //Storing in JLabel to draw(Sprite)
        JLabel image=new JLabel(i3);
        //Setting it bound    (Position)
        image.setBounds(150,5,100,100);
        //draw image to the window
        add(image);

        JLabel l1=new JLabel("Page 3:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2=new JLabel("Account Details:");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3=new JLabel("Account Types:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        savAcc1=new JRadioButton("Saving Account");
        savAcc1.setFont(new Font("Raleway",Font.BOLD,16));
        savAcc1.setBackground(new Color(215,252,252));
        savAcc1.setBounds(100,180,150,30);
        add(savAcc1);

        savAcc2 = new JRadioButton("Fixed Deposit Account");
        savAcc2.setFont(new Font("Raleway",Font.BOLD,16));
        savAcc2.setBackground(new Color(215,252,252));
        savAcc2.setBounds(350,180,300,30);
        add(savAcc2);

        savAcc3 = new JRadioButton("Current Account");
        savAcc3.setFont(new Font("Raleway",Font.BOLD,16));
        savAcc3.setBackground(new Color(215,252,252));
        savAcc3.setBounds(100,220,250,30);
        add(savAcc3);

        savAcc4 = new JRadioButton("Recurring Deposit Account");
        savAcc4.setFont(new Font("Raleway",Font.BOLD,16));
        savAcc4.setBackground(new Color(215,252,252));
        savAcc4.setBounds(350,220,250,30);
        add(savAcc4);

        ButtonGroup buttongroup=new ButtonGroup();
        buttongroup.add(savAcc1);
        buttongroup.add(savAcc2);
        buttongroup.add(savAcc3);
        buttongroup.add(savAcc4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);


        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        serReq1 = new JCheckBox("ATM CARD");
        serReq1.setBackground(new Color(215,252,252));
        serReq1.setFont(new Font("Raleway",Font.BOLD,16));
        serReq1.setBounds(100,500,200,30);
        add(serReq1);

        serReq2 = new JCheckBox("Internet Banking");
        serReq2.setBackground(new Color(215,252,252));
        serReq2.setFont(new Font("Raleway",Font.BOLD,16));
        serReq2.setBounds(350,500,200,30);
        add(serReq2);

        serReq3 = new JCheckBox("Mobile Banking");
        serReq3.setBackground(new Color(215,252,252));
        serReq3.setFont(new Font("Raleway",Font.BOLD,16));
        serReq3.setBounds(100,550,200,30);
        add(serReq3);

        serReq4 = new JCheckBox("EMAIL Alerts");
        serReq4.setBackground(new Color(215,252,252));
        serReq4.setFont(new Font("Raleway",Font.BOLD,16));
        serReq4.setBounds(350,550,200,30);
        add(serReq4);

        serReq5 = new JCheckBox("Cheque Book");
        serReq5.setBackground(new Color(215,252,252));
        serReq5.setFont(new Font("Raleway",Font.BOLD,16));
        serReq5.setBounds(100,600,200,30);
        add(serReq5);

        serReq6 = new JCheckBox("E-Statement");
        serReq6.setBackground(new Color(215,252,252));
        serReq6.setFont(new Font("Raleway",Font.BOLD,16));
        serReq6.setBounds(350,600,200,30);
        add(serReq6);

        JCheckBox c7 = new JCheckBox("I here by decleares that the above entered details correct to the best of my knlowledge.",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,20);
        add(c7);


        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);


        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD,14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD,14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setUndecorated(true);  //Remove cross,minimize and other options
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        String acctype=null;
        if(savAcc1.isSelected()){
            acctype="Saving Account";
        }
        else if(savAcc2.isSelected()){
            acctype="Fixed Deposit Account";
        }
        else if (savAcc3.isSelected()){
            acctype="Current Account";
        }
        else if(savAcc4.isSelected()){
            acctype="Recurring Deposit Account";
        }

        Random ran=new Random(); // For generating card number
        long first7=(ran.nextLong()%90000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);

        long first3=(ran.nextLong()% 9000L)+1000L;
        String pin=""+Math.abs(first3);

        String service="";
        if(serReq1.isSelected()){
            service=service+"ATM CARD";
        }
        else if(serReq2.isSelected()){
            service=service+"Internet Banking";
        }
        else if(serReq3.isSelected()){
            service+="Mobile Banking";
        }
        else if(serReq4.isSelected()){
            service+="EMAIL Alerts";
        }
        else if(serReq5.isSelected()){
            service+="Cheque Book";
        }
        else if(serReq6.isSelected()){
            service+="E-Statement";
        }

        try{
            if(e.getSource()==submit){
                if(acctype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the Fields.");
                }
                else{
                    Con c1=new Con();
                    String q1="insert into signupthree values('"+formno+"','"+acctype+"','"+cardno+"','"+pin+"','"+service+"')";
                    String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";

                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card No. :"+cardno+"\n PIn :"+pin);
                    new Deposit(pin);
                    setVisible(false);
                }

            }
            else if(e.getSource()==cancel){
                System.exit(0);
            }

        }catch(Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Signup3(" ");

    }

}
