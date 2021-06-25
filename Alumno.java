/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author 52553
 */
public class Alumno extends persona.Persona{
    private int numeroDeCuenta;
    private String Carrera;
    private int semestre;

    public Alumno() {
    }

    public Alumno(int numeroDeCuenta, String Carrera, int semestre) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.Carrera = Carrera;
        this.semestre = semestre;
    }

    public Alumno(int numeroDeCuenta, String Carrera, int semestre, String nombre, int edad, String genero, float altura) {
        super(nombre, edad, genero, altura);
        this.numeroDeCuenta = numeroDeCuenta;
        this.Carrera = Carrera;
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroDeCuenta=" + numeroDeCuenta + ", Carrera=" + Carrera + ", semestre=" + semestre + '}';
    }
    public void estudiar(){
        System.out.println("Esta estudiando");
    }
}
