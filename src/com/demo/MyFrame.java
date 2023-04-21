package com.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Zhixiang Shang on 21.04.2023.
 */
public class MyFrame extends JFrame {
    public MyFrame(){
        this.setVisible(true);
//        this.setSize(1400,1000);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JFrame put something, container
        Container container =this.getContentPane();
        //absolute layout
        container.setLayout(null);

        //button
        JButton button1 = new JButton("Stein");//create object
        JButton button2 = new JButton("Papier");//create object
        JButton button3 = new JButton("schiere");//create object
        JButton button4 = new JButton("Stein");//create object
        JButton button5 = new JButton("Papier");//create object
        JButton button6 = new JButton("schiere");//create object
        button1.setBounds(70+60, 100+60,300,100);
        button2.setBounds(70+60, 100+240,300,100);
        button3.setBounds(70+60, 100+420,300,100);
        button4.setBounds(70+700,100+60,300,100);
        button5.setBounds(70+700,100+240,300,100);
        button6.setBounds(70+700,100+420,300,100);

        // button1.setPreferredSize(new Dimension(40, 40));
        // button2.setPreferredSize(new Dimension(40, 40));
        // button3.setPreferredSize(new Dimension(40, 40));
        // button4.setPreferredSize(new Dimension(40, 40));
        // button5.setPreferredSize(new Dimension(40, 40));
        // button6.setPreferredSize(new Dimension(40, 40));

        Font f=new Font("Arial", Font.BOLD,30);
        button1.setFont(f);
        button2.setFont(f);
        button3.setFont(f);
        button4.setFont(f);
        button5.setFont(f);
        button6.setFont(f);

        //A pop-up window pops up when the button is clicked
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pop up
                new Dialog();
            }
        });
        //A pop-up window pops up when the button is clicked
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pop up
                new Dialog();
            }
        });        //A pop-up window pops up when the button is clicked
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pop up
                new Dialog();
            }
        });        //A pop-up window pops up when the button is clicked
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pop up
                new Dialog();
            }
        });        //A pop-up window pops up when the button is clicked
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pop up
                new Dialog();
            }
        });        //A pop-up window pops up when the button is clicked
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pop up
                new Dialog();
            }
        });
        //add to container
        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(button4);
        container.add(button5);
        container.add(button6);
    }
    public static void main(String[] args) {
        //1.创建小窗口对象:（被监听的对象)
        MyFrame myFrame = new MyFrame();
        //设置窗口的宽高
        myFrame.setBounds(300,200,1400,1000);
        //2.设置窗口显示
        myFrame.setVisible(true);
    }
}
