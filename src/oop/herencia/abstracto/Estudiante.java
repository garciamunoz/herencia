package oop.herencia.abstracto;


//protected
public class Estudiante extends Persona {


    public void estudiar() {
        System.out.println("Estudia ingenieria");
    }

    public void dormir(){
        super.dormir();
        System.out.println("dormir sobreescrito");
    }
}
