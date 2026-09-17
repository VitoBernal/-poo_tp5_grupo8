package ar.edu.unju.fi.poo.logistica.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RutaDiaria {

    private LocalDate fecha;
    private Vehiculo vehiculo;
    private List<Envio> envios;

    public RutaDiaria(LocalDate fecha, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.envios = new ArrayList<>();
    }

    public RutaDiaria() {
    }

    public void agregarEnvio(Envio envio) {
        this.envios.add(envio);
        envio.setEstado(EstadoEnvio.EN_RUTA);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(List<Envio> envios) {
        this.envios = envios;
    }

}