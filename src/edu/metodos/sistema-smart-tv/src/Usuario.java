public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Aual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - Tv ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Novo status - canal atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Novo status - volume atual: " + smartTv.volume);

        smartTv.mudarCanalDireto(12);
        System.out.println("Novo status - canal atual: " + smartTv.canal);


    }
}
