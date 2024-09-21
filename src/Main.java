import oop.herencia.abstracto.Estudiante;
import oop.herencia.abstracto.Persona;
import oop.herencia.interfase.TarjetasService;
import oop.herencia.interfase.impl.TarjetasServiceImpl;
import oop.herencia.model.Tarjeta;
import oop.herencia.padre.Animal;
import oop.herencia.subclases.Gato;
import oop.herencia.subclases.Perro;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static TarjetasService tarjetasService = new TarjetasServiceImpl();

    public static void main(String[] args) {
        // Instanciamos
        /*Animal a = new Animal();
        //a.sonido();
        Perro scrappy = new Perro();
        scrappy.setNombre("Scrappy");
        scrappy.setEspecie("Perro");
        //metodo propio de la subclase
        scrappy.setRaza("Cocker");

        //scrappy.sonido();
        Gato garfield = new Gato();
        garfield.setColor("Anaranjado");

        //ejemplo de polimorfismo sin interfaces
        Animal fido = new Perro();
        fido.setNombre("Fido");
        //Perro rayo  = new Animal();
        Animal tom = new Gato();
        Gato g = (Gato)tom;
        g.setColor("Blanco");
        //System.out.println("El color "+g.getColor());
        tom.setNombre("tom");
        //tom.sonido();


        List<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(scrappy);
        listaAnimales.add(garfield);

        Gato cat = new Gato();
        cat.setColor("anaranjado");
        cat.setEspecie("gato");
        cat.setNombre("Gato Robot");
        System.out.println("Nombre del gato es "+cat.getNombre());
        cat.hacerLogica();*/
        System.out.println("Este es nuestro controlador");
       //this.tarjetasService = new TarjetasServiceImpl();
       /*List<Tarjeta> listaTarjetas = tarjetasService.listarTarjetaPorTipo("B");
        for(Tarjeta tarjeta: listaTarjetas){
            System.out.println("Numero de tarjeta es "+ tarjeta.getNumero());
            System.out.println("Tipo de tarjeta es "+ tarjeta.getTipo());

        }*/


    }
}