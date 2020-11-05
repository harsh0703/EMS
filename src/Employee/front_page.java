/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;//For handling events after click

/**
 *
 * @author HARSH PAGARIA
 */
class front_page implements ActionListener{ //For creating frames
    JFrame f; 
    JLabel id,l1;
    JButton b;

    front_page(){
 
        f = new JFrame("Employee Management System");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employee/icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);//Changing the size of the image
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,150,1360,530);
        f.add(l1);


        b = new JButton("CLICK TO CONTINUE");//Creating button and defining it
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);       

        b.setBounds(500,600,300,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.black);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.WHITE);//Making all the frame background white

        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);//Setting the location where to opem

        while(true){
            lid.setVisible(false);//Editing the lid label
            try{
                Thread.sleep(1000); //1000 = 1 second
            }catch(Exception e){} 
            lid.setVisible(true);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new login();    
        }
    }

    public static void main(String[] arg){
        front_page f = new front_page();
    }
}
