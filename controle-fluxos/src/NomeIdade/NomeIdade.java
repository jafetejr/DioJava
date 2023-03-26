package NomeIdade;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        int idade;

        while (nome.equalsIgnoreCase("0") == false){
            
            System.out.print("Digite um nome: ");
            nome = scanner.next();

            if (nome.equalsIgnoreCase("0")) break;

            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();           
        }
        scanner.close();
    }

}
