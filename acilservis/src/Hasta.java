public class Hasta  implements  Comparable<Hasta>{

    private String isim;
    private String şikeyet;
    private int öncelik ;


    public Hasta (String isim, String şikeyet )
    {
        this.isim=isim;
        this.şikeyet=şikeyet;

        if (şikeyet.equals("apandist"))
        {
            this.öncelik=3;
        } else if (şikeyet.equals("yanık")) {
            this.öncelik=2;
        }
        else

            this.öncelik=1;
    }

    @Override
    public String toString() {
        String bilgiler="Hasta adı: "+isim
                +"\nşikayet: "+şikeyet
                +"\nöncelik: "+öncelik;
        return bilgiler;

    }

    @Override
    public int compareTo(Hasta hasta) {
        if (this.öncelik>hasta.öncelik)
        {
            return -1;
        }
        else if (this.öncelik<hasta.öncelik)
        {
            return 1;
        }
        else
            return 0;
    }
}
