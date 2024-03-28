import java.util.Scanner;

public class hesap {

    private String kullanıcıadı;
    private String parola;
    private double bakiye;

public hesap(String kullanıcıadı,String parola,double bakiye)
{
    this.kullanıcıadı=kullanıcıadı;
    this.parola=parola;
    this.bakiye=bakiye;
}

    public String getKullanıcıadı() {
        return kullanıcıadı;
    }
    public void setKullanıcıadı(String kullanıcıadı)
    {
        this.kullanıcıadı=kullanıcıadı;
    }

    public String getParola() {
        return parola;
    }
    public void setParola(String parola)
    {
        this.parola=parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public void parayatır(int tutar)
    {
        bakiye+=tutar;
        System.out.println("yeni bakiyeniz= "+bakiye);
    }
    public void  paracekme(double tutar)
    {

        if (tutar-bakiye>0)
        {
            System.out.println("yetersiz limit");
            System.out.println("bakiyeniz="+bakiye);
        }else
        {
            bakiye -=tutar;
        }
    }
}
