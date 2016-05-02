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
public class Calculadora {
    Persona persona=new Persona();
            int peso = persona. getPeso();
            double est = persona.getEstatura();
            int edad = persona.getEdad();
            double act = persona.getActividadDiaria();
    /*
    formula: Hombres  [66 + (13.7 x Peso kg) ] + [ (5 x Altura cm) – (6.8 x Edad)] x Factor actividad
             Mujeres  [655 + (9.6 x Peso kg) ] + [ (1.8 x Altura cm) – (4.7 x Edad)] x Factor actividad
    */
    public double calcularCalorias(){
        double caloriasDiarias = 0;
        if (persona.isSexo()) {
            //Hombres
            return caloriasDiarias = (66+(13.7*peso))+ ((5*est)-(6.8*edad))*act;
        } else {
            //mujer
            return caloriasDiarias = (655+(9.6*peso))+ ((1.8*est)-(4.7*edad))*act;
        }
    } 
    public double calcularIMC(){
        double imc = 0;
        return imc = (peso)/(est/100);
    }
}

