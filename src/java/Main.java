import Arrays.CountEvens;
import Strings.BobThere;
import Strings.CountHi;
import Strings.CountYZ;
import Strings.DoubleChar;

public class Main {

    public static void main(String[] args) {
                //String-2
        System.out.println(new CountYZ().start("day fyyyz"));
        System.out.println(new DoubleChar().start("abc"));
        System.out.println(new BobThere().start("bib"));
        System.out.println(new CountHi().start("hilvrepdfhisdvlkszdhi"));

                //Array-2
        System.out.println(new CountEvens().start(new int[]{1, 2, 4, 5}));


    }
}