
package arreglosejercicio2;


public class ArreglosEjercicio2 {

   
    public static void main(String[] args) {
       
        int[] arreglo=new int[100];
        for (int i = arreglo.length-1; i > 0; i--) {
            arreglo[i]=i;
            System.out.println(arreglo[i]);
        }
        
    }
    
}
