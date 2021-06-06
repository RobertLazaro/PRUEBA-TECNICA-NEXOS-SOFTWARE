package com.softnexos.back.service;

import com.softnexos.back.model.Mercancia;
import com.softnexos.back.model.Usuarios;
import com.softnexos.back.repository.MercanciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MercanciaServiceImpl implements MercanciaService{

    @Autowired
    private MercanciaRepository mercanciaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Mercancia> findAll() {
        return mercanciaRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Mercancia> findAllByNombre(String nombre_producto) {
        List<Mercancia> mercanciasRespuesta = new ArrayList<>();
        List<Mercancia> mercancias = mercanciaRepository.findAll();
        for(int i=0; i<mercancias.size(); i++) {
            if(mercancias.get(i).getNombre_producto()==nombre_producto) {
                mercanciasRespuesta.add(mercancias.get(i));
            }
        }
        return mercanciasRespuesta;
    }

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
