/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Habitacion 
{
    String tipo;
    int numHabitacion, fechaAlq;

    public Habitacion() {
    }

    public Habitacion(String tipo, int numHabitacion, int fechaAlq) {
        this.tipo = tipo;
        this.numHabitacion = numHabitacion;
        this.fechaAlq = fechaAlq;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(int fechaAlq) {
        this.fechaAlq = fechaAlq;
    }
    
    
}
