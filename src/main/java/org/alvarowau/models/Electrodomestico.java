package org.alvarowau.models;

import java.util.Objects;

/**
 * La clase Electrodomestico es una clase abstracta que representa un electrodoméstico genérico.
 * Contiene atributos comunes a todos los electrodomésticos, como descripción, fabricante, modelo, stock y precio unitario.
 */
public abstract class Electrodomestico extends Codigo {

    private String descripcion;
    private String fabricante;
    private String modelo;
    private int stock;
    private double precioUnitario;

    /**
     * Constructor de la clase Electrodomestico.
     * @param codigo El código del electrodoméstico.
     * @param descripcion La descripción del electrodoméstico.
     * @param fabricante El fabricante del electrodoméstico.
     * @param modelo El modelo del electrodoméstico.
     * @param stock El stock del electrodoméstico.
     * @param precioUnitario El precio unitario del electrodoméstico.
     */
    public Electrodomestico(String codigo, String descripcion, String fabricante, String modelo, int stock, double precioUnitario) {
        super(codigo);
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.stock = stock;
        this.precioUnitario = precioUnitario;
    }

    /**
     * Método getter para obtener la descripción del electrodoméstico.
     * @return La descripción del electrodoméstico.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método setter para establecer la descripción del electrodoméstico.
     * @param descripcion La nueva descripción del electrodoméstico.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método getter para obtener el fabricante del electrodoméstico.
     * @return El fabricante del electrodoméstico.
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Método setter para establecer el fabricante del electrodoméstico.
     * @param fabricante El nuevo fabricante del electrodoméstico.
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Método getter para obtener el modelo del electrodoméstico.
     * @return El modelo del electrodoméstico.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método setter para establecer el modelo del electrodoméstico.
     * @param modelo El nuevo modelo del electrodoméstico.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método getter para obtener el stock del electrodoméstico.
     * @return El stock del electrodoméstico.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Método setter para establecer el stock del electrodoméstico.
     * @param stock El nuevo stock del electrodoméstico.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Método getter para obtener el precio unitario del electrodoméstico.
     * @return El precio unitario del electrodoméstico.
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Método abstracto para calcular el precio del electrodoméstico.
     */
    public abstract void calculoPrecio();

    /**
     * Método setter para establecer el precio unitario del electrodoméstico.
     * @param precioUnitario El nuevo precio unitario del electrodoméstico.
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Método equals para comparar dos electrodomésticos por su modelo.
     * @param o El objeto a comparar.
     * @return true si los electrodomésticos tienen el mismo modelo, false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Electrodomestico that = (Electrodomestico) o;
        return Objects.equals(getModelo(), that.getModelo());
    }

    /**
     * Método hashCode para generar un código hash para el electrodoméstico.
     * @return El código hash del electrodoméstico.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getModelo());
    }

    /**
     * Método toString para obtener una representación en forma de cadena del electrodoméstico.
     * @return Una cadena que representa el electrodoméstico.
     */
    @Override
    public String toString() {
        return "Código: " + getCodigo() + " " +
                "Descripción: " + descripcion + " " +
                "Fabricante: " + fabricante + " " +
                "Modelo: " + modelo + " " +
                "Precio unitario: " + precioUnitario + " ";
    }
}
