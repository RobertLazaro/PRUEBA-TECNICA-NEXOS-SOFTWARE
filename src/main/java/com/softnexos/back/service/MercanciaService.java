package com.softnexos.back.service;


import com.softnexos.back.model.Cargos;
import com.softnexos.back.model.Mercancia;

import java.util.List;
import java.util.Optional;

public interface MercanciaService {

    public List<Mercancia> findAll();

    //List<Mercancia> buscarPorNombre_producto(String nombre_producto);

    public Mercancia save(Mercancia mercancia);

    public void deleteById(Long id_producto);

    public Optional<Mercancia> findById(Long id_producto);
}
