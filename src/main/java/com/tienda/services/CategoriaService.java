/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;


import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author ricar
 */
public interface CategoriaService {
    
    //Se propone la firma de un metodo para
    //recuperar los registros de la tabla categoria
    
    public List<Categoria> getCategorias(Boolean activo);
    
    //Se programa el codigo para obtener una categoria
    
    public Categoria getCategoria (Categoria categoria);
    
    // Se actualiza o se crea un registro que tenga el mismo idCategoria
    
    //Si el objeto tiene un idCategoria, lo busca... si lo encuentra
    //lo actualiza si no.. lo crea..
    
    public void save(Categoria categoria);
    
    //Se elimina el registro que tenga el idCategoria pasado por parametro
    
    public void delete(Categoria categoria);
    
    
    
    
    
}
