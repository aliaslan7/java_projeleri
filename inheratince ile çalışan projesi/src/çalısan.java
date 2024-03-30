public class çalısan {


    private String isim;
    private int maas;

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    private String departman;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public çalısan(String isim, int maas, String departman)
    {
        this.isim=isim;
        this.maas=maas;
        this.departman=departman;

    }
    public void calıs()
    {
        System.out.println("çalışan çalışıyor..");
    }
    public void bilgilerigoster()
    {

        System.out.println("*************************");
        System.out.println("AD: "+isim);
        System.out.println( "MAAŞ: "+maas);
        System.out.println("DEPARTMAN :"+departman);
        System.out.println("*************************");
    }
    public void deparman_değiştir(String yeni_departman)
    {
        System.out.println("departman değiştiriliyor...");
        this.departman=yeni_departman;
        System.out.println("yeni departman.. "+this.departman);

    }



}
