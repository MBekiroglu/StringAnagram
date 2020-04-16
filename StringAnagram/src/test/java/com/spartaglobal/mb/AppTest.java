package com.spartaglobal.mb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    StringAnagram stringAnagram = new StringAnagram();

    @Test
    public void checkThatCarAndRacAreAnagrams() {
        Assertions.assertTrue(stringAnagram.isStringAnagram("car", "rac"));
    }
    @Test
    public void checkThatMaryAndArmyAreAnagrams() {
        Assertions.assertTrue(stringAnagram.isStringAnagram("army", "mary"));
    }
    @Test
    public void checkThatOneStringIsConvertedToLowerCase() {
        Assertions.assertTrue(stringAnagram.isStringAnagram("army", "Mary"));
    }
    @Test
    public void checkThatBothStringsAreConvertedToLowerCase() {
        Assertions.assertTrue(stringAnagram.isStringAnagram("Army", "Mary"));
    }
    @Test
    public void checkSingleCharacterStringsWork() {
        Assertions.assertTrue(stringAnagram.isStringAnagram("a", "a"));
    }
    @Test
    public void checkEmptyStringsWork() {
        Assertions.assertTrue(stringAnagram.isStringAnagram("", ""));
    }
    @Test
    public void checkEmptyStringsReturnTrue() {
        Assertions.assertTrue(stringAnagram.isStringAnagram("", ""));
    }
    @Test
    public void checkThatBillAndFredAreNotAnagrams() {
        Assertions.assertFalse(stringAnagram.isStringAnagram("Fred", "Bill"));
    }
    @Test
    public void checkLongStringsWork() {
        Assertions.assertTrue(stringAnagram.isStringAnagram("Angered", "Enraged"));
    }
    @Test
    public void testThatSpacesAreIgnored() {
        Assertions.assertTrue(stringAnagram.isStringAnagram("School master", "The classroom"));
    }
    @Test
    public void testThatLongerStringsAreAnagrams() {
        Assertions.assertTrue(stringAnagram.isStringAnagram("basiparachromatin", "marsipobranchiata"));
    }
    @Test
    public void testThatSpacesAreIgnoredInOneWord() {
        Assertions.assertTrue(stringAnagram.isStringAnagram("basipar achromatin", "marsipob      ranchiata"));
    }
}