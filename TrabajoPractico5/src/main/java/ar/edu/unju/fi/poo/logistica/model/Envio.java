package ar.edu.unju.fi.poo.logistica.model;

import java.util.ArrayList;
import java.util.List;

public class Envio {
    private Integer id;
    private String remitente;
    private String destinatario;
    private String direccionEntrega;
    private EstadoEnvio estado;
    private List<Paquete> paquetes;

    public Envio() {

    }

    public Envio(Integer id, String remitente, String destinatario, String direccionEntrega) {
        this.id = id;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.direccionEntrega = direccionEntrega;
        this.paquetes = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public EstadoEnvio getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public void agregarPaquete(Paquete paquete) {
        this.paquetes.add(paquete);
    }

    public void despachar() {
        setEstado(EstadoEnvio.EN_ALMACEN);
    }

    public void devolver() {
        setEstado(EstadoEnvio.DEVUELTO);
    }

    public double pesoTotal() {
        double total = 0;
        for (Paquete paquete : paquetes) {
            total += paquete.getPesoKg();
        }
        return total;
    }

    public double volumenTotal() {
        double total = 0;
        for (Paquete paquete : paquetes) {
            total += paquete.getVolumenDm3();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Envio [id=" + id + ", remitente=" + remitente + ", destinatario=" + destinatario + ", direccionEntrega="
                + direccionEntrega + ", estado=" + estado + "\nPAQUETES:" + paquetes + "]";
    }

}