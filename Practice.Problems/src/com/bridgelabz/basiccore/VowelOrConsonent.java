package com.bridgelabz.basiccore;

public class VowelOrConsonent {
   public static void Vowel_Or_Consonant(char y)
    {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                || y == 'u')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
    }

    public static void main(String[] args)
    {
        Vowel_Or_Consonant('b');
        Vowel_Or_Consonant('u');
    }
}
