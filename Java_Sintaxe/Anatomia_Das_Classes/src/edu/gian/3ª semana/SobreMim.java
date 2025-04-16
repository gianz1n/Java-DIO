import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Informe sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.println("Seu nome é " + nome + " " + sobrenome+ ".");
        System.out.println("Você tem " + idade + " anos e " + altura + "m de altura");


        // String nome = args [0];
        // String sobrenome = args [1];
        // int idade = Integer.valueOf(args [2]);
        // double altura = Double.valueOf(args[3]);

        // System.out.println("Meu nome é "+ nome + " " + sobrenome);
        // System.out.println("Tenho " + idade + " anos");
        // System.out.println("Minha altura é "+ altura + "cm");

    }
}