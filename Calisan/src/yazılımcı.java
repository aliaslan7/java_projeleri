public class yazılımcı extends Calisan {

    private String diller;

    public yazılımcı(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller=diller;

    }
    public void formatat(String isletim_sistemi)
    {
        System.out.println(getAd()+" "+isletim_sistemi+"ni yüklüyor...");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("yazılımcının bildiği diller "+diller);
    }
}
