package ar.edu.unju.fi.poo.logistica.model;

public class Vehiculo {

    private String patente;
    private double capacidadKg;
    private double capacidadVolumenDm3;

    public Vehiculo() {
    }

    public Vehiculo(String patente, double capacidadKg, double capacidadVolumenDm3) {
        this.patente = patente;
        this.capacidadKg = capacidadKg;
        this.capacidadVolumenDm3 = capacidadVolumenDm3;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCapacidadKg() {
        return capacidadKg;
    }

    public void setCapacidadKg(double capacidadKg) {
        this.capacidadKg = capacidadKg;
    }

    public double getCapacidadVolumenDm3() {
        return capacidadVolumenDm3;
    }

    public void setCapacidadVolumenDm3(double capacidadVolumenDm3) {
        this.capacidadVolumenDm3 = capacidadVolumenDm3;
    }

}