/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity

@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVerionUID = 1l;

    public Producto() {
    }

    public Producto(String descripcion, String detalle, double precio, int existencias, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")

    private Long idProducto;
    private Long idCategoria;
    private String descripcion;
    private String detalle;
    public double precio;
    public int existencias;
    private String rutaImagen;
    private boolean activo;

    

}
