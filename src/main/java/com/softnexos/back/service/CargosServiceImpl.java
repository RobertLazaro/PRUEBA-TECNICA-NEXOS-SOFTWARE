package com.softnexos.back.service;

import com.softnexos.back.model.Cargos;
import com.softnexos.back.repository.CargosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CargosServiceImpl implements CargosService{

    @Autowired
    private CargosRepository cargosRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cargos> findAll() {
        return cargosRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Cargos> findById(int id) {
        return cargosRepository.findById(id);
    }
}
