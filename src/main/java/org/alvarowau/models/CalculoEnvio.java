package org.alvarowau.models;

public interface CalculoEnvio {

    /***
     * Los gastos de envio se calculan multiplicando el peso por los metros cúbicos
     * maximo gastos de envio 50€
     */
    void calculoGasto();


    /***
     * calculo metros cubicos --> (ancho * alto * fondo) / 1000000
     * @return metrosCubicos
     */
    double calculoMetrosCubicos();
}
