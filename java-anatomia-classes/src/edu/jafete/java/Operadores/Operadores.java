package edu.jafete.java.Operadores;

public class Operadores {
    
    public static void main (String[] args) {

        String nomeCompleto = "jafete " + "ribeiro";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);
        
        concatenacao = 2 + 2 + "1" + 2 + 2;
        System.out.println(concatenacao);

        String nomeAula = "AULA 2: INCREMENTO";
        System.out.println(nomeAula);

        int numero = 1;
        numero ++;
        System.out.println(numero ++);
        
        System.out.println(numero);

        nomeAula = "AULA 5: CONDICIONAL";
        System.out.println(nomeAula);

        int a,b;
        a = 51;
        b = 7;

        String resultado = a==b ?"verdadeiro" : "falso";
        System.out.println(resultado);

        nomeAula = "AULA 5: RELACIONAL";
        System.out.println(nomeAula);

        Boolean simNao = a == b;
        System.out.println(simNao);

        simNao = a != b;
        System.out.println(simNao);

        simNao = a >= b;
        System.out.println(simNao);

        if(a < b){
            System.out.println("Condição aceita");
        } else {System.out.println("Condição negada");}
            
        



    }

    
    
}
