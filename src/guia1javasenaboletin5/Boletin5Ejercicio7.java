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
public class Boletin5Ejercicio7 {
    
    public static void solucion(){
    
        System.out.println("7.utilizando dos tablas de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda.");
        
        int filas = 5, columnas = 9;
        
        System.out.printf("A continuacion escriba una tabla de %d X %d", filas, columnas);
        int [][] matriz = Matrices.obtenerMatriz(filas, columnas);
        
        System.out.println("La matriz original es :");
        Matrices.mostrarMatriz(matriz);
        
        System.out.println("La matriz transpuesta es :");
        Matrices.mostrarMatriz(transponerMatriz(matriz));
        
    }
    
    private static int[][] transponerMatriz(int[][] matriz){
        
        int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
        
        for(int i=0 ; i<matriz.length ; i++){
            for(int j=0 ; j<matriz[0].length ; j++){
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        
        return matrizTranspuesta;       
    }
    
}
