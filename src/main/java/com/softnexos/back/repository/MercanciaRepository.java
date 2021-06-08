package com.softnexos.back.repository;

import com.softnexos.back.model.Mercancia;
import org.springframework.data.jpa.repository.JpaRepository;

//import java.util.List;

public interface MercanciaRepository extends JpaRepository<Mercancia, Long> {

    //Buscar mercancia por nombre de producto
    //List<Mercancia> findByNombre_producto(String nombre_producto);
}
