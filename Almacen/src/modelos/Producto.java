/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author hebod
 */
public class Producto {
    private String idProd;
    private String nombreProd;
    private double precioProd;
    private int existenciaProd;

    public Producto() {
    }

    public Producto(String idProd, String nombreProd, double precioProd, int existenciaProd) {
        this.idProd = idProd;
        this.nombreProd = nombreProd;
        this.precioProd = precioProd;
        this.existenciaProd = existenciaProd;
    }

    public String getIdProd() {
        return idProd;
    }

    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }

    public int getExistenciaProd() {
        return existenciaProd;
    }

    public void setExistenciaProd(int existenciaProd) {
        this.existenciaProd = existenciaProd;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProd=" + idProd + ", nombreProd=" + nombreProd + ", precioProd=" + precioProd + ", existenciaProd=" + existenciaProd + '}';
    }
    
    
}
