package oop.herencia.interfase;

import oop.herencia.model.Tarjeta;

import java.util.List;

public interface TarjetasService {

    public List<Tarjeta> listarTarjetaPorTipo(String tipo);

}
