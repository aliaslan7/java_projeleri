import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Kumanda programına Hoşgeldiniz....\n");
        Scanner scanner =new Scanner(System.in);

        String islemler="işlemler....\n" +
                "1.kanalları göster \n" +
                "2.kanal ekle\n" +
                "3.kanal sil\n" +
                "4.kanal sayısı oğren\n" +
                "q.çıkış";

        Kumanda kumanda =new Kumanda();
        while (true)
        {
            System.out.println("*************************\n");
            System.out.println(islemler);
            System.out.println("*************************\n");
            System.out.print("işlem seçiniz: ");

            String islem= scanner.nextLine();

            if (islem.equals("q"))
            {
                System.out.println("programdan çıkılıyor");
                Thread.sleep(3000);
                break;
            }
            else if (islem.equals("1")) {
                kanallarıgoster(kumanda);
            }
            else if (islem.equals("2")) {
                System.out.print("Eklenecek kanal ismi: ");
                String kanal_ismi=scanner.nextLine();
                kumanda.KanalEkle(kanal_ismi);

            }
            else if (islem.equals("3")) {
                System.out.print("silinecek kanal ismi :");

                String kanal_ismi=scanner.nextLine();
                kumanda.Kanalsil(kanal_ismi);

            }
            else if (islem.equals("4")) {
                System.out.println("Kanal sayısı: "+kumanda.Kanlsayısı());

            }
            else
                System.out.println("geçersiz işlem");



        }
    }


    public static void kanallarıgoster(Kumanda kumanda)
    {
        if (kumanda.Kanlsayısı()==0)
        {
            System.out.println("kanal bunulmamaktadır.");
        }
        else {
            Iterable<? extends String> Kumanda =new ArrayList<String>();
            for (String kanal :Kumanda )
            {
                System.out.println(kanal);
            }
        }
    }
}