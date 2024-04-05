import java.util.ArrayList;

public class Sarkicilar {

    private ArrayList<String> sarkici_listesi=new ArrayList<String>();

    public void sarkıcı_bastır(){

        System.out.println("şarkıcı listesinde "+sarkici_listesi.size()+" kadar şarkıcı var.");
        for (int i =0; i<sarkici_listesi.size();i++)
        {
            System.out.println((i+1)+"."+" : "+sarkici_listesi.get(i));
        }

    }
    public void sarkici_ekle(String isim)
    {
        sarkici_listesi.add(isim);
        System.out.println("şarkıcı listesi güncellendi.");
    }
    public void sarkici_sil(int pozisyon)
    {
        String isim=sarkici_listesi.get(pozisyon);
        sarkici_listesi.remove(pozisyon);
        System.out.println("şarkıcı listesinden "+isim+"silindi.");
        System.out.println("şarkıcı listesi güncellendi.");
    }
    public void sarkici_guncelle(int pozisyon, String isim)
    {
       sarkici_listesi.set(pozisyon,isim);
        System.out.println("şarkıcı listesi güncellendi.");
    }

    public void sarkici_ara(String isim)
    {
        int pozisyon=sarkici_listesi.indexOf(isim);

        if (sarkici_listesi.indexOf(isim)<0)
        {
            System.out.println("bu şarkıcı bulunamadı.");
        }
        else
            System.out.println(sarkici_listesi.indexOf(isim)+1);
    }
}

