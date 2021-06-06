package com.softnexos.back.service;

import com.softnexos.back.model.Usuarios;
import com.softnexos.back.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuariosService{

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Usuarios> findAll() {
        return usuariosRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Usuarios> findByNombre(String nombre) {
        return usuariosRepository.findById(nombre);
    }
}
