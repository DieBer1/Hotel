/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Modelo.Alquiler;
import Vista.Vista;
/**
 *
 * @author estudiante
 */
public class Servicios 
{
    public void Alquilar(Alquiler alquiler)
    {
        try
        {
            UsuarioServicios us = new UsuarioServicios();
            us.guardar(Conexion.obtener(), alquiler.getUsuario);
        } catch(Exception e){}
    }
    public void obtener(Vista vista)
    {
        String nombre = vista.nomTxfield.getText();
        String identificacion = docTxfield.getText();
        String id = identificacion.substring(identificacion.length()-4, identificacion.length());
        String edad = edad = edadTxfield.getText();
    }
}
