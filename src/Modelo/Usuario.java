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
    int idUser, edad;
    String nomb;

    public Usuario() {
    }

    public Usuario(int idUser, int edad, String nomb) {
        this.idUser = idUser;
        this.edad = edad;
        this.nomb = nomb;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    @Override
    public String toString() {
        return "Usuario{" + "idUser=" + idUser + ", edad=" + edad + ", nomb=" + nomb + '}';
    }
    
    public Boolean calcularEdad()
    {
        boolean esMayor=false;
        if(edad>=18) esMayor=true;
        return esMayor;
    }
}
