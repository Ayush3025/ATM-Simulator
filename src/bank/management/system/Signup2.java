package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*************************************************************
 Developer Name : Ayush Tiwari
 Developer Contact : ayushtiwari3012004@gmail.com
 Created on : 09-06-2025 23:56
 Project Name : Bank Management System
 *************************************************************/
public class Signup2 extends JFrame implements ActionListener {
    JButton next;
    JComboBox ComboBox ,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textaadhar,textpan;
    JRadioButton r1,r2,r3,r4;
    String formno;

    Signup2(String formno){
        super("Application Form");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Addtional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] ={"Hindu","Muslim","Sikh","Christian","Other"};
        ComboBox = new JComboBox<>(religion);
        ComboBox.setBackground(new Color(252,208,76));
        ComboBox.setFont(new Font("Raleway",Font.BOLD,14));
        ComboBox.setBounds(350,120,320,30);
        add(ComboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] ={"General","OBC","SC","ST"};
        comboBox2 = new JComboBox<>(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] ={"null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,120,30);
        add(l6);

        String educational[] ={"High-School","Intermediate","Graduate","Post-Graduate","Doctrate","Others"};
        comboBox4 = new JComboBox<>(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,120,30);
        add(l7);

        String occupation[] ={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5 = new JComboBox<>(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN No. :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,120,30);
        add(l8);

        textpan = new JTextField();
        textpan.setFont(new Font("Raleway",Font.BOLD,18));
        textpan.setBounds(350,370,320,30);
        add(textpan);

        JLabel l9 = new JLabel("Aadhar No. :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,420,120,30);
        add(l9);

        textaadhar = new JTextField();
        textaadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textaadhar.setBounds(350,420,320,30);
        add(textaadhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,470,150,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,470,100,30);
        add(r2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,520,170,30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(252,208,76));
        r3.setBounds(350,520,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(252,208,76));
        r4.setBounds(460,520,100,30);
        add(r4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);

        JLabel l12 = new JLabel("Form No:-");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(690,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,80,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,590,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) ComboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = (String) textpan.getText();
        String aad = (String) textaadhar.getText();

        String scitizen=null;
        if(r1.isSelected()){
            scitizen="Yes";
        }
        else if(r2.isSelected()){
            scitizen="No";
        }

        String eaccount=null;
        if(r3.isSelected()){
            eaccount="Yes";
        }
        else if(r4.isSelected()){
            eaccount="No";
        }

        try{
            if(textpan.getText().equals("") || textpan.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else{
                DBCon c1 = new DBCon();
                String q = "insert into signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aad+"','"+scitizen+"','"+eaccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
