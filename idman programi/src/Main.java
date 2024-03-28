import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("idman programına Hoş Geldiniz..");

        String idmanlar= ("geçerli hareketler \n" +
                "1-buurpee hareketi \n" +
                "2-pushup hareketi \n" +
                "3situp hareketi \n" +
                "4- squat hareketi\n ");
        System.out.println("*************************");
        System.out.println(idmanlar);
        System.out.println("*************************");


        System.out.println("idaman oluşturun.. ");

        System.out.println("buurpee sayısı :");
        int buurpe= scanner.nextInt();
        System.out.println("squat sayısı :");
        int squat= scanner.nextInt();
        System.out.println("pushup sayısı :");
        int pushup= scanner.nextInt();
        System.out.println("situp sayısı :");
        int situp= scanner.nextInt();
        scanner.nextLine();



        idman idman1=new idman(buurpe,situp,squat,pushup);

        while (idman1.idmanbittimi()==false)
        {
            System.out.print("hareket turunu seçin:");
            String tur= scanner.nextLine();
            System.out.print("hareket sayisi :");
            int sayi= scanner.nextInt();
            scanner.nextLine();

            idman1.hareketyap(tur,sayi);
        }


        System.out.println("idmanınızı başarıyla bitirdiniz...");

    }
}