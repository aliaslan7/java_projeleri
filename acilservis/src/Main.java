import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Queue<Hasta> acilservis=new PriorityQueue<Hasta>();


        acilservis.offer(new Hasta("ali ","yanık"));
        acilservis.offer(new Hasta("can ","apandist"));
        acilservis.offer(new Hasta("mehmet ","baş ağrisi "));
        acilservis.offer(new Hasta("hasan ","yanık"));
        acilservis.offer(new Hasta("huseyin ","baş ağrisi "));
        acilservis.offer(new Hasta("recep ","apandist"));


        int i=1;
        while (acilservis.isEmpty() !=true){

            System.out.println("*********************************");
            System.out.println(i+"."+"sıradaki: ");
            System.out.println(acilservis.poll());
            System.out.println("*********************************");
            Thread.sleep(3000);
            i++;

        }

    }
}