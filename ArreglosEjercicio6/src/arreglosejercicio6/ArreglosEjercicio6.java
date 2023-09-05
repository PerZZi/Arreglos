package arreglosejercicio6;

import java.util.Scanner;

public class ArreglosEjercicio6 {

    public static void main(String[] args) {

        int mat[][] = new int[3][3];
        Scanner leer = new Scanner(System.in);
        System.out.println("Cargar valores");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.println("["+i+"]"+"["+j+"]");
                mat[i][j] = leer.nextInt();
            }
        }

        int arreglo[] = new int[8];
        int conta = 0;

        for (int i = 0; i < arreglo.length; i++) {
            conta+=i;
            for (int j = 0; j < arreglo.length; j++) {
                arreglo[conta] += mat[i][j];
                arreglo[conta+2]+=mat[j][i];
                
            }
        }
    }
}
