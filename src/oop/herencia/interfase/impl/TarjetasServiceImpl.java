package oop.herencia.interfase.impl;

import oop.herencia.interfase.TarjetasService;
import oop.herencia.model.Tarjeta;

import java.util.ArrayList;
import java.util.List;

public class TarjetasServiceImpl implements TarjetasService {

    public List<Tarjeta> listarTarjetaPorTipo(String tipo) {
        List<Tarjeta> lista = llenarTarjetas();
        lista.removeIf(t -> !t.getTipo().equals(tipo));

        return lista;
    }

    private List<Tarjeta> llenarTarjetas(){
        List<Tarjeta> l = new ArrayList<>();
        Tarjeta t = new Tarjeta();
        t.setNumero("13211114");
        t.setTipo("A");
        t.setFechaVencimiento("24/08/2024");

        Tarjeta t2 = new Tarjeta();
        t2.setNumero("13211116");
        t2.setTipo("A");
        t2.setFechaVencimiento("24/08/2024");

        Tarjeta t3 = new Tarjeta();
        t3.setNumero("13211117");
        t3.setTipo("B");
        t3.setFechaVencimiento("24/08/2024");

        l.add(t);
        l.add(t2);
        l.add(t3);
        return l;
    }
}
