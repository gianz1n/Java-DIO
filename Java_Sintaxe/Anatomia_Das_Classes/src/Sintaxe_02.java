public class Sintaxe_02 {
    public static void main(String[] args) {
        String primeiroNome = "Gian";
        String segundoNome = "Emanuel";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print (nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
} 
