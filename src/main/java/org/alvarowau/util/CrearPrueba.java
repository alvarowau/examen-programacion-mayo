package org.alvarowau.util;

import org.alvarowau.models.Electrodomestico;
import org.alvarowau.models.ElectrodomesticoGrande;
import org.alvarowau.models.ElectrodomesticoSmoll;
import org.alvarowau.models.Tipo;

import java.util.ArrayList;

public class CrearPrueba {

    public static ArrayList<Electrodomestico> crearObjetosPrueba(){
        ArrayList<Electrodomestico> tienda = new ArrayList<>();
        // Crear 10 objetos de ElectrodomesticoGrande

        ElectrodomesticoGrande grande1 = new ElectrodomesticoGrande("CODG0001", "Nevera", "Samsung", "Modelo ABC", 20, 800, 50, 150, 70, 60, Tipo.INSTALACION);
        ElectrodomesticoGrande grande2 = new ElectrodomesticoGrande("CODG0002", "Lavadora", "LG", "Modelo XYZ", 15, 600, 40, 100, 60, 50, Tipo.NO_INSTALACION);
        ElectrodomesticoGrande grande3 = new ElectrodomesticoGrande("CODG0003", "Microondas", "Whirlpool", "Modelo 123", 10, 400, 35, 80, 40, 30, Tipo.INSTALACION);
        ElectrodomesticoGrande grande4 = new ElectrodomesticoGrande("CODG0004", "Horno", "Bosch", "Modelo 456", 8, 700, 55, 120, 65, 50, Tipo.NO_INSTALACION);
        ElectrodomesticoGrande grande5 = new ElectrodomesticoGrande("CODG0005", "Secadora", "Electrolux", "Modelo 789", 12, 900, 60, 140, 75, 70, Tipo.INSTALACION);
        ElectrodomesticoGrande grande6 = new ElectrodomesticoGrande("CODG0006", "Congelador", "Indesit", "Modelo 101", 5, 1000, 70, 160, 80, 60, Tipo.NO_INSTALACION);
        ElectrodomesticoGrande grande7 = new ElectrodomesticoGrande("CODG0007", "Lavavajillas", "Siemens", "Modelo 202", 18, 750, 45, 110, 55, 40, Tipo.INSTALACION);
        ElectrodomesticoGrande grande8 = new ElectrodomesticoGrande("CODG0008", "Campana extractora", "Cata", "Modelo 303", 7, 550, 40, 100, 50, 35, Tipo.NO_INSTALACION);
        ElectrodomesticoGrande grande9 = new ElectrodomesticoGrande("CODG0009", "Frigorífico", "Zanussi", "Modelo 404", 14, 850, 55, 130, 65, 55, Tipo.INSTALACION);
        ElectrodomesticoGrande grande10 = new ElectrodomesticoGrande("CODG0010", "Placa de inducción", "Balay", "Modelo 505", 9, 650, 50, 120, 60, 45, Tipo.NO_INSTALACION);

        // Crear 10 objetos de ElectrodomesticoSmoll
        ElectrodomesticoSmoll smoll1 = new ElectrodomesticoSmoll("CODS0001", "Exprimidor", "Moulinex", "Modelo 111", 25, 30);
        ElectrodomesticoSmoll smoll2 = new ElectrodomesticoSmoll("CODS0002", "Cafetera", "Krups", "Modelo 222", 20, 40);
        ElectrodomesticoSmoll smoll3 = new ElectrodomesticoSmoll("CODS0003", "Batidora", "Taurus", "Modelo 333", 15, 35);
        ElectrodomesticoSmoll smoll4 = new ElectrodomesticoSmoll("CODS0004", "Tostadora", "Philips", "Modelo 444", 18, 25);
        ElectrodomesticoSmoll smoll5 = new ElectrodomesticoSmoll("CODS0005", "Robot de cocina", "Bosch", "Modelo 555", 22, 80);
        ElectrodomesticoSmoll smoll6 = new ElectrodomesticoSmoll("CODS0006", "Aspiradora", "Rowenta", "Modelo 666", 17, 90);
        ElectrodomesticoSmoll smoll7 = new ElectrodomesticoSmoll("CODS0007", "Plancha", "Ufesa", "Modelo 777", 30, 50);
        ElectrodomesticoSmoll smoll8 = new ElectrodomesticoSmoll("CODS0008", "Freidora", "Tefal", "Modelo 888", 14, 75);
        ElectrodomesticoSmoll smoll9 = new ElectrodomesticoSmoll("CODS0009", "Licuadora", "Braun", "Modelo 999", 12, 60);
        ElectrodomesticoSmoll smoll10 = new ElectrodomesticoSmoll("CODS0010", "Molinillo de café", "Delonghi", "Modelo 1010", 19, 55);
        // Agregar objetos a la tienda
        tienda.add(grande1);
        tienda.add(grande2);
        tienda.add(grande3);
        tienda.add(grande4);
        tienda.add(grande5);
        tienda.add(grande6);
        tienda.add(grande7);
        tienda.add(grande8);
        tienda.add(grande9);
        tienda.add(grande10);
        tienda.add(smoll1);
        tienda.add(smoll2);
        tienda.add(smoll3);
        tienda.add(smoll4);
        tienda.add(smoll5);
        tienda.add(smoll6);
        tienda.add(smoll7);
        tienda.add(smoll8);
        tienda.add(smoll9);
        tienda.add(smoll10);
        return tienda;
    }
}
