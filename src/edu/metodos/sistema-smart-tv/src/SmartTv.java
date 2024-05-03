public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("A TV foi ligada!");
    }

    public void desligar(){
        System.out.println("A TV vai ser desligada!");
        ligada = false;

    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentou o canal!");
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminui o canal!");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentou o volume!");
    }
    
    public void diminuirVolume(){
        volume++;
        System.out.println("Diminui o volume!");
    }

    public void mudarCanalDireto(int canalNovo){
        canal = canalNovo;
    }
}