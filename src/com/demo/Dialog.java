package com.demo;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Zhixiang Shang on 22.04.2023.
 */
public class Dialog extends JDialog {
    public  Dialog(String message){
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);
        //container.add(new Label("java学习测试"));


        JLabel label=new JLabel(message);
        container.add(label);

        //center text
        label.setHorizontalAlignment(SwingConstants.CENTER);

    }
}
