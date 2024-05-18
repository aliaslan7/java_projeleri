import java.util.ArrayList;
import java.util.Iterator;

public class Kumanda {

    private ArrayList<String> Kanallar=new ArrayList<String>();

    public class KumandaIterator implements Iterator<String>{


        private  int index=0;
        @Override
        public boolean hasNext() {

            if (index>=Kanallar.size())
                return false;
            else
            {
                return true;
            }
        }

        @Override
        public String next() {
            String deger =Kanallar.get(index);
            index++;
            return deger;

        }
    }
    public void KanalEkle(String kanal )
    {
        Kanallar.add(kanal);
    }
    public void  Kanalsil(String kanal )
    {
        if (Kanallar.contains(kanal))
        {
            System.out.println("kanal silme başarılı ...");
            Kanallar.remove(kanal);
        }
        else
            System.out.println("boyle bir kanal ismi yoktur.");
    }
    public  int Kanlsayısı(){
        return Kanallar.size();
    }

    public Iterator<String> iterator(){
        return new KumandaIterator();
    }
}
