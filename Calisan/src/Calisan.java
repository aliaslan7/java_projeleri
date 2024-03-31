public class Calisan {


    private String ad;
    private String soyad;
    private int id;

    public void bilgilerigoster()
    {
        System.out.println("ad : "+ad);
        System.out.println("soyad :"+soyad);
        System.out.println("id : "+id);
    }
    public Calisan(String ad,String soyad,int id)
    {
        this.ad=ad;
        this.soyad=soyad;
        this.id=id;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
