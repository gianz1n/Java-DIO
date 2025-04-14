import java.awt.SystemTray;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número da conta: ");    
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe o valor a depositar: ");
        Float saldo = scanner.nextFloat(); 


        System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + " , conta " + numeroConta + " e seu saldo de R$" + saldo + " já esta disponível para saque. ");
    }

    
}
