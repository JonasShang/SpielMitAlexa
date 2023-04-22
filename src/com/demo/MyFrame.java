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
    int clickCount = 0;
    JButton b1=new JButton();
    JButton b2=new JButton();
    JButton b3=new JButton();
    JButton b4=new JButton();
    JButton b5=new JButton();
    JButton b6=new JButton();
    JButton b7=new JButton();
    JButton b8=new JButton();
    JButton b9=new JButton();
    private int winTimes1 = 0;
    private int winTimes2 = 0;
    Font f=new Font("Arial", Font.BOLD,30);
    Font timerFont=new Font("Arial", Font.BOLD,150);
    Font SpielerFont=new Font("Arial", Font.BOLD,50);
    public MyFrame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createWindow();
        drawGrid();
        this.setLayout(new GridLayout(4,3,5,5));
        this.setSize(300,500);
        this.setVisible(true);
    }

    public void drawGrid(){
        JLabel time = new JLabel();
        JLabel inputLabel1 = new JLabel("<html><body>"+"Spieler 1"+"<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+winTimes1+"<body></html>",JLabel.CENTER);
        JLabel inputLabel2 = new JLabel("<html><body>"+"Spieler 2"+"<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+winTimes2+"<body></html>",JLabel.CENTER);

        this.add(inputLabel1);
        this.add(time);
        this.add(inputLabel2);

        this.setTimer(time,1);
        time.setFont(timerFont);
        inputLabel1.setFont(SpielerFont);
        inputLabel2.setFont(SpielerFont);
        // adding buttons to the frame

        this.add(b1); this.add(b2); this.add(b3);
        this.add(b4); this.add(b5); this.add(b6);
        this.add(b7); this.add(b8); this.add(b9);


//        b1.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
//        b2.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    b1.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b1.setEnabled(false);
                }else if(clickCount%2==0){
                    b1.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b1.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    b2.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b2.setEnabled(false);
                }else if(clickCount%2==0){
                    b2.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b2.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    b3.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b3.setEnabled(false);
                }else if(clickCount%2==0){
                    b3.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b3.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    b4.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b4.setEnabled(false);
                }else if(clickCount%2==0){
                    b4.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b4.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    b5.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b5.setEnabled(false);
                }else if(clickCount%2==0){
                    b5.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b5.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    b6.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b6.setEnabled(false);
                }else if(clickCount%2==0){
                    b6.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b6.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    b7.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b7.setEnabled(false);
                }else if(clickCount%2==0){
                    b7.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b7.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    b8.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b8.setEnabled(false);
                }else if(clickCount%2==0){
                    b8.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b8.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    b9.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b9.setEnabled(false);
                }else{
                    b9.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b9.setEnabled(false);
                }
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
        this.setTitle("   Multimodale Benutzungsoberflächen Übung(TUD)");
//        java.net.URL imgURL = MyFrame.class.getResource("./img/dresdner-frauenkirche.png");
        java.net.URL imgURL = MyFrame.class.getResource("./img/tic-tac-toe-hand-gezeichnetes-spiel.png");
        if (imgURL != null) {
            arrowIcon = new ImageIcon(imgURL);
            this.setIconImage(arrowIcon.getImage());
        } else {
            JOptionPane.showMessageDialog(this, "Icon image not found.");
        }

    }

}
