/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import Servicio.ServicioProducto;
import java.util.List;

/**
 *
 * @author addri
 */
public class ControladorProducto
{
     private final ServicioProducto servicioProducto = new ServicioProducto();
     
    public Producto crear(String [] args){       
        Producto servicioProducto = new Producto(Integer.valueOf(args[0]),args[1],args[2],Double.valueOf(args[3]));
        this.servicioProducto.crear(servicioProducto);
        return servicioProducto;
    }
    
        public List<Producto> listar(){
        return this.servicioProducto.listar();
    }
}
