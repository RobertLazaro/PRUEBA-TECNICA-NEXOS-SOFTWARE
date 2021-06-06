package com.softnexos.back.service;

import com.softnexos.back.model.Usuarios;

import java.util.List;
import java.util.Optional;

public interface UsuariosService {

    public List<Usuarios> findAll();

    public Optional<Usuarios> findByNombre(String nombre);


}
