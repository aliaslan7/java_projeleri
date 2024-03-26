import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        18.5 altındaysa zayıf
        18.5 - 25 arasındaysa normal
        25-30 arasında fazla kilolu
        30 dan buyuk obez
         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz: ");
        int kilo = scanner.nextInt();
        System.out.println("boyunuzu girniz: (m cinsinden )");
        double boy= scanner.nextDouble();

        double bdki=kilo/(boy*boy);
        if (bdki<18.5){
            System.out.println("bdki="+bdki + " zayıfsınız");

        }
        else if (bdki > 18.5 && bdki < 25) {
            System.out.println("bdki:"+bdki + " normal kilo");

        }
        else if (bdki > 25 && bdki < 30) {
            System.out.println("bdki:"+ bdki + " fazla kilolu");
        }
        else {
            System.out.println("bdki:"+bdki + " obez");
        }


    }
}