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
public class Boletin5Ejercicio4 {
    
    public static void solucion(){
    
        System.out.println("4.Crear y cargar una tabla de tamaño 3x3, trasponerla y mostrarla.\n");
        
        // tamaño de la matriz cuadrada
        int tamaño = 3;
        
        System.out.printf("A continuacion escriba los datos de una tabla de %d X %d %n", tamaño, tamaño);
        int[][] matriz = Matrices.obtenerMatriz(tamaño, tamaño);
        
        System.out.println("\n La matriz es :  ");
        Matrices.mostrarMatriz(matriz);
        
        
        System.out.println("La matriz transpuesta es :");
        transponerMatrizCuadrada(matriz);
        Matrices.mostrarMatriz(matriz);
        
    
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
    
    private static void transponerMatrizCuadrada(int[][] matriz){
        
        int varAuxiliar;
        
        for(int i=0 ; i<matriz.length ; i++){
            for(int j=i+1 ; j<matriz[0].length ; j++){
                varAuxiliar = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = varAuxiliar;
                
            }
        }
    
    }
    
}
