package com.softnexos.back.service;

import com.softnexos.back.repository.CargosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargosService {

    @Autowired
    private CargosRepository cargosRepository;
}
