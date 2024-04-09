import java.util.Scanner;

public class Yolcu implements Yurtdisi {
    public   Yolcu()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("yatıdığınız harc miktarı: ");
        this.harci= scanner.nextInt();
        scanner.nextLine();

        System.out.println("siyasi yasağnız var mı? :");
        String cevap=scanner.nextLine();

        if (cevap.equals("evet") )
        {
            this.siyasiyasak=true;
        }else {
            this.siyasiyasak = false;
        }
        System.out.println("vizeniz var mı :");
        String cevap1=scanner.nextLine();

        if (cevap1.equals("evet"))
        {
            this.vizedurumu=true;
        }
        else {
            this.vizedurumu=false;
        }

    }
    @Override
    public boolean yurtdisiharcıKontrol() {
        if (this.harci<200)
        {
            System.out.println("yurtdişi harcını tamamlayın.");
            return false;
        }
        else {
            System.out.println("yurtdişi harci tamamlanmıştır.");
        }return true;

    }

    @Override
    public boolean siyasiyasakKontrol() {
        if (this.siyasiyasak==true)
        {
            System.out.println("siyasi yasagınız bulunuyor.yurtdişina çıkamazzsınız.");
           return false;
        }
        else
        {
            System.out.println("siyasi  yasağınız bulunmuyor.");
            return true;
        }

    }

    @Override
    public boolean vize_durmuKontrol() {
        if (this.vizedurumu==true)
        {
            System.out.println("vizeniz mevcuttur.");
            return true;
        }
        else {
            System.out.println("vizeniz yoktur.yurtdişina çıkmassınız.");
            return false;
        }

    }

    private int harci ;
    private boolean siyasiyasak;
    private boolean vizedurumu;

}
