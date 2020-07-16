package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TextSeparator {
    private String[] textOne;
    private String[] textTwo;

    public TextSeparator(String textOne, String textTwo) {
        this.textOne = textOne.split("\\.");
        this.textTwo = textTwo.split("\\.");
    }

    public void printInFile() {
        String text = "";
//        text += String.format("made by Gabriela Vasileva 02.06.2020%n");

        for (int i = 0; i < Math.min(this.textOne.length, this.textTwo.length); i++) {
            text += String.format("%s%n%s%n",this.textOne[i],this.textTwo[i]);
        }

        for (int i = Math.min(this.textOne.length, this.textTwo.length); i < Math.max(this.textOne.length, this.textTwo.length); i++) {
            text += String.format("%s%n",(this.textOne.length < this.textTwo.length) ? this.textTwo[i] : this.textOne[i]);
        }

        File myObj = null;
        try {
            myObj = new File("parallel text.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        BufferedWriter bufferedWriter;

        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(myObj, true), StandardCharsets.UTF_8));
            bufferedWriter.write(text);
            System.out.println(text);
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

//        try {
//            FileWriter myWriter = new FileWriter("parallel text.txt");
//            myWriter.write(text);
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
    }

}
