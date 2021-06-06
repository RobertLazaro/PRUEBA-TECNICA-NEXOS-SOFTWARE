package com.softnexos.back.rest;

import com.softnexos.back.model.Mercancia;
import com.softnexos.back.service.MercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/mercancia/")
public class MercanciaRest {

    @Autowired
    private MercanciaService mercanciaService;

    @GetMapping("{nombre_producto}")
    public ResponseEntity<List<Mercancia>> getAllByNombre(@PathVariable("nombre_producto") String nombre_producto) {
        return ResponseEntity.ok(mercanciaService.findAllByNombre(nombre_producto));
    }

    @GetMapping
    public ResponseEntity<List<Mercancia>> getAllMercancia (){
        return ResponseEntity.ok(mercanciaService.findAll());
    }

    @PostMapping
    public ResponseEntity<Mercancia> saveMercancia (@RequestBody Mercancia mercancia) {

        try{
            Mercancia mercanciaRegistrada = mercanciaService.save(mercancia);
            return ResponseEntity.created(new URI("/mercancia/"+mercanciaRegistrada.getId_producto())).body(mercanciaRegistrada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


}
