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
public class Usuario 
{
    int  edad;
    String nomb, id, identificacion;

    public Usuario() {
    }

    public Usuario(int edad, String nomb, String id, String identificacion) {
        this.edad = edad;
        this.nomb = nomb;
        this.id = id;
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "idUser=" + id + ", edad=" + edad + ", nomb=" + nomb + '}';
    }
    
    public Boolean calcularEdad()
    {
        boolean esMayor=false;
        if(edad>=18) esMayor=true;
        return esMayor;
    }
}
