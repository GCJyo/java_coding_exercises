package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
      return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0))+"."+Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double withVat = originalPrice + (originalPrice * vatRate)/ 100;
        withVat=Math.round(withVat*100.00)/100.00;
        return withVat;
    }

    public String reverse(String sentence) {
        String rev = "";
        int len = sentence.length();
        for (int i = len -1; i>=0; i--)
          rev = rev + sentence.charAt(i);
        return rev;
    }

    public int countLinuxUsers(List<User> users) {
        return 0;
    }
}
