package ar.edu.unju.fi.poo.logistica.manager;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.poo.logistica.model.Envio;
import ar.edu.unju.fi.poo.logistica.model.EstadoEnvio;
import ar.edu.unju.fi.poo.logistica.model.Vehiculo;
import ar.edu.unju.fi.poo.logistica.model.RutaDiaria;

public class ManagerEnvios {

    private List<Envio> envios = new ArrayList<>();
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private List<RutaDiaria> rutas = new ArrayList<>();

    public List<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(List<Envio> envios) {
        this.envios = envios;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<RutaDiaria> getRutas() {
        return rutas;
    }

    public void setRutas(List<RutaDiaria> rutas) {
        this.rutas = rutas;
    }

    public void registrarEnvio(Envio envio) {
        envio.setEstado(EstadoEnvio.GENERADO);
        this.envios.add(envio);
        System.out.println("Envio registrado");
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
        System.out.println("Vehiculo registrado");
    }

    public void registrarRuta(RutaDiaria ruta) {
        this.rutas.add(ruta);
        System.out.println("Ruta registrada");
    }

    public void asignarRuta(Envio envio, RutaDiaria ruta) {
        if (envio.getPaquetes().isEmpty()) {
            System.out.println("No se puede asignar un envio sin paqueteS");
        } else {
            envio.despachar();
            if (envio.pesoTotal() > ruta.getVehiculo().getCapacidadKg()) {
                System.out.println(
                        "No se puede asignar el envio a la ruta: el peso total del envio es mayor a la capacidad del vehiculo");
            } else {
                if (envio.volumenTotal() > ruta.getVehiculo().getCapacidadVolumenDm3()) {
                    System.out.println(
                            "No se puede asignar el envio a la ruta: el volumen total del envio es mayor a la capacidad del vehiculo");
                } else {
                    ruta.agregarEnvio(envio);
                    System.out.println("Envio " + envio.getId() + " asignado a la ruta");
                }
            }
        }
    }

}