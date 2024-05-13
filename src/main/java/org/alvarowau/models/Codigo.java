package org.alvarowau.models;

import org.alvarowau.util.Utils;

import java.io.Serializable;

/**
 * La clase Codigo representa el código alfanumérico asociado a un electrodoméstico.
 * Este código debe tener una longitud de 8 caracteres y puede contener letras mayúsculas,
 * minúsculas y números.
 */
public class Codigo implements Serializable {

    private String codigo;

    /**
     * Constructor de la clase Codigo.
     * @param codigo El código alfanumérico a asignar.
     */
    public Codigo(String codigo) {
        // Verificar si el código proporcionado es válido
        do {
            if (codigoValido(codigo)) {
                this.codigo = codigo;
            } else {
                System.out.println("El código introducido no es válido...");
                codigo = Utils.recogerTeclado("Introduzca el código nuevamente: ");
            }
        } while (!codigoValido(codigo));
    }

    /**
     * Método getter para obtener el código alfanumérico.
     * @return El código alfanumérico.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Método setter para establecer el código alfanumérico.
     * @param codigo El nuevo código alfanumérico a asignar.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Método que verifica si un código es válido.
     * @param codigo El código a verificar.
     * @return true si el código es válido, false en caso contrario.
     */
    public boolean codigoValido(String codigo) {
        return codigo.matches("[0-9A-Za-z]{8}");
    }

    /**
     * Método toString que retorna una representación en forma de cadena del objeto Codigo.
     * @return Una cadena que representa el código alfanumérico.
     */
    @Override
    public String toString() {
        return "Código{" +
                "código='" + codigo + '\'' +
                '}';
    }
}
