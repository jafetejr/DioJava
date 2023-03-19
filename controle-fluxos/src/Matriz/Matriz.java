package Matriz;

import java.util.Random;

public class Matriz {

    public static void main(String[] args) throws Exception{
        Random geradorNumero = new Random();
        int[][] M = new int[4][4];

        for (int x=0; x<M.length; x++){
            for (int y=0; y<M[x].length; y++){
                M[x][y] = geradorNumero.nextInt(9);           
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
    
}
