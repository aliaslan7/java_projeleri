
public class Main {
    public static void main(String[] args) {

        Resolution resolution =new Resolution(1920,1080);
        Monitor monitor=new Monitor("caper gh12","casper","18.5 ",resolution);
        Kasa kasa=new Kasa("casper gh12","casper","tamperli cam ");
        Anakart anakart=new Anakart("Gh-25623","casper","windows 10 pro",10);

        Bilgisayar bilgisayar=new Bilgisayar(kasa, monitor,anakart);

        bilgisayar.getKasa().bilgisayarı_ac();
        bilgisayar.getMonitor().monitoru_kapat();
        bilgisayar.getAnakart().isletim_sistmi_yukle("windows 11");

    }
}