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
    public int buttonArr[][] = {{0,0,0},{0,0,0},{0,0,0}};
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
//        b1.setBackground(new Color(0xff, 0xdd, 0x00));
//        b1.setBackground(new Color(0xff, 0xdd, 0x00));
        b1.setBackground(new Color(255,255,255));
        b2.setBackground(new Color(255,255,255));
        b3.setBackground(new Color(255,255,255));
        b4.setBackground(new Color(255,255,255));
        b5.setBackground(new Color(255,255,255));
        b6.setBackground(new Color(255,255,255));
        b7.setBackground(new Color(255,255,255));
        b8.setBackground(new Color(255,255,255));
        b9.setBackground(new Color(255,255,255));

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
                    //1 means O
                    buttonArr[0][0]=1;
                    b1.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b1.setEnabled(false);
                }else if(clickCount%2==0){
                    //2 means X
                    buttonArr[0][0]=2;
                    b1.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b1.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
                if(winnen(buttonArr)==1){
                    new Dialog("Spieler 1 hat gewonnen!!!");
                }else if(winnen(buttonArr)==2){
                    new Dialog("Spieler 2 hat gewonnen!!!");
                }else {
                    System.out.println("noch nicht");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    buttonArr[0][1]=1;
                    b2.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b2.setEnabled(false);
                }else if(clickCount%2==0){
                    buttonArr[0][1]=2;
                    b2.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b2.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
                if(winnen(buttonArr)==1){
                    new Dialog("Spieler 1 hat gewonnen!!!");
                }else if(winnen(buttonArr)==2){
                    new Dialog("Spieler 2 hat gewonnen!!!");
                }else {
                    System.out.println("noch nicht");
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    buttonArr[0][2]=1;
                    b3.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b3.setEnabled(false);
                }else if(clickCount%2==0){
                    buttonArr[0][2]=2;
                    b3.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b3.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
                if(winnen(buttonArr)==1){
                    new Dialog("Spieler 1 hat gewonnen!!!");
                }else if(winnen(buttonArr)==2){
                    new Dialog("Spieler 2 hat gewonnen!!!");
                }else {
                    System.out.println("noch nicht");
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    buttonArr[1][0]=1;
                    b4.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b4.setEnabled(false);
                }else if(clickCount%2==0){
                    buttonArr[1][0]=2;
                    b4.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b4.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
                if(winnen(buttonArr)==1){
                    new Dialog("Spieler 1 hat gewonnen!!!");
                }else if(winnen(buttonArr)==2){
                    new Dialog("Spieler 2 hat gewonnen!!!");
                }else {
                    System.out.println("noch nicht");
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    buttonArr[1][1]=1;
                    b5.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b5.setEnabled(false);
                }else if(clickCount%2==0){
                    buttonArr[1][1]=2;
                    b5.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b5.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
                if(winnen(buttonArr)==1){
                    new Dialog("Spieler 1 hat gewonnen!!!");
                }else if(winnen(buttonArr)==2){
                    new Dialog("Spieler 2 hat gewonnen!!!");
                }else {
                    System.out.println("noch nicht");
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    buttonArr[1][2]=1;
                    b6.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b6.setEnabled(false);
                }else if(clickCount%2==0){
                    buttonArr[1][2]=2;
                    b6.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b6.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
                if(winnen(buttonArr)==1){
                    new Dialog("Spieler 1 hat gewonnen!!!");
                }else if(winnen(buttonArr)==2){
                    new Dialog("Spieler 2 hat gewonnen!!!");
                }else {
                    System.out.println("noch nicht");
                }
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    buttonArr[2][0]=1;
                    b7.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b7.setEnabled(false);
                }else if(clickCount%2==0){
                    buttonArr[2][0]=2;
                    b7.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b7.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
                if(winnen(buttonArr)==1){
                    new Dialog("Spieler 1 hat gewonnen!!!");
                }else if(winnen(buttonArr)==2){
                    new Dialog("Spieler 2 hat gewonnen!!!");
                }else {
                    System.out.println("noch nicht");
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    buttonArr[2][1]=1;
                    b8.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b8.setEnabled(false);
                }else if(clickCount%2==0){
                    buttonArr[2][1]=2;
                    b8.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b8.setEnabled(false);
                }else{
                    clickCount--;
                    return;
                }
                if(winnen(buttonArr)==1){
                    new Dialog("Spieler 1 hat gewonnen!!!");
                }else if(winnen(buttonArr)==2){
                    new Dialog("Spieler 2 hat gewonnen!!!");
                }else {
                    System.out.println("noch nicht");
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2!=0){
                    buttonArr[2][2]=1;
                    b9.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-kreis-100.png")));
                    b9.setEnabled(false);
                }else{
                    buttonArr[2][2]=2;
                    b9.setIcon(new ImageIcon(MyFrame.class.getResource("./img/icons8-löschen-100.png")));
                    b9.setEnabled(false);
                }
                if(winnen(buttonArr)==1){
                    new Dialog("Spieler 1 hat gewonnen!!!");
                }else if(winnen(buttonArr)==2){
                    new Dialog("Spieler 2 hat gewonnen!!!");
                }else {
                    System.out.println("noch nicht");
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

    public int winnen(int [][] b){
        if(b[0][0]==1 && b[0][1]==1 && b[0][2]==1){
            b1.setBackground(new Color(0xff, 0xdd, 0x00));
            b2.setBackground(new Color(0xff, 0xdd, 0x00));
            b3.setBackground(new Color(0xff, 0xdd, 0x00));
            return 1;
        }else if(b[1][0]==1 && b[1][1]==1 && b[1][2]==1){
            b4.setBackground(new Color(0xff, 0xdd, 0x00));
            b5.setBackground(new Color(0xff, 0xdd, 0x00));
            b6.setBackground(new Color(0xff, 0xdd, 0x00));
            return 1;
        }else if(b[2][0]==1 && b[2][1]==1 && b[2][2]==1){
            b7.setBackground(new Color(0xff, 0xdd, 0x00));
            b8.setBackground(new Color(0xff, 0xdd, 0x00));
            b9.setBackground(new Color(0xff, 0xdd, 0x00));
            return 1;
        }else if(b[0][0]==1 && b[1][0]==1 && b[2][0]==1){
            b1.setBackground(new Color(0xff, 0xdd, 0x00));
            b4.setBackground(new Color(0xff, 0xdd, 0x00));
            b7.setBackground(new Color(0xff, 0xdd, 0x00));
            return 1;
        }else if(b[0][1]==1 && b[1][1]==1 && b[2][1]==1){
            b2.setBackground(new Color(0xff, 0xdd, 0x00));
            b5.setBackground(new Color(0xff, 0xdd, 0x00));
            b8.setBackground(new Color(0xff, 0xdd, 0x00));
            return 1;
        }else if(b[0][2]==1 && b[1][2]==1 && b[2][2]==1){
            b3.setBackground(new Color(0xff, 0xdd, 0x00));
            b6.setBackground(new Color(0xff, 0xdd, 0x00));
            b9.setBackground(new Color(0xff, 0xdd, 0x00));
            return 1;
        }else if(b[0][0]==1 && b[1][1]==1 && b[2][2]==1){
            b1.setBackground(new Color(0xff, 0xdd, 0x00));
            b5.setBackground(new Color(0xff, 0xdd, 0x00));
            b9.setBackground(new Color(0xff, 0xdd, 0x00));
            return 1;
        }else if(b[0][2]==1 && b[1][1]==1 && b[2][0]==1){
            b3.setBackground(new Color(0xff, 0xdd, 0x00));
            b5.setBackground(new Color(0xff, 0xdd, 0x00));
            b7.setBackground(new Color(0xff, 0xdd, 0x00));
            return 1;
        }else if(b[0][0]==2 && b[0][1]==2 && b[0][2]==2){
            b1.setBackground(new Color(0xff, 0, 0x00));
            b2.setBackground(new Color(0xff, 0, 0x00));
            b3.setBackground(new Color(0xff, 0, 0x00));
            return 2;
        }else if(b[1][0]==2 && b[1][1]==2 && b[1][2]==2){
            b4.setBackground(new Color(0xff, 0, 0x00));
            b5.setBackground(new Color(0xff, 0, 0x00));
            b6.setBackground(new Color(0xff, 0, 0x00));
            return 2;
        }else if(b[2][0]==2 && b[2][1]==2 && b[2][2]==2){
            b7.setBackground(new Color(0xff, 0, 0x00));
            b8.setBackground(new Color(0xff, 0, 0x00));
            b9.setBackground(new Color(0xff, 0, 0x00));
            return 2;
        }else if(b[0][0]==2 && b[1][0]==2 && b[2][0]==2){
            b1.setBackground(new Color(0xff, 0, 0x00));
            b4.setBackground(new Color(0xff, 0, 0x00));
            b7.setBackground(new Color(0xff, 0, 0x00));
            return 2;
        }else if(b[0][1]==2 && b[1][1]==2 && b[2][1]==2){
            b2.setBackground(new Color(0xff, 0, 0x00));
            b5.setBackground(new Color(0xff, 0, 0x00));
            b8.setBackground(new Color(0xff, 0, 0x00));
            return 2;
        }else if(b[0][2]==2 && b[1][2]==2 && b[2][2]==2){
            b3.setBackground(new Color(0xff, 0, 0x00));
            b6.setBackground(new Color(0xff, 0, 0x00));
            b9.setBackground(new Color(0xff, 0, 0x00));
            return 2;
        }else if(b[0][0]==2 && b[1][1]==2 && b[2][2]==2){
            b1.setBackground(new Color(0xff, 0, 0x00));
            b5.setBackground(new Color(0xff, 0, 0x00));
            b9.setBackground(new Color(0xff, 0, 0x00));
            return 2;
        }else if(b[0][2]==2 && b[1][1]==2 && b[2][0]==2){
            b3.setBackground(new Color(0xff, 0, 0x00));
            b5.setBackground(new Color(0xff, 0, 0x00));
            b7.setBackground(new Color(0xff, 0, 0x00));
            return 2;
        }
        return 0;
    }

}
