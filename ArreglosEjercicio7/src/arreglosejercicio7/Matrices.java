package arreglosejercicio7;

public class Matrices {

    public static void comprobarMatriz(int M[][], int P[][]) {
        for (int i = 0; i <= M.length - P.length; i++) {
            for (int j = 0; j <= M.length - P.length; j++) {
                boolean encontrada = false;
                if (M[i][j] == P[0][0]) {

                    for (int k = 0; k < P.length; k++) {
                        for (int l = 0; l < P.length; l++) {
                            if (M[i + k][j + l] == P[k][l]) {
                                encontrada = true;
                            } else {
                                encontrada = false;
                            }

                        }
                    }
                }
                if (encontrada == true) {
                    for (int[] matriz : M) {
                        for (int matriz1 : matriz) {
                            System.out.print(matriz1 + " ");
                        }System.out.println(" ");
                    }
                    System.out.println("La matriz P comienza en la fila: " + i + " y la columna " + j + " ");
                    
                }
            }
        }
        System.out.println("La matriz P esta contenida en la matriz M");

    }

}
