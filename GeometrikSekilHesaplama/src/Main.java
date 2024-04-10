import java.security.PrivilegedExceptionAction;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       String islemler="1 -işlemleri göster.\n " +
               "2-kare alanı hesaplama.\n" +
               "3-daire alanı hesaplama.\n" +
               "4-üçgen alanı hesaplama.\n" +
               "5-programdan çıkış";



        Scanner scanner =new Scanner( System.in);
        while ( true)
        { System.out.println("------------------------------------");
            System.out.println(islemler);
            System.out.println("------------------------------------");
            System.out.print("işlem seçiniz: ");
            int islem = scanner.nextInt();

        switch ( islem)
        {
            case 1:
            {
                System.out.println(islemler);
                break;
            }
            case 2:
            {
                System.out.print("kenar uzunluğunu gir: ");
                int kenar= scanner.nextInt();
                Kare kare=new Kare("KARE",kenar);
                kare.alan_hesapla();
                break;
            }
            case 3:{
                System.out.print("yarıçap uzuunluğunu gir: ");
                int yarıçap= scanner.nextInt();
                Daire daire=new Daire("DAİRE" ,yarıçap);
                daire.alan_hesapla();
                break;
            }
            case 4:{

                System.out.print("kenar1 uzunlugunu gir: ");
                int kenar1= scanner.nextInt();
                System.out.print("kenar2 uzunluğunu gir:");
                int kenar2= scanner.nextInt();
                Ücgen ücgen=new Ücgen("ÜÇGEN",kenar1,kenar2);
                ücgen.alan_hesapla();
                break;
            }
            case 5:
                System.out.println("programdan  çıkılıyor....");
                break;
            }
            break;
        }



}
}