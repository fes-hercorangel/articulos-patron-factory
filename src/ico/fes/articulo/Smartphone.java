/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.articulo;

import ico.fes.factory.Articulo;

/**
 *
 * @author ahc
 */
public class Smartphone implements Articulo {
    private String marca;
    private String modelo;
    private String pantalla;
    private String almacenamiento;

    public Smartphone(String marca, String modelo, String pantalla, String almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", modelo=" + modelo + ", pantalla=" + pantalla + ", almacenamiento=" + almacenamiento + '}';
    }
    
}
