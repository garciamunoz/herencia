package oop.herencia.interfase;

public interface Robot {

    default void hacerLogica(){
        int numero = 4;
        numero ++;
        System.out.println("el numero es :" + numero);
    }



}
