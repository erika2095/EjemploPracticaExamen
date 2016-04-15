/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 3rika
 */
public class Articulo {

    private String codigo;
    private String articulo;
    private int cantidad;

    public Articulo(String codigo, String articulo, int cantidad) {
        this.codigo = codigo;
        this.articulo = articulo;
        this.cantidad = cantidad;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getInformacionArticulo()
    {
        return "\nN.Codigo: " + getCodigo() + " Articulo: " + getArticulo() + " Cantidad: " + getCantidad();
    }
}
