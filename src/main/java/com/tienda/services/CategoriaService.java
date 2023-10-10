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
    
    
}
