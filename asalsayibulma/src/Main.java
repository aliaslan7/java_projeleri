//asal sayı 1 ve kendisinden başka sayıya bölünemeyen sayılara asal sayı denir.

public class Main {

    public static boolean asalmı(int sayı)
    {
        for (int i=2;i<sayı;i++)
        {
            if (sayı%i==0)
                return false;
        }return true;
    }





    public static void main(String[] args) {

        for (int i=2;i<1000;i++)
            if (asalmı(i))
                System.out.println(i);






    }
}