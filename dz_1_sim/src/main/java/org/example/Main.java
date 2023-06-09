package org.example;

import org.apache.commons.lang3.text.WordUtils;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static int zd_1(){
        Random random = new Random();
        int i = random.nextInt(2000);
        return i;
    }

    public static int zd_2(int rand){
        int n = Integer.toBinaryString(rand).length()-1;
        return n;
    }

    public static  int zd_3(int rand,int f_bit){
        short count = 0;
        for (int j = rand; j < Short.MAX_VALUE; j++){
            if ( j % f_bit == 0) {
                count++;
            }
        }
        return count;
    }

    public static int zd_4(int rand, int f_bit){
        short count = 0;
        //второй массив;
        for (int j = Short.MIN_VALUE; j < rand; j++){
            if ( j % f_bit != 0) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        var label = new JLabel("Номер задания");
        label.setFont(new Font("Serif", Font.PLAIN, 72));

        var rez = new JLabel("");
        rez.setFont(new Font("Serif", Font.PLAIN, 36));
        rez.setLocation(150,200);

        var label2 = new JLabel("");
        label2.setFont(new Font("Serif", Font.PLAIN, 36));

        var label3 = new JLabel("");
        label3.setFont(new Font("Serif", Font.PLAIN, 36));

        var label4 = new JLabel("");
        label4.setFont(new Font("Serif", Font.PLAIN, 36));



        int i = zd_1();
        String i_s = Integer.toString(i);
        var zd_1 = new JButton("Задание 1");
        zd_1.setSize(200,200);
        zd_1.addActionListener(e ->
                label.setText("Задание 1"));
        zd_1.addActionListener(e ->
                rez.setText("Рандомное число: "+i_s));

        int n = zd_2(i);
        String n_s = Integer.toString(n);
        var zd_2 = new JButton("Задание 2");
        zd_2.addActionListener(e ->
                label.setText("Задание 2")
        );
        zd_2.addActionListener(e ->
                label2.setText("Номер старшего значения бита: "+n_s)
        );

        int m1 = zd_3(i,n);
        String m1_s = Integer.toString(m1);
        var zd_3 = new JButton("Задание 3");
        zd_3.addActionListener(e ->
                label.setText("Задание 3")
        );
        zd_3.addActionListener(e ->
                label3.setText("длина массива m1 =  "+m1_s)
        );

        int m2 = zd_4(i,n);
        String m2_s = Integer.toString(m2);
        var zd_4 = new JButton("Задание 4");
        zd_4.addActionListener(e ->
                label.setText("Задание 4")
        );
        zd_4.addActionListener(e ->
                label4.setText("длина массива m2 =  "+m2_s)
        );

        var panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(label);

        panel.add(zd_1);
        panel.add(zd_2);
        panel.add(zd_3);
        panel.add(zd_4);
        panel.add(rez);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);

        var frame = new JFrame("dz_1_sim(Goose inc©)");
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}