package com.softnexos.back.service;

import com.softnexos.back.repository.MercanciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MercanciaService {

    @Autowired
    private MercanciaRepository mercanciaRepository;
}
