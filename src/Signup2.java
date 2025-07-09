package bank.magagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Signup2 extends JFrame implements ActionListener {
    JComboBox relBox,cateBox,incBox,eduBox,occBox;

    JTextField textPan,textAadhar;
    String formno;

    JRadioButton sen1,sen2,ex1,ex2;
    JButton next;

    Signup2(String formno){

        super("APPLICATION FORM");
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

        this.formno=formno;

        JLabel l1=new JLabel("Page 2:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details:");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(100,120,100,30);
        add(l3);

        //Drop down  option
        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        relBox= new JComboBox(religion);
        relBox.setBackground(new Color(252,208,76));
        relBox.setFont(new Font("Raleway",Font.BOLD,14));
        relBox.setBounds(350,120,320,30);
        add(relBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category [] = {"General","OBC","SC", "ST", "Other"};
        cateBox = new JComboBox(Category);
        cateBox.setBackground(new Color(252,208,76));
        cateBox.setFont(new Font("Raleway",Font.BOLD,14));
        cateBox.setBounds(350,170,320,30);
        add(cateBox);


        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income [] = {"Null","<1,50,000","<2,50,000", "5,00,000", "Uptp 10,00,000","Above 10,00,000"};
        incBox = new JComboBox(income);
        incBox.setBackground(new Color(252,208,76));
        incBox.setFont(new Font("Raleway",Font.BOLD,14));
        incBox.setBounds(350,220,320,30);
        add(incBox);



        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String educational [] = {"Non-Graduate","Graduate","Post-Graduate", "Doctrate", "Others"};
        eduBox = new JComboBox(educational);
        eduBox.setBackground(new Color(252,208,76));
        eduBox.setFont(new Font("Raleway",Font.BOLD,14));
        eduBox.setBounds(350,270,320,30);
        add(eduBox);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        add(l7);

        String Occupation [] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
        occBox = new JComboBox(Occupation);
        occBox.setBackground(new Color(252,208,76));
        occBox.setFont(new Font("Raleway",Font.BOLD,14));
        occBox.setBounds(350,320,320,30);
        add(occBox);

        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD,18));
        textPan.setBounds(350,390,320,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(100,440,180,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD,18));
        textAadhar.setBounds(350,440,320,30);
        add(textAadhar);


        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);

        sen1 = new JRadioButton("Yes");
        sen1.setFont(new Font("Raleway", Font.BOLD,14));
        sen1.setBackground(new Color(252,208,76));
        sen1.setBounds(350,490,100,30);
        add(sen1);

        sen2 = new JRadioButton("No");
        sen2.setFont(new Font("Raleway", Font.BOLD,14));
        sen2.setBackground(new Color(252,208,76));
        sen2.setBounds(460,490,100,30);
        add(sen2);


        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(sen1);
        buttonGroup.add(sen2);


        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);

        ex1 = new JRadioButton("Yes");
        ex1.setFont(new Font("Raleway", Font.BOLD,14));
        ex1.setBackground(new Color(252,208,76));
        ex1.setBounds(350,540,100,30);
        add(ex1);


        ex2 = new JRadioButton("No");
        ex2.setFont(new Font("Raleway", Font.BOLD,14));
        ex2.setBackground(new Color(252,208,76));
        ex2.setBounds(460,540,100,30);
        add(ex2);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(ex1);
        buttonGroup1.add(ex2);


        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,12));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        
        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setUndecorated(true);  //Remove cross,minimize and other options
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String rel=(String)relBox.getSelectedItem();
        String cate=(String)cateBox.getSelectedItem();
        String inc=(String)incBox.getSelectedItem();
        String edu=(String)eduBox.getSelectedItem();
        String occ=(String)occBox.getSelectedItem();

        String pan=textPan.getText();
        String aadhar=textAadhar.getText();

        String sencitizen=null;
        if(sen1.isSelected()){
            sencitizen="Yes";
        }
        else if(sen2.isSelected()){
            sencitizen="No";
        }

        String exiAccount=null;
        if(ex1.isSelected()){
            exiAccount="Yes";
        }
        else if(ex2.isSelected()){
            exiAccount="No";
        }

        try{
            if(textPan.getText().equals("") ||textAadhar.getText().equals("") ){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con c1=new Con();
                String val="insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+sencitizen+"','"+exiAccount+"')";
                c1.statement.executeUpdate(val);
                new Signup3(formno);  //Sending from_no tp page 3
                setVisible(false);
            }


        }
        catch(Exception E){
            E.printStackTrace();
        }








    }

    public static void main(String[] args) {
        new Signup2("");

    }
}
