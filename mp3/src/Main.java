import java.io.*;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Integer> icerik=new ArrayList<Integer>();
    public static  void dosyaoku()
    {
        try {
            FileInputStream in=new FileInputStream("mp3.mp3");

            int oku;
            while ((oku=in.read()) !=-1)
            {
                icerik.add(oku);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void kopyalam(String dosyaismi)
    {
        try {
            FileOutputStream out =new FileOutputStream(dosyaismi);

            for (int deger: icerik)
            {
                out.write(deger);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {

        dosyaoku();

        kopyalam("mp4");



    }
}