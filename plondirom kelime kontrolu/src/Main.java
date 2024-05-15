import java.util.Scanner;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //POLİNDROM KELİME KONTROLU


        Scanner scanner =new Scanner(System.in);
        System.out.print("cümle giriniz: ");

        String cumle= scanner.nextLine();

        Stack<Character> stack=new Stack<Character>();

        for (int i=0; i<cumle.length()/2;i++)
        {
            stack.push(cumle.charAt(i));

        }
if (ispolindrom(cumle,stack)){
    System.out.println("cümle polindrom cümledir..");

}
else
    System.out.println("cümle polindrom cümle değildir.");

    }
    public static boolean ispolindrom(String cumle , Stack< Character> stack)
    {

        for (int i=(cumle.length()/2)+1; i<cumle.length();  i++)
        {
            if(cumle.charAt(i) != stack.pop())
                return false;
        }
        return true;
    }

}
