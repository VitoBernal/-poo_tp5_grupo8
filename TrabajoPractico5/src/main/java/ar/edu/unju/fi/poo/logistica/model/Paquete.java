package ar.edu.unju.fi.poo.logistica.model;

public class Paquete {
    private String codigo;
    private String descripcion;
    private double pesoKg;
    private double volumenDm3;

    public Paquete() {
    }

    public Paquete(String codigo, String descripcion, double pesoKg, double volumenDm3) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pesoKg = pesoKg;
        this.volumenDm3 = volumenDm3;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getVolumenDm3() {
        return volumenDm3;
    }

    public void setVolumenDm3(double volumenDm3) {
        this.volumenDm3 = volumenDm3;
    }

    @Override
    public String toString() {
        return "\nPaquete codigo: " + codigo + ", descripcion: " + descripcion + ", pesoKg: " + pesoKg
                + ", volumenDm3: " + volumenDm3;
    }

}
