/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Metodo_Articulo;
import vista.FRM_VentanaCliente;

/**
 *
 * @author 3rika
 */
public class Controlador_VentanaArticulo implements ActionListener{
    
    public Metodo_Articulo metodoArticulo;
    FRM_VentanaCliente frm_Ventana;
    
    public Controlador_VentanaArticulo(FRM_VentanaCliente frm_Ventana)
    {
        metodoArticulo = new Metodo_Articulo();
        this.frm_Ventana = frm_Ventana;
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("AGREGAR"))
        {
            metodoArticulo.agregarArticulo(frm_Ventana.devolverInformacion());
            frm_Ventana.mostrarMensaje("El articulo fue agregado correctamente");
            frm_Ventana.resetearGUI();
        }
        if(e.getActionCommand().equals("BUSCAR"))
        {
            buscar();
        }
        if(e.getActionCommand().equals("MODIFICAR"))
        {
            metodoArticulo.modificarArticulo(frm_Ventana.devolverInformacion());
            frm_Ventana.mostrarMensaje("El articulo fue modificado de forma correcta.");
            frm_Ventana.resetearGUI();
        }
        if(e.getActionCommand().equals("ELIMINAR"))
        {
            metodoArticulo.eliminarArticulo(frm_Ventana.devolverInformacion());
            frm_Ventana.mostrarMensaje("El articulo fue eliminado de forma correcta.");
            frm_Ventana.resetearGUI();
        }
        if(e.getActionCommand().equals("Busqueda general"))
        {
            buscarArticulo();
        }
    }
    
    public void buscar()
    {
        if(metodoArticulo.consultarArticulo(frm_Ventana.devolverCodigo()))
        {
            frm_Ventana.mostrarInformacion(metodoArticulo.getArregloInformacion());
            frm_Ventana.habilitarEdicion();
        }
        else
        {
            frm_Ventana.mostrarMensaje("La articulo buscada no se encuentra.");
            frm_Ventana.habilitarAgregar();
        }
        
    }
    public void buscarArticulo()
    {
        if(metodoArticulo.consultarRegistro() == true)
        {
            frm_Ventana.mostrarInformacionRegistro(metodoArticulo.mostrarInformacionRegistro());
        }
        else
        {
            frm_Ventana.mostrarInformacionRegistro("---> Registro de articulo vacio!");
        }
    }
}
