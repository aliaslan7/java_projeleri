public class Monitor {

    private String model;
    private String uretici ;
    private  String  boyut;
    private  Resolution resolution;

    public Monitor(String model, String uretici,String boyut, Resolution resolution) {

    this.uretici=uretici;
    this.model=model;
    this.boyut=boyut;
    this.resolution=resolution;

    }
    public void monitoru_kapat()
    {
        System.out.println("monitor kapatılıyor...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBoyutu() {
        return boyut;
    }

    public void setBoyutu(String boyutu) {
        this.boyut = boyutu;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
