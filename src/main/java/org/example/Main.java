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
        System.out.println("Match a word with exactly n-d repetitions of the selected character.");
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







        System.out.println("================================");
        System.out.println("Match a string composed only of the letters a, b, and c.");
        System.out.println("================================");
        Pattern pattern9 = Pattern.compile("[abc]+");
        String text9 = "a ab abc abcd abcde adf acb abc bca cba abg";
        String[] splitText9 = text9.split("\\s+");

        for (String s : splitText9) {
            Matcher forMatcher9 = pattern9.matcher(s);

            if (forMatcher9.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text9Empty = "";
        Matcher emptyMatcher9 = pattern9.matcher(text9Empty);
        if (emptyMatcher9.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text9Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text9Empty);








        System.out.println("================================");
        System.out.println("Match any lowercase letter from a-z.");
        System.out.println("================================");
        Pattern pattern10 = Pattern.compile("[a-z]");
        String text10 = "a b c d e f gh a cfg asf as bb b";
        String[] splitText10 = text10.split("\\s+");

        for (String s : splitText10) {
            Matcher forMatcher10 = pattern10.matcher(s);

            if (forMatcher10.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text10Empty = "";
        Matcher emptyMatcher10 = pattern10.matcher(text10Empty);
        if (emptyMatcher10.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text10Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text10Empty);






        System.out.println("================================");
        System.out.println("Match any character that is not a, b, or c.");
        System.out.println("================================");
        Pattern pattern11 = Pattern.compile("[^abc]");
        String text11 = "a ab bca cba abg hj ih i v d g a b h";
        String[] splitText11 = text11.split("\\s+");

        for (String s : splitText11) {
            Matcher forMatcher11 = pattern11.matcher(s);

            if (forMatcher11.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text11Empty = "";
        Matcher emptyMatcher11 = pattern11.matcher(text11Empty);
        if (emptyMatcher11.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text11Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text11Empty);



        System.out.println("================================");
        System.out.println("Match an integer");
        System.out.println("================================");
        Pattern pattern12 = Pattern.compile("-?\\d+");
        String text12 = "9 10 2 4 5 13 421 -9 -900";
        String[] splitText12 = text12.split("\\s+");

        for (String s : splitText12) {
            Matcher forMatcher12 = pattern12.matcher(s);

            if (forMatcher12.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text12Empty = "";
        Matcher emptyMatcher12 = pattern12.matcher(text12Empty);
        if (emptyMatcher12.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text12Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text12Empty);





        System.out.println("================================");
        System.out.println("Match an identifier composed of letters, digits, and underscores");
        System.out.println("================================");
        Pattern pattern13 = Pattern.compile("\\w+");
        String text13 = "a ab abc ab2 ah65 hg2344 23vb a_2 *@#^ ABC!@ ABC!";
        String[] splitText13 = text13.split("\\s+");

        for (String s : splitText13) {
            Matcher forMatcher13 = pattern13.matcher(s);

            if (forMatcher13.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text13Empty = "";
        Matcher emptyMatcher13 = pattern13.matcher(text13Empty);
        if (emptyMatcher13.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text13Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text13Empty);


        System.out.println("================================");
        System.out.println("Match a fragment containing whitespace");
        System.out.println("================================");

        testRegex(".*\\s+.*", "Hello World", "SPACE");
        testRegex(".*\\s+.*", "HelloWorld", "NO SPACE");

        testRegex("", "", "");
        testRegex("", "", "");

        System.out.println("================================");
        System.out.println("Match a string containing only non-digit characters");
        System.out.println("================================");

        testRegex("[^0-9]+", "1234a", "NUMBER");
        testRegex("[^0-9]+", "abcd", "NO NUMBER");







        System.out.println("================================");
        System.out.println("Match text that begins with a specific letter.");
        System.out.println("================================");
        Pattern pattern14 = Pattern.compile("^B.*", Pattern.CASE_INSENSITIVE);
        String text14 = "a ab abc bbcd bbcde adf acb abc bca cba abg";
        String[] splitText14 = text14.split("\\s+");

        for (String s : splitText14) {
            Matcher forMatcher14 = pattern14.matcher(s);

            if (forMatcher14.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text14Empty = "";
        Matcher emptyMatcher14 = pattern14.matcher(text14Empty);
        if (emptyMatcher14.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text14Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text14Empty);




        System.out.println("================================");
        System.out.println("Match text that ends with a specific character.");
        System.out.println("================================");
        Pattern pattern15 = Pattern.compile(".*c$");
        String text15 = "a ab abc bcb bbc ccb bcc ccc abcd abcde adf acb abcc bcac cba abg";
        String[] splitText15 = text15.split("\\s+");

        for (String s : splitText15) {
            Matcher forMatcher15 = pattern15.matcher(s);

            if (forMatcher15.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text15Empty = "";
        Matcher emptyMatcher15 = pattern15.matcher(text15Empty);
        if (emptyMatcher15.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text15Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text15Empty);










        System.out.println("================================");
        System.out.println("Check if the entire string exactly matches the given pattern.");
        System.out.println("================================");
        Pattern pattern16 = Pattern.compile("^abc$");
        String text16 = "a ab abc abcd abcde adf acb abc bca cba abg";
        String[] splitText16 = text16.split("\\s+");

        for (String s : splitText16) {
            Matcher forMatcher16 = pattern16.matcher(s);

            if (forMatcher16.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text16Empty = "";
        Matcher emptyMatcher16 = pattern16.matcher(text16Empty);
        if (emptyMatcher16.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text16Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text16Empty);








        System.out.println("================================");
        System.out.println("Match an entire word, but not a fragment of a larger word.");
        System.out.println("================================");
        Pattern pattern17 = Pattern.compile("\\bdog\\b");
        String text17 = "hotdog dog dogfight";
        String[] splitText17 = text17.split("\\s+");

        for (String s : splitText17) {
            Matcher forMatcher17 = pattern17.matcher(s);

            if (forMatcher17.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text17Empty = "";
        Matcher emptyMatcher17 = pattern17.matcher(text17Empty);
        if (emptyMatcher17.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text17Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text17Empty);








        System.out.println("================================");
        System.out.println("Match an entire word, but not a fragment of a larger word.");
        System.out.println("================================");
        Pattern pattern18 = Pattern.compile("\\Bdog\\b");
        String text18 = "hotdog dog dogfight";
        String[] splitText18 = text18.split("\\s+");

        for (String s : splitText18) {
            Matcher forMatcher18 = pattern18.matcher(s);

            if (forMatcher18.matches()) {
                System.out.println("Match found: " + s);
            } else System.out.println("No match found: " + s);
        }

        String text18Empty = "";
        Matcher emptyMatcher18 = pattern18.matcher(text18Empty);
        if (emptyMatcher18.matches()) {
            System.out.println("EMPTY 1 occur - Match found: " + text18Empty);
        } else System.out.println("EMPTY 1 occur - No match found: " + text18Empty);





    }
    private static void testRegex(String regex, String input, String description) {
        // The matches() method checks if the ENTIRE input string matches the regex pattern
        boolean isMatch = Pattern.matches(regex, input);

        System.out.printf("[ %-6s ] Pattern: %-10s | Text: %-13s | Goal: %s%n",
                isMatch ? "MATCH" : "FAIL",
                regex,
                "\"" + input + "\"",
                description);
    }
}