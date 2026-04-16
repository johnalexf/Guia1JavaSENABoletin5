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
public class Boletin5Ejercicio2 {
    
    public static void solucion(){
    
        System.out.println("2.Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir si se obtiene la \n" +
                            "misma tabla al cambiar las filas por columnas.  \n");
        
        int tamañoTabla=4;
        int[][] tabla = new int[tamañoTabla][tamañoTabla];
        boolean esSimetrica = true;
        
        System.out.printf("Acontinuacion ingrese los datos de una tabla %d X %d %n",tamañoTabla,tamañoTabla);
        
        for(int i=0; i<tamañoTabla ; i++){
            System.out.printf("Fila%d : %n",i+1);
            for(int j=0; j<tamañoTabla ; j++){
                System.out.printf("   Dato%d : ",j+1);
                tabla[i][j] = Entrada.entero();
            }
        }
        
        //Comprobar si es simetrica
        for(int i=0; i<tamañoTabla -1  ; i++){
            for(int j=i+1; j<tamañoTabla ; j++){
                if( tabla[i][j] != tabla[j][i]){
                    esSimetrica = false;
                    break;
                }
            }
            if(!esSimetrica) break;
        }
        
        System.out.printf("%n La tabla %s es Simetrica %n%n", esSimetrica ? "SI" : "NO" );
        
    }
    
    
}
