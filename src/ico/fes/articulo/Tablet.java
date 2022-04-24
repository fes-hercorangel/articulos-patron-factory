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
public class Tablet implements Articulo {
    private String marca;
    private String modelo;
    private String almacenamiento;
    private String pantalla;

    public Tablet(String marca, String modelo, String almacenamiento, String pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.pantalla = pantalla;
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

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ", modelo=" + modelo + ", almacenamiento=" + almacenamiento + ", pantalla=" + pantalla + '}';
    }
    
}
