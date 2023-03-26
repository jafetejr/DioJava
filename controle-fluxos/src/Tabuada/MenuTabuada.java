package Tabuada;

import java.util.Scanner;

public class MenuTabuada {
    public static void main(String[] args){
        Multiplicacao();
    }


    public static void Multiplicacao(){
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Escolha um número de 1  a 10: ");
        numero = scanner.nextInt();
        while (numero < 1 |numero > 10){
            System.out.println("Número Inválido!");
            System.out.print("Escolha um número de 1  a 10: ");
            numero = scanner.nextInt();
        }
        
        System.out.println("Tabuada Multiplicação de " + numero);
        
        for (int x = 1; x <=10; x++){
            System.out.println(numero +" x "+ x + " = " + (numero*x));
        }
        
        scanner.close();
    }
}
