public class idman {


    private int buurpe_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public idman (int buurpe_sayisi,int pushup_sayisi,int squat_sayisi,int situp_sayisi)
    {
        this.buurpe_sayisi=buurpe_sayisi;
        this.squat_sayisi=squat_sayisi;
        this.pushup_sayisi=pushup_sayisi;
        this.situp_sayisi=situp_sayisi;
    }

    public int getBuurpe_sayisi() {
        return buurpe_sayisi;
    }

    public void setBuurpe_sayisi(int buurpe_sayisi) {
        this.buurpe_sayisi = buurpe_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public void hareketyap(String hareket,int sayi)
    {
        if (hareket.equals("buurpe"))
        {
            buurpeyap(sayi);

        } else if (hareket.equals("puushup"))
        {
            puushupyap(sayi);
        } else if (hareket.equals("squat")) {
            squatyap(sayi);

        } else if (hareket.equals("situp")) {

            situpyap(sayi);

        }

    }
    public void buurpeyap(int sayı)
    {
        if (buurpe_sayisi==0)
        {
            System.out.println("yapacak buurpee kalmadı.");
        }
        if (buurpe_sayisi-sayı<0)
        {
            System.out.println("hedeflediğin buurpee geçtin . Tebrikler...");
            System.out.println("kalan buurpee sayısı ="+buurpe_sayisi);
        }
        else
            buurpe_sayisi-=sayı;
        System.out.println("kalan buurpee sayısı="+buurpe_sayisi);
    }
    public void situpyap(int sayı)
    {
        if (situp_sayisi==0)
        {
            System.out.println("yapacak situp sayısı kalmadı.");
        }
        if (situp_sayisi-sayı<0)
        {
            System.out.println("hedeflediğin situp geçtin . Tebrikler...");
            System.out.println("kalan situp sayısı ="+situp_sayisi);
        }
        else
            situp_sayisi-=sayı;
        System.out.println("kalan situp sayısı="+situp_sayisi);
    }
    public void puushupyap(int sayı)
    {
        if (pushup_sayisi==0)
        {
            System.out.println("yapacak psuhup kalmadı.");
        }
        if (pushup_sayisi-sayı<0)
        {
            System.out.println("hedeflediğin pushup geçtin . Tebrikler...");
            System.out.println("kalan pushup sayısı ="+pushup_sayisi);
        }
        else
            pushup_sayisi-=sayı;
        System.out.println("kalan pushup sayısı="+pushup_sayisi);
    }
    public void squatyap(int sayı)
    {
        if (squat_sayisi==0)
        {
            System.out.println("yapacak squat kalmadı.");
        }
        if (squat_sayisi-sayı<0)
        {
            System.out.println("hedeflediğin spuat geçtin . Tebrikler...");
            System.out.println("kalan squat sayısı ="+squat_sayisi);
        }
        else
            squat_sayisi-=sayı;
        System.out.println("kalan squat sayısı="+buurpe_sayisi);
    }

    public boolean idmanbittimi()
    {
        return buurpe_sayisi==0 && squat_sayisi==0 && situp_sayisi==0 && pushup_sayisi==0;
    }
}
