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
public class Boletin5Ejericio1 {
    
    public static void Solucion(){
    
        System.out.println("1. Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m]\n" +
                            "debe contener n+m. Después se debe mostrar su contenido.");
        
        int tabla[][] = new int[5][5];
        StringBuilder contenidoTabla = new StringBuilder();
        String separador = " | ";
 
        // Armando matriz
        for(int i=0 ; i<5; i++){
            for(int j=0 ; j<5; j++){
                tabla[i][j] = i+j;
            }
        }
        
        // Armando stringbuilder para mostrar contenido de la matriz
        for(int i=0 ; i<5; i++){
            contenidoTabla.append(separador);
            for(int j=0 ; j<5; j++){
                contenidoTabla.append(tabla[i][j]).append(separador);
            }
            contenidoTabla.append( "\n");
        }
        
        
        
        
        System.out.println("El contenido de la tabla es:");
        System.out.println(contenidoTabla);
    }
    
    
}
