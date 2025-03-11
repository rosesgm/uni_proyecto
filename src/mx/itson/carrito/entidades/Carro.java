/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

import mx.itson.carrito.enums.CategoriaAuto;
import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author alumnog
 */
public class Carro {

    /**
     * @return the servicio
     */
    public Servicio getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    /**
     * @return the propietario
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the categoriaAuto
     */
    public CategoriaAuto getCategoriaAuto() {
        return categoriaAuto;
    }

    /**
     * @param categoriaAuto the categoriaAuto to set
     */
    public void setCategoriaAuto(CategoriaAuto categoriaAuto) {
        this.categoriaAuto = categoriaAuto;
    }

    /**
     * @return the tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the kilometraje
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
   private String color;
   private int anio;
   private String marca;
   private double kilometraje;
   private TipoMotor tipoMotor;
   private CategoriaAuto categoriaAuto;
   private Propietario propietario;
   private Servicio servicio;
   
   /**
    * Calcula el tiempo en el que tarda  el carro en recorrer una distancia.
    * @param distancia Distancia que recorrerá el carro.
    * @param velocidad Velocidad en la que viaja el carro.
    * @return El tiempo en el que reccorre 'x' distancia.
    */
   public double calcularTiempo(double distancia, double velocidad){
       this.kilometraje += distancia;
       // La linea de arriba es lo mismo que la linea de abajo 
       //this.kilometraje = this.kilometraje + distancia;
       
       double tiempo=distancia/velocidad;
       return tiempo;
   }
   
}
