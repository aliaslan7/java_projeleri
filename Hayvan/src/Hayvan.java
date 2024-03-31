public class Hayvan {

    private String isim;
    private int yas;
    private int boy;


    public Hayvan(String isim,int yas,int boy)
    {
        this.isim=isim;
        this.yas=yas;
        this.boy=boy;
    }
    public void yemek_ye ()
    {
        System.out.println("hayvan şuan yemek yiyor...");
    }

    public void hareketegec(int hız)
    {
        System.out.println("hayvan şuan "+hız +" ile koşuyor");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
