public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume Atual: " + smartTV.volume);
        
        System.out.println("Canal Atual: " + smartTV.canal);
        
        smartTV.mudarCanal(13);
        
        System.out.println("Canal Atual: " + smartTV.canal);

        System.out.println("TV Liagada ? " + smartTV.ligada);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar ();
        System.out.println(" Novo Status -> TV Liagada ? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println(" Novo Status -> TV Liagada ? " + smartTV.ligada);


    }
}
