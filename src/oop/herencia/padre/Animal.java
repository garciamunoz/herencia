package oop.herencia.padre;

public class Animal {

    // Esta es la clase padre, o super clase

    private String nombre;
    private String especie;

    //Metodo a heredar
    public void sonido(){
        System.out.println(" El sonido que emite el animal es :");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
