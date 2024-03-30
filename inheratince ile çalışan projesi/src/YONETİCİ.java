public class YONETİCİ extends çalısan {

    private int sorumlu_kisi;

    public YONETİCİ(String isim, int maas, String departman, int sorumlu_kisi)
    {
        super(isim, maas, departman);
        this.sorumlu_kisi=sorumlu_kisi;


    }
    public void zam_yap(int miktar)
    {
        System.out.println("DUYURU...");

        System.out.println("zam miktarı: "+miktar);
    }
    public void sorumlu_kisi(int kisi)
    {

        System.out.println("sorumlu oldugu kişi sayısı :"+kisi);
    }

    public void bilgilerigoster()
    {


        /*System.out.println("AD: "+getIsim());
        System.out.println( "MAAŞ: "+getMaas());
        System.out.println("DEPARTMAN :"+getDepartman());*/
        // yada super kullanırız
        super.bilgilerigoster();
        System.out.println("sorumlu kişi sayısı "+sorumlu_kisi);

    }



}
