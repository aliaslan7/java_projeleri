import java.util.Scanner;

public class Main {
    private static Kart kartlar[][] = new Kart[4][4];


    public static void main(String[] args) {


        kartlar[0][0] = new Kart('H');
        kartlar[0][1] = new Kart('G');
        kartlar[0][2] = new Kart('C');
        kartlar[0][3] = new Kart('C');
        kartlar[1][0] = new Kart('E');
        kartlar[1][1] = new Kart('F');
        kartlar[1][2] = new Kart('G');
        kartlar[1][3] = new Kart('E');
        kartlar[2][0] = new Kart('A');
        kartlar[2][1] = new Kart('B');
        kartlar[2][2] = new Kart('E');
        kartlar[2][3] = new Kart('F');
        kartlar[3][0] = new Kart('D');
        kartlar[3][1] = new Kart('H');
        kartlar[3][2] = new Kart('A');
        kartlar[3][3] = new Kart('D');

        while (oyunbittimi()==false)
        {
            oyuntahtası();
            tahminet();
        }

    }
    public static void tahminet()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("birinci tahmin (i ve j değerlerini bir boşluk ile giriniz: ): ");

        int i1= scanner.nextInt();
        int j1= scanner.nextInt();
        kartlar[i1][j1].setTahmin(true);
        oyuntahtası();

        System.out.print("ikinci tahimini gir (i ve j değerlerini bir boşluk ile girniz: ): ");

        int i2= scanner.nextInt();
        int j2=scanner.nextInt();

        if(kartlar[i1][j1].getDeger()==kartlar[i2][j2].getDeger())
        {

            kartlar[i1][j1].setTahmin(true);
            kartlar[i2][j2].setTahmin(true);
            System.out.println("doğru tahmin.");

        }
        else
            kartlar[i1][j1].setTahmin(false);
         //System.out.println("yanlış tahmin");
    }
    public static  boolean oyunbittimi()
    {
        for (int i=0; i<4 ; i++)
        {
            for (int j=0; j<4; j++)
            {
                if(kartlar[i][j].isTahmin()==false)
                {
                    return false;
                }
            }
        }
        return true;
    }


    public static void oyuntahtası(){
        System.out.println("---------------");
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin()) {
                    System.out.print("|" + kartlar[i][j].getDeger() + "|");
                } else
                    System.out.print("| |");
            }
            System.out.println(" ");

        }
        System.out.println("---------------");
    }
}