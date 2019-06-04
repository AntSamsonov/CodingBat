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
