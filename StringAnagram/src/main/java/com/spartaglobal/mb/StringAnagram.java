package com.spartaglobal.mb;

public class StringAnagram {

    public boolean isStringAnagram(String string1, String string2) {
        StringBuilder stringBuilder1 = new StringBuilder(string1);
        StringBuilder stringBuilder2 = new StringBuilder(string2);
        int counterOne = 0;
        int counterTwo = 0;

        for (int i = 0; i < stringBuilder1.length(); i++) {
            while (stringBuilder1.charAt(i) == ' ') {
                stringBuilder1.deleteCharAt(i);
                counterOne++;
            }
        }

        for (int j = 0; j < stringBuilder2.length(); j++) {
            while (stringBuilder2.charAt(j) == ' ') {
                stringBuilder2.deleteCharAt(j);
                counterTwo++;
            }
        }

        for (int i = 0; i < stringBuilder1.length(); i++) {
            char one = stringBuilder1.toString().toLowerCase().charAt(i);
            for (int j = 0; j < stringBuilder2.length(); j++) {
                char two = stringBuilder2.toString().toLowerCase().charAt(j);
                if (one == two) {
                    stringBuilder2.deleteCharAt(j);
                    counterOne++;
                    counterTwo++;
                    break;
                }
            }
        }
        if (counterOne == string1.length() && counterTwo == string2.length()) {
            return true;
        }
        return false;
    }
}
