package edu.jafete.java.SmartTv;
import java.util.Scanner;


public class SmartTv {
    boolean ligada = false;
    int canal = 11;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }     
    
    public void desligar(){
        ligada = false;
    }
    
    public void aumentarVolume(){
        volume ++;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para " + volume); 
    }

    public void aumentarCanal(){
        canal ++;
        System.out.println("Aumentando o canal para " + canal);
    }

    public void diminuirCanal(){
        canal --;
        System.out.println("Diminuindo o canal para " + canal);
    }

    public void mudarCanal(int canalEscolhido){
        Scanner scanner = new  Scanner(System.in);

        System.out.println("QUAL CANAL VOCE DESEJA ASSISTIR?");
        canalEscolhido = scanner.nextInt();
        scanner.close();
        
        canal = canalEscolhido;        
        System.out.println("Canal Escolhido: " + canalEscolhido);

    }
}
