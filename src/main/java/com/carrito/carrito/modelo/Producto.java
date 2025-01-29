package com.carrito.carrito.modelo;

public class Producto {
    private int idProd;
    private String nombre;
    private double precio;
    private String imagen;

    public Producto() {
    }

    public Producto(int idProd, String nombre, double precio, String imagen) {
        this.idProd = idProd;
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
   
}
