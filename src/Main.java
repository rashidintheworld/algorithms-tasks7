import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = 1234;
        int cem =0;

        while(a>0){
            cem+=a%10;
            a=a/10;
            System.out.println(cem);
        }
   }
}