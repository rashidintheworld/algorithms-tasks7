package az.orient.lesson7.random;

import java.util.Random;
import java.util.Scanner;

public class RanTask1 {
    //a-b araliginda olan n sayda random ededin hasilini tapin.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a-ededini daxil edin:");
        int a = sc.nextInt();
        System.out.print("b-ededini daxil edin:");
        int b = sc.nextInt();

        Random ran = new Random();
        //default deyer 1 dir 0 deyil cunki sonra artiracam 0-i vuranda 0 edir, bu da arzuolunmaz haldir.Cunki netice vermiyecek
        long hasil = 1;
        //araliq mehdudiyeti
        if (a > b) {
            System.out.println("Ilk eded ikinci daxil olunan ededden kicik olmalidir!");
        } else {
            System.out.print("Nece eded random number lazimdir?->");
            int n = sc.nextInt();
            //eger 10 15 arasi ededin icinden 20 dene random istese mesaj versin
            if (n > (b - a)) {
                System.out.println(a + " ve " + b + " araliqinda " + n + " sayda eded yoxdur!");
            } else {
                int i;
                int r = 0;
                for (i = 1; i < n + 1; i++) {
                    r = ran.nextInt(a, b);
                    hasil = hasil * r;
                    //System.out.println(i);
                    System.out.println(i + ". random eded-> " + r);
                }
                System.out.println(a + " ve " + b + " araliqindaki " + n + " sayda ededin hasili->" + hasil);
            }
        }
    }
}
