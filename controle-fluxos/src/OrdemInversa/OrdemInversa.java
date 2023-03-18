package OrdemInversa;

import java.util.Scanner;


public class OrdemInversa {
    

    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = {0, 0, 0, 0, 0};
        int quantidadeNumeros = 5;

        System.out.println("Escolha 5 numeros aleatórios.");        
        System.out.println("Digite o primeiro número: ");
        vetor[0] = scanner.nextInt();
        
        for (int x = 1; x < quantidadeNumeros; x++){
            System.out.println("Digite outro número qualquer: ");
            vetor[x] = scanner.nextInt();
        } 

        scanner.close();

        System.out.print("Sequencia Inversa dos Numeros Digitados: ");
        for (int x = 4; x >= 0; x--){
            System.out.print(vetor[x] + ", ");
        }
        
 
    }

    
}
