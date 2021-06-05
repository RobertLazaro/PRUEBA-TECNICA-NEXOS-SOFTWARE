package com.softnexos.back.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table (name = "mercancia")
public class Mercancia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_producto;

    private String nombre_producto;

    private int cantidad;

    private Date fecha_ingreso;

    @ManyToOne
    @JoinColumn(name = "nombre_usuario")
    private Usuarios usuario_registro;

    public Mercancia(String nombre_producto, int cantidad, Date fecha_ingreso, Usuarios usuario_registro) {
        this.nombre_producto = nombre_producto;
        this.cantidad = cantidad;
        this.fecha_ingreso = fecha_ingreso;
        this.usuario_registro = usuario_registro;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Usuarios getUsuario_registro() {
        return usuario_registro;
    }

    public void setUsuario_registro(Usuarios usuario_registro) {
        this.usuario_registro = usuario_registro;
    }
}