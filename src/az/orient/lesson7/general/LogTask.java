package az.orient.lesson7.general;

import java.util.Scanner;

public class LogTask {
    public static void main(String[] args) {
        //logarifma hesablayan program
        System.out.println("Umumi shekil -> loga(b) = c -> b = a^c");
        Scanner sc = new Scanner(System.in);
        System.out.print("a esasi daxil edin -> ");
        double a = sc.nextDouble();
        System.out.print("b daxil edin -> ");
        double b = sc.nextDouble();

        if (a <= 0 || b <= 0) { //xasse
            System.out.println("Logarifmanin a esasi ve b deyeri hemise musbet olmalidir!");
        } else if(a==1){ //xasse
            System.out.println("Esas eger 1 olarsa qiymet sonsuzluq alinar, cunki logarifma 1 sayinin diger sayinin nece defe quvveti oldugunu gosterir.\n 1 Esas o demekdirki herhansi bir ededin herhansi quvveti = 1 dir!");
        } else {
            double logabDustur = Math.log10(b) / Math.log10(a); //riyazi yanasma dusturu
            String strFormat = String.format("%.2f",logabDustur); //isteyirem ki , den sonra 2 eded versin

            if (logabDustur < 0) { //logarifma xasse: log deyeri 0 - dan kicik ola bilmez
                System.out.println("Logarifmanin deyeri 0-dan boyuk olmalidir! Alinan deyer ->" + strFormat);
            } else {
                System.out.println("Logarifma " + a + " esasdan " + b + " -> qiymeti : " + strFormat);
            }
        }
    }

}
