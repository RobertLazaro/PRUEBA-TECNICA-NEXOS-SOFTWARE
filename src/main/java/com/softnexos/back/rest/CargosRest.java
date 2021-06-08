package com.softnexos.back.rest;

import com.softnexos.back.model.Cargos;
import com.softnexos.back.service.CargosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cargos/")
public class CargosRest {

    @Autowired
    private CargosService cargosService;

    @GetMapping
    public ResponseEntity<List<Cargos>> getAllCargos (){
        return ResponseEntity.ok(cargosService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> read(@PathVariable Integer id) {
        Optional<Cargos> oCargos = cargosService.findById(id);

        if(!oCargos.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oCargos);
    }

}
