import java.util.Scanner;

public class Main {


    public static void main(String[] args)  {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Matematik ve fizik programına  Hoşgeldiniz..");

        String islemler="1-Dairenin alanı Hesaplama \n " +
                "2-Üçgenin çevresi Hesaplama \n" +
                "3-İki Vectorun  iççarpım Hesaplama \n" +
                "4-çıkış";

        while (true)
        {
            System.out.println("------------------------------");
            System.out.println(islemler);
            System.out.println("------------------------------");


            System.out.print("yapmak istediğiniz işlemi seçiniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q"))
            {
                System.out.println("programdan çıkılıyor...");
                break;

            }
            else if (islem.equals("1"))
            {

                System.out.print("Dairnin yarıçapı: ");
                int yarıcap= scanner.nextInt();
                scanner.nextLine();
                problem.matamatik.daire_alanı(yarıcap);



            }
            else if (islem.equals("2"))
            {
                System.out.println("kenar1: ");
                int kenar1= scanner.nextInt();
                System.out.println("kenar2: ");
                int kenar2= scanner.nextInt();
                System.out.println("kenar3: ");
                int kenar3= scanner.nextInt();
                scanner.nextLine();
                problem.matamatik.ucgenin_cevresi(kenar1,kenar2,kenar3);


            }
            else if (islem.equals("3"))
            {
              Vec vec1=new Vec("vektör1");
              Vec vec2=new Vec("vektör2");
              problem.fizik.İcCarpım(vec1,vec2);

            }
            else
                System.out.println("geçersiz işlem. ");



        }


    }
}