/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1javasenaboletin5;

/**
 *
 * @author JOHN FORERO
 */
public class Boletin5Ejercicio5 {
    
    public static void solucion(){
    
        System.out.println("5.Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean \n" +
                            "1 y el resto 0.\n");
        
        int tamaño = 7;
        
        int[][] matriz = new int[tamaño][tamaño];
        
        //Relleno en dado caso que deseemos modificar el valor de la diagonal y el resto
        /*for( int i=0 ; i<tamaño ; i++){
            for( int j=0 ; j<tamaño ; j++){
                matriz[i][j] = ( i==j ? 1 : 0 );
            }
        }*/
        
        //Relleno de la diagonal, por defecto toda al crearse viene con 0.
        for(int i=0 ; i<tamaño ; i++){
            matriz[i][i] = 1;
        }
        
        System.out.println("La matriz es :");
        Matrices.mostrarMatriz(matriz);
    
    }
    
}
