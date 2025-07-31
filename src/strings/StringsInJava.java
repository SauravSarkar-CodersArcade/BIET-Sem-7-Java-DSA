package strings;
public class StringsInJava {
    public static void main(String[] args) {
        // Different ways to represent a string in Java
        String data = new String("Java"); // Declaration 1
        String word = "Java"; // Declaration 2
        char[] array = {'J','a','v','a'}; // Declaration 3
        System.out.println(array[0]);
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));
        String jumbled = "Arun1studies1in1ISE1Section1C1@1BIET";
        String[] sentence = jumbled.split("1");
        // Arun studies in ISE Section C @ BIET
        System.out.println(sentence[4]);
        String wordWithSpaces = "      BIET   Davangere       ";
        String trimmedString = wordWithSpaces.trim();
        System.out.println(trimmedString);
        char c1 = 'A';
        char c2 = 'a';
        int a1 = (int) c1;
        int a2 = (int) c2;
        System.out.println(a1); // 65
        System.out.println(a2); // 97
        // '\0' null character -> 0
        // 'a' is ahead of 'A' in the ASCII table by 32 units
        char c3 = 'A' + 32; // upper + 32 = lower
        System.out.println(c3);
        char c4 = 'a' - 32; // lower - 32 = upper
        System.out.println(c4);
    }
}
