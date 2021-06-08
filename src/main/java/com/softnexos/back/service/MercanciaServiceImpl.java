package com.softnexos.back.service;

import com.softnexos.back.model.Cargos;
import com.softnexos.back.model.Mercancia;
import com.softnexos.back.model.Usuarios;
import com.softnexos.back.repository.MercanciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MercanciaServiceImpl implements MercanciaService{

    @Autowired
    private MercanciaRepository mercanciaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Mercancia> findAll() {
        return mercanciaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Mercancia> findById(Long id_producto) {
        return mercanciaRepository.findById(id_producto);
    }

    /*@Override
    public List<Mercancia> buscarPorNombre_producto(String nombre_producto) {
        return mercanciaRepository.findByNombre_producto(nombre_producto);
    }*/

    @Override
    @Transactional
    public Mercancia save(Mercancia mercancia) {
        return mercanciaRepository.save(mercancia);
    }

    @Override
    @Transactional
    public void deleteById(Long id_producto) {
        mercanciaRepository.deleteById(id_producto);
    }
}
