import java.util.Scanner;

public class main {
    public static void main(String[]args) {

        Scanner scanner=new Scanner(System.in);

        int a;
        int b;
        System.out.println("birinici kenarı gir: ");
        a=scanner.nextInt();
        System.out.println("ikinci kenarı gir: ");
        b=scanner.nextInt();
        double h = Math.sqrt(a*a+b*b);
        System.out.println("hipotenus: "+h );


    }
}
