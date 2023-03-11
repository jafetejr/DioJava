package edu.jafete.java.SmartTv;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv SmartTv = new SmartTv();

        System.out.println("Tv Ligada:  " + SmartTv.ligada);
        System.out.println("Canal Atual:  " + SmartTv.canal);
        System.out.println("Volume atual:  " + SmartTv.volume);

        SmartTv.ligar();
        System.out.println("Novo Status - Tv Ligada:  " + SmartTv.ligada);

        SmartTv.desligar();
        System.out.println("Novo Status - Tv Ligada:  " + SmartTv.ligada);

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        System.out.println("Volume atual: " + SmartTv.volume);     
        
        SmartTv.aumentarVolume();
        System.out.println("Volume atual: " + SmartTv.volume); 

        SmartTv.mudarCanal(SmartTv.canal);
        System.out.println("Canal Atual: " + SmartTv.canal);

    }
}
