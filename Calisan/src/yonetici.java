public class yonetici extends Calisan{

    private int sorumlu_kisi_sayısı;
    public yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayısı) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayısı=sorumlu_kisi_sayısı;

    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();

        System.out.println("yöneticinin sorumlu olduğu kişi sayısı : "+sorumlu_kisi_sayısı);
    }

    public void zam_yap(int miktar)
    {
        System.out.println(getAd()+" çalışanlara "+miktar+"tl zam yaptı.");

    }
}
