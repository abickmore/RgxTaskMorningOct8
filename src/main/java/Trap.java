package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trap {

    public static void main(String[] args) {
        trapEx("Oh no, there is a big TRAP waiting for you! eeeeeek!");

    }



    public static void trapEx(String inputText ){
        //String str=sourceText.toLowerCase();
        Pattern p= Pattern.compile("trap");
        //Create the matcher instance
        Matcher m= p.matcher(inputText.toLowerCase());
        // Find the matches and count them
        if (m.find()){
            System.out.println("BOO!!");
        }else {
            System.out.println("Relax, there is no trap.");
        }

    }
}
