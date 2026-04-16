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
public class Boletin5Ejercicio3 {
    
    public static void solucion(){
    
        System.out.println("3.Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma. \n");
    
        int tamañoMatriz = 3;
       
        System.out.println("Escriba la primera matriz ");
        int[][] matriz1 = obtenerMatrizCuadrada(tamañoMatriz);
        
        System.out.println("\nEscriba la segunda matriz ");
        int[][] matriz2 = obtenerMatrizCuadrada(tamañoMatriz);
        
        System.out.println("\n");
        System.out.println("La primera matriz es : ");
        mostrarMatrizCuadrada(matriz1);
        
        System.out.println("La segunda matriz es : ");
        mostrarMatrizCuadrada(matriz2);
        
        System.out.println("La suma de las matrices es igual a : ");
        mostrarMatrizCuadrada(sumarMatrices(matriz1, matriz2));
        
        
    }
    
    
    //Funcion para mostrar una matriz cuadrada;
    private static void mostrarMatrizCuadrada(int[][] matriz) {
        
        StringBuilder armarStringMatriz = new StringBuilder();
        String separador = " | ";
        
        for (int[] vector : matriz) {
            armarStringMatriz.append(separador);
            for (int valorMatriz : vector) {
                armarStringMatriz.append(valorMatriz).append(separador);
            }
            armarStringMatriz.append("\n");
        }
        
        System.out.println(armarStringMatriz);
        
    }
    
    
    //Funcion para capturar los datos de una matriz cuadrada
    private static int[][] obtenerMatrizCuadrada(int tamaño){
    
        int[][] matriz = new int[tamaño][tamaño];
        for(int i=0 ; i<tamaño ; i++){
            System.out.printf("%nFila%d  :  %n",i+1);
            for(int j=0 ; j<tamaño ; j++){
                System.out.printf("   Dato%d  :  ",j+1);
                matriz[i][j] = Entrada.entero();
            }
        }
    
        return matriz;
    }
    
    
    //Funcion para sumar dos matrices del mismo tamaño
    private static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2){
    
        int[][] matrizSuma = new int[matriz1.length][matriz1.length];
        
        if(matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length ){
            for(int i=0 ; i<matriz1.length ; i++){
                for(int j=0 ; j<matriz1[0].length ; j++){
                    matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        }else{
            System.err.println("Error en la funcion sumarMatrices");
            System.err.println("las matrices no son iguales");
        }
    
        return matrizSuma;
        
    }
    
    
}
