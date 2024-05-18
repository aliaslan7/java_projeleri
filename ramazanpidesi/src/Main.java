import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // fırından 7 tane pide çıkacak ama sırada 10 kişi olacak
        Random random=new Random();
        System.out.println("  ramazan pidesi uygulaması \n");


        Queue<String> pide_kuyrugu=new LinkedList<String>();

        pide_kuyrugu.offer("ali");
        pide_kuyrugu.offer("mehmet");
        pide_kuyrugu.offer("abdullah");
        pide_kuyrugu.offer("ahmet");
        pide_kuyrugu.offer("aslan");
        pide_kuyrugu.offer("bunyamim");
        pide_kuyrugu.offer("ismett");
        pide_kuyrugu.offer("paşa");
        pide_kuyrugu.offer("recep");
        pide_kuyrugu.offer("can");
        pide_kuyrugu.offer("serhat");
        pide_kuyrugu.offer("huseyin");

        int pide_sayisi= 1+random.nextInt(10);

        System.out.println("pide çıkarılıyor....");

    Thread.sleep(3000);
        System.out.println("çıkarılan pide sayisi "+(pide_sayisi-1));

        Thread.sleep(3000);
        int i=1;

        while (!pide_kuyrugu.isEmpty()){
            if (i==pide_sayisi)
            {
                System.out.println("pide bitti ");
                break;
            }
            i++;
        Thread.sleep(1000);
            System.out.println(" pide alanlar: "+pide_kuyrugu.poll());

        }



    }
}