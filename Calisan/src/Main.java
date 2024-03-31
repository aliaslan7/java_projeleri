import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.print("çalışanlar programına hoşgeldiniz.\n");
        Scanner scanner = new Scanner(System.in);

        String islemler = "işlemler \n" +
                "1-yazılımcı işlemleri\n" +
                "2-yönetici işlemleri\n" +
                "q-çıkış için";

        System.out.println("**********************");
        System.out.println(islemler);
        System.out.println("**********************");


        while (true) {
            System.out.print("işlem seçiniz:");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("programdan çıkılıyor.");
                break;
            } else if (islem.equals("1")) {

                yazılımcı yazılımcı = new yazılımcı("ALİ ", "ASLAN", 1234, "C , JAVA , PYTHON ");
                String islemler_a = "1-format at\n" +
                        "2-bilgileri göster\n" +
                        "q-yazılımcı dan çıkış\n";

                System.out.println(islemler_a);
                while (true) {
                    System.out.print("yazılımcı için işlem seçiniz: ");
                    String islem_b = scanner.nextLine();

                    if (islem_b.equals("q")) {
                        System.out.println("yazılımcı programından çıkılıyor.");
                        break;
                    } else if (islem_b.equals("1")) {
                        System.out.print("işletim sistemi seçin:");
                        String isletim_sistemi = scanner.nextLine();
                        yazılımcı.formatat(isletim_sistemi);
                    }


                    } else if (islem.equals("2")) {

                        String islemler_x = "yönetici için işlemler\n" +
                                "1-zam yap" +
                                "2-bilgileri göster\n" +
                                "q- yoneticiden çıkış yap\n ";
                        System.out.println(islemler_x);
                    }


                    while (true) {
                        yonetici yonetici = new yonetici("MEHMET ", "ASLAN", 1546, 2000);
                        System.out.print("yönetici için işlem seçin:");
                        String islem_c = scanner.nextLine();

                        if (islem_c.equals("q")) {
                            System.out.println("yöneeticiden çıkış yapılıyor...");
                            break;
                        } else if (islem_c.equals("1")) {

                            System.out.println("yönetici ne kadar zam yapmasını istersiniz.");

                            int miktar = scanner.nextInt();
                            scanner.nextLine();
                            yonetici.zam_yap(miktar);

                        } else if (islem_c.equals("2")) {

                            yonetici.bilgilerigoster();
                        } else
                            System.out.println("HATA.....");


                    }


                }



        }


    }
}




