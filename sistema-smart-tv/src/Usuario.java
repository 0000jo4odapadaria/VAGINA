public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println(" Canal : " + smartTv.canal);
        

        smartTv.mudarCanal(13);

        System.out.println(" Canal : " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        System.out.println(" TV Ligada ? " + smartTv.ligada);
        System.out.println(" Volume : " + smartTv.volume);
        System.out.println(" Canal : " + smartTv.canal);
        smartTv.ligar();
        System.out.println(" Novo Status -> TV Ligada ? " + smartTv.ligada);       

        
        smartTv.desligar();
        System.out.println(" Novo Status -> TV Ligada ? " + smartTv.ligada);       


    }
}
