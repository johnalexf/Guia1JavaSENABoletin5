/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1javasenaboletin5;

import java.util.ArrayList;

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
    
    
    private static int cantidadAtletas;
    private static String[] nombreAtleta;
    private static int[] numeroDorsal;
    
    private static int[][] marcas;
    private static String[] añoMarcas;
    
    private static int cantidadAtletasGuardados;
    private static int limiteNumDorsal;
    
    private static StringBuilder listaInfoAtletasCompleta = new StringBuilder();
    private static int[][] ordenMarcas;
    private static StringBuilder[] listasInfoMarcasAtletas;
    
    
    public static void inicializarVariables( int numAtletas, String[] listaAñoMarcas, int defNumLimDorsal ){
        
        cantidadAtletas = numAtletas;
        nombreAtleta = new String[cantidadAtletas];
        numeroDorsal = new int[cantidadAtletas];
        
        int cantidadMarcas = listaAñoMarcas.length;
        marcas = new int[cantidadAtletas][cantidadMarcas];
        añoMarcas = listaAñoMarcas;
        /*La posiciones de las mejores marcas se manejaran asi:
            indice 0 = mejor marca del año listaAñoMarcas[0]
            indice 1 = mejor marca del año listaAñoMarcas[1]
            indice 2 = mejor marca del año listaAñoMarcas[2]
        */
        
        cantidadAtletasGuardados = 0;
        limiteNumDorsal = defNumLimDorsal; 
        
        ordenMarcas = new int[cantidadMarcas][cantidadAtletas];
        listasInfoMarcasAtletas = new StringBuilder[cantidadMarcas];
        for (int i = 0; i < listasInfoMarcasAtletas.length; i++) {
            listasInfoMarcasAtletas[i] = new StringBuilder();
        }
    }
    
    
    
    //Variables y funcion para estructurar el menu de opciones
    public static String armarStringMenu(){
    
        String[] menu;
        StringBuilder concatenarMenu = new StringBuilder();
        
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
        
        return concatenarMenu.toString();
  
    }
    //Fin de Variables y funcion para estructurar el menu de opciones
   
    
    
    
    public static void agregarAtleta(){
    
        if(hayCupoDisponible()){
            
            System.out.printf("%nA continuacion va escribir la informacion del atleta #%d %n", cantidadAtletasGuardados + 1 );
            nombreAtleta[cantidadAtletasGuardados] = capturarNombre();
            numeroDorsal[cantidadAtletasGuardados] = capturarNumeroDorsal();  
            capturarMarcas();
            cantidadAtletasGuardados++;
            
            actualizarListaInfoAtletasCompleta();
            actualizarPosicionesMarcas();
        }else{
            System.out.printf("Ha llegado al limite de %d atletas \n", cantidadAtletas);
        }
    
    }
    
    
    public static boolean hayCupoDisponible(){
        return cantidadAtletasGuardados < cantidadAtletas;
    }
    
    
    public static String capturarNombre(){
        System.out.printf("Nombre del atleta : ");
        return Entrada.texto();
    }
    
    
    public static int capturarNumeroDorsal(){
        int numero;
        while (true){
            System.out.printf("%nEscribe el NUMERO del atleta\n");
            System.out.printf("Recuerda debe estar en un rango de 1 hasta %d\n", limiteNumDorsal);
            numero = Entrada.entero();

            if(numero > limiteNumDorsal ){
                mostrarError("Valor por encima del permitido");
            }else{
                boolean isNumRepetido = false;
                for(int num: numeroDorsal){
                    if(numero == num){
                        isNumRepetido = true;
                        break;
                    }
                }
                
                if(isNumRepetido) mostrarError("Numero Dorsal repetido, verifica y escribelo nuevamente");
                else return numero;           
            }   
        }
    }
    
    
    public static void capturarMarcas(){
        System.out.println("");
        for(int i=0 ; i<añoMarcas.length ; i++){
            System.out.printf("Mejor marca del año %s en cm :",añoMarcas[i]);
            marcas[cantidadAtletasGuardados][i] = Entrada.entero(false, false, true);
        }
    }
    
    
    
    public static void mostrarError(String error) {
        System.out.println("\n----------------------------------------------------------------------------------");
        System.out.println("Error: "+ error);
        System.out.println("----------------------------------------------------------------------------------\n");
    }
    
    
    
    public static void actualizarListaInfoAtletasCompleta() {
        
        // Formateamos el dorsal para que siempre tenga 4 dígitos con ceros a la izquierda
        String dorsalFormateado = String.format("%04d", numeroDorsal[cantidadAtletasGuardados-1]);
        
        listaInfoAtletasCompleta.append("\n-------------------------------------")
                                .append("\nNumero Dorsal              : ").append(dorsalFormateado)
                                .append("\nNombre del Atleta          : ").append(nombreAtleta[cantidadAtletasGuardados-1])
                                .append("\nMejores marcas por año      ");
        for(int i=0 ; i<añoMarcas.length ; i++){
            listaInfoAtletasCompleta.append("\n                     ")
                                    .append(añoMarcas[i]).append("  :  ")
                                    .append(marcas[cantidadAtletasGuardados-1][i]);
        }
        
    }
    
    
    public static void mostrarAtletas(){
    
        System.out.println("\n-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("\n    Lista de atletas registrados  ");
        System.out.println(listaInfoAtletasCompleta);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------\n");
    }
    
    
    public static void actualizarPosicionesMarcas(){
        
        
        int posicionAtleta;
        int ultimoAtletaGuardado = cantidadAtletasGuardados-1;
        
        for(int marca=0 ; marca < añoMarcas.length ; marca++){
            int reajustePosicion=-1;
            if(ultimoAtletaGuardado != 0){
                for(int i=0; i< cantidadAtletasGuardados-1; i++){
                    posicionAtleta = ordenMarcas[marca][i];
                    if( marcas[ultimoAtletaGuardado][marca] > marcas[posicionAtleta][marca] ){
                        reajustePosicion = i;
                        break;
                    }
                }
            }
            
            if(reajustePosicion == -1){
                ordenMarcas[marca][ultimoAtletaGuardado] = ultimoAtletaGuardado;
                actualizarListaInfoMarcaAtletas(marca, false);
            }else{
                for(int i=ultimoAtletaGuardado ; i>reajustePosicion; i--){
                    ordenMarcas[marca][i] = ordenMarcas[marca][i-1];
                }
                ordenMarcas[marca][reajustePosicion] = ultimoAtletaGuardado;
                actualizarListaInfoMarcaAtletas(marca, true);
            } 
        }        

    }
    
    
    
    public static void actualizarListaInfoMarcaAtletas(int marca, boolean crearDesdeCero) {
        
        
        if(crearDesdeCero){
            listasInfoMarcasAtletas[marca].setLength(0);
            for(int i=0 ; i< cantidadAtletasGuardados ; i++){
                armarListaInfoMarcaAtletas(marca, ordenMarcas[marca][i]);
            }
        }else{
                armarListaInfoMarcaAtletas(marca, cantidadAtletasGuardados-1 );
        }
        
    }
    
    
    public static void armarListaInfoMarcaAtletas(int marca, int posicionAtleta){
         // Formateamos el dorsal a 4 dígitos como querías antes
        String dorsalFormateado = String.format("%04d", numeroDorsal[posicionAtleta]);
        
        listasInfoMarcasAtletas[marca].append("\n-------------------------------------")
                                .append("\nNumero Dorsal     : ").append(dorsalFormateado)
                                .append("\nNombre del Atleta : ").append(nombreAtleta[posicionAtleta])
                                .append("\nMejor marca       : ").append(marcas[posicionAtleta][marca]);
    
    }
    
    
    public static void mostrarMarcaAtletasOrdenadas(int marca){
    
        System.out.println("\n-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.printf("%n    Lista de marcas del año %s ordenadas  ", añoMarcas[marca]);
        System.out.println(listasInfoMarcasAtletas[marca]);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------\n");
    }
    
    
    
    
    
    
    public static void solucion(){
        

        String  mensajeMenu = armarStringMenu();
        
        inicializarVariables(10, new String[]{"2002","2001","2000"}, 9999);
        
        
        int opcion=0;
        while(opcion !=4){
            
            System.out.println(mensajeMenu);
            System.out.print("Escriba la opcion que desea realizar : ");
            opcion = Entrada.entero(false, false, true);
            
            switch(opcion){
                
                case 1:
                    agregarAtleta();
                    break;
                
                case 2:
                    mostrarAtletas();
                    break;
                
                case 3:
                    mostrarMarcaAtletasOrdenadas(2);
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
    

}
