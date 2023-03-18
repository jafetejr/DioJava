package Meses;
import java.util.Scanner;

public class Meses {
    public static void main(String[] args) throws Exception {
    

        consultarMes();
    }

    public static void consultarMes(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do Mês que você deseja consultar: ");
        int mesEscolhido = scanner.nextInt();
        scanner.close();

        if (mesEscolhido == 1){
            System.out.println("Você escolheu Janeiro.");
        } else if (mesEscolhido == 2){
            System.out.println("Você escolheu Fevereiro.");
        } else if (mesEscolhido == 3){
            System.out.println("Você escolheu Março.");
        } else if (mesEscolhido == 4){
            System.out.println("Você escolheu Abril.");
        } else if (mesEscolhido == 5){
            System.out.println("Você escolheu Maio.");
        } else if (mesEscolhido == 6){
            System.out.println("Você escolheu Junho.");
        } else if (mesEscolhido == 7){
            System.out.println("Você escolheu Julho.");
        } else if (mesEscolhido == 8){
            System.out.println("Você escolheu Agosto.");
        } else if (mesEscolhido == 9){
            System.out.println("Você escolheu Setembro.");
        } else if (mesEscolhido == 10){
            System.out.println("Você escolheu Outubro.");
        } else if (mesEscolhido == 11){
            System.out.println("Você escolheu Novembro.");
        } else if (mesEscolhido == 12){
            System.out.println("Você escolheu Dezembro.");
        } else {
            System.out.println("Mês Inválido!!!");
        }




    }
}
