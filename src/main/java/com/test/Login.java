package com.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by Zhixiang Shang on 22.04.2023.
 */
public class Login extends JFrame implements ActionListener {
    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();
    JTextField tf3 = new JTextField();
    JButton blogin = new JButton("Login");
    JButton bcancle = new JButton("Cancle");
    JButton breset = new JButton("reset");
    public Login(){
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //JFrame put something, container
        Container container =this.getContentPane();
        //absolute layout
        container.setLayout(null);

        JLabel l1 = new JLabel("username");
        JLabel l2 = new JLabel("pwd");
        l1.setBounds(50,50, 100,30);
        l2.setBounds(50,100, 100,30);
        container.add(l1);
        container.add(l2);


        tf1.setBounds(150,50,300,30);
        tf2.setBounds(150,100,300,30);
        tf3.setBounds(150,300,300,30);
        tf3.setEditable(false);
        container.add(tf1);
        container.add(tf2);
        container.add(tf3);


        blogin.setBounds(50,150,70,30);
        bcancle.setBounds(150,150,70,30);
        breset.setBounds(250,150,70,30);
        container.add(blogin);
        container.add(bcancle);
        container.add(breset);

        blogin.addActionListener(this);
        bcancle.addActionListener(this);
        breset.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        String username = tf1.getText();
        String pwd = tf2.getText();
        System.out.println("username="+username+"pwd="+pwd);
        if(e.getSource()==blogin){
            if(username.equals("aaa")&& pwd.equals("123")){
                //1.创建小窗口对象:（被监听的对象)
                MyFrame myFrame = new MyFrame();
                //设置窗口的宽高
                myFrame.setBounds(300,200,1300,1000);
                //2.设置窗口显示
                myFrame.setVisible(true);
                tf3.setText("RICHTIG！！！");
                tf1.setText("");
                tf2.setText("");
                this.setVisible(false);
            }else{
//            String result=String.valueOf(c);
                tf3.setText("FAlSCH！！！");
                tf1.setText("");
                tf2.setText("");
            }
        }else if (e.getSource()==bcancle){
            this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING) );
        }else if(e.getSource()==breset){
            tf3.setText("");
            tf1.setText("");
            tf2.setText("");
        }

    }
}
