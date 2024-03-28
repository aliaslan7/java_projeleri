import java.util.Scanner;

public class ATM {

    public void calıs(hesap hesap1 ){

        login login1 =new login();

        Scanner scanner =new Scanner(System.in);
        System.out.println("Bankamıza hoş geldiniz");
        System.out.println("************************");
        System.out.println("kullanıcı girişi : ");
        System.out.println("************************");

        int girishakkı=3;

        while (true)
        {
            if(login1.login(hesap1))
            {
                System.out.println("başarılı giriş..");
                break;
            }
            else
            {
                girishakkı -=1;
                System.out.println("giriş başarısız");
                System.out.println("kalan giriş hakkınız= "+girishakkı);
            }
            if (girishakkı==0)
            {
                System.out.println("giriş hakkınız bitmiştir");

                return;
            }
        }
        System.out.println("**************************");
        String islemler= ("1.bakiye görüntüle \n" +
                "2.para yatırma \n" +
                "3.para çekme \n" +
                "çıkış için q'ya bas");
        System.out.println(islemler);
        System.out.println("**************************");


        while (true)
        {
            System.out.println("işlem seçiniz");
            String islem= scanner.nextLine();

            if (islem.equals("q")){

                break;
            }
            else if ( islem.equals("1"))
            {
                System.out.println("bakiyeniz= "+hesap1.getBakiye());
            }
            else if (islem.equals("2"))
            {
                System.out.print("tutar: ");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                hesap1.parayatır(tutar);


            }
            else if (islem.equals("3"))
            {
                System.out.print("tutar=");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                hesap1.paracekme(tutar);


            }
            else
            {
                System.out.println("geçersiz işlem.. ");
            }

        }

    }

}
