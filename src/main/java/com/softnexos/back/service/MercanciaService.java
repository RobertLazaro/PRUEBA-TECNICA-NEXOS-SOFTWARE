package com.softnexos.back.service;


import com.softnexos.back.model.Mercancia;

import java.util.List;

public interface MercanciaService {

    public List<Mercancia> findAll();

    public List<Mercancia> findAllByNombre(String nombre_producto);

    public Mercancia save(Mercancia mercancia);

    public void deleteById(Long id_producto);
}
