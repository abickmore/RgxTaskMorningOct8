package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowel {

    public static void main(String[] args) {

        noVowel("Howdy partners, let's learn some Java!");
    }

    public static void noVowel (String ourText){

        String stuff = ourText.toLowerCase();


        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(stuff);

        if(m.find()) {
            System.out.println(stuff.replaceAll("[aeiou]", ""));
        }else{
            System.out.println(stuff);
        }

    }


}
