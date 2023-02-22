package az.orient.lesson7.general;

import java.util.Scanner;

public class GenTask1 {
    //Girilen 2 edede gore EKOB ve EKOB tapan proqram
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Daxil edin ilk ededi: ");
        int a = sc.nextInt();
        System.out.println("Daxil edin ikinci ededi: ");
        int b = sc.nextInt();
        int ebob = 1; //temp bir deyer verilir  = 1 ; niye  0 yox? , cunki bu deyer 2 ededin ortaq boleni olmalidir.
        int ekob = 1;


        if(a<=0 || b<=0){ // 0 olarsa ekob tapilmaz ebob da 0 olar
            System.out.println("Ededler natural olmalidir.(mes:10,25");
        }else {
            int i;
            for (i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                }
            }
            ekob = a * b / ebob;
            System.out.println(a + " ve " + b + " EBOB'u -> " + ebob);
            System.out.println(a + " ve " + b + " EKOB'u -> " + ekob);

        }



    }
}
