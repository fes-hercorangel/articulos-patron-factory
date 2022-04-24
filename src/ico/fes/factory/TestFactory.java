/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory;

import java.util.Scanner;

/**
 *
 * @author ahc
 */
public class TestFactory {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("Menu Articulos");
        System.out.println(Articulo.LENOVO_LEG + " Computadora lenovo legion");
        System.out.println(Articulo.DELL_XPS + " Computadora Dell xps");
        System.out.println(Articulo.SAMSUNG_GAL + " Smartphone Samsung galaxy");
        System.out.println(Articulo.APPLE_IP13 + " Smartphone Apple Iphone 13");
        System.out.println(Articulo.SAMSUNG_GALT + " Tablet Samsung galaxy tab");
        System.out.println(Articulo.APPLE_IPD + " Tablet Apple ipad");
        
        try {
            System.out.print("elige una opcion: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("no capturaste numero");
        }
        
        Articulo articulo = ArticuloFactory.createArticulo(eleccion);
        System.out.println(articulo.toString());
    }
}
