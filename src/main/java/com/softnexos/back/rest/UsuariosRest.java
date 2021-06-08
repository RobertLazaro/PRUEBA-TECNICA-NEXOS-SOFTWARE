package com.softnexos.back.rest;

import com.softnexos.back.model.Cargos;
import com.softnexos.back.model.Usuarios;
import com.softnexos.back.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios/")
public class UsuariosRest {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping
    public ResponseEntity<List<Usuarios>> getAllUsuarios (){
        return ResponseEntity.ok(usuariosService.findAll());
    }

    @GetMapping("{nombre}")
    public ResponseEntity<?> read(@PathVariable String nombre) {
        Optional<Usuarios> oUsuarios = usuariosService.findByNombre(nombre);

        if(!oUsuarios.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oUsuarios);
    }

}
