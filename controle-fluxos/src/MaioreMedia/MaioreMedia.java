package MaioreMedia;

import java.util.Scanner;

public class MaioreMedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior;
        int soma;
        double media;

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();
        maior = numero;
        soma = numero;

        for (int x = 1; x<5 ; x++){
            System.out.print("Digite outro numero: ");
            numero = scanner.nextInt();
            soma = soma + numero;

            if (numero > maior) maior = numero;
        }
        
        media = soma/5;

        System.out.println("Maior Numero: " + maior);
        System.out.println("Soma dos Numeros: " + soma);
        System.out.println("Media: " + media);

        scanner.close();
    }
}
