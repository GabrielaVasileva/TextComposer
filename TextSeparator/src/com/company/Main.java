package com.company;

import javax.swing.*;

public class Main extends JFrame {
    public Main(){
        setTitle("Sumator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 500);
        add(new Window());
        setVisible(true);
    }

    public static void main(String[] args) {
        Main mw = new Main();
    }
}
