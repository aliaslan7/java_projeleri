//gelişmiş hesap makinewsi
// 2 ve 3 lu toplma carpma fonksiyonu overloding kullanarak yapmak

import java.util.Scanner;

public class Main {
    public static int toplama(int a, int b)
    {
        return (a+b);
    }
    public static int toplama(int a , int b , int c)
    {
        return (a+b+c);
    }
    public static int cıkarma(int a,int b)
    {
        return (a-b);

    }
    public static int carpma(int a,int b)
    {
        return (a*b);
    }
    public static int carpma(int a,int b,int c)
    {
        return (a*b*c);

    }
    public static double bolme(int a,int b)
    {
        return (double) a/b;
    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String islemler=" 2-toplama" +
                " 3-çıkarma" +
                " 4-çarpma" +
                " 5-bolme" +
                " 1-çıkış için ";
        System.out.println("***********************");
        System.out.println(islemler);
        System.out.println("***********************");
while (true) {
    System.out.println("işlem seçiniz:");
    String islem = scanner.nextLine();


    if (islem.equals("1")) {
        System.out.println("programdan çıkılıyor...");
        break;

    } else if (islem.equals("2")) {
        System.out.println("kaç değer gireceksiniz ? (2 veya 3)");
        int deger = scanner.nextInt();
        if (deger == 2) {
            System.out.print("sayi1 gir:");
            int sayi1 = scanner.nextInt();
            System.out.print("sayi2 gir:");
            int sayi2 = scanner.nextInt();


            System.out.println("sonuc:" + toplama(sayi1, sayi2));

        } else if (deger == 3) {
            System.out.print("sayi1 gir:");
            int sayi1 = scanner.nextInt();
            System.out.print("sayi2 gir:");
            int sayi2 = scanner.nextInt();
            System.out.print("sayi3 gir:");
            int sayi3 = scanner.nextInt();


            System.out.print("sonuc:" + toplama(sayi1, sayi2, sayi3));

        } else {
            System.out.println("uygun metod bulunamadı.");
        }
    } else if (islem.equals("3")) {
        System.out.print("sayi1 gir:");
        int sayi1 = scanner.nextInt();
        System.out.print("sayi2 gir:");
        int sayi2 = scanner.nextInt();

        System.out.print("sonuc:" + cıkarma(sayi1, sayi2));

    } else if (islem.equals("4")) {
        System.out.print("kaç değer gireceksiniz ? (2 veya 3)");
        int deger = scanner.nextInt();

        if (deger == 2) {
            System.out.print("sayi1 gir:");
            int sayi1 = scanner.nextInt();
            System.out.print("sayi2 gir:");
            int sayi2 = scanner.nextInt();


            System.out.print("sonuç:" + carpma(sayi1, sayi2));
        } else if (deger == 3) {
            System.out.print("sayi1 gir:");
            int sayi1 = scanner.nextInt();
            System.out.print("sayi2 gir:");
            int sayi2 = scanner.nextInt();
            System.out.print("sayi3 gir:");
            int sayi3 = scanner.nextInt();

            System.out.print("sonuc:" + carpma(sayi1, sayi2, sayi3));


        } else {
            System.out.println("uygun metod bulunamadı.");
        }

    } else if (islem.equals("5")) {
        System.out.print("sayi1 gir:");
        int sayi1 = scanner.nextInt();
        System.out.print("sayi2 gir:");
        int sayi2 = scanner.nextInt();


        System.out.print("sonuc:" + bolme(sayi1, sayi2));

    }


}

    }
}