package org.alvarowau.util;

import org.alvarowau.models.Tipo;

import java.util.Scanner;

/**
 * La clase Utils proporciona métodos útiles para interactuar con la entrada del usuario en la consola.
 */
public class Utils {

    private static Scanner entrada = new Scanner(System.in);

    /**
     * Recoge una entrada del teclado con un mensaje especificado.
     * @param mensaje El mensaje a mostrar antes de recoger la entrada.
     * @return La entrada del usuario como una cadena.
     */
    public static String recogerTeclado(String mensaje){
        String entradaUsuario;
        do {
            System.out.print(mensaje);
            entradaUsuario = entrada.nextLine();
            if (entradaUsuario.trim().isEmpty()) {
                System.out.println("Por favor, ingrese un valor válido.");
            }
        } while (entradaUsuario.trim().isEmpty());
        return entradaUsuario;
    }

    /**
     * Cierra la instancia de Scanner utilizada para la entrada del usuario.
     */
    public static void cerrarClase(){
        entrada.close();
    }

    /**
     * Recoge una entrada del teclado como un número entero.
     * @param s El mensaje a mostrar antes de recoger la entrada.
     * @return El número entero introducido por el usuario.
     */
    public static int recogerTecladoNum(String s) {
        String numero;
        do {
            System.out.print(s);
            numero = entrada.nextLine();
        }while (!isNumeroEntero(numero));
        return Integer.parseInt(numero);
    }

    /**
     * Recoge una entrada del teclado como un número decimal.
     * @param s El mensaje a mostrar antes de recoger la entrada.
     * @return El número decimal introducido por el usuario.
     */
    public static double recogerTecladoNumDouble(String s) {
        String numero = "";
        do{
            System.out.print(s);
            numero = entrada.nextLine();
        }while (!isNumeroDouble(numero));
        return Double.parseDouble(numero);
    }

    /**
     * Verifica si una cadena representa un número entero.
     * @param num La cadena a verificar.
     * @return true si la cadena representa un número entero, false de lo contrario.
     */
    private static boolean isNumeroEntero(String num){
        try{
            int numero = Integer.parseInt(num);
            return true;
        }catch (NumberFormatException e){
            System.out.println("Valor no válido...");
            return false;
        }
    }

    /**
     * Verifica si una cadena representa un número decimal.
     * @param num La cadena a verificar.
     * @return true si la cadena representa un número decimal, false de lo contrario.
     */
    private static boolean isNumeroDouble(String num){
        try {
            double numero = Double.parseDouble(num);
            return true;
        }catch (NumberFormatException e){
            System.out.println("Valor no válido...");
            return false;
        }
    }

    /**
     * Recoge el tipo de electrodoméstico seleccionado por el usuario.
     * @return El tipo de electrodoméstico seleccionado.
     */
    public static Tipo recogerTipo() {
        System.out.println("Seleccione un tipo:");
        for (Tipo tipo : Tipo.values()) {
            System.out.println((tipo.ordinal() + 1) + ". " + tipo.name());
        }
        String seleccion;
        do {
            seleccion = recogerTeclado("Ingrese el número correspondiente al tipo: ");
        } while (!isNumeroEntero(seleccion));

        return Tipo.values()[Integer.parseInt(seleccion) - 1];
    }
}
