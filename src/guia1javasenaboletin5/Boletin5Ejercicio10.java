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
public class Boletin5Ejercicio10 {
    
    public static void solucionA(){
    
        System.out.println("10.Los siguientes programas piden una serie de datos y tras procesarlos ofrecen unos resultados por \n" +
                "pantalla. Mostrar el resultado:\n" +
                "PROGRAMA Ej10a\n" +
                "VARIABLES\n" +
                "    i, m, a: ENTEROS\n" +
                "    t: TABLA [5] ENTEROS\n" +
                "COMIENZO\n" +
                "    PARA i0 HASTA 4\n" +
                "        leer (t[i])\n" +
                "    FIN PARA\n" +
                "    m \n" +
                " 0\n" +
                "    PARA i  0 HASTA 4\n" +
                "        SI t[i] > m\n" +
                "            m \n" +
                " t[i]\n" +
                "         FIN SI\n" +
                "    FIN PARA\n" +
                "    a \n" +
                " t[4-m]\n" +
                "    t[4-m]  t[m]\n" +
                "    t[m]  a\n" +
                "    PARA i  0 HASTA 4\n" +
                "        escribir (t[i])\n" +
                "    FIN PARA\n" +
                "FIN PROGRAMA\n" +
                "Datos de entrada: -4, 0, 1, 3 y \n" +
                "2.\n");
        
        int i, m, a;
        int[] t = new int[5];
        
        //leemos el valor
        /*for(i=0; i<=4; i++){
            t[i] = Entrada.entero();
        }*/
        
        //Como el ejercicio nos da un dato de prueba lo asignamos desde codigo
        t = new int[]{-4,0,1,3,2};
        
        m=0;
        for (i=0; i <= 4; i++ ){
            if( t[i]> m ) m = t[i];
        }
        
        a = t[4-m];
        t[4-m] = t[m];
        t[m] = a;
        
        
        for(i=0; i<=4; i++){
            System.out.println(t[i]);
        }
    
    }
    
    public static void solucionB() {
        
        System.out.println(   "PROGRAMA Ej10b\n" +
                               "VARIABLES\n" +
                               "    n, i: ENTEROS\n" +
                               "    a, b: TABLA [100] ENTEROS\n" +
                               "COMIENZO\n" +
                               "    n \n" +
                               " 10\n" +
                               "    PARA i0 HASTA n-1\n" +
                               "        leer (a[i])\n" +
                               "    FIN PARA\n" +
                               "    PARA i  0 HASTA n/2\n" +
                               "        b[i] \n" +
                               " a[n-1-i]\n" +
                               "        b[n-1-i]  a[i]\n" +
                               "    FIN PARA\n" +
                               "    PARA i  0 HASTA n-1\n" +
                               "        SI i mod 2 = 0\n" +
                               "            escribir (a[i])\n" +
                               "        SINO\n" +
                               "            escribir (b[i])\n" +
                               "        FIN SI\n" +
                               "    FIN PARA\n" +
                               "FIN PROGRAMA\n" +
                               "Datos de entrada:\n" +
                               " 6, 2, 8, 9, 2, 5, 8, 2, 6 y 1."       
                       );
        
        
        int n, i;
        int[] a = new int[100];
        int[] b = new int[100];
        
        n=10;
        
        //leemos el valor
        /*for(i=0; i<=n-1; i++){
            a[i] = Entrada.entero();
        }*/
        
        //Como el ejercicio nos da un dato de prueba lo asignamos desde codigo
        a = new int[]{6, 2, 8, 9, 2, 5, 8, 2, 6, 1};
        
        for (i=0; i <= n/2; i++ ){
            b[i] = a[n-1-i];
            b[n-1-i] = a[i];
        }
        
        for(i=0; i<=n-1; i++){
            System.out.println((i%2==0)? a[i]: b[i]);
        }
    }
}
