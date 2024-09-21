package oop.herencia.subclases;

import oop.herencia.interfase.Robot;
import oop.herencia.padre.Animal;

public class Gato extends Animal implements Robot {

    private String color;

    public void sonido(){
        super.sonido();
        //logica de la subclase
        System.out.println(" maullar ");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }





}
