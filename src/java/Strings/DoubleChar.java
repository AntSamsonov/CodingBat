package Strings;

public class DoubleChar {
    public String start(String str) {
        String s = "";

        for(int i = 0; i < str.length(); i++){
            s+=str.charAt(i);
            s+=str.charAt(i);
        }
        return s;
    }
}
/*
Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"