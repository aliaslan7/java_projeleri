public class Anakart {

    private  String model;
    private  int yuvas_sayisi;

    private String uretici;
    private String isletim_sistemi;

    public Anakart(String model,String uretici,String isletim_sistemi,int yuvas_sayisi)
    {
        this.isletim_sistemi=isletim_sistemi;
        this.model=model;
        this.uretici=uretici;
        this.yuvas_sayisi=yuvas_sayisi;
    }
    public void isletim_sistmi_yukle(String isletim_sistemi)
    {
        this.isletim_sistemi=isletim_sistemi;
        System.out.println("işletim sistemi yuklendi. "+isletim_sistemi);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYuvas_sayisi() {
        return yuvas_sayisi;
    }

    public void setYuvas_sayisi(int yuvas_sayisi) {
        this.yuvas_sayisi = yuvas_sayisi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }
}
