/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author LENOVO
 */
import java.util.Date;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.I;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String Cedula;
    private String nombre1;

    private String apellido1;

    private String telefono;
    private String correo;
    private int edad;
    
    public Persona(){
        
    }

    public Persona(String Cedula, String nombre1, String nombre2, String apellido1, String apellio2, String telefono, String correo, int edad) {
        this.Cedula = Cedula;
        this.nombre1 = nombre1;

        this.apellido1 = apellido1;

        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }


    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre1() {
        return nombre1;
    }



    public String getApellido1() {
        return apellido1;
    }


    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }
    
    @Override
    public String toString() {
        return "los datos de la persona son:\n"
                +"Cedula: "+getCedula()+"\n"
                + "Nombre1: "+getNombre1()+"\n"
                +"Apellido1: "+getApellido1()+"\n"
                +"Telefono: "+getTelefono()+"\n"
                +"Correo: "+getCorreo()+"\n"
                +"Edad: "+getEdad()+"\n";
                
                }
  
        
    }
