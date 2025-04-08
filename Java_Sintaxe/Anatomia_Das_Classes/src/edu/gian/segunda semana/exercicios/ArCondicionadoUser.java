public class ArCondicionadoUser {
   
    //Puxando o método ArCondicionado e criando uma variável
    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado();

    //Chamando as funções  do método
        arCondicionado.Ligar();
        System.out.println("Ligando.... O ar condicionado está ligado! " + arCondicionado.ligado);

        arCondicionado.aumentarTemperatura();
        System.out.println("A temperatura atual é:   " + arCondicionado.temperatura);
        arCondicionado.aumentarTemperatura();
        System.out.println("A temperatura atual é:   " + arCondicionado.temperatura);
        arCondicionado.aumentarTemperatura();
        System.out.println("A temperatura atual é:   " + arCondicionado.temperatura);

        arCondicionado.abaixarTemperatura();
        System.out.println("A temperatura atual é:   " + arCondicionado.temperatura);
        arCondicionado.abaixarTemperatura();
        System.out.println("A temperatura atual é:   " + arCondicionado.temperatura);
    }
}
