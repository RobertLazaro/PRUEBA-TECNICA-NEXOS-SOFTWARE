package com.softnexos.back.rest;

import com.softnexos.back.model.Mercancia;
import com.softnexos.back.model.Usuarios;
import com.softnexos.back.service.MercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mercancia/")
public class MercanciaRest {

    @Autowired
    private MercanciaService mercanciaService;

    /*@GetMapping("{nombre_producto}")
    public String buscarPorNombre_producto(@RequestParam String nombre_producto, Model model, @ModelAttribute("producto") Mercancia mercancia) {
        model.addAttribute("productosNombre", mercanciaService.buscarPorNombre_producto(nombre_producto));
        return ;
    }*/


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

    @DeleteMapping(value = "delete/{id_producto}")
    public ResponseEntity<Boolean> deleteMercancia (@PathVariable ("id_producto") Long id_producto){
        mercanciaService.deleteById(id_producto);
        return ResponseEntity.ok(!(mercanciaService.findById(id_producto)!=null));
    }


}
