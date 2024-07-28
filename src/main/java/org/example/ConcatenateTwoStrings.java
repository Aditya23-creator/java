package org.example;

public class ConcatenateTwoStrings {

    public static void main(String[] args) {
        String S1 = "Hack";
        String S2 = "ingly";

        String result = concatenateStrings(S1, S2);
      //  System.out.println(result);
    }
    private static String concatenateStrings(String S1, String S2) {
        StringBuilder sb = new StringBuilder();
        sb.append(S1);
        sb.append(S2);
        return sb.toString();
    }
}
