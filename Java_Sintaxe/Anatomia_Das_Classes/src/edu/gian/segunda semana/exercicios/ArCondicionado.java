
//Declarando as variaveis
public class ArCondicionado {
    boolean ligado = false;
    int temperatura = 16;

//Criando as funções
    public void Ligar(){
        ligado = true;
    }

    public void Desligar(){
        ligado = false;
    }

    public void aumentarTemperatura(){
        temperatura ++;
    }

    public void abaixarTemperatura(){
        temperatura --;
    }
}
