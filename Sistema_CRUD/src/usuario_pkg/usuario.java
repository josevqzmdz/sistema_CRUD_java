/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario_pkg;

/**
 *
 * @author royer
 * https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
 * 
 * Abstract classes are similar to interfaces. You cannot instantiate them,
 * and they may contain a mix of methods declared with or without an 
 * implementation. However, with abstract classes, you can declare fields 
 * that are not static and final, and define public, protected, and private
 * concrete methods. With interfaces, all fields are automatically public, 
 * static, and final, and all methods that you declare or define 
 * (as default methods) are public. In addition, you can extend only one class, 
 * whether or not it is abstract, whereas you can implement any number of 
 * interfaces.
 */
public abstract class usuario {
    String nombre, ID, contrasena = null;
    
    // metodos get/set generados automaticamente con alt + ins
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
