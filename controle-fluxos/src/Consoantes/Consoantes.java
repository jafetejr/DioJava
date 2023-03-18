package Consoantes;

import java.util.Scanner;

public class Consoantes {

    
    
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String[] letra = new String[6];
        String[] consoantes = new String[6];
        int contadorConsoantes = 0;

        for (int x=0; x<5; x++){
            System.out.print("Digite uma letra: ");
            letra[x] = scanner.next();
        }
        scanner.close();
        for (int x=0; x<5; x++){
            if (!(letra[x].equalsIgnoreCase("a")) |
                (letra[x].equalsIgnoreCase( "e")) |
                (letra[x].equalsIgnoreCase( "i")) |
                (letra[x].equalsIgnoreCase( "o")) |
                (letra[x].equalsIgnoreCase( "u"))){
                
                
                consoantes[contadorConsoantes] = letra[x];
                contadorConsoantes++;
            }
        }

        System.out.println("Foram digitadas " + contadorConsoantes + " consoantes.");
        System.out.print("As consoantes digitadas foram: ");
        for (int x=0; x<contadorConsoantes; x++){
            System.out.print(consoantes[x]);

        }

    }
}
