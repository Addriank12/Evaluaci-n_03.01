/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Producto;
import java.util.List;

/**
 *
 * @author addri
 */
public interface IProducto
{
    public Producto crear(Producto barco);
    public List<Producto> listar(); 
}
