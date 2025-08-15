package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/*************************************************************
 Developer Name : Ayush Tiwari
 Developer Contact : ayushtiwari3012004@gmail.com
 Created on : 09-06-2025 19:21
 Project Name : Bank Management System
 *************************************************************/
public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4,r5;
    JButton next;
    JTextField textname,textfname,textemail,textadd,textcity,textpin,textstate;
    JDateChooser dateChooser;
    Random ran = new Random();
    long four = (ran.nextLong() % 9000L) + 1000L;
    String first = " "+Math.abs(four);
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. "+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelname = new JLabel("Name :");
        labelname.setFont(new Font("Raleway",Font.BOLD,20));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        textname = new JTextField();
        textname.setFont(new Font("Raleway",Font.BOLD,14));
        textname.setBounds(300,190,400,30);
        add(textname);

        JLabel labelfname = new JLabel("Father's Name :");
        labelfname.setFont(new Font("Raleway",Font.BOLD,20));
        labelfname.setBounds(100,240,200,30);
        add(labelfname);

        textfname = new JTextField();
        textfname.setFont(new Font("Raleway",Font.BOLD,14));
        textfname.setBounds(300,240,400,30);
        add(textfname);

        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,340,200,30);
        add(dob);
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelg = new JLabel("Gender :");
        labelg.setFont(new Font("Raleway",Font.BOLD,20));
        labelg.setBounds(100,290,200,30);
        add(labelg);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelemail = new JLabel("Email :");
        labelemail.setFont(new Font("Raleway",Font.BOLD,20));
        labelemail.setBounds(100,390,200,30);
        add(labelemail);

        textemail = new JTextField();
        textemail.setFont(new Font("Raleway",Font.BOLD,14));
        textemail.setBounds(300,390,400,30);
        add(textemail);

        JLabel labelms = new JLabel("Marital Status :");
        labelms.setFont(new Font("Raleway",Font.BOLD,20));
        labelms.setBounds(100,440,200,30);
        add(labelms);

        r3=new JRadioButton("Married");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(300,440,100,30);
        add(r3);

        r4=new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(450,440,100,30);
        add(r4);

        r5=new JRadioButton("Other");
        r5.setFont(new Font("Raleway",Font.BOLD,14));
        r5.setBackground(new Color(222,255,228));
        r5.setBounds(635,440,100,30);
        add(r5);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);
        buttonGroup2.add(r5);



        JLabel labeladd = new JLabel("Address :");
        labeladd.setFont(new Font("Raleway",Font.BOLD,20));
        labeladd.setBounds(100,490,200,30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,490,400,30);
        add(textadd);

        JLabel labelcity = new JLabel("City :");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,590,200,30);
        add(labelstate);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,590,400,30);
        add(textstate);

        JLabel labelpin = new JLabel("Pincode :");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,640,200,30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,640,400,30);
        add(textpin);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textname.getText();
        String fname = textfname.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender="Male";
        }
        else if(r2.isSelected()){
            gender="Female";
        }
        String email = textemail.getText();
        String marital = null;
        if(r3.isSelected()){
            marital="Married";
        }
        else if(r4.isSelected()){
            marital="Unmarried";
        }
        else if(r5.isSelected()){
            marital="Other";
        }
        String address=textadd.getText();
        String city = textcity.getText();
        String state = textstate.getText();
        String pincode = textpin.getText();

        try {
            if(textname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                DBCon con1 = new DBCon();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
