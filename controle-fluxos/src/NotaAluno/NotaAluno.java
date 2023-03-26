package NotaAluno;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nota = -1;

        while ((nota<0) | (nota>10)){
            System.out.print("Digite a nota do aluno: ");
            nota = scanner.nextInt();

            if ((nota<0) | (nota>10)){
                System.out.println("Nota Inválida!!");
            } else {break;}

        }
        scanner.close();
            
    }
}
