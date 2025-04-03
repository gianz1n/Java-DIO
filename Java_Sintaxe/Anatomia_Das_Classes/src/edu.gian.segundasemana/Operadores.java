public class Operadores {
    public static void main(String[] args) {


        //Operadores aritméticos
        String nome = "Gian"; // = atribuição
        int soma = 1 + 1; // + aritmético
        int subtracao = 1 - 1; // + aritmético
        int multiplicacao = 1 * 1; // + aritmético
        double divisao = 1 / 1; // + aritmético
        int restoDiv = 1 % 1; // + aritmético


        //Concatenação
        String nomeCompleto = "Gian" + " Emanuel";
            System.out.print("O nome completo é: "); 
            System.out.println(nomeCompleto); 

        //Operadores unários
        // int numero = 5; 
        // numero = numero +1;

        // System.out.println(numero);

        int numero2 = 5;
        
        System.out.print("O número é: "); 
        System.out.println(++ numero2);


        //Negando uma expressão lógica
        boolean var = true;
            System.out.print("A expressão negada é: "); 
            System.out.println(! var);


        //Operador ternário
        int a,b;
        a = 5;
        b = 5;

        // String resultado = "";

        // if (a==b)
        // resultado = "Verdadeiro";
        // else 
        // resultado = "Falso";

        // System.out.println(resultado);

        String resultado = a==b ? "Verdadeiro" : "Falso";

        System.out.print("O valor é: "); 
        System.out.println(resultado);


        //Operador relacional
        int c,d;
        c = 1;
        d = 2;

        boolean condicao = c == d;
            System.out.print("C é igual a D?: "); 
            System.out.println(condicao);

        boolean condicao2 = d > c;
            System.out.print("D é maior que C?: "); 
            System.out.println(condicao2);

        boolean condicao3 = d <= c;
            System.out.print("D é menor ou igual a C?: "); 
            System.out.println(condicao);

        boolean condicao4 = c != d;
            System.out.print("C é diferente de D?: "); 
            System.out.println(condicao4);


        //Operadores lógicos
        boolean cond1 = true;
        boolean cond2 = false;

        if (cond1 && cond2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if (cond1 || cond2) {
            System.out.println("Uma das condições é verdadeira");
        }


    }
}
