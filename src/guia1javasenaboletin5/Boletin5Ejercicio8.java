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
public class Boletin5Ejercicio8 {
    
    
    public static void solucion(){
    
        System.out.println("8.Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo los de los bordes que \n" +
                            "deben ser 1. Mostrarla.\n");
        
        
        int filas = 8, columnas = 6;
        int[][] matriz = new int[filas][columnas];
        
        //La matriz gracias a java se ha llenado con 0 tan solo con crearla
        //Entonces solo tenemos que llenar los bordes
        for(int i=0 ; i<filas; i++){
            if( i==0 || i == filas-1){
                for(int j=0; j<columnas; j++){
                    matriz[i][j] = 1;
                }
            }else{
                matriz[i][0] = 1;
                matriz[i][columnas-1] = 1;
            }
        }
        
        System.out.println("La matriz marcando sus bordes es con 1 y lo demas con 0 es :");
        Matrices.mostrarMatriz(matriz);
        
    }
    
}
