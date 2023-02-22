package az.orient.lesson7.random;

import java.util.Random;
import java.util.Scanner;

public class RanTask2 {
    //a-b araliginda olan random 2 eded sec ve min max hesabla
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a ededini daxil edin: ");
        int a = sc.nextInt();
        System.out.print("b ededini daxil edin: ");
        int b = sc.nextInt();
        Random ran = new Random();
        int max = a;
        int min = b;
        if (a > b) {
            System.out.println("Ilk eded yeni " + a + " ikinci ededden yeni " + b + "-den boyuk ola bilmez!");
        } else {
            System.out.print("Nece eded secmek isteyirsen?");
            int n = sc.nextInt();
            if (n > (b - a)) {
                System.out.println(a + " ve " + b + " araliqinda " + n + " sayda eded yoxdur!");
            } else {
                int r = 0;
                for (int i = 1; i < n+1; i++) { //n=3 olsa
                    r = ran.nextInt(a, b);
                    System.out.println(i+".random eded->" + r);
                    if (r < min) {
                        min = r;
                    }
                    if (r > max) {
                        max = r;
                    }

                }System.out.println("Minumum reqem-> "+min);
                System.out.println("Maximum reqem-> "+max);
            }
        }
    }
}
