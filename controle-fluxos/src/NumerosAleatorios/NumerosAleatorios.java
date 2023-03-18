package NumerosAleatorios;

import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) throws Exception{
        Random geradorNumeros = new Random();
        int[] numeroAleatorio = new int[20];

        for (int x=0; x < numeroAleatorio.length; x++){
            numeroAleatorio[x] = geradorNumeros.nextInt(100);

            System.out.println(x + "º Numero Gerado: " + numeroAleatorio[x]);
            numeroAleatorio[x]++;
            System.out.println("Numero Seguinte: " + numeroAleatorio[x]);
            System.out.println(" ");


        }
    }
    
}
