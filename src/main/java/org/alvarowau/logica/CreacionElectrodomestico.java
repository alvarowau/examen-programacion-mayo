package org.alvarowau.logica;

import org.alvarowau.models.ElectrodomesticoGrande;
import org.alvarowau.models.ElectrodomesticoSmoll;
import org.alvarowau.models.Tipo;
import org.alvarowau.util.Utils;


public class CreacionElectrodomestico {

    public static ElectrodomesticoGrande crearGrande(){
        System.out.println("----CREACIÓN DE ELECTRODOMÉSTICO GRANDE----");
        String codigo = Utils.recogerTeclado("Digite el código del proucto: (8 digitos que pueden ser letras o números) ");
        String descripcion = Utils.recogerTeclado("Digite la descripción: ");
        String fabricante = Utils.recogerTeclado("Digite el fabricante: ");
        String modelo = Utils.recogerTeclado("Digite el modelo: ");
        int stock = Utils.recogerTecladoNum("Digite el stock del producto: ");
        double precioUnitario = Utils.recogerTecladoNumDouble("Digite el precio unitario: ");
        double peso = Utils.recogerTecladoNumDouble("Digite el peso: ");
        double alto = Utils.recogerTecladoNumDouble("Digite el alto: ");
        double ancho = Utils.recogerTecladoNumDouble("Digite el ancho: ");
        double fondo = Utils.recogerTecladoNumDouble("Digite el fondo: ");
        Tipo tipo = Utils.recogerTipo();
        return new ElectrodomesticoGrande(
                codigo, descripcion,fabricante, modelo,stock,precioUnitario,peso,alto,ancho,fondo,tipo);
    }

    public static ElectrodomesticoSmoll crearSmoll(){
        String codigo = Utils.recogerTeclado("Digite el código del proucto: (8 digitos que pueden ser letras o números) ");
        String descripcion = Utils.recogerTeclado("Digite la descripción: ");
        String fabricante = Utils.recogerTeclado("Digite el fabricante: ");
        String modelo = Utils.recogerTeclado("Digite el modelo: ");
        int stock = Utils.recogerTecladoNum("Digite el stock del producto: ");
        double precioUnitario = Utils.recogerTecladoNumDouble("Digite el precio unitario: ");
        return new ElectrodomesticoSmoll(
                codigo, descripcion,fabricante, modelo,stock,precioUnitario);
        }

    }

