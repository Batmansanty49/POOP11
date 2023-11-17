/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 * Clase alumno que le da atributos, así como sus respectivos metodos
 * @author Jacinto Robledo Valeria Berenice
 */
public class Alumno {
    private String nombre, apPat, apMat, numCuenta;
    private int edad;
    /**
     * Contructor vacio
     */
    public Alumno() {
    }
    /**
     * Contructor
     * @param nombre El nombre del alumno
     * @param apPat El apellido paterno del alumno
     * @param apMat El apellido materno del alumno
     * @param numCuenta Numero de cuenta del alumno
     * @param edad Edad del alumno
     */
    public Alumno(String nombre, String apPat, String apMat, String numCuenta, int edad) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }
    /**
     * Metodo get del nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo set del nombre
     * @param nombre asigna nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo get del apellido paterno
     * @return apellido paterno
     */
    public String getApPat() {
        return apPat;
    }
    /**
     * Metodo set del apellido paterno
     * @param apPat asigna apellido paterno
     */
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }
    /**
     * Metodo get del apellido materno
     * @return apellido materno
     */
    public String getApMat() {
        return apMat;
    }
    /**
     * Metodo set del apellido materno
     * @param apMat asigna apellido materno
     */
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }
    /**
     * Metodo get del numero de cuenta
     * @return numero de cuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }
    /**
     * Metodo set del numero de cuenta
     * @param numCuenta asigna el numero de cuenta
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * Metodo get de la edad
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Metodo set de la edad
     * @param edad asigna la edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Metodo sobreescribir
     * @return imprime los datos completos de los alumnos 
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apPat=" + apPat + ", apMat=" + apMat + ", numCuenta=" + numCuenta + ", edad=" + edad + '}';
    }
    
    
}
