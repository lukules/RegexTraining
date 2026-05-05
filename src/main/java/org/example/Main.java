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
        String[] splitText4 = text3.split("\\s+");
        for (String s : splitText3) {
            Matcher forMatcher3 = pattern3.matcher(s);

            if (forMatcher3.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text4Empty = "";
        Matcher emptyMatcher4 = pattern4.matcher(text4Empty);
        if (emptyMatcher4.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text4Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text4Empty);






    }
}