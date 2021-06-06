package com.softnexos.back.service;

import com.softnexos.back.model.Cargos;

import java.util.List;
import java.util.Optional;

public interface CargosService{

    public List<Cargos> findAll();

    public Optional<Cargos> findById(int id);

}
