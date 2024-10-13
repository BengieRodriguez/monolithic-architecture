/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author user
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String color;
    private String modelo;
    private int capacidad;
    private String condicion;
    private int codigoPrestador;

    public Vehiculo(String  matricula, String marca, String color, String modelo, int capacidad, String condicion, int codigoPrestador) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.condicion = condicion;
        this.codigoPrestador = codigoPrestador;
    }

    @Override
    public String toString() {
        return "Vehiculo{ matricula=" + matricula + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", capacidad=" + capacidad + ", condicion=" + condicion + ", codigoPrestador=" + codigoPrestador + '}';
    }
    
    /**
    /**
     * @return the matricula
     */
    public String  getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String  matricula) {
        this.matricula = matricula;
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
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the condicion
     */
    public String getCondicion() {
        return condicion;
    }

    /**
     * @param condicion the condicion to set
     */
    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    /**
     * @return the codigoPrestador
     */
    public int getCodigoPrestador() {
        return codigoPrestador;
    }

    /**
     * @param codigoPrestador the codigoPrestador to set
     */
    public void setCodigoPrestador(int codigoPrestador) {
        this.codigoPrestador = codigoPrestador;
    }


}
