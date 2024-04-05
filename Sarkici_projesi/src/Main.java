import java.util.Scanner;

public class Main {

    private static Sarkicilar sarkicilar=new Sarkicilar();
    private static Scanner scanner=new Scanner(System.in);

    public static void islemleri_bastır(){
        System.out.println("\t 0-işlemleri görüntüle");
        System.out.println("\t 1-şarkıcıları görüntüle");
        System.out.println("\t 2-şarkıcı ekle");
        System.out.println("\t 3-şarkıcı sil");
        System.out.println("\t 4-şarkıcı güncelle");
        System.out.println("\t 5-şarkıcı ara");
        System.out.println("\t 6-uygulamadan çık");

    }
    public static void sarkici_goruntule()
    {
        sarkicilar.sarkıcı_bastır();
    }
    public static void sarkici_ekle(){
        System.out.print("eklemek istediğin şarkıcının ismi:");
        String isim=scanner.nextLine();

        sarkicilar.sarkici_ekle(isim);
    }
    public static void sarkici_sil()
    {
        System.out.print("silmek istediğiniz şarkicinin pozisyonu:");
        int pozisyon=scanner.nextInt();
        sarkicilar.sarkici_sil(pozisyon+1);
    }
    public static void sarkici_guncelle()
    {
        System.out.print("güncellemek istediğiniz pozisyon:");
        int pozisyon= scanner.nextInt();
        scanner.nextLine();
        System.out.print("güncellemek istediğiniz isim: ");
        String isim= scanner.nextLine();


        sarkicilar.sarkici_guncelle(pozisyon+1,isim);
    }

    public static void sarkici_ara()
    {
        System.out.println("armak istediğiniz isim: ");
        String isim= scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }

    public static void main(String[] args) {
        System.out.println("Şarkıcı Uygulamasına Hoşgeldiniz");
        islemleri_bastır();

        boolean cikis=false;
        int islem;
        while (!cikis)
        {
            System.out.print("bir işlem seçiniz:");
            islem= scanner.nextInt();
            scanner.nextLine();

            switch (islem)
            {
                case 0:
                    islemleri_bastır();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_sil();
                    break;
                case 4:
                    sarkici_guncelle();
                    break;
                case 5:
                    sarkici_ara();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("uygulamadan çıkılıyor...");
                    break;
            }





        }
islemleri_bastır();





    }
}