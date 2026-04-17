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
    
    
    private static int cantidadAtletas;
    private static String[] nombreAtleta;
    private static int[] numeroDorsal;
    
    private static int[][] marcas;
    private static String[] añoMarcas;
    
    private static int cantidadAtletasGuardados;
    private static int limiteNumDorsal;
    
    public static void inicializarVariables( int numAtletas, String[] listaAñoMarcas, int defNumLimDorsal ){
        
        cantidadAtletas = numAtletas;
        nombreAtleta = new String[cantidadAtletas];
        numeroDorsal = new int[cantidadAtletas];
        
        marcas = new int[cantidadAtletas][listaAñoMarcas.length];
        añoMarcas = listaAñoMarcas;
        /*La posiciones de las mejores marcas se manejaran asi:
            indice 0 = mejor marca del año listaAñoMarcas[0]
            indice 1 = mejor marca del año listaAñoMarcas[1]
            indice 2 = mejor marca del año listaAñoMarcas[2]
        */
        
        cantidadAtletasGuardados = 0;
        limiteNumDorsal = defNumLimDorsal; 
        
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
        System.out.println("\n-----------------------------------------");
        System.out.println("Error: "+ error);
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
    

}
