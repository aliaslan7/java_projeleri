public class Ücgen extends Sekil{

    private  int kenar1;
    private int kenar2;
    public Ücgen(String isim, int kenar1,int kenar2) {
        super(isim);
        this.kenar1 =kenar1;
        this.kenar2=kenar2;

    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim()+" alanı : "+ ((kenar2*kenar1)/2));
    }
}
