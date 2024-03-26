import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("vize 1:");
        int vize1= scanner.nextInt();
        System.out.print("vize 2:");
        int vize2= scanner.nextInt();
        System.out.print("final:");
        int finalnot= scanner.nextInt();
        double toplamnot= (vize2*3/10.0)+(vize1*3/10.0)+(finalnot*4/10.0);
        System.out.println("toplamnot:"+toplamnot);

        System.out.print("ortalamınızı giriniz:");
        double ort= scanner.nextDouble();

        if (toplamnot>=90){
            System.out.println("AA aldınız.");

        }
        else if (toplamnot > 80 && toplamnot <= 90) {

            System.out.println("AB aldınız.");

        }
        else if (toplamnot > 70 && toplamnot <= 80) {

            System.out.println("BB aldınız.");

        } else if (toplamnot > 60 && toplamnot <= 70) {

            System.out.println("BC aldınız.");

        }
        else if (toplamnot > 50 && toplamnot <= 60) {

            System.out.println("CC aldınız.");

        }
        else if (toplamnot > 40 && toplamnot <= 50) {

            System.out.println("DD aldınız.");
            if (ort<2.50){
                System.out.println("kaldınız bu dersi tekrar alabilirsiniz");
            }


        }
        else {
            System.out.println("FF aldınız ve kaldınız");
        }


    }
}