package ar.edu.unju.fi.poo;

import ar.edu.unju.fi.poo.logistica.manager.ManagerEnvios;
import ar.edu.unju.fi.poo.logistica.model.Envio;
import ar.edu.unju.fi.poo.logistica.model.Paquete;
import ar.edu.unju.fi.poo.logistica.model.RutaDiaria;
import ar.edu.unju.fi.poo.logistica.model.Vehiculo;
import java.time.LocalDate;

public class MainEnvios {

    public static void main(String[] args) {
        ManagerEnvios manager = new ManagerEnvios();

        Vehiculo vehiculo1 = new Vehiculo("ASD232", 1000d, 800d);
        Vehiculo vehiculo2 = new Vehiculo("QWE232", 3000d, 2000d);
        System.out.print("Vehiculo 1: ");
        manager.registrarVehiculo(vehiculo1);
        System.out.print("Vehiculo 2: ");
        manager.registrarVehiculo(vehiculo2);

        Paquete paquete1 = new Paquete("1", "Paquete 1", 200d, 100d);
        Paquete paquete2 = new Paquete("2", "Paquete 2", 600d, 500d);
        Paquete paquete3 = new Paquete("3", "Paquete 3", 3001d, 1000d);

        Envio envio1 = new Envio(1, "Juan", "Maria", "Calle 1");
        System.out.print("Envio 1: ");
        envio1.agregarPaquete(paquete1);
        envio1.agregarPaquete(paquete2);
        manager.registrarEnvio(envio1);

        Envio envio2 = new Envio(2, "Carlos", "Luisa", "Calle 3");
        System.out.print("Envio 2: ");
        envio2.agregarPaquete(paquete3);
        manager.registrarEnvio(envio2);

        Envio envio3 = new Envio(3, "Ana", "Pedro", "Calle 4");
        System.out.print("Envio 3: ");
        manager.registrarEnvio(envio3);

        RutaDiaria ruta1 = new RutaDiaria(LocalDate.now(), vehiculo1);
        RutaDiaria ruta2 = new RutaDiaria(LocalDate.now(), vehiculo2);
        System.out.print("Ruta 1: ");
        manager.registrarRuta(ruta1);
        System.out.print("Ruta 2: ");
        manager.registrarRuta(ruta2);

        System.out.println("Asignar envios a rutas");
        System.out.print("envio 1: ");
        manager.asignarRuta(envio1, ruta1);
        System.out.print("envio 2: ");
        manager.asignarRuta(envio2, ruta1);
        System.out.print("envio 3: ");
        manager.asignarRuta(envio3, ruta2);

        System.out.println("envio 1 " + envio1 + "\n");
        System.out.println("envio 2 " + envio2 + "\n");
        System.out.println("envio 3 " + envio3 + "\n");

        envio1.devolver();
        System.out.println("envio 1 " + envio1);
    }
}