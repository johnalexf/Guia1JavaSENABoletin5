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
public class Boletin5Ejercicio6 {
    
    public static void solucion(){
    
        System.out.println("6.Crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila y de cada columna.\n");
        
        int tamaño = 10;
        
        System.out.printf("A continuacion digita los datos de una tabla de %d X %d %n", tamaño, tamaño);
        int[][] tabla = Matrices.obtenerMatriz(tamaño, tamaño);
        
        
        int[] sumaFil = new int[tamaño];
        int[] sumaCol = new int[tamaño];
        
        for(int i=0 ; i<tamaño; i++){
            for(int j=0 ; j<tamaño; j++){
                sumaFil[i] += tabla[i][j];
                sumaCol[j] += tabla[i][j];
            }
        }
        
        System.out.println("La suma de cada fila en orden es :");
        mostrarVector(sumaFil);
        
        System.out.println("La suma de cada col en orden es :");
        mostrarVector(sumaCol);
        
        
    
    }
    
    private static void mostrarVector( int[] vector){
        
        StringBuilder stringVector = new StringBuilder();
        String separador = " | ";
        
        stringVector.append(separador);
        for( int datoVector : vector){
            stringVector.append(datoVector).append(separador);
        }
        System.out.println(stringVector);
        
    }
    
}
