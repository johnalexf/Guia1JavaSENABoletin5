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
public class Matrices {
    
    //Funcion para mostrar una matriz de cualquier tamaño;
    public static void mostrarMatriz(int[][] matriz) {
        
        StringBuilder armarStringMatriz = new StringBuilder();
        String separador = " | ";
        
        for (int[] vector : matriz) {
            armarStringMatriz.append(separador);
            for (int valorVector : vector) {
                armarStringMatriz.append(valorVector).append(separador);
            }
            armarStringMatriz.append("\n");
        }
        
        System.out.println(armarStringMatriz);
        
    }
    
    //Funcion para capturar los datos de una matriz de cualquier tamaño
    public static int[][] obtenerMatriz(int filas, int columnas){
    
        int[][] matriz = new int[filas][columnas];
        for(int i=0 ; i<filas ; i++){
            System.out.printf("%nFila%d  :  %n",i+1);
            for(int j=0 ; j<columnas ; j++){
                System.out.printf("   Columna%d  :  ",j+1);
                matriz[i][j] = Entrada.entero();
            }
        }
    
        return matriz;
    }
    
}
