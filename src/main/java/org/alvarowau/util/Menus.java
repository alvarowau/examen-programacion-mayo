package org.alvarowau.util;

/**
 * La clase Menus proporciona métodos estáticos para mostrar menús en la consola.
 */
public class Menus {

    /**
     * Muestra el menú principal en la consola.
     */
    public static void menuPrincipal(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Añadir Electrodoméstico");
        System.out.println("2. Vender Electrodoméstico");
        System.out.println("3. Eliminar Electrodoméstico");
        System.out.println("4. Salir");
    }

    /**
     * Muestra el menú de opciones para crear un electrodoméstico en la consola.
     */
    public static void menuClasesElectrodomestico(){
        System.out.println("MENU CLASES ELECTRODOMÉSTICO");
        System.out.println("¿Qué tipo de Electrodoméstico desea crear?");
        System.out.println("1. Electrodoméstico pequeño");
        System.out.println("2. Electrodoméstico Grande");
        System.out.println("3. Volver atrás");
    }
}
