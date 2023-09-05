
package arreglosejercicio4;


public class ArreglosEjercicio4 {

    
    public static void main(String[] args) {
       
        int matriz[][]=new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                matriz[i][j]=(int) (Math.random()*10);
                System.out.println("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
        System.out.println("Traspuesta");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
    
}
