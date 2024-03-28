import java.util.Scanner;

public class login {
    public boolean login(hesap hesap1 )
    {
        Scanner scanner =new Scanner(System.in);
        String kullanıcıadı;
        String parola;

        System.out.print("kullanıcı adını= ");
        kullanıcıadı= scanner.nextLine();
        System.out.print("parola=");
        parola= scanner.nextLine();

        if (hesap1.getKullanıcıadı().equals(kullanıcıadı) && hesap1.getParola().equals(parola))
        {
            return true;
        }
        else
            return false;
    }

}
