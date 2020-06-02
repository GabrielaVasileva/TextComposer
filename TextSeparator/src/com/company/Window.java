package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JPanel {
    private TextField textOneField = new TextField();
    private TextField textTwoField = new TextField();
    private Button mCalcButton = new Button();
    private Color mLastBackgroundColor;

    public Window() {
        init();
    }

    public void init() {
        this.setLayout(null);
        textOneField.setBounds(new Rectangle(30, 55, 250, 350));
        textOneField.setBackground(Color.white);
        this.add(textOneField, this);
        textOneField.setText("");

        this.setLayout(null);
        textTwoField.setBounds(new Rectangle(310, 55, 250, 350));
        textTwoField.setBackground(Color.white);
        this.add(textTwoField, this);
        textTwoField.setText("");

        mCalcButton.setBounds(new Rectangle(200, 15, 200, 25));
        mCalcButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        TextSeparator textSeparator = new TextSeparator(textOneField.getText(), textTwoField.getText());
                        repaint();
                        textSeparator.printInFile();
                    }
                });
        mCalcButton.setLabel("Подреди");
        this.add(mCalcButton, this);

    }

//    public boolean mouseDown(Event aEvent, int aX, int aY) {
//        mLastBackgroundColor = this.getBackground();
//        this.setBackground(Color.red);
//        return true;
//    }
//
//    public boolean mouseUp(Event aEvent, int aX, int aY) {
//        this.setBackground(mLastBackgroundColor);
//        return true;
//    }

    public void paint(Graphics aGraphics) {
        super.paint(aGraphics);
        Font font = new Font("Dialog", Font.BOLD, 23);
        aGraphics.setFont(font);

        aGraphics.setColor(Color.black);
    }

}
