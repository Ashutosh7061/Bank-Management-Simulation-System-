package bank.magagement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener{

    JLabel label1,label2,label3; //Globally declaring used to write texts
    JTextField textField2;   // To draw text area  (input box)
    JPasswordField passwordField3;  //  To draw input textArea for password
    JButton button1,button2,button3;  //  To draw buttons

    //JFrame uses here to create window
    login(){
        super("Bank Management System");//Give name to the window--on top always

        //Load and store image(Bank Logo) from the system
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        //Scaling the image size
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        //Convert the scaled image to ImageIcon
        ImageIcon i3=new ImageIcon(i2); //Make image to the frame
        //Storing in JLabel to draw(Sprite)
        JLabel image=new JLabel(i3);
        //Setting it bound    (Position)
        image.setBounds(350,10,100,100);
        //draw image to the window
        add(image);

        //Load and store image(Card Logo) from the system
        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2=ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2); //Make image to the frame
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);  //draw image to the window


        //Create the text to de displayed
        label1=new JLabel("WELCOME TO ATM");
        //Set the color
        label1.setForeground(Color.WHITE);
        //Set test details
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        // Set size and location
        label1.setBounds(230,125,450,40);
        //  Draw/Display the text
        add(label1);


        label2=new JLabel("Card No.:");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        //    Creating textFeild for Card Number INPUT
        textField2 =new JTextField(15);  // set input size
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        textField2.setBounds(325,190,230,30);
        add(textField2);

        label3=new JLabel("PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        //Creating textfield for PIN
        passwordField3= new JPasswordField(15);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        passwordField3.setBounds(325,250,230,30);
        add(passwordField3);


        //CREATING BUTTONS(SIGN IN, CLEAR,SIGN UP  )
        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(320,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("CLEAR");
        button2.setFont(new Font("Aerial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(450,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(320,350,230,30);
        button3.addActionListener(this);
        add(button3);




        //Load and store image(Back Ground) from the system
        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2=iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2); //Make image to the frame
        //Main work is to show any text on frame
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);  //draw image to the window


        setLayout(null);
        setSize(850,480); //set window size
        setLocation(450,200);
        setUndecorated(true);  //Remove cross,minimize and other options
        setVisible(true);             //ByDefault window visible if off(false)

    }
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource()==button1){
                //Validate pin number from the database
                Con c=new Con();
                String cardno=textField2.getText();
                String pin=passwordField3.getText();
                //Extract data from "login table"
                String q="select * from login where card_number='"+cardno+"' and pin='"+pin+"'";
                //Store extracted data into resultSet
                ResultSet resultSet=c.statement.executeQuery(q);

                //To check whether ther is any data or empty
                //.next  is used to check whether there is any data or not
                if(resultSet.next()){
                    setVisible(false);
                    new main_class(pin);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");

                }


            }
            else if(e.getSource()==button2){
                textField2.setText("");
                passwordField3.setText("");

            }
            else if(e.getSource()==button3){
                new Signup();
                setVisible(false);

            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new login();
    }
}
