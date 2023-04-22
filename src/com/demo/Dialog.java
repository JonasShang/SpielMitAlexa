package com.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Zhixiang Shang on 22.04.2023.
 */
public class Dialog extends JFrame implements ActionListener {
    public  Dialog(String message){
        this.setVisible(true);
        this.setBounds(300,300,1200,1000);
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font f=new Font("Arial", Font.BOLD,50);
        Container container = this.getContentPane();
        container.setLayout(null);
        //container.add(new Label("java学习测试"));
        JButton bb = new JButton("aaaaaa");
        this.add(bb);
        System.out.println(message);
        JLabel label=new JLabel(message);
        label.setFont(f);
        label.setBounds(5,5, 1000,900);
        container.add(label);

        //center text
        label.setHorizontalAlignment(SwingConstants.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
