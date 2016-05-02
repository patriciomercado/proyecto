/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthyplan;

/**
 *
 * @author patricio mercado
 */
public class Persona {
    private String nombre;
    private boolean sexo;
    private int estatura;
    private int edad;
    private int peso;
    private double actividadDiaria;
    /* 
    1)sedentarias (1,2)
    2)ligera (1,375)
    3)moderada (1,55)
    4)intensa (1,725)
    5)extrema (1,9)
    
    */

    public Persona() {
    }

    public Persona(int actividadDiaria) {
        if (actividadDiaria == 1) {
            this.actividadDiaria = 1.2;
        }
        if (actividadDiaria == 2) {
            this.actividadDiaria = 1.375;
        }
        if (actividadDiaria == 3) {
            this.actividadDiaria = 1.55;
        }
        if (actividadDiaria == 4) {
            this.actividadDiaria = 1.725;
        }
        if (actividadDiaria == 5) {
            this.actividadDiaria = 1.9;
        }
    }
    
    public Persona(String nombre, boolean sexo, int estatura, int edad, int peso) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.estatura = estatura;
        this.edad = edad;
        this.peso = peso;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setActividadDiaria(int actividadDiaria) {
        this.actividadDiaria = actividadDiaria;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isSexo() {
        return sexo;
    }

    public int getEstatura() {
        return estatura;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setActividadDiaria(double actividadDiaria) {
        this.actividadDiaria = actividadDiaria;
    }

    public double getActividadDiaria() {
        return actividadDiaria;
    }

    
}
