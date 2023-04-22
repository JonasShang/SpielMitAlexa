package com.demo;

import sun.rmi.runtime.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Zhixiang Shang on 21.04.2023.
 */
public class MyFrame extends JFrame {
    JButton b1=new JButton("1");
    JButton b2=new JButton("2");
    JButton b3=new JButton("3");
    JButton b4=new JButton("4");
    JButton b5=new JButton("5");
    JButton b6=new JButton("6");
    JButton b7=new JButton("7");
    JButton b8=new JButton("8");
    JButton b9=new JButton("9");
    Font f=new Font("Arial", Font.BOLD,30);
    Font timerFont=new Font("Arial", Font.BOLD,150);
    public MyFrame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createWindow();
        drawGrid();
        this.setLayout(new GridLayout(4,3,5,5));
        this.setSize(300,500);
        this.setVisible(true);
    }
    public void drawTextField(){
        JTextField t1,t2;
        t1=new JTextField("Welcome to Javatpoint.");
        t1.setBounds(50,100, 200,30);
        t2=new JTextField("AWT Tutorial");
        t2.setBounds(50,150, 200,30);
        this.add(t1); this.add(t2);
    }
    public void drawGrid(){
        JLabel time = new JLabel();
        JLabel inputLabel1 = new JLabel("输入");
        JLabel inputLabel2 = new JLabel("输入");
        this.add(time);
        this.add(inputLabel1);
        this.add(inputLabel2);

        this.setTimer(time,1);
        time.setFont(timerFont);
        // adding buttons to the frame
        this.add(b1); this.add(b2); this.add(b3);
        this.add(b4); this.add(b5); this.add(b6);
        this.add(b7); this.add(b8); this.add(b9);

        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);
        b6.setFont(f);
        b7.setFont(f);
        b8.setFont(f);
        b9.setFont(f);

        //A pop-up window pops up when the button is clicked
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                this.setTimer(time,0);
                //pop up
                new Dialog();
            }
        });
    }
    public void setTimer(JLabel time,int status) {
        final JLabel varTime = time;
        Timer timeAction = new Timer(1000, new ActionListener() {
            long timemillis2 = (System.currentTimeMillis()-1000);
            public void actionPerformed(ActionEvent e) {
                long timemillis1 = System.currentTimeMillis();
                long timemillis = timemillis1-timemillis2;
                // 转换日期显示格式
                SimpleDateFormat df = new SimpleDateFormat("mm:ss");
                varTime.setText(df.format(new Date(timemillis)));
            }
        });
        if(status==1){
            timeAction.start();
        }else{
            timeAction.stop();
        }
    }

    public void createWindow(){
        ImageIcon arrowIcon = null;
        this.setTitle("Multimodale Benutzungsoberflächen Übung(TUD)");
        java.net.URL imgURL = MyFrame.class.getResource("./img/dresdner-frauenkirche.png");
        if (imgURL != null) {
            arrowIcon = new ImageIcon(imgURL);
            this.setIconImage(arrowIcon.getImage());
        } else {
            JOptionPane.showMessageDialog(this, "Icon image not found.");
        }

    }

}
