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
public class Boletin5Ejercicio9 {
    
    public static void solucion(){
    
        System.out.println("9.Hacer lo mismo que el ejercicio anterior, pero con una matriz 9x9x9. Creamos un cubo con las caras \n" +
                            "puestas a 1 y el interior a 0.");
        
        int tamaño = 9;
        int[][][] matriz = new int[tamaño][tamaño][tamaño];
        
        //La matriz gracias a java se ha llenado con 0 tan solo con crearla
        //Entonces solo tenemos que llenar los bordes
        for(int z=0 ; z<tamaño; z++){   
            for(int i=0 ; i<tamaño; i++){
                if( ( i==0 || i == tamaño-1 ) || ( z==0 || z== tamaño-1)){
                    for(int j=0; j<tamaño; j++){
                        matriz[z][i][j] = 1;
                    }
                }else{
                    matriz[z][i][0] = 1;
                    matriz[z][i][tamaño-1] = 1;
                }
            }
        }
        
        System.out.printf("La matriz %d X %d X %d resultantes es : \n", tamaño, tamaño, tamaño);
        for(int z=0 ; z<tamaño; z++){
            System.out.printf(" matriz de %d X %d en la posicion z=%d %n", tamaño, tamaño, z+1);
            Matrices.mostrarMatriz(matriz[z]);
        }
        
    
    }
    
}
