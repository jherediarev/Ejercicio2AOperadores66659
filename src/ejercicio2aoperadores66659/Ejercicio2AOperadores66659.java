/*
 UNIVERSIDAD AUTÓNOMA DE CAMPECHE
 Facultad de Ingenieria
 Ingenier{ia en Sistemas Computacionales
 */
package ejercicio2aoperadores66659;

/**
 *
 * @author Johnny Reveles
 */
public class Ejercicio2AOperadores66659 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Ejercicio de matrices
        
       int [][] matrices = new int [3][3];
        
        
        matrices[0][0] = 89;
        matrices[0][1] = 33;
        matrices[0][2] = 114;
                 
        matrices[1][0] = 22;
        matrices[1][1] = 26;
        matrices[1][2] = 25;
                 
        matrices[2][0] = 14;
        matrices[2][1] = 57; 
        matrices[2][2] = 81;
                
        
        int determinante = (matrices[0][0] * matrices[1][1] * matrices[2][2])-(matrices[0][2] * matrices[1][1] * matrices[2][0]);
        System.out.println("El determinante es = " + determinante);        
    
        
        
}

}