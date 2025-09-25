package CapaLogica;

import java.util.Date;

public class licencia {
    private Date fechaInicio;
    private Date fechaFin;
    private String turno;
    private String[] gruposAfectados;
    private String estado;
    private tipoLicencia tipo;

    public licencia(Date fechaInicio, Date fechaFin, String turno, String[] gruposAfectados, String estado, tipoLicencia tipo) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.turno = turno;
        this.gruposAfectados = gruposAfectados;
        this.estado = estado;
        this.tipo = tipo;
    }

    public boolean estaActiva() {
        Date hoy = new Date();
        return hoy.after(fechaInicio) && hoy.before(fechaFin);
    }

    public tipoLicencia getTipo() { return tipo; }

    public String getTurno() { return turno; }
    public String getEstado() { return estado; }

    @Override
    public String toString() {
        return "Licencia " + tipo.getNombre() + " (" + estado + ") - Turno: " + turno;
    }
}

