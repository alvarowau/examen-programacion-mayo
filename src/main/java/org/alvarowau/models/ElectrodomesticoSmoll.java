package org.alvarowau.models;

import java.io.Serializable;
import java.util.Objects;

/**
 * La clase ElectrodomesticoSmoll representa un electrodoméstico pequeño.
 * Extiende la clase Electrodomestico y tiene un precio final igual al precio unitario.
 */
public class ElectrodomesticoSmoll extends Electrodomestico implements Serializable {

    private double precioFinal;

    /**
     * Constructor de la clase ElectrodomesticoSmoll.
     * @param codigo Código del electrodoméstico.
     * @param descripcion Descripción del electrodoméstico.
     * @param fabricante Fabricante del electrodoméstico.
     * @param modelo Modelo del electrodoméstico.
     * @param stock Stock disponible del electrodoméstico.
     * @param precioUnitario Precio unitario del electrodoméstico.
     */
    public ElectrodomesticoSmoll(String codigo, String descripcion, String fabricante, String modelo, int stock, double precioUnitario) {
        super(codigo, descripcion, fabricante, modelo, stock, precioUnitario);
        this.precioFinal = precioUnitario;
    }

    /**
     * Calcula el precio final del electrodoméstico pequeño, que es igual al precio unitario.
     */
    @Override
    public void calculoPrecio() {
        this.precioFinal = super.getPrecioUnitario();
    }

    /**
     * Obtiene el precio final del electrodoméstico pequeño.
     * @return Precio final del electrodoméstico.
     */
    public double getPrecioFinal() {
        return precioFinal;
    }

    /**
     * Establece el precio final del electrodoméstico pequeño.
     * @param precioFinal Precio final del electrodoméstico.
     */
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectrodomesticoSmoll that = (ElectrodomesticoSmoll) o;
        return Double.compare(that.precioFinal, precioFinal) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), precioFinal);
    }

    @Override
    public String toString() {
        return super.toString() + (getStock() > 0 ? "Stock disponible: " + getStock() + " Precio final: " + precioFinal + " " : "Estado: Agotado ");
    }
}
