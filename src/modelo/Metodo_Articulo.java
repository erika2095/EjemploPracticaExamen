/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 3rika
 */
public class Metodo_Articulo {

    private ArrayList <Articulo> arrayArticulo;
    String arregloInformacionConsultada[] = new String[2];
    
    public Metodo_Articulo()
    {
        arrayArticulo = new ArrayList <Articulo>();
        
        // SE PUEDE INCLUIR LA INFO POR DEFECTO
    }
    
    public void agregarArticulo(String informacion[])
    {
        Articulo temporal = new Articulo(informacion[0], informacion[1], Integer.parseInt(informacion[2]));
        arrayArticulo.add(temporal);
    }
    
    public void mostrarInformacion()
    {
        for(int contador = 0; contador < arrayArticulo.size(); contador++)
        {
            JOptionPane.showMessageDialog(null, arrayArticulo.get(contador).getInformacionArticulo());
        }
    }
    
    public boolean consultarArticulo(String codigo)
    {
        boolean existe = false;
        
        for(int contador = 0; contador< arrayArticulo.size(); contador++)
        {
            if(arrayArticulo.get(contador).getCodigo().equals(codigo))
            {
                arregloInformacionConsultada[0] = arrayArticulo.get(contador).getArticulo();
                arregloInformacionConsultada[1] = ""+arrayArticulo.get(contador).getCantidad();
            }
        }
        return existe;
    }
    
    public void modificarArticulo(String arreglo[])
    {
        for(int contador=0;contador<arrayArticulo.size();contador++)
        {
            if(arrayArticulo.get(contador).getCodigo().equals(arreglo[0]))
            {
                arrayArticulo.get(contador).setArticulo(arreglo[1]);
                arrayArticulo.get(contador).setCantidad(Integer.parseInt(arreglo[2]));
            }
        }
    }
    
    public void eliminarArticulo(String arreglo[])
    {
        for(int contador=0; contador<arrayArticulo.size();contador++)
        {
            arrayArticulo.remove(contador);
        }
    }
    public boolean consultarRegistro()
    {
        boolean existe=false;
        for(int i = 0; i < arrayArticulo.size(); i++)
        {
            if(arrayArticulo.get(i) != null)
            {
                existe=true;
            }
        }
        return existe;
    }
    
    public String mostrarInformacionRegistro()
    {
        String imprimir = "";
        for(int contador=0; contador<arrayArticulo.size(); contador++)
        {
            imprimir += arrayArticulo.get(contador).getInformacionArticulo();    
        }
        return imprimir;
    }
    
    public String[] getArregloInformacion()
    {
        return this.arregloInformacionConsultada;
    }
}
