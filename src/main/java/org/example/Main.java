package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    static void main() {
        //1 char match
        Pattern pattern = Pattern.compile(".");
        String text1 = "ABC D EFG";
        Matcher matcher1 = pattern.matcher(text1);

        if (matcher1.matches()) {
            System.out.println("Match found: " + text1);
        } else {
            System.out.println("No match found: " + text1);
        }
        System.out.println("================================");
        String[] splitText1 = text1.split("\\s+");

        for (String s : splitText1) {
            Matcher forMatcher1 = pattern.matcher(s);

            if (forMatcher1.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }



        //3 times, any char
        System.out.println("================================");
        System.out.println("3 any chars");
        System.out.println("================================");
        Pattern pattern2 = Pattern.compile(".{3}");
        String text2 = "ABC DE FGH IJKL";
        String[] splitText2 = text2.split("\\s+");

        for (String s : splitText2) {
            Matcher forMatcher2 = pattern2.matcher(s);

            if (forMatcher2.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }



        System.out.println("================================");
        System.out.println("Match a string containing 'a' repeated 0 or more times.");
        System.out.println("================================");

        Pattern pattern3 = Pattern.compile("a*");
        String text3 = "ABC Da FGH IJaa aa a ";
        String[] splitText3 = text3.split("\\s+");
        for (String s : splitText3) {
            Matcher forMatcher3 = pattern3.matcher(s);

            if (forMatcher3.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text3Empty = "";
        Matcher emptyMatcher3 = pattern3.matcher(text3Empty);
        if (emptyMatcher3.matches()) {
            System.out.println("EMPTY 0 occur- Match found: " + text3Empty);
        } else System.out.println("EMPTY 0 occur  - No match found: " + text3Empty);





        System.out.println("================================");
        System.out.println("Match a string containing 'a' repeated 1 or more times.");
        System.out.println("================================");

        Pattern pattern4 = Pattern.compile("a+");
        String text4 = "ABC Da FGH IJaa aa a ";
        String[] splitText4 = text4.split("\\s+");
        for (String s : splitText4) {
            Matcher forMatcher4 = pattern4.matcher(s);

            if (forMatcher4.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text4Empty = "";
        Matcher emptyMatcher4 = pattern4.matcher(text4Empty);
        if (emptyMatcher4.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text4Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text4Empty);



        //1 or 0 occur
        System.out.println("================================");
        System.out.println("1 or 0 occur");
        System.out.println("================================");
        Pattern pattern5 = Pattern.compile("a?");
        String text5 = "a aa aaa aab ab aba b cb";
        String[] splitText5 = text5.split("\\s+");

        for (String s : splitText5) {
            Matcher forMatcher5 = pattern5.matcher(s);

            if (forMatcher5.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text5Empty = ""; //dla " " (spacja w środku) nie działa
        Matcher emptyMatcher5 = pattern5.matcher(text5Empty);
        if (emptyMatcher5.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text5Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text5Empty);





        System.out.println("================================");
        System.out.println("Match a word with exactly n repetitions of the selected character.");
        System.out.println("================================");
        Pattern pattern6 = Pattern.compile("a{3}");
        String text6 = "a aa aaa aab ab aba b cb";
        String[] splitText6 = text6.split("\\s+");

        for (String s : splitText6) {
            Matcher forMatcher6 = pattern6.matcher(s);

            if (forMatcher6.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text6Empty = "";
        Matcher emptyMatcher6 = pattern6.matcher(text6Empty);
        if (emptyMatcher6.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text6Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text6Empty);









        System.out.println("================================");
        System.out.println("Match a word with exactly n repetitions of the selected character.");
        System.out.println("================================");
        Pattern pattern7 = Pattern.compile("a{2,}");
        String text7 = "a aa aaa aab ab aba b cb aaaaaa";
        String[] splitText7 = text7.split("\\s+");

        for (String s : splitText7) {
            Matcher forMatcher7 = pattern7.matcher(s);

            if (forMatcher7.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text7Empty = "";
        Matcher emptyMatcher7 = pattern7.matcher(text7Empty);
        if (emptyMatcher7.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text7Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text7Empty);









        System.out.println("================================");
        System.out.println("Match a word with exactly n repetitions of the selected character.");
        System.out.println("================================");
        Pattern pattern8 = Pattern.compile("a{2,4}");
        String text8 = "a aa aaa aaaa aaaaa aaaaaaa";
        String[] splitText8 = text8.split("\\s+");

        for (String s : splitText8) {
            Matcher forMatcher8 = pattern8.matcher(s);

            if (forMatcher8.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text8Empty = "";
        Matcher emptyMatcher8 = pattern8.matcher(text8Empty);
        if (emptyMatcher8.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text8Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text8Empty);







    }
}