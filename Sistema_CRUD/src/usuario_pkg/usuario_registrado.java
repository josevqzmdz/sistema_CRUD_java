/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario_pkg;

/**
 *
 * clase para guardar los valores registrados del usuario
 */
public class usuario_registrado extends usuario {
    
    public usuario_registrado(String nombre, String ID, String contrasena){
        this.nombre = nombre;
        this.ID = ID;
        this.contrasena = contrasena;
    }
}
