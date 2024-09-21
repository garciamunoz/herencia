package oop.herencia.subclases;

import oop.herencia.interfase.Robot;
import oop.herencia.padre.Animal;

public class Perro extends Animal implements Robot {

    private String raza;

    //Sobreescribiendo el metodo
    public void sonido(){

        System.out.println(" El sonido es ladrar, el mensaje padre no aparecera");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    public void hacerLogica() {
        System.out.println("Este es un perro robot");
    }
}
