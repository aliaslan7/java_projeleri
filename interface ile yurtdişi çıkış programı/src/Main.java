
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("GAP Havalimanına Hoşgeldiniz. ");

        String sartlar="Yurtdişi çıkış kuralları...\n" +
                "Herhangi bir siyasi yasağınızın olmaması gerekiyor.\n" +
                "200tl lik harc ücretini yatırmış olmalısınız.\n" +
                "Gideceğiniz yere vizenizin olması gerekmektedir.";

        String message="Yurdişi kurallarını yerine getirmeniz gerekiyor..";


        while (true){
            System.out.println("**********************************************");
            System.out.println(message);
            System.out.println("**********************************************");
            System.out.println(sartlar);


            Yolcu yolcu=new Yolcu();


            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);

            if (yolcu.yurtdisiharcıKontrol()==false)
            {
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            if (yolcu.siyasiyasakKontrol()==false)
            {
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor..");
            Thread.sleep(3000);

            if (yolcu.vize_durmuKontrol()==false)
            {
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamamdır. Yurdişina çıkabilirsiniz.");
            break;
        }


    }
}