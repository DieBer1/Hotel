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
public class Alquiler 
{
    String idUsuario, hab, fechaAlq;

    public Alquiler() {
    }

    public Alquiler(String idUsuario, String hab, String fechaAlq) {
        this.idUsuario = idUsuario;
        this.hab = hab;
        this.fechaAlq = fechaAlq;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getHab() {
        return hab;
    }

    public void setHab(String hab) {
        this.hab = hab;
    }

    public String getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(String fechaAlq) {
        this.fechaAlq = fechaAlq;
    }
    
    
}
