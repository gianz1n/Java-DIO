public class Sintaxe{
    public static void main(String[] args) {

        //Hello, world!
        String msg = "Hello, world!";
        System.out.println (msg);

        //Concatenação
        String primeiroNome = "Gian";
        String segundoNome = "Emanuel";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println (nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
 






