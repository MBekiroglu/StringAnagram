package com.spartaglobal.mb;

public class StringAnagram {

    public boolean isStringAnagram(String string1, String string2) {
        StringBuilder tester = new StringBuilder(string2);
        int counter = 0;
        for (int i = 0; i < string1.length(); i++) {
            char one = string1.toLowerCase().charAt(i);
            for (int j = 0; j < tester.length(); j++) {
                char two = tester.toString().toLowerCase().charAt(j);
                if (one == two) {
                    tester.deleteCharAt(j);
                    counter++;
                    break;
                }
            }
        }
        if (counter == string1.length()) {
            return true;
        }
        return false;
    }
}
