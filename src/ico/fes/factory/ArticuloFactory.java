/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory;

import ico.fes.articulo.Computadora;
import ico.fes.articulo.Smartphone;
import ico.fes.articulo.Tablet;

/**
 *
 * @author ahc
 */
public class ArticuloFactory {

    public static Articulo createArticulo(int tipo) {
        switch (tipo) {
            case Articulo.LENOVO_LEG:
                return new Computadora("Lenovo", "Legion", true, "1TB", "16");
            case Articulo.DELL_XPS:
                return new Computadora("Dell", "XPS", true, "500GB", "14");
            case Articulo.SAMSUNG_GAL:
                return new Smartphone("Samsung", "Galaxy", "6.8", "256GB");
            case Articulo.APPLE_IP13:
                return new Smartphone("Apple", "Iphone 13", "6.1", "256GB");
            case Articulo.SAMSUNG_GALT:
                return new Tablet("Samsung", "Galaxy tab", "128GB", "11");
            case Articulo.APPLE_IPD:
                return new Tablet("Apple", "Ipad", "128GB", "11");
            default:
                throw new AssertionError();
        }
    }
}
