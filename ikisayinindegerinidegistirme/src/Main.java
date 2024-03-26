import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int sayi1;
        int sayi2;
        System.out.print("sayi1: ");
         sayi1= scanner.nextInt();
        System.out.print("sayi2:");
        sayi2= scanner.nextInt();
        System.out.println("sayıların değeri değiştirilmeden önce ....");
        System.out.println("sayı1:"+sayi1 + " sayı2:"+sayi2);

        int geçici=sayi1;
        sayi1=sayi2;
        sayi2=geçici;
        System.out.println("değerleri değiiştikten sonra...");
        System.out.println("sayı1:"+sayi1 + " sayı2:" + sayi2);

    }
}