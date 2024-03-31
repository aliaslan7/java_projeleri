public class kopek extends Hayvan{

    private int bacak_saysı;

    public kopek(String isim,int yas,int boy,int bacak_saysı)
    {
     super(isim, yas, boy);
     this.bacak_saysı=bacak_saysı;

    }
public void kos(int hız)
{
    System.out.println("kopek koşuyor.");
    super.hareketegec(hız);
}

    public int getBacak_saysı() {
        return bacak_saysı;
    }

    public void setBacak_saysı(int bacak_saysı) {
        this.bacak_saysı = bacak_saysı;
    }

}
