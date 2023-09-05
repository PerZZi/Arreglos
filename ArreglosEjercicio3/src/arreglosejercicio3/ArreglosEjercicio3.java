package arreglosejercicio3;

import java.util.Scanner;

public class ArreglosEjercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();
        int[] array = new int[numero];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]);
        }
        int numerorepe=leer.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i]==numerorepe){
                System.out.println(i);
            
            }
        }

    }

}
