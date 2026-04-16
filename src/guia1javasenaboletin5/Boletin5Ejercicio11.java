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
public class Boletin5Ejercicio11 {
    
    public static void solucion(){
    
        System.out.println("11-Se pretende realizar un programa para gestionar la lista de participaciones en una competición de \n" +
                        "   salto de longitud. El número de plazas disponible es de 10. Sus datos se irán introduciendo en el mismo \n" +
                        "   orden que vayan inscribiéndose los atletas. Diseñar el programa que muestre las siguientes opciones:\n" +
                        "   1- Inscribir un participante.\n" +
                        "   2- Mostrar listado de datos.\n" +
                        "   3- Mostrar listado por marcas.\n" +
                        "   4- Finalizar el programa.\n" +
                        "   Si se selecciona 1, se introducirán los datos de uno de los participantes: Nombre, mejor marca del \n" +
                        "   2002, mejor marca del 2001 y mejor marca del 2000.\n" +
                        "   Si se elige la opción 2, se debe mostrar un listado por número de dorsal.\n" +
                        "   La opción 3 mostrará un listado ordenado por la marca del 2002, de mayor a menor.\n" +
                        "   Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se seleccione la opción \n" +
                        "   4, que terminará el programa.\n\n\n\n");
        
        String[] menu;
        menu = new String[]{
            "Inscribir un participante.",
            "Mostrar listado de datos.",
            "Mostrar listado por marcas.",
            "Finalizar el programa."
        };
        
        StringBuilder concatenarMenu = new StringBuilder();
        
        concatenarMenu.append("\n Menu: \n");
        for( int i=0; i< menu.length; i++){
            concatenarMenu.append(i+1).append(".-").append(menu[i]).append("\n");
        }
        
        int opcion=0;
        while(opcion !=4){
            
            System.out.println(concatenarMenu);
            System.out.print("Escriba la opcion que desea realizar : ");
            opcion = Entrada.entero(false, false, true);
            
            switch(opcion){
                
                case 1:
                    break;
                
                case 2:
                    break;
                
                case 3:
                    break;
                
                case 4:
                    break;
                
                default:
                    System.out.println("\n-----------------------------------------");
                    System.out.println("ERROR: Opcion no valida, intente de nuevo");
                    System.out.println("-----------------------------------------\n");
                    break;
            
            }
            
            
        }
        
        System.out.println("Fin del programa");
    
    }
}
