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
    
    /*
    11-Se pretende realizar un programa para gestionar la lista de participaciones en una competición de 
        salto de longitud. El número de plazas disponible es de 10. Sus datos se irán introduciendo en el 
        mismo orden que vayan inscribiéndose los atletas. Diseñar el programa que muestre las siguientes 
        opciones:
        1- Inscribir un participante.
        2- Mostrar listado de datos.
        3- Mostrar listado por marcas.
        4- Finalizar el programa.
        Si se selecciona 1, se introducirán los datos de uno de los participantes: Nombre, mejor marca del 
        2002, mejor marca del 2001 y mejor marca del 2000.
        Si se elige la opción 2, se debe mostrar un listado por número de dorsal.
        La opción 3 mostrará un listado ordenado por la marca del 2002, de mayor a menor.
        Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se seleccione la 
        opción 4, que terminará el programa.
    */
    
    
    //Variables y funcion para estructurar el menu de opciones
    public static String[] menu;
    public static StringBuilder concatenarMenu = new StringBuilder();
    
    public static void armarStringMenu(){
    
         menu = new String[]{
            "Inscribir un participante.",
            "Mostrar listado de datos.",
            "Mostrar listado por marcas.",
            "Finalizar el programa."
        };
        
        concatenarMenu.append("\n Menu: \n");
        for( int i=0; i< menu.length; i++){
            concatenarMenu.append(i+1).append(".-").append(menu[i]).append("\n");
        }
  
    }
    //Fin de Variables y funcion para estructurar el menu de opciones
   
    
    public static void solucion(){

        armarStringMenu();
        
        int cantidadAtletas = 10;
        int cantidadAtletasGuardados = 0;
        int cantMarcas = 3;
        String[] nombreAtleta = new String[cantidadAtletas];
        int[] numeroDorsal = new int[cantidadAtletas];
        int limiteNumDorsal = 9999;
        int[][] marcas = new int[cantidadAtletas][cantMarcas];
        /*La posiciones de las mejores marcas se manejaran asi:
            indice 0 = mejor marca del año 2002
            indice 1 = mejor marca del año 2001
            indice 2 = mejor marca del año 2000
        */
        String[] añoMarcas = new String[]{"2002","2001","2000"};
        
        
        int opcion=0;
        while(opcion !=4){
            
            System.out.println(concatenarMenu);
            System.out.print("Escriba la opcion que desea realizar : ");
            opcion = Entrada.entero(false, false, true);
            
            switch(opcion){
                
                case 1:
                    if(cantidadAtletasGuardados < cantidadAtletas){
                        System.out.printf("%nA continuacion va escribir la informacion del atleta #%d %n", cantidadAtletasGuardados + 1 );
                        System.out.printf("Nombre del atleta : ");
                        nombreAtleta[cantidadAtletasGuardados] = Entrada.texto();
 
                        while (true){
                            System.out.printf("%nEscribe el NUMERO del atleta\n");
                            System.out.printf("Recuerda debe estar en un rango de 1 hasta %d\n", limiteNumDorsal);
                            numeroDorsal[cantidadAtletasGuardados] = Entrada.entero();

                            if(numeroDorsal[cantidadAtletasGuardados] > limiteNumDorsal){
                                mostrarError("Valor por encima del permitido");
                            }else{
                                break;
                            }                             
                        }
                        
                        System.out.println("");
                        for(int i=0 ; i<cantMarcas ; i++){
                                                           
                            System.out.printf("Mejor marca del año %s en cm :",añoMarcas[i]);
                            marcas[cantidadAtletasGuardados][i] = Entrada.entero(false, false, true);

                        }
                        
                        cantidadAtletasGuardados++;
                        
                    }else{
                        System.out.printf("Ha llegado al limite de %d atletas \n", cantidadAtletas);
                    }
                    
                    break;
                
                case 2:
                    break;
                
                case 3:
                    break;
                
                case 4:
                    break;
                
                default:
                    mostrarError("Opcion no valida, intente de nuevo");
                    break;
            
            }
            
            
        }
        
        System.out.println("Fin del programa");
    
    }
    
    public static void mostrarError(String error) {
        System.out.println("\n-----------------------------------------");
        System.out.println("Error: "+ error);
        System.out.println("-----------------------------------------\n");
    }
}
