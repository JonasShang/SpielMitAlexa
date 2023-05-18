package com.test;

/**
 * Created by Zhixiang Shang on 22.04.2023.
 */
public class Main {
    public static void main(String[] args) {
        //1.创建小窗口对象:（被监听的对象)
        MyFrame myFrame = new MyFrame();
        //设置窗口的宽高
        myFrame.setBounds(300,200,1400,1000);
        //2.设置窗口显示
        myFrame.setVisible(true);


//        Login login = new Login();
//        login.setVisible(true);
//        login.setBounds(600,400,1000,600);
    }



}
