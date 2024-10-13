/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author user
 */
public class Servicio_transporte {
    private float precio;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private int codigo_vehiculo;
    private String tipo;
    private int codigo_prestador;

    public Servicio_transporte(float precio, String origen, String destino, LocalDate fecha, LocalTime hora, int codigo_vehiculo, String tipo, int codigo_prestador) {
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.codigo_vehiculo = codigo_vehiculo;
        this.tipo = tipo;
        this.codigo_prestador = codigo_prestador;
    }


    
    public Servicio_transporte(float precio, String origen, String destino, LocalDate fecha, LocalTime hora) {
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Servicio_transporte{ precio=" + precio + ", origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
    
    /**
     * @return the codigo
    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public LocalTime getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    /**
     * @return the codigo_vehiculo
     */
    public int getCodigo_vehiculo() {
        return codigo_vehiculo;
    }

    /**
     * @param codigo_vehiculo the codigo_vehiculo to set
     */
    public void setCodigo_vehiculo(int codigo_vehiculo) {
        this.codigo_vehiculo = codigo_vehiculo;
    }

    /**
     * @return the codigo_prestador
     */
    public int getCodigo_prestador() {
        return codigo_prestador;
    }

    /**
     * @param codigo_prestador the codigo_prestador to set
     */
    public void setCodigo_prestador(int codigo_prestador) {
        this.codigo_prestador = codigo_prestador;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
