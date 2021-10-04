/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_6;

/**
 *
 * @author santi
 */
public class Cliente {
   private  String nombre;
   private  String apellido;
   private  int dni;
   private String ciudad;
   String direccion;

    public Cliente(String nombre, String apellido, int dni, String ciudad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }

    



 
   
   
   
}
