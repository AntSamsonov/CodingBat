package Strings;

public class BobThere {
    public boolean start(String str){
        for(int i = 0; i < str.length() - 2; i++){
            if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b'){
                return true;
            }
        }
        return false;
    }
}
/*Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


        bobThere("abcbob") → true
        bobThere("b9b") → true
        bobThere("bac") → false