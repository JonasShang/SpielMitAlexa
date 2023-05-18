package com.test;


import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.MalformedURLException;

/**
 * Created by Zhixiang Shang on 22.04.2023.
 */
public class Dialog extends JFrame implements ActionListener {

    private static File file = null;
    //创建audioclip对象
    private static AudioClip audioClip = null;

    public  Dialog(String message){
        this.setVisible(true);
        this.setBounds(150,150,1200,1000);
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font f=new Font("Arial", Font.BOLD,30);
        Container container = this.getContentPane();
        container.setLayout(null);
        //container.add(new Label("java学习测试"));
        JButton bb = new JButton("aaaaaa");
        this.add(bb);
        System.out.println(message);
        JLabel label=new JLabel(message);
        label.setFont(f);
        label.setBounds(0,0, 1000,900);
        container.add(label);
        createWindow();
        play("./sound/winner.mp3");
        //center text
        label.setHorizontalAlignment(SwingConstants.CENTER);

    }
    public static void play(String fileUrl) {
        //选择播放文件
        file = new File(fileUrl);


        //将file转换为url
        try {
            audioClip = Applet.newAudioClip(file.toURI().toURL());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //循环播放	播放一次可以使用audioClip.play
        audioClip.loop();
//		audioClip.play();

    }
    public static void stop() {
        audioClip.stop();
    }
    public void createWindow(){
        ImageIcon arrowIcon = null;
        this.setTitle("   Multimodale Benutzungsoberflächen Übung(TUD)");
//        java.net.URL imgURL = MyFrame.class.getResource("./img/dresdner-frauenkirche.png");
        java.net.URL imgURL = Dialog.class.getResource("/img/tic-tac-toe-hand-gezeichnetes-spiel.png");
        if (imgURL != null) {
            arrowIcon = new ImageIcon(imgURL);
            this.setIconImage(arrowIcon.getImage());
        } else {
            JOptionPane.showMessageDialog(this, "Icon image not found.");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
