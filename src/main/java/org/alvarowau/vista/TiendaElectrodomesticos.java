package org.alvarowau.vista;

import org.alvarowau.logica.CreacionElectrodomestico;
import org.alvarowau.models.Electrodomestico;
import org.alvarowau.models.ElectrodomesticoGrande;
import org.alvarowau.models.ElectrodomesticoSmoll;
import org.alvarowau.util.CrearPrueba;
import org.alvarowau.util.Menus;
import org.alvarowau.util.Utils;

import java.io.*;
import java.util.ArrayList;

public class TiendaElectrodomesticos {

    private ArrayList<Electrodomestico> inventario;

    public TiendaElectrodomesticos() {
        inventario = new ArrayList<>();
        cargarDesdeArchivoBinario();
    }

    public void iniciar() {
        if (inventario.isEmpty()) {
            inventario.addAll(CrearPrueba.crearObjetosPrueba());
        }
        mostrarMenuPrincipal();
    }

    private int obtenerOpcionMenuPrincipal() {
        int seleccion = 0;
        do {
            Menus.menuPrincipal();
            seleccion = Utils.recogerTecladoNum("Seleccione un número: ");
        } while (seleccion < 0 || seleccion > 4);
        return seleccion;
    }

    private void mostrarMenuPrincipal() {
        int seleccion = obtenerOpcionMenuPrincipal();
        switch (seleccion) {
            case 1:
                addElectrodomestico();
                break;
            case 2:
                venderElectrodomestico();
                break;
            case 3:
                eliminarEletrodomestico();
                break;
            case 4:
                cerrarPrograma();
                break;
            default:
                System.out.println("Hubo un error, estamos intentado solucionarlo...");
                System.out.println("..");
                iniciar();
        }
    }

    private void cerrarPrograma() {
        guardarEnArchivoBinario();
        inventario.clear();
        Utils.cerrarClase();
    }

    /***
     * ELIMINADO DE ELECTRODOMESTICOS
     */

    private void eliminarEletrodomestico() {
        mostrarParaBorrar();
        Electrodomestico eletro = buscarPorCodigo();
        if (eletro != null) {
            System.out.println("el Electrodoméstico " + eletro + " eliminado");
            inventario.remove(eletro);
        } else {
            System.out.println("El código introducido no corresponde a ningún Electrodoméstico");
        }
        iniciar();
    }

    private Electrodomestico buscarPorCodigo() {
        String codigo = "";
        Electrodomestico buscado = null;
        codigo = Utils.recogerTeclado("Digite el código del producto que desea eliminar: ");
        for (Electrodomestico e : inventario) {
            if (e.getCodigo().equals(codigo)) {
                buscado = e;
            }
        }
        return buscado;
    }


    private void mostrarParaBorrar() {
        for (Electrodomestico e : inventario) {
            System.out.println("Codigo: " + e.getCodigo() + " Modelo: " + e.getModelo() + " Descripción: " + e.getDescripcion());
        }
    }

    private void venderElectrodomestico() {
        mostrarParaVender();
        String codigo = Utils.recogerTeclado("Digite código: ");

        for (Electrodomestico electro : inventario) {
            if (electro.getCodigo().equals(codigo)) {
                int cantidad = Utils.recogerTecladoNum("Digite la cantidad que quiere vender: ");

                if (cantidad <= electro.getStock()) {
                    electro.setStock(electro.getStock() - cantidad);
                    System.out.println("Se han vendido " + cantidad + " de " + electro.getModelo() + " " + electro.getDescripcion());
                    System.out.println("Ahora quedan " + electro.getStock());
                } else {
                    System.out.println("No hay cantidad suficiente.");
                }
                iniciar();// Salir del método después de vender el electrodoméstico
            }
        }

        System.out.println("El código no existe, no se pudo vender");
        iniciar();
    }


    private void mostrarParaVender() {
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-15s | %-15s | %-5s | %-10s | %-10s | %-12s |\n",
                "Código", "Descripción", "Fabricante", "Modelo", "Stock", "Precio", "Peso", "Precio Final");
        System.out.println("-----------------------------------------------------------------------------------------------");

        for (Electrodomestico e : inventario) {
            if (e instanceof ElectrodomesticoGrande) {
                ElectrodomesticoGrande eg = (ElectrodomesticoGrande) e;
                System.out.printf("| %-10s | %-20s | %-15s | %-15s | %-5d | %-10.2f | %-10.2f | %-12.2f |\n",
                        eg.getCodigo(), eg.getDescripcion(), eg.getFabricante(), eg.getModelo(), eg.getStock(), eg.getPrecioUnitario(), eg.getPeso(), eg.getPrecioFinal());
            } else if (e instanceof ElectrodomesticoSmoll) {
                ElectrodomesticoSmoll es = (ElectrodomesticoSmoll) e;
                System.out.printf("| %-10s | %-20s | %-15s | %-15s | %-5d | %-10.2f | %-10s | %-12.2f |\n",
                        es.getCodigo(), es.getDescripcion(), es.getFabricante(), es.getModelo(), es.getStock(), es.getPrecioUnitario(), "", es.getPrecioFinal());
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    private int selecElectrodomestico() {
        Menus.menuClasesElectrodomestico();
        int seleccion = 0;
        do {
            seleccion = Utils.recogerTecladoNum("Seleccione un número: ");
        } while (seleccion < 1 || seleccion > 3);
        return seleccion;
    }

    private void addElectrodomestico() {
        int seleccion = selecElectrodomestico();
        switch (seleccion) {
            case 1:
                creacionElectrodomesticoSmol();
                break;
            case 2:
                creacionElectrodomesticoGrande();
                break;
            case 3:
            default:
                iniciar();
        }
    }

    private void creacionElectrodomesticoGrande() {
        ElectrodomesticoGrande electroGrande = CreacionElectrodomestico.crearGrande();
        boolean repetido = false;
        for (Electrodomestico e : inventario) {
            if (e.equals(electroGrande)) {
                repetido = true;
            }
        }
        if (!repetido) {
            System.out.println("Se ha añadido: " + electroGrande);
            inventario.add(electroGrande);
        } else {
            System.out.println("Ya hay un electrodomestico con ese código");
            System.out.println("Vuelva a intentarlo de nuevo");
        }
        iniciar();
    }

    private void creacionElectrodomesticoSmol() {
        ElectrodomesticoSmoll electroSmoll = CreacionElectrodomestico.crearSmoll();
        boolean repetido = false;
        for (Electrodomestico e : inventario) {
            if (e.equals(electroSmoll)) {
                repetido = true;
            }
        }
        if (!repetido) {
            System.out.println("Se ha añadido: " + electroSmoll);
            inventario.add(electroSmoll);
        } else {
            System.out.println("Ya hay un electrodomestico con ese código");
            System.out.println("Vuelva a intentarlo de nuevo");
        }
        iniciar();
    }

    private void guardarEnArchivoBinario() {
        String escritorioPath = System.getProperty("user.home") + "/Desktop/";
        String nombreArchivo = "tienda_data.bin";
        String rutaCompleta = escritorioPath + nombreArchivo;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaCompleta))) {
            oos.writeObject(inventario);
            System.out.println("Datos de la tienda guardados en: " + rutaCompleta);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos de la tienda en el archivo binario.");
            e.printStackTrace();
        }
    }

    private void cargarDesdeArchivoBinario() {
        String escritorioPath = System.getProperty("user.home") + "/Desktop/";
        String nombreArchivo = "tienda_data.bin";
        String rutaCompleta = escritorioPath + nombreArchivo;

        File file = new File(rutaCompleta);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaCompleta))) {
                inventario = (ArrayList<Electrodomestico>) ois.readObject();
                System.out.println("Datos de la tienda cargados desde: " + rutaCompleta);
            } catch (IOException e) {
                System.out.println("Error de E/S al cargar los datos de la tienda desde el archivo binario.");
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("Clase no encontrada al cargar los datos de la tienda desde el archivo binario.");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error inesperado al cargar los datos de la tienda desde el archivo binario.");
                e.printStackTrace();
            }
        } else {
            System.out.println("No se encontró ningún archivo de datos de la tienda.");
        }
    }

}
