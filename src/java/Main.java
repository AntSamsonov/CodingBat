import Arrays.CountEvens;
import Arrays.Lucky13;
import Arrays.Only14;
import Arrays.Sum13;
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
        System.out.println(new Sum13().start(new int[]{2,2,4,13,2}));
        System.out.println(new Lucky13().start(new int[]{3,4,6,4}));
        System.out.println(new Only14().start(new int[]{1,4,1,1}));

    }
}