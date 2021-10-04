/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_6;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author santi
 */
public class Directorio {
HashMap<String,Cliente> directorio;

public Directorio(){
    this.directorio = new HashMap<>();
}

    public HashMap<String, Cliente> getDirectorio() {
        return directorio;
    }

//    public void setDirectorio(HashMap<Long, Cliente> directorio) {
//        this.directorio = directorio;
//    }

  public void agregarCliente(String telefono,String nombre,String apellido,int dni, String ciudad,String direccion){
      directorio.put(telefono, new Cliente(nombre,apellido,dni,ciudad,direccion));
      
      
  }
  public Cliente buscarCliente(String telefono){
      if(telefono != null){
          if(directorio.containsKey(telefono)){
              return directorio.get(telefono);
              
          }else {
             
              System.out.println("El cliente solicitado no existe");
         return null;
          }
  }else{
          System.out.println("ingrese numero de telefono");
      return null;
      }
}
   public ArrayList<String> buscarTelefonos(String apellido){
     ArrayList<String> telefonos = new ArrayList<>();
   Set<String> claves = directorio.keySet();
   for(String key:claves){
       if(directorio.get(key).getApellido().equals(apellido)){
           telefonos.add(key);
       }
       
   }
    return telefonos;
  }

 public ArrayList<Cliente> buscarClientes(String ciudad){
     ArrayList<Cliente> clientes = new ArrayList<>();
     Collection valores = directorio.values();
     Iterator it = valores.iterator();
     while(it.hasNext()){
         Cliente valor = (Cliente)it.next();
         if(valor.getCiudad().equals(ciudad)){
             clientes.add(valor);
         }
     }
     return clientes;
 }
 public void borrarCliente(int dni){
     Set <String> tel = directorio.keySet();
     Iterator it= tel.iterator();
     while(it.hasNext()){
         String telefono = (String)it.next();
         Cliente c = directorio.get(telefono);
         if(c.getDni()==dni){
             directorio.remove(telefono);
         }
     }

 }
}
