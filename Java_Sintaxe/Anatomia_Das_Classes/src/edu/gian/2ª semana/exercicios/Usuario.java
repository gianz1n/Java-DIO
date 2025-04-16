public class Usuario {
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Aumentando o volume " + smartTv.volume);

        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        System.out.println("Diminuindo o volume " + smartTv.volume);


        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        System.out.println("Aumentando o canal " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Diminuindo o canal " + smartTv.canal);

        smartTv.mudarCanal(16);
        System.out.println("Canal escolhido " + smartTv.canal);
    }
}
