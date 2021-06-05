package com.softnexos.back.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    private String nombre;

    private int edad;

    private Date fecha_ingreso_compañia;

    @ManyToOne
    @JoinColumn(name = "cargo_usuario")
    private Cargos cargo;

    public Usuarios(String nombre, int edad, Date fecha_ingreso_compañia, Cargos cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.fecha_ingreso_compañia = fecha_ingreso_compañia;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha_ingreso_compañia() {
        return fecha_ingreso_compañia;
    }

    public void setFecha_ingreso_compañia(Date fecha_ingreso_compañia) {
        this.fecha_ingreso_compañia = fecha_ingreso_compañia;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }
}
