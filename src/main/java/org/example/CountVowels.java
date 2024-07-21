package org.example;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Hackingly";
        int count = countVowels(str);
        System.out.println("Total No of Vowels present"+" "+count);
    }
    private static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou";   // taking both upper case and lowercase vowels

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
