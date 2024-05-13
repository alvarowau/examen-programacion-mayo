package org.alvarowau.models;

import java.io.Serializable;
import java.util.Objects;

public class ElectrodomesticoGrande extends Electrodomestico implements CalculoEnvio, Serializable {

    private double peso;
    private double alto;
    private double ancho;
    private double fondo;
    private Tipo tipo;
    private double gastosEnvio;
    private double precioFinal;

    /**
     * Constructor de la clase ElectrodomesticoGrande.
     * @param codigo El código del electrodoméstico.
     * @param descripcion La descripción del electrodoméstico.
     * @param fabricante El fabricante del electrodoméstico.
     * @param modelo El modelo del electrodoméstico.
     * @param stock El stock del electrodoméstico.
     * @param precioUnitario El precio unitario del electrodoméstico.
     * @param peso El peso del electrodoméstico.
     * @param alto La altura del electrodoméstico.
     * @param ancho El ancho del electrodoméstico.
     * @param fondo La profundidad del electrodoméstico.
     * @param tipo El tipo de electrodoméstico grande.
     */
    public ElectrodomesticoGrande(String codigo, String descripcion, String fabricante, String modelo, int stock, double precioUnitario, double peso, double alto, double ancho, double fondo, Tipo tipo) {
        super(codigo, descripcion, fabricante, modelo, stock, precioUnitario);
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.tipo = tipo;
        calculoGasto();
        calculoPrecio();
    }

    /**
     * Método para calcular los gastos de envío del electrodoméstico.
     * Los gastos de envío se calculan multiplicando el peso por los metros cúbicos.
     */
    @Override
    public void calculoGasto() {
        double calculo = peso * calculoMetrosCubicos();
        if(calculo > 50){
            this.gastosEnvio = 50;
        }else{
            this.gastosEnvio = calculo;
        }
    }

    @Override
    public double calculoMetrosCubicos() {
        return (ancho * alto * fondo) /1000000;
    }

    /**
     * Método para calcular el precio final del electrodoméstico.
     * El precio final se calcula sumando el precio unitario, los gastos de envío y, en caso de instalación, un coste adicional.
     */
    @Override
    public void calculoPrecio() {
        if (tipo == Tipo.INSTALACION) {
            this.precioFinal = super.getPrecioUnitario() + gastosEnvio + 15;
        }else{
            this.precioFinal = super.getPrecioUnitario() + gastosEnvio;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectrodomesticoGrande that = (ElectrodomesticoGrande) o;
        return Double.compare(getPeso(), that.getPeso()) == 0 && Double.compare(getAlto(), that.getAlto()) == 0 && Double.compare(getAncho(), that.getAncho()) == 0 && Double.compare(getFondo(), that.getFondo()) == 0 && Double.compare(getGastosEnvio(), that.getGastosEnvio()) == 0 && Double.compare(getPrecioFinal(), that.getPrecioFinal()) == 0 && getTipo() == that.getTipo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPeso(), getAlto(), getAncho(), getFondo(), getTipo(), getGastosEnvio(), getPrecioFinal());
    }

    @Override
    public String toString() {
        return super.toString() + "Peso: " + peso + " " +
                "Alto: " + alto + " " +
                "Ancho: " + ancho + " " +
                "Fondo: " + fondo + " " +
                "Tipo: " + tipo + " " +
                "Gastos de envío: " + gastosEnvio + " " +
                (getStock() > 0 ? "Stock disponible: " + getStock() + " Precio final: " + precioFinal + " " : "Estado: Agotado ");
    }



}
